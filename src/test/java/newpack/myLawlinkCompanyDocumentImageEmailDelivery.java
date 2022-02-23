package newpack;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBLawlink;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myLawlinkCompanyDocumentImageEmailDelivery {

	@Test
	public void myLawlinkCompanyDocumentImageEmailDeliveryViewResults() throws Exception {
		
		try {

			WebDriver driver;
			
			WebDriverWait mywaitvar = null;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(3); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);
				
				myRBcommon rbcom = new myRBcommon(driver);
				
				myRBLawlink rblawlink = new myRBLawlink(driver);

				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://nonprod.lawlink.ie";

				driver.get(baseurl);

				//driver.findElement(By.xpath("//*[@id=\"header_right\"]/p/span/a")).click();
				
				rblawlink.clickLawlinkLoginNowlink();

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(3, i, 0));

				rb.setpassword(excel.getData(3, i, 1));

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img")).click();

				rb.clicklawlinklogin();

				// passed values

				System.out.println("Values passed");

				// Click Company/Business - Company Search link

				//driver.findElement(By.xpath("//*[@id="leftmenu"]/ul[1]/li[1]/a")).click();
				
				rblawlink.clickLawlinkCompanyCompanylink();
				
				//Click Company/Business - Document Search link
				
				rblawlink.clickLawlinkCompanyDocumentlink();

				// Pass search values and click search button

				// driver.findElement(By.name("userRef")).sendKeys("mysantest"+
				// rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				//driver.findElement(By.name("compNumber")).sendKeys(excel.getNumericData(3, i, 3));
				
				rblawlink.setcompanynumber(excel.getNumericData(3, i, 3));
				
				//Select Document type
				
				rblawlink.setdocumenttype(excel.getData(3, i, 4));

				//Click Search button
				
				rblawlink.clickLawlinkCaptchaSubmit();
				
				//mywaitvar = new WebDriverWait(driver, 80);

				//mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.name("docButton")));
				
				rblawlink.Lawlinkexplicitwaitdocbutton();	
				
				//Get the count of image links with NO checkboxes
				//List<WebElement> imagelinks=driver.findElements(By.cssSelector("table.ReportChoiceInfo td.blue11 a"));
				List<WebElement> imagelinks = rblawlink.LawlinkDocumentOrderlinks();
				int numberofimagelinks = imagelinks.size();
				System.out.println("Number of Image links without Checkbox available are:" + numberofimagelinks);
				
				if (numberofimagelinks>0)
				{
					
						
									
					
					//Click each image link one by one and download
					for(int k=0; k<numberofimagelinks; k++) {
						
							//Click image link using index
							imagelinks.get(k).click();
							//Click delivery by email radio button
							rblawlink.clickLawlinkImageDownloadEmailRadioButton();
							//Click Accept charge link
							rblawlink.clickLawlinkAcceptChargelink();
							//Wait for image to send in email
							Thread.sleep(30000);
							
							//Go back to the image select screen for selecting the next image link - 2 screen previous from email confirm screen
							driver.navigate().back();
							driver.navigate().back();
							//To exit from the loop for avoiding stale element exception
							break;
					}
					
					
					
					
				
					
				}
				
				else
				{
					
				
				//Click PDF link

				//driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/div[1]/p/a[2]")).click();
				
				rblawlink.clickLawlinkJudgementPDFLink();

				Thread.sleep(5000);
				
				}

				// excel.writeData(0, i, 3);

				// close chrome
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

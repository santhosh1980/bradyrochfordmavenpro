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
import pagefactory.myRBCID;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myCIDDocumentImageDownload {

	@Test
	public void myCIDDocumentImageDownloadViewResults() throws Exception {
		// to use chrome
		try {

			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(1); i++) {

				driver = new ChromeDriver();
				
				WebDriverWait mywaitvar = null;

				myRBlogin rb = new myRBlogin(driver);
				
				myRBcommon rbcom = new myRBcommon(driver);
				
				myRBCID rbcid = new myRBCID(driver);
				
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://nonprod.cid.ie";

				driver.get(baseurl);

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(1, i, 0));

				rb.setpassword(excel.getData(1, i, 1));

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.className("submit")).click();;

				rb.clickCIDlogin();

				// passed values

				System.out.println("Values passed");

				// Click CID and Company Search link

				//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[1]/a")).click();

				//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[2]/a")).click();
				
				rbcid.clickCIDlink();
				
				rbcid.clickCIDDocumentLink();

				// Pass search values and click search button

				// driver.findElement(By.id("userRef")).sendKeys("mysantest"+
				// rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				//driver.findElement(By.name("compName")).sendKeys(excel.getData(1, i, 2));
				
				//rbcid.setcompanyname(excel.getData(1, i, 2));
				
				rbcid.setcompanynumber(excel.getNumericData(1, i, 3));

				// *[@id="form1"]/table/tbody/tr[14]/td[2]/input[1]

				//driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[14]/td[2]/input[1]")).click();
				
				//Select document type
				
				rbcid.setdocumenttype(excel.getData(1, i, 4));
				
				//Click search button
				
				rbcid.clickCIDDocumentSearchLink();

				

							
				
				
				//mywaitvar = new WebDriverWait(driver, 80);

				//mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.name("docButton")));
				
				rbcid.CIDexplicitwaitdocbutton();
				
				//To get all the anchor links which contains the string mentioned below in href attribute
				//List<WebElement> imagelinks = driver.findElements(By.xpath(".//a[contains(@href,'sub-search-accept-charge')]"));
				List<WebElement> imagelinks = rbcid.CIDDocumentOrderlinks();
				
				int numberofimagelinks = imagelinks.size();
				
				if (numberofimagelinks>0)
				{
					
					System.out.println("Number of Image links without checkbox available are:" + numberofimagelinks);
					
					
				
					
					
					
					//Click each image link one by one and download
					for(int k=0; k<numberofimagelinks; k++) {
						
						//Click image link using index
						imagelinks.get(k).click();
						//Click Accept charge link
						rbcid.clickCIDAcceptCharge();
						//Wait for image to download
						Thread.sleep(30000);
						//Go back to the screen for selecting the next image link
						driver.navigate().back();
						//To exit from the loop for avoiding stale element exception
						break;
					}
					
					
				}
				
				else
				{
				// Capture company report

				utility.screenshotcapture(driver, "companyreport");

				driver.findElement(By.xpath("//*[@id=\"topLinks\"]/tbody/tr[3]/td[2]/a")).click();

				Thread.sleep(5000);
				}
				
				// Write to Excel - PDF URL
				
				//String pdfurl = utility.getPDFURL(driver);

				 //excel.writeData(1, i, 21, pdfurl);

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

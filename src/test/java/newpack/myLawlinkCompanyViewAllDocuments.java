package newpack;

import java.time.Duration;
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

public class myLawlinkCompanyViewAllDocuments {

	@Test
	public void myLawlinkCompanyViewAllDocumentsViewResults() throws Exception {
		// to use chrome
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
				
				//Selenium 3
				
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Selenium 4
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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

				// Click Company Search link

				//driver.findElement(By.xpath("//*[@id=\"leftmenu\"]/ul[3]/li[4]/a")).click();
				
				rblawlink.clickLawlinkCompanylink();

				// Pass search values and click search button

				// driver.findElement(By.name("userRef")).sendKeys("mysantest"+
				// rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				//driver.findElement(By.name("compNumber")).sendKeys(excel.getNumericData(3, i, 3));
				
				rblawlink.setcompanynumber(excel.getNumericData(3, i, 3));

				//driver.findElement(By.name("search")).click();
				
				rblawlink.clickLawlinkSearchLink();

				// Click accept charge button

				//driver.findElement(By.name("acceptCharge")).click();
				
				rblawlink.clickLawlinkAcceptChargelink();

						
				//mywaitvar = new WebDriverWait(driver, 80);

				//mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.name("docButton")));

				rblawlink.Lawlinkexplicitwaitdocbutton();					
				
				//Get the count of image checkboxes
				//List<WebElement> imageboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
				List<WebElement> imageboxes = rblawlink.LawlinkImageDownloadCheckboxes();
				int numberofimageboxes = imageboxes.size();
				//To restrict maximum document selection to 20
				int maxdoc = 1;
				
				if (numberofimageboxes>0)
				{
					
					System.out.println("Number of Image checkboxed available are:" + numberofimageboxes);
					
					//Select all checkboxes
					for(WebElement ele : imageboxes) {
						
						if(!(ele.isSelected()) && maxdoc<=20) {
							ele.click();
							maxdoc++;
						}
					}
					
					//Click Document Order button
					
					rblawlink.clickLawlinkDocumentOrderlink();

					Thread.sleep(5000);
					
					//Assert the text for Number of Image boxes selected for viewing
					
					//String imagetotaltext = driver.findElement(By.xpath("//*[@id=\"sub_content\"]/p")).getText();
					
					String imagetotaltext = rblawlink.verifyLawlinkNumberofImagecheckboxViewText();
					
					System.out.println(imagetotaltext);
					
					//Assert.assertEquals("You have selected "+numberofimageboxes+" documents.", imagetotaltext);
					
					if(numberofimageboxes<=20) {
						
						Assert.assertTrue(imagetotaltext.contains("You have selected "+numberofimageboxes+" documents."));
						
					}
					else {
						
						Assert.assertTrue(imagetotaltext.contains("You have selected "+(maxdoc-1)+" documents."));
					}
						
					
					
					
					//Click Accept charge submit link
					
					rblawlink.clickLawlinkAcceptChargeSubmitlink();
					
					
					//Get the count of imagelinks
					//List<WebElement> imagelinks=driver.findElements(By.cssSelector("ul.orange-list li"));
					List<WebElement> imagelinks = rblawlink.LawlinkImageViewLinks();
					int numberofimagelinks = imagelinks.size();
					
					System.out.println("Number of Image links available are:" + numberofimagelinks);
					
					//Click each image link one by one and capture screenshots
					for(int k=1; k<=numberofimagelinks; k++) {
						
							String submissionno = driver.findElement(By.xpath("//*[@id=\"sub_content\"]/ul/li["+k+"]/a")).getText();
							driver.findElement(By.xpath("//*[@id=\"sub_content\"]/ul/li["+k+"]/a")).click();
							
							Thread.sleep(5000);
							utility.fullscreenshotcapture(driver, submissionno);
							driver.navigate().back();
					}
					
				}
					
				else
					{
					//Click PDF link

					//driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/div[1]/p/a[2]")).click();
					
					rblawlink.clickLawlinkJudgementPDFLink();
					
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

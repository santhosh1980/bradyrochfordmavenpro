package newpack;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBCID;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myCIDLinksCheck {
  @Test
  public void myCIDLinksCheckViewResults() throws Exception {
	  
	  try {

			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(6); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);
				
					
				myRBCID rbcid = new myRBCID(driver);


				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://qa.cid.ie";

				driver.get(baseurl);

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(6, i, 0));

				rb.setpassword(excel.getData(6, i, 1));
				
				Thread.sleep(5000);

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.className("submit")).click();;

				rb.clickCIDlogin();

				// passed values

				System.out.println("Values passed");

				// Click CID Home Link
				
				rbcid.clickCIDHomeLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "CID Home");
				
				// Click CID About Us Link
				
				rbcid.clickCIDAboutUsLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "CID About Us");
				
				// Click CID Subscribe Link
				
				rbcid.clickCIDSubscribeLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "CID Subscribe");
				
				// Click CID Costs Link
				
				rbcid.clickCIDCostsLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "CID Costs");
				
				// Click CID Support Link
				
				rbcid.clickCIDSupportLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "CID Support");
				
				// Click CID Contact Us Link
				
				rbcid.clickCIDContactUsLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "CID Contact Us");
				
				
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

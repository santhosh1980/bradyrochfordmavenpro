package newpack;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBCID;
import pagefactory.myRBLawlink;
import pagefactory.myRBlogin;

public class myLawlinkLinksCheck {
  @Test
  public void myLawlinkLinksCheckViewResults() {
	  
	  try {

			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(7); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);
				
					
				myRBLawlink rblawlink = new myRBLawlink(driver);

				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://qa.lawlink.ie";

				driver.get(baseurl);
				
				rblawlink.clickLawlinkLoginNowlink();

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(7, i, 0));

				rb.setpassword(excel.getData(7, i, 1));
				
				Thread.sleep(5000);

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.className("submit")).click();;

				rb.clicklawlinklogin();

				// passed values

				System.out.println("Values passed");

				// Click Lawlink Home Link
				
				rblawlink.clickLawlinkHomeLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "Lawlink Home");
				
				// Click Lawlink About Us Link
				
				rblawlink.clickLawlinkAboutUsLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "Lawlink About Us");
				
				// Click Lawlink Subscribe Link
				
				rblawlink.clickLawlinkSubscribeLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "Lawlink Subscribe");
				
				// Click Lawlink Costs Link
				
				rblawlink.clickLawlinkCostsLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "Lawlink Costs");
				
				// Click Lawlink Support Link
				
				rblawlink.clickLawlinkSupportLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "Lawlink Support");
				
				// Click Lawlink Contact Us Link
				
				rblawlink.clickLawlinkContactUsLink();
				
				Thread.sleep(5000);
				
				utility.fullscreenshotcapture(driver, "Lawlink Contact Us");
				
				
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

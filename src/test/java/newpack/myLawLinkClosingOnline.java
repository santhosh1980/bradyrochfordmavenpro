package newpack;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBLawlink;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myLawLinkClosingOnline {

	@Test
	public void myLawLinkClosingOnlineViewResults() throws Exception {

		WebDriver driver;

		WebDriverWait mywaitvar = null;

		String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

		String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestDataOnline.xlsx";

		ExcelDataConfig excel = new ExcelDataConfig(datapath);

		Random rand = new Random();

		// create chrome instance
		System.setProperty("webdriver.chrome.driver", driverpath);

		for (int i = 0; i <= excel.getrownum(5); i++) {

			driver = new ChromeDriver();

			myRBlogin rb = new myRBlogin(driver);
			
			myRBcommon rbcom = new myRBcommon(driver);
			
			myRBLawlink rblawlink = new myRBLawlink(driver);

			// create firefox instance

			// System.setProperty("webdriver.firefox.marionette",
			// "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			// DesiredCapabilities dc = DesiredCapabilities.firefox();

			// dc.setCapability("marionette", true);

			// driver = new FirefoxDriver();

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// base url

			String baseurl = "https://qa.lawlink.ie";

			driver.get(baseurl);

			//driver.findElement(By.xpath("//*[@id=\"header_right\"]/p/span/a")).click();
			
			rblawlink.clickLawlinkLoginNowlink();

			// get webelements

			// WebElement name = driver.findElement(By.id("userName"));

			// WebElement pass = driver.findElement(By.id("password"));

			// pass credential and submit

			rb.setusername(excel.getData(5, i, 0));

			rb.setpassword(excel.getData(5, i, 1));

			Thread.sleep(5000);

			// Click login button

			// driver.findElement(By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img")).click();

			rb.clicklawlinklogin();

			// click closing search button
			Thread.sleep(5000);

			//driver.findElement(By.xpath("//*[@id=\"leftmenu\"]/ul[2]/li/a")).click();
			
			rblawlink.clickLawlinkClosingSearchlink();

			// capture screenshot 1

			utility.screenshotcapture(driver, "closingsearch");

			// Pass search values and click search button

			// driver.findElement(By.id("userRef")).sendKeys("myautotest" +
			// rand.nextInt(1000));

			rbcom.setuserRef("myautotest" + rand.nextInt(1000));

			// select the checkbox - Judgment/Bankruptcy & Personal Insolvency (ISI)
			// searches and click Next button

			//driver.findElement(By.id("chkJudg")).click();
			
			rblawlink.selectLawlinkClosingCheckJudgBox();

			//driver.findElement(By.name("next")).click();
			
			rblawlink.clickLawlinkClosingNextLink();

			// pass Surname and firstname and then click add button

			for (int j = 2; j < excel.getcolnum(5, i); j += 2) {

				//driver.findElement(By.name("surname")).sendKeys(excel.getData(5, i, j));

				//driver.findElement(By.name("firstName")).sendKeys(excel.getData(5, i, j + 1));

				//driver.findElement(By.id("AddName")).click();
				
				rbcom.setsurname(excel.getData(5, i, j));
				
				rbcom.setfirstname(excel.getData(5, i, j + 1));
				
				rblawlink.clickLawlinkClosingAddNameLink();

				Thread.sleep(5000);
			}

			// capture screenshot 2

			utility.screenshotcapture(driver, "searchvalue");

			System.out.println("Values passed");

			// Click submit button

			//driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/table[2]/tbody/tr[3]/td/input")).click();
			
			rblawlink.clickLawlinkClosingOnlineSubmitlink();

			Thread.sleep(15000);

			// Click download pdf button

			mywaitvar = new WebDriverWait(driver, 30);

			mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"all_reports\"]/a/p")));
			
			//driver.findElement(By.xpath("//*[@id=\"all_reports\"]/a/p")).click();
			
			rblawlink.clickLawlinkClosingPDFLink();

			Thread.sleep(5000);

			// verify pdf

			utility.verifyPDFInURL(driver);

			// Write to Excel - PDF URL

			String pdfurl = utility.getPDFURL(driver);

			excel.writeData(5, i, 21, pdfurl);

			// Window handle

			// utility.windowhandle(driver);

			// close chrome
			driver.quit();

			System.out.println("Browser closed");
		}

	}

}

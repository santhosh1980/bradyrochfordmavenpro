package example;

import org.testng.annotations.Test;

import lib.utility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class ScreenshotCapture {

	WebDriver driver;

	@Test(priority = 0)

	public void openurl() throws Exception {

		try {

			String baseurl = "http://demo.guru99.com/popup.php";

			driver.get(baseurl);

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			// capture exception screenshot

			//utility.screenshotcapture(driver, "exception");
		}

	}

	@Test(priority = 1)

	public void insurance() throws Exception {

		try {

			driver.findElement(By.partialLinkText("Insurance")).click();
			
			System.out.println("insurance executed");

			Thread.sleep(5000);

		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			// capture exception screenshot

			//utility.screenshotcapture(driver, "exception");
		}

	}

	@Test(priority = 2)

	public void agile() throws Exception {

		try {

			driver.findElement(By.partialLinkText("Xgile")).click();
			
			System.out.println("Agile executed");

			Thread.sleep(5000);
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			// capture exception screenshot

			//utility.screenshotcapture(driver, "exception");
		}

	}

	@Test(priority = 3)

	public void bank() throws Exception {

		try {

			driver.findElement(By.partialLinkText("Bank")).click();
			
			System.out.println("Bank executed");

			Thread.sleep(5000);

			
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			// capture exception screenshot

			//utility.screenshotcapture(driver, "exception");
		}

	}

	@BeforeTest()
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		
		
//		 if(ITestResult.FAILURE==myresult.getStatus()) {
//		 System.out.println("Test failed"); 
//		 utility.fullscreenshotcapture(driver,"screenfail"); 
//		 }
		 

		driver.close();

	}

}

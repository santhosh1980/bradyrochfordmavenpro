package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testpagesource {

	WebDriver driver;

	@Test
	public void TestpagesourceResults() throws Exception {

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		String baseurl = "http://demo.guru99.com/selenium/guru99home/";
		
		driver.get(baseurl);
		
		boolean result1 = driver.getPageSource().contains("THIS IS A DEMO PAGE FOR TESTING");
		
		boolean result2=	driver.getPageSource().contains("Here you learn by practice. We make tons of efforts to take boredom out of learning and make education a fun experience.");		
		
		System.out.println(result1);
		
		System.out.println(result2);
		Thread.sleep(5000);

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}
}

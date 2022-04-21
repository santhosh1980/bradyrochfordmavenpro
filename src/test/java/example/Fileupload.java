package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {

	WebDriver driver;
	


	@Test
	public void FileuploadResults() throws Exception {

		driver.manage().window().maximize();

		String baseurl = "http://demo.guru99.com/test/upload/";

		driver.get(baseurl);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\U35035\\Downloads\\1081714-241756.pdf");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		Thread.sleep(5000);
		
		String confirmtext= driver.findElement(By.tagName("body")).getText();
		
		String expectedconfirmtext = "1 file\n" + "has been successfully uploaded";
		
		
		
		if (confirmtext.contains(expectedconfirmtext)){
			System.out.println("Confirm text pass");
		}
		
		else {
			System.out.println("Confirm text fail");
		}
			

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

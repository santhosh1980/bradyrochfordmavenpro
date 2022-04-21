package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestException {

	WebDriver driver;

	WebDriverWait mywaitvar;
	
	@Test
	public void TestExceptionResults() throws Exception {
		
		try {
			
			driver.manage().window().maximize();

			String baseurl = "http://demo.guru99.com/test/delete_customer.php";

			driver.get(baseurl);
			
			mywaitvar = new WebDriverWait(driver, 10);
			
			mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
			
			driver.findElement(By.name("cusi")).sendKeys("332343");
			
			driver.findElement(By.name("submit")).click();
			
			Alert alert1 = driver.switchTo().alert();
			
			System.out.println(alert1.getText());
			
			alert1.accept();
			
			Alert alert2 = driver.switchTo().alert();
			
			System.out.println(alert2.getText());
			
			alert2.accept();
			
			
			
		}

		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Element not found");
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

		driver.quit();

	}
}

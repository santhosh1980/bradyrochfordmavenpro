package example;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;

public class NewTestNGAnnotation {

	WebDriver driver;
	public String expected = null;
	public String actual = null;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	@BeforeMethod
	public void verifytitle() {

		String expectedtitle = "Welcome: Mercury Tours";

		String actualtitle = driver.getTitle();

		Assert.assertEquals(expectedtitle, actualtitle);
	}

	
	@Test(priority = 0)
	public void register() {

		driver.findElement(By.linkText("REGISTER")).click();

		expected = "Register: Mercury Tours";

		actual = driver.getTitle();

		Assert.assertEquals(expected, actual);
	}

	@Test(priority = 1)
	public void contact() {

		driver.findElement(By.linkText("CONTACT")).click();

		expected = "Under Construction: Mercury Tours";

		actual = driver.getTitle();

		Assert.assertEquals(expected, actual);
	}
	
	@AfterMethod
	public void gobacktohomepage() {

		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}

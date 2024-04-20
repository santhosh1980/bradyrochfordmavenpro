package example;

import org.testng.annotations.Test;

import ch.lambdaj.group.Group;
import ch.lambdaj.group.Groups;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

//use of listener in single class
@Listeners(example.ListenerTest.class)
public class NewTestNGAnnotation {

	WebDriver driver;
	public String expected = null;
	public String actual = null;

	@BeforeTest ()
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		
		//Code for chrome incognito window to open
				//configure options parameter to chrome driver
				ChromeOptions co = new ChromeOptions();
				//chrome 111 issue to resolve - After the Chrome 111 update, you can no longer kick off a chromedriver instance unless you add an additional chrome option
				co.addArguments("--remote-allow-origins=*");
				//add incognito parameter
				co.addArguments("--incognito");
				
				driver = new ChromeDriver(co);
		

		driver.manage().window().maximize();
		
		//Selenium 3
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Selenium 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		

		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	@BeforeMethod()
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
	
	@AfterMethod()
	public void gobacktohomepage() throws InterruptedException {

		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(5000);
	}

	@AfterTest()
	public void afterTest() {

		driver.close();

	}

}

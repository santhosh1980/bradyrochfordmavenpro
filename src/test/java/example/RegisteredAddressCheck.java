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

public class RegisteredAddressCheck {

	WebDriver driver;

	@Test(priority=0)
	public void HomePageResults() throws Exception {

		
			
		if (driver.getPageSource().contains("39/40 Upper Mount"))		
		{
		System.out.println("Text found in Home page");
		}
		else
		{
		System.out.println("Text not found in Home page");
		}
		Thread.sleep(5000);

	}
	
	@Test(priority=1)
	public void ContactusResults() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"header_right\"]/ul/li[6]/a")).click();
			
		if (driver.getPageSource().contains("39/40 Upper Mount"))		
		{
		System.out.println("Text found in Contact Us page");
		}
		else
		{
		System.out.println("Text not found in Contact Us page");
		}
		Thread.sleep(5000);

	}
	
	@Test(priority=2)
	public void SupportResults() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"header_right\"]/ul/li[5]/a")).click();;
			
		if (driver.getPageSource().contains("39/40 Upper Mount"))		
		{
		System.out.println("Text found in Support page");
		}
		else
		{
		System.out.println("Text not found in Support page");
		}
		Thread.sleep(5000);

	}
	
	@Test(priority=3)
	public void CostResults() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"header_right\"]/ul/li[4]/a")).click();;
			
		if (driver.getPageSource().contains("39/40 Upper Mount"))		
		{
		System.out.println("Text found in Cost page");
		}
		else
		{
		System.out.println("Text not found in Cost page");
		}
		Thread.sleep(5000);

	}
	
	@Test(priority=4)
	public void SubscribeResults() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"header_right\"]/ul/li[3]/a")).click();;
			
		if (driver.getPageSource().contains("39/40 Upper Mount"))		
		{
		System.out.println("Text found in Subscribe page");
		}
		else
		{
		System.out.println("Text not found in Subscribe page");
		}
		Thread.sleep(5000);

	}
	
	@Test(priority=5)
	public void AboutusResults() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"header_right\"]/ul/li[2]/a")).click();;
			
		if (driver.getPageSource().contains("39/40 Upper Mount"))		
		{
		System.out.println("Text found in About us page");
		}
		else
		{
		System.out.println("Text not found in About us page");
		}
		Thread.sleep(5000);

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String baseurl = "https://qa.lawlink.ie";
		
		driver.get(baseurl);
	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}
}

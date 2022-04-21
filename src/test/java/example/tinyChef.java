package example;

import org.testng.annotations.Test;

import lib.utility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class tinyChef {

	WebDriver driver;
	
	WebDriverWait mywaitvar;

	@BeforeTest
	public void beforeTest() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://tinychef.ai/recipes/add-new/");
		
		System.out.println("URL has Opened");
		
		Thread.sleep(5000);
	}
	
	
	
	@Test
	public void typeanswer() throws Exception {
		
		mywaitvar = new WebDriverWait(driver, 30);
		
		//Press enter
		
		utility.keyenter();
		
		Thread.sleep(5000);
		  
		
		//Click "Let us begin" button
		
		//driver.findElement(By.xpath("//body")).click();
		
		//driver.findElement(By.tagName("body")).sendKeys(Keys.ENTER);
		
		//mywaitvar.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='root']//div[@data-qa='layout-placement-wrapper']//section[@data-qa='welcome-screen-wrapper']//button[@data-qa='start-button']//span[contains(.,'Begin')]"))).click();
		
		//driver.findElement(By.xpath("//span[contains(@class, 'TextWrapper-sc-__sc-1f8vz90-0') and contains(., 'Begin')]")).click();
		
		//mywaitvar.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.ButtonWrapper-sc-__sc-1qu8p4z-0 kxrchW span.FlexWrapper-sc-__sc-1qu8p4z-1 jqrpsF span.ButtonTextWrapper-sc-__sc-1qu8p4z-4 bNgWKn span.TextWrapper-sc-__sc-1f8vz90-0 hoAvCN")));
		
		//driver.findElement(By.cssSelector("button.ButtonWrapper-sc-__sc-1qu8p4z-0 kxrchW span.FlexWrapper-sc-__sc-1qu8p4z-1 jqrpsF span.ButtonTextWrapper-sc-__sc-1qu8p4z-4 bNgWKn span.TextWrapper-sc-__sc-1f8vz90-0 hoAvCN")).click();
		
		
		//driver.findElement(By.xpath("/html/body/div[3]/main/div[1]/div[2]/div/section/div[1]/div/div/div/div/div[3]/div[1]/div/button/span/span/span")).click();
		
		//driver.findElement(By.cssSelector("input[type='button']")).click();
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(".//*[starts-with(@class,'ButtonWrapper-sc-')]")));
		
		//driver.findElement(By.cssSelector("button[data-qa='start-button']")).click();
		
		//driver.findElement(By.cssSelector("span[class='TextWrapper-sc-__sc-1f8vz90-0 hoAvCN']")).click();
		
		//driver.findElement(By.cssSelector("div[class='SubmitWrapper-sc-__sc-1ra8r4w-2 jLdqzQ']")).click();
		
		//driver.findElement(By.cssSelector("span:contains('Let's Begin')")).click();
		
		
		//Fill in Name and press Enter
		
		//driver.findElement(By.name("name")).sendKeys("NameIgnore");
		
		//driver.findElement(By.id("short_text-0e8005fce1662867-3OSPh52JVfqqaYeE")).sendKeys("NameIgnore");
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Nametest");
		
		driver.findElement(By.xpath(".//input[contains(@name,'name')]")).sendKeys("Nametest");
		
		//driver.findElement(By.cssSelector("input.InputField-sc-__sc-p8yw0p-0.iTjRUO")).sendKeys("Hello");
		
		//driver.findElement(By.name("name")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		//Fill in Email and press Enter
		
		//driver.findElement(By.name("email")).sendKeys("ignore@ignore.com");
		
		//driver.findElement(By.name("email")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
	}

	
	

	@AfterTest
	public void afterTest() {

		driver.close();

	}

}

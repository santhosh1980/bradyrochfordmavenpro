package SeleniumGrid;

import org.testng.annotations.Test;

import bsh.Capabilities;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class TestGridClass {
  
	public WebDriver driver;
	public String URL = "https://www.seleniumeasy.com/test/";
	public String Node;
	protected ThreadLocal<RemoteWebDriver> threadDriver = null;
	
	
	@Parameters({ "browserType" })
	@BeforeTest
	public void launchbrowser(String browserType) throws MalformedURLException {
		
		
		if (browserType.equalsIgnoreCase("firefox")) {
			System.out.println(" Executing on FireFox");
			
			FirefoxOptions fo = new FirefoxOptions();
			Node = "http://10.100.75.32:4444/wd/hub";
			//DesiredCapabilities cap = DesiredCapabilities.firefox();
			//cap.setBrowserName("firefox");
			//cap.setPlatform(Platform.WINDOWS);
			//driver = new RemoteWebDriver(new URL(Node), cap);
			driver = new RemoteWebDriver(new URL(Node), fo);
			// Puts an Implicit wait, Will wait for 10 seconds before throwing exception
			//Selenium 3
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selenium 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
		} else if (browserType.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			
			ChromeOptions co= new ChromeOptions();
			//co.setCapability(ChromeOptions.CAPABILITY, co);
			//DesiredCapabilities cap = DesiredCapabilities.chrome();
			//cap.setBrowserName("chrome");
			//cap.setPlatform(Platform.WINDOWS);
			Node = "http://10.100.75.32:4444/wd/hub";
			//driver = new RemoteWebDriver(new URL(Node), cap);
			driver = new RemoteWebDriver(new URL(Node), co);
			//Selenium 3
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selenium 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
		} else if (browserType.equalsIgnoreCase("ie")) {
			System.out.println(" Executing on IE");
			
			EdgeOptions eo = new EdgeOptions();
			//DesiredCapabilities cap = DesiredCapabilities.chrome();
			//cap.setBrowserName("ie");
			//cap.setPlatform(Platform.WINDOWS);
			Node = "http://10.100.75.32:4444/wd/hub";
			//driver = new RemoteWebDriver(new URL(Node), cap);
			driver = new RemoteWebDriver(new URL(Node), eo);
			//Selenium 3
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selenium 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
		} else {
			
			
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	}

	@Test
	public void SeleniumFormTest() throws Exception {
		
		
		// Launch website
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		
		//Click Input forms
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		//Click Simple form demo
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		//Enter message
		driver.findElement(By.id("user-message")).sendKeys("Hello world");
		Thread.sleep(3000);
		
		//Click show message button
		driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
		Thread.sleep(3000);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}

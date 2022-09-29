package SeleniumGrid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
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
			Node = "http://10.100.75.32:4444/wd/hub";
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(Node), cap);
			// Puts an Implicit wait, Will wait for 10 seconds before throwing exception
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
		} else if (browserType.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			Node = "http://10.100.75.32:4444/wd/hub";
			driver = new RemoteWebDriver(new URL(Node), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
		} else if (browserType.equalsIgnoreCase("ie")) {
			System.out.println(" Executing on IE");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("ie");
			cap.setPlatform(Platform.WINDOWS);
			Node = "http://10.100.75.32:4444/wd/hub";
			driver = new RemoteWebDriver(new URL(Node), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
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

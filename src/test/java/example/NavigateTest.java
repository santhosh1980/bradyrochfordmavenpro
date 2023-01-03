package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.junit.Assert;

public class NavigateTest {
	
	@Test
	public void NavigateTestresults() throws InterruptedException {
		
		WebDriver driver=null;
		
		try {
			
			//assert test
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			
			driver = new ChromeDriver();
			
			//WebDriver driver = new FirefoxDriver();
			
						
			//driver.manage().window().setSize(new Dimension(320, 480));
			
			//driver.manage().window().maximize();
			
			//Selenium 3
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selenium 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://google.com"); 
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(3000);
			
			driver.get("https://www.freshworks.com/");
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(3000);
			
			driver.navigate().back();
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(3000);
			
			driver.navigate().forward();
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(3000);
			
			
			
			driver.quit();
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e.getMessage());
			driver.quit();
			
		}
		
		
		
		
		
	}

}

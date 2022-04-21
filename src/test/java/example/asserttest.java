package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.junit.Assert;

public class asserttest {
	
	@Test
	public void asserttestresults() {
		
		WebDriver driver=null;
		
		try {
			
			//assert test
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			
			driver = new ChromeDriver();
			
			//WebDriver driver = new FirefoxDriver();
			
						
			driver.manage().window().setSize(new Dimension(320, 480));
			
			//driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("http://google.com"); 
			
			System.out.println(driver.getTitle());
			
			//Hard Assert
			Assert.assertEquals("Google", driver.getTitle());
			Assert.assertTrue(2<1);
			System.out.println("Hard Assertion failed, so not executes");
			
			//Soft Assert
			//SoftAssert sa = new SoftAssert();
			//sa.assertEquals("Google", driver.getTitle());
			//sa.assertTrue(2<1);
			//System.out.println("Soft Assertion failed, but executes");
			
					
			//Thread.sleep(5000);
			
			driver.quit();
			
			
			
		}
		catch (AssertionError ae) {
			// TODO: handle exception
			
			System.out.println(ae.getMessage());
			driver.quit();
			
		}
		
		
		
		
		
	}

}

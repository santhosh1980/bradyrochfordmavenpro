package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import lib.utility;

import org.junit.Assert;

public class frametest {
	
	@Test
	public void frametestresults() {
		
		WebDriver driver=null;
		
		try {
			
			//assert test
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			
			driver = new ChromeDriver();
			
			//WebDriver driver = new FirefoxDriver();
			
						
			//driver.manage().window().setSize(new Dimension(320, 480));
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://demo.guru99.com/selenium/deprecated.html"); 
			
			//switch to frame
			
			driver.switchTo().frame("classFrame");
			
			driver.findElement(By.partialLinkText("Deprecated")).click();
			
			Thread.sleep(3000);
			
			//Click each deprecated link one by one and capture screenshots
			
			List<WebElement> deprecatelinks = driver.findElements(By.cssSelector("div.header ul li"));
			
			int numberdeprecatelinks = deprecatelinks.size();
			
			System.out.println("The number of deprecated links are: " + numberdeprecatelinks);
			
			for (int k=1;k<=numberdeprecatelinks;k++)
			{
				String deprecatedlinktext = driver.findElement(By.xpath("/html/body/div[5]/ul/li["+k+"]/a")).getText();
				System.out.println("Deprecated link text is:"+deprecatedlinktext);
				driver.findElement(By.xpath("/html/body/div[5]/ul/li["+k+"]/a")).click();
				utility.fullscreenshotcapture(driver, deprecatedlinktext);
				Thread.sleep(2000);
				
			}
			
			driver.quit();
			
			
			
		}
		catch (AssertionError ae) {
			// TODO: handle exception
			
			System.out.println(ae.getMessage());
			driver.quit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			driver.quit();
		}
		
		
		
		
		
	}

}

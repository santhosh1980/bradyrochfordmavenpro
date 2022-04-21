package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import lib.utility;

import org.junit.Assert;

public class multiplewindows {

	@Test
	public void multiplewindowsresults() {

		WebDriver driver = null;

		try {

			// assert test

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

			// System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			driver = new ChromeDriver();

			// WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://www.tutorialspoint.com/about/about_careers.htm");

			Thread.sleep(3000);

			// key chord string

			String keychord = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			//open link in new tab
			
			driver.findElement(By.linkText("Team")).sendKeys(keychord);
			
			Thread.sleep(3000);
			
			//store windowg handle ids
			
			ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
			
			//switch to second tab
			
			driver.switchTo().window(tabs.get(1));
			
			driver.close();
			
			Thread.sleep(3000);
			
			//switch to first tab
			
			driver.switchTo().window(tabs.get(0));
			
			driver.close();
			
			//driver.quit();

		} catch (Exception ae) {
			// TODO: handle exception

			System.out.println(ae.getMessage());
			driver.quit();

		}

	}

}

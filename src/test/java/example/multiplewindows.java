package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import lib.utility;

import org.junit.Assert;

public class multiplewindows {

	@Test
	public void multiplewindowsresults() {

		WebDriver driver = null;

		try {

			// assert test

			/*System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");*/

			// System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			//driver = new ChromeDriver();
			
			//Code for chrome incognito window to open
			//configure options parameter to chrome driver
			//ChromeOptions co = new ChromeOptions();
			//chrome 111 issue to resolve - After the Chrome 111 update, you can no longer kick off a chromedriver instance unless you add an additional chrome option
			//co.addArguments("--remote-allow-origins=*");
			//add incognito parameter
			//co.addArguments("--incognito");
			
			//driver = new ChromeDriver(co);
			
			// Setup ChromeDriver using WebDriverManager
			  WebDriverManager.chromedriver().setup();
			  ChromeOptions co = new ChromeOptions();
			  co.addArguments("--remote-allow-origins=*");
			// Create instance of ChromeDriver
		      driver = new ChromeDriver(co);

			// WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			//Selenium 3
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selenium 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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

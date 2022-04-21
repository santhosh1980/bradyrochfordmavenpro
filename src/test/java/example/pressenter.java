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

public class pressenter {

	@Test
	public void pressenterresults() {

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

			driver.get("http://google.com");

			driver.findElement(By.name("q")).sendKeys("selenium");

			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

			Thread.sleep(3000);

			List<WebElement> anchorelements = driver.findElements(By.cssSelector("a.l"));

			int sizeanchorelements = anchorelements.size();

			System.out.println("Number of anchor elements:" + sizeanchorelements);

			// key chord string

			String keychord = Keys.chord(Keys.CONTROL, Keys.ENTER);

			for (WebElement ele : anchorelements) {

				ele.sendKeys(keychord);

				Thread.sleep(3000);

			}

			windowhandle2(driver);

			// driver.quit();

		} catch (Exception ae) {
			// TODO: handle exception

			System.out.println(ae.getMessage());
			driver.quit();

		}

	}

	public void windowhandle1(WebDriver driver) throws Exception {

		String parent = driver.getWindowHandle();

		System.out.println("Parent window id is:" + parent);

		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();

		System.out.println("total window is:" + count);

		for (String child : allWindows) {

			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);
				
				System.out.println("Child window title is:" + driver.getTitle());

				Thread.sleep(5000);

				driver.close();

			}
		}

		driver.switchTo().window(parent);

		System.out.println("Parent window title is:" + driver.getTitle());

		Thread.sleep(5000);

		driver.close();
	}
	
	public void windowhandle2(WebDriver driver) throws Exception {

		

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		int count = tabs.size();

		System.out.println("total window is:" + count);

		for (int i=0;i<count;i++) {
			
			driver.switchTo().window(tabs.get(i));
			
			Thread.sleep(5000);
			
			driver.close();
		}

		

		
	}

}

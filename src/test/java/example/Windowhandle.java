package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {

	WebDriver driver;

	@Test
	public void WindowhandleResults() throws Exception {

		driver.manage().window().maximize();

		String baseurl = "http://demo.guru99.com/popup.php";

		driver.get(baseurl);
		
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindows= driver.getWindowHandles();
		
		Iterator<String> i1=allwindows.iterator();
		
		while(i1.hasNext()) {
			driver.switchTo().window(i1.next());
			driver.close();
			Thread.sleep(5000);
		}

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	/*@AfterTest
	public void afterTest() {

		driver.close();

	}*/
}

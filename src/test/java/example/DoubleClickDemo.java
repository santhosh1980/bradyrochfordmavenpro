package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClickDemo {

	WebDriver driver;
	


	@Test
	public void DoubleClickDemoResults() throws Exception {

		driver.manage().window().maximize();

		String baseurl = "http://demo.guru99.com/test/simple_context_menu.html";

		driver.get(baseurl);
		
		//double click button
		
		Actions action = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		action.doubleClick(link).perform();
		
		//switch to alert and click ok
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
	

	}

	

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}
}

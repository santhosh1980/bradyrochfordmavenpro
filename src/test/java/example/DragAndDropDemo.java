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

public class DragAndDropDemo {

	WebDriver driver;
	


	@Test
	public void DragAndDropDemoResults() throws Exception {

		driver.manage().window().maximize();

		String baseurl = "http://demo.guru99.com/test/drag_drop.html";

		driver.get(baseurl);
		
		WebElement from1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		
		WebElement to1 = driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		
		WebElement from2 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		
		WebElement to2 = driver.findElement(By.xpath("//*[@id=\"loan\"]"));
		
		//drag and drop
		
		Actions action = new Actions(driver);
		
		
		action.dragAndDrop(from1, to1).build().perform();
		
		Thread.sleep(5000);	
		
		action.dragAndDrop(from2, to2).build().perform();
		
		Thread.sleep(5000);	
		
		System.out.println("Drag and drop done");
	

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

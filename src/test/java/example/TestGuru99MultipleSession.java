package example;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGuru99MultipleSession {

	WebDriver driver;

	@Test
	public void firstchromesession() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V4/");

		//Selenium 3
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Selenium 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// fill username

		driver.findElement(By.name("uid")).sendKeys("mngr242731");

		// fill password

		driver.findElement(By.name("password")).sendKeys("gYhYzej");

		// click submit

		driver.findElement(By.name("btnLogin")).click();

		// logout
		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();

		// get text from alert
		
		System.out.println("Alert text:" + driver.switchTo().alert().getText());

		// alert accept

		driver.switchTo().alert().accept();

		// quit driver

		driver.close();

	}

	@Test
	public void secondchromesession() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V4/");

		//Selenium 3
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Selenium 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// fill username

		driver.findElement(By.name("uid")).sendKeys("mngr242731");

		// fill password

		driver.findElement(By.name("password")).sendKeys("gYhYzej");

		// click submit

		driver.findElement(By.name("btnLogin")).click();

		// logout
		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();

		// get text from alert
		
		System.out.println("Alert text:" + driver.switchTo().alert().getText());

		// alert accept

		driver.switchTo().alert().accept();

		// quit driver

		driver.close();

	}

	
	 	 
}

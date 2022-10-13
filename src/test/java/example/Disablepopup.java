package example;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Disablepopup {
	
	WebDriver driver;
  @Test
  public void popupblock() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  
	//to disable pop ups
		
	//ChromeOptions opt = new ChromeOptions();
			
	//opt.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

		//driver = new ChromeDriver(opt);
	  
	  driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//Selenium 3
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Selenium 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.naukri.com/");
  }
}

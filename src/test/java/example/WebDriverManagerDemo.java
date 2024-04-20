package example;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
  @Test
  public void WebDriverManagerDemoTest() throws InterruptedException {
	  
	
	// Setup ChromeDriver using WebDriverManager
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	// Create instance of ChromeDriver
      WebDriver driver = new ChromeDriver(co);
	  
   // Setup GeckoDriver (Firefox) using WebDriverManager
      //WebDriverManager.firefoxdriver().setup();
      //WebDriver driver = new FirefoxDriver();
	  
	// Setup EdgeDriver using WebDriverManager
	  //WebDriverManager.edgedriver().setup();
	  //WebDriver driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  
	  //Navigate to website
	  
	  driver.get("https://nonprod.lawlink.ie");
	  
	  System.out.println(driver.getTitle());
	  
	
	  Thread.sleep(5000);
	  
	  driver.quit();
  }
}

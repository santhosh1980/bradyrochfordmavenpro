package example;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
  @Test
  public void WebDriverManagerDemoTest() throws InterruptedException {
	  
	
	  //Webdriver manager for chrome
	  //WebDriver driver = WebDriverManager.chromedriver().create();
	
	  //Webdriver manager for firefox
	  //WebDriver driver = WebDriverManager.firefoxdriver().create();
	  
	  //Webdriver manager for edge
	  WebDriver driver = WebDriverManager.edgedriver().create();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  
	  //Navigate to website
	  
	  driver.get("https://nonprod.lawlink.ie");
	  
	  System.out.println(driver.getTitle());
	  
	
	  Thread.sleep(5000);
	  
	  driver.quit();
  }
}

package example;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
  @Test
  public void WebDriverManagerDemoTest() throws InterruptedException {
	  
	
	  
	  WebDriver driver = WebDriverManager.chromedriver().create();
				 
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  
	  //Navigate to website
	  
	  driver.get("https://nonprod.lawlink.ie");
	  
	  System.out.println(driver.getTitle());
	  
	
	  Thread.sleep(5000);
	  
	  driver.quit();
  }
}

package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import lib.utility;

public class SeleniumHeadlessBrowser {
	
	WebDriver driver = null;
  @Test(enabled=false)
  public void chromeheadless() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	  
	  //code for chrome headless browser
	  
	  ChromeOptions co = new ChromeOptions();
	  
	  //another way to set headless browser in chrome
	  
	  //co.addArguments("headless");
	  
	  co.setHeadless(true);
	  	  
	  ChromeDriver driver = new ChromeDriver(co);
	  
	  driver.get("https://demoqa.com/");
	  
	  System.out.println("Chrome "+driver.getTitle());
	  
	  utility.fullscreenshotcapture(driver, "chromeheadlessscreencapture");
	  
	  driver.close();
  }
  
  @Test(enabled=false)
  public void firefoxheadless() {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\U35035\\\\eclipse-workspace\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe");
	  //code for firefox headless browser
	  
	  FirefoxOptions co = new FirefoxOptions();
	  
	 co.setHeadless(true);
	  
	  FirefoxDriver driver = new FirefoxDriver(co);
	  
	  driver.get("https://demoqa.com/");
	  
	  System.out.println("Firefox "+driver.getTitle());
	  
	  utility.fullscreenshotcapture(driver, "firefoxheadlessscreencapture");
	  
	  driver.close();
  }
  
  @Test
  public void edgeheadless() {
	  
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\U35035\\eclipse-workspace\\Microsoftwebdriver\\msedgedriver.exe");
	  //code for edge headless browser
	  
	  EdgeOptions co = new EdgeOptions();
	  
	co.setHeadless(true);
	  
	  EdgeDriver driver = new EdgeDriver(co);
	  
	  driver.get("https://demoqa.com/");
	  
	  System.out.println("Edge "+driver.getTitle());
	  
	  utility.fullscreenshotcapture(driver, "edgeheadlessscreencapture");
	  
	  driver.close();
  }
}

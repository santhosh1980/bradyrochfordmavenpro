package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import lib.ScreenRecorderUtil;

public class testngsample {
	
	
	@Test
	public void verifyHomepageTitle() throws Exception {
	String baseUrl = "http://demo.guru99.com/test/newtours/";
    //String driverPath = "C:\\geckodriver.exe";
    //public WebDriver driver ; 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	
	//starting video capture
	ScreenRecorderUtil.startRecord("verify video capture");
	  
	  for (int i=1;i<=5;i++) {
		  
		  
		  System.out.println("launching chrome browser"); 
	      
	      ChromeDriverService driverservice = ChromeDriverService.createDefaultService();
	  	  ChromeDriver driver= new ChromeDriver(driverservice);
	       
	      //driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	      driver.quit();
	      driverservice.stop();
	      
		  
	  }
       
	//video capture ending  
	  ScreenRecorderUtil.stopRecord();
  }

}

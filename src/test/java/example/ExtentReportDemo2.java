package example;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import lib.utility;


public class ExtentReportDemo2 {
	
	WebDriver driver;
	
	ExtentReports extent;
	
	ExtentTest logger;
	
	@BeforeMethod
	public void setup(){
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ExtendedReport2.html");
		  
		extent = new ExtentReports();
		  
		extent.attachReporter(reporter);
		  
		logger = extent.createTest("Open URL and Title Test");
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws Exception{
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			String temp = utility.extendedscreenshotcapture(driver, "extendcapturescreen");
			
			logger.fail(result.getThrowable().getMessage() ,MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			
			
			
			
			
		}
		
		extent.flush();
		driver.quit();
		
	}
	
	
    
     
  @Test   
  public void verifyHomepageTitle() throws Exception {
	  
	  
      
	  String baseUrl = "http://demo.guru99.com/test/newtours/";   
	  
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      
      driver.manage().window().maximize();
           
      driver.get(baseUrl);
      
      
      String expectedTitle = "Wlcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
	  
	  
	  
	  
	  
	
	  
       
      
  }

}

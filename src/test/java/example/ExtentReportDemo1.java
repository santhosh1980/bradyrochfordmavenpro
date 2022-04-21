package example;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@Test
public class ExtentReportDemo1 {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    //String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ; 
     
  public void verifyHomepageTitle() throws Exception {
	  
	  
      
      
	  
	  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ExtendedReport1.html");
	  
	  ExtentReports extent = new ExtentReports();
	  
	  extent.attachReporter(reporter);
	  
	  
	  //First Test Case
	  ExtentTest logger1 = extent.createTest("Open URL and Title Test");
	  
	    
	  
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      logger1.log(Status.INFO, "Launching chrome browser");
      
      driver.get(baseUrl);
      logger1.log(Status.INFO, "Open Guru99 URL");
      
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
	  logger1.log(Status.PASS, "Title verified");
	  
	  extent.flush();
	  
	  //Second Test Case
	  ExtentTest logger2 = extent.createTest("Login Test");
	  
	  logger2.log(Status.INFO, "Signin Test");
	  driver.findElement(By.name("userName")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  logger2.log(Status.PASS, "Signin successfully");
	  logger2.fail("Failed due to this reason", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\U35035\\eclipse-workspace\\myrbtest\\pictures\\fail.png").build());
	  
	  //Third Test Case
	  ExtentTest logger3 = extent.createTest("Logoff Test");
	  
	  logger3.log(Status.INFO, "Signoff Test");
	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	  logger3.log(Status.PASS, "Signoff successfully");
	  driver.close();
	  logger3.log(Status.INFO, "Closing chrome browser");
	  logger3.pass("Passed due to this reason", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\U35035\\eclipse-workspace\\myrbtest\\pictures\\pass.png").build());
	  
	  extent.flush();
	  
       
      
  }

}

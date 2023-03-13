package example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.examplepage;

import org.openqa.selenium.JavascriptExecutor;

public class AmericanStatesExample {
  @Test
  public void AmericanStatesExampleResults () {
	  
	  WebDriver driver = null;
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
	
	  
	  String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\empdata.xlsx";

	  ExcelDataConfig excel = new ExcelDataConfig(datapath);
	  
	  examplepage ep = new examplepage(driver);
	  
	 try {
		 
		 for (int i = 0; i <= excel.getrownum(3); i++) {
			 
			//Web driver 
			
			 driver = new ChromeDriver();
				
			//Maximize browser window
			
			driver.manage().window().maximize();
			
			//Implicit timeout
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Access URL
			
			driver.get("https://petdiseasealerts.org/forecast-map");
			
			//Sleep for 5 seconds
			
			Thread.sleep(5000);
			

			//scroll down to the lower of webpage and wait
			
			//utility.scrollendofpage(driver);
			
			//Click state
			
			//ep.clickstate(excel.getData(3, i, 0));
			
			
			
			//driver.findElement(By.xpath("//*[name()='svg']/*[local-name()='g']/*[local-name()='g']/*[local-name()='g']/*[local-name()='g']/*[local-name()='path' and @name='California']")).click();
			
			//driver.findElement(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='g']/*[name()='g']/*[name()='g']/*[name()='path' and @name='California']")).click();
			
			//List<WebElement> regionelements = driver.findElements(By.xpath(".//g[contains(@class,'region')]"));
			
			//List<WebElement> regionelements = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g']//*[local-name()='g']"));
			
			//int numberregionelements = regionelements.size();
			
			//System.out.println("Number of regions:"+numberregionelements);
			
			//driver.findElement(By.xpath("//*[@id=\"5\"]")).getText();
			
			//driver.findElement(By.xpath("//*[local-name()='div' and @id='capc-map-app']/*[local-name()='div' and @class='map-content']/*[local-name()='div' and @id='map-component']/*[local-name()='svg' and @id='map-svg']/*[local-name()='g' and @id='features']/*[local-name()='g' and @id='regions']/*[local-name()='g' and @id='california']/*[local-name()='g' and @class='rpath']/*[local-name()='path' and @name='California']")).click();
			
			WebElement m = driver.findElement(By.xpath("//*[local-name()='div' and @id='capc-map-app']/*[local-name()='div' and @class='map-content']/*[local-name()='div' and @id='map-component']/*[local-name()='svg' and @id='map-svg']/*[local-name()='g' and @id='features']/*[local-name()='g' and @id='regions']/*[local-name()='g' and @id='california']/*[local-name()='g' and @class='rpath']/*[local-name()='path' and @name='California']"));
			
			//using javascriptexecutor
						
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",m);
			
			//using action class
			//Action class to move and click element
			
			Actions a = new Actions(driver);
			
			a.moveToElement(m).click().build().perform();

			//Sleep for 5 seconds
			
			Thread.sleep(5000);
			 
		 }
		 
		 
		
	} catch (Exception e) {
		// TODO: handle exception
		
		System.out.println(e.getMessage());
		
		driver.quit();
	}
  }
}

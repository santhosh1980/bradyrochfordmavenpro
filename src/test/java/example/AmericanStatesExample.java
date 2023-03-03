package example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.examplepage;

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
			
			
			
			//driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='g']//*[local-name()='g']//*[local-name()='g']//*[local-name()='g']//*[local-name()='path' and @name='California']")).click();
			
			//driver.findElement(By.xpath("//*[name()='svg']//*[name()='g']//*[name()='g']//*[name()='g']//*[name()='g']//*[name()='path' and @name='California']")).click();
			
			//List<WebElement> regionelements = driver.findElements(By.xpath(".//g[contains(@class,'region')]"));
			
			//List<WebElement> regionelements = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g']//*[local-name()='g']"));
			
			//int numberregionelements = regionelements.size();
			
			//System.out.println("Number of regions:"+numberregionelements);
			
			driver.findElement(By.xpath("//*[@id=\"5\"]")).getText();

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

package example;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab {
	
	public static void main (String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com");  
		Thread.sleep(5000);
		
				
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("http://linkedin.com");
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		tabs= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		driver.get("http://facebook.com");
		
		driver.switchTo().window(tabs.get(0));
		driver.close();
			  
		driver.switchTo().window(tabs.get(1));
		driver.close();
	    
		driver.switchTo().window(tabs.get(2));
		driver.close();
	    
	    
	    
	}
	
	

}

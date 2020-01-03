package newpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class asserttest {
	
	public static void main (String[] args) throws Exception{
		
		//assert test
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com"); 
		
		System.out.println(driver.getTitle());
		
		try {
			
			Assert.assertEquals("Google", driver.getTitle());
			
		}
		
		catch (Exception e) {
			System.out.println(e.getStackTrace());
			Assert.assertEquals("Google", driver.getTitle());
		}
			
		finally {
			driver.close();
		}
		
	}

}

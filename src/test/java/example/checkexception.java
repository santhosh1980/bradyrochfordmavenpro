package example;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkexception {
	
	public static void main (String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		
		try {
			//try block
			
			driver.manage().window().maximize();
			 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			String baseurl = "http://demo.guru99.com/test/delete_customer.php";

			driver.get(baseurl);
			
			driver.findElement(By.name("cusid")).sendKeys("332343");
			
			driver.findElement(By.name("submit")).click();
			
			Alert alert1 = driver.switchTo().alert();
			
			System.out.println(alert1.getText());
			
			alert1.accept();
			
			Alert alert2 = driver.switchTo().alert();
			
			System.out.println(alert2.getText());
			
			alert2.accept();
		}
		
		catch(NoSuchElementException e){
			//catch block
			
			System.out.println(e.getMessage());
			
			System.out.println("Element not found");
		}
		
		finally {
			
			//final block
			
			driver.quit();
		}
	}

}

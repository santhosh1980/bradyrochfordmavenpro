package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mysampletestng {
	
	 WebDriver driver;
	 
	 
	 
  @Test(priority=0, groups= {"smoke"})
    
  public void openurl() throws Exception {
	  
	 
	  
	  String baseurl = "http://demo.guru99.com/popup.php";
	  
	  driver.get(baseurl);
	  
	  driver.manage().window().maximize();
		 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
	  
	  
  }
  
  @Test(priority=1, groups= { "feature"})
  
  public void insurance() throws Exception{
	  
	  driver.findElement(By.partialLinkText("Insurance")).click();
	  
	  Thread.sleep(5000);
  }
  
@Test(priority=2, groups= {"smoke", "feature"})
  
  public void agile() throws Exception{
	  
	  driver.findElement(By.partialLinkText("Agile")).click();
	  
	  Thread.sleep(5000);
  }

@Test(priority=3, groups= { "feature"})

public void bank() throws Exception{
	  
	  driver.findElement(By.partialLinkText("Bank")).click();
	  
	  Thread.sleep(5000);
}
  
  @BeforeTest (groups= {"smoke", "feature"})
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterTest (groups= {"smoke", "feature"})
	public void afterTest() {

		driver.close();

	}
}

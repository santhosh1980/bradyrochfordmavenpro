package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestNGPriority {
	
	WebDriver driver;
	
  @Test(priority=0)
  public void f() {
	  
	  System.out.println("Method f");
  }
  
  @Test(priority=2)
  public void b() {
	  
	  System.out.println("Method b");
  }
  
  @Test(priority=1)
  public void c() {
	  
	  System.out.println("Method c");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}

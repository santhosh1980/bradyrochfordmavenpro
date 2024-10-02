package example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleWebdriverManager {
	
		
		@Test
		public void SimpleWebdriverManagerTest() throws Exception {
		
		// Set up the Chrome driver using WebDriver Manager
	    WebDriverManager.chromedriver().setup();

	    // Initialize the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Open a website
	    driver.get("https://nonprod.lawlink.ie");

	    // Your code here (e.g., interact with the website)

	    // Close the browser after use
	    driver.quit();
	}
	
	

}

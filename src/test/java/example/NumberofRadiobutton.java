package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import lib.utility;

import org.junit.Assert;

public class NumberofRadiobutton {

	@Test
	public void NumberofRadiobuttonresults() {

		WebDriver driver = null;

		try {

			// assert test

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

			// System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			driver = new ChromeDriver();

			// WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		

			Thread.sleep(3000);

			//List<WebElement> radioelements = driver.findElements(By.xpath("input[type='radio']"));
			
			/*List<WebElement> radioelements = driver.findElements(By.name("exp"));

			int sizeradioelements = radioelements.size();

			System.out.println("Number of radio elements:" + sizeradioelements);
			
			for (int i=0;i<sizeradioelements;i++) {
				
				WebElement radio = radioelements.get(i);
				
				radio.click();
				
				if (radio.isSelected()){
					System.out.println("Years of experience selected is: " + radio.getAttribute("value"));
					
					Thread.sleep(3000);
				}

				
			}*/
			
			
			
			
			Select mydropdown = new Select(driver.findElement(By.name("continents")));
			
			List<WebElement> mydropdownelements = mydropdown.getOptions();
			
			int mydropdownsize = mydropdownelements.size();
			
			System.out.println("Number of dropdown elements:" + mydropdownsize);
			
			for (int i=0;i<mydropdownsize;i++) {
				
				mydropdown.selectByIndex(i);
				
				System.out.println("The selected value from dropdown is:" + mydropdown.getFirstSelectedOption().getText());
				
				Thread.sleep(3000);
			}
			
			
			
					
			
			driver.quit();

		} catch (Exception ae) {
			// TODO: handle exception

			System.out.println(ae.getMessage());
			driver.quit();

		}

	}

	

}

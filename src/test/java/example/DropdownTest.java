package example;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DropdownTest {
  @Test
  public void DropdownTestResults() throws InterruptedException {
	  
	  WebDriver driver = null;
	  
	  try {
		  
		//Initialize Chrome driver
		  driver = new ChromeDriver();
		  
		  //Navigate to the URL
		  driver.get("https://demo.guru99.com/test/guru99home/");
		  
		  //Locate drop down element
		  WebElement dropdownelement = driver.findElement(By.id("awf_field-91977689"));
		  
		  //Create select object
		  Select dropdown = new Select(dropdownelement);
		  
		  //Get all options in drop down
		  List<WebElement> options = dropdown.getOptions();
		  
		  System.out.println("Course options are:");
		  
		  //Get the text of all options
		  for(WebElement option: options) {
			  System.out.println(option.getText());
		  }
		  
		  //Get the number of drop down elements
		  int optionssize = options.size();
		  
		  System.out.println("The number of options in Course drop down is:" + optionssize);
		  
		  //Select the last option
		  dropdown.selectByIndex(optionssize-1);
		  
		  //Wait for 5 seconds
		  Thread.sleep(5000);
		  
		  //Get the selected option from the drop down
		  WebElement selectedoption =  dropdown.getFirstSelectedOption();
		  
		  //Soft Assertion
		  //SoftAssert sa = new SoftAssert();
		  //sa.assertEquals(selectedoption.getText(), "SAP HAN");
		  
		  //Assertion
		  Assert.assertEquals(selectedoption.getText(), "SAP HANA");
		  
		  //Close browser
		  driver.quit();
		  
	  }
	  catch (Exception e) {
		// TODO: handle exception
		  
		  System.out.println(e.getMessage());
		//Close browser
		  driver.quit();
	}
	  
	  
	  
  }
}

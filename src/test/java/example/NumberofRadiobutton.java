package example;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.bs.I.Is;
import lib.utility;
import pagefactory.examplepage;

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
			
			examplepage ep = new examplepage(driver);

			driver.manage().window().maximize();

			//Selenium 3
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selenium 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		

			Thread.sleep(3000);
			
			//Textbox fields
			
						
			ep.setexamplefirstname("Testfirstname1");
			
			ep.setexamplelastname("Testlastname1");
			
						
			System.out.println("Firstname field value is:"+ep.getexamplefirstname());
			
			System.out.println("Lastname field value is:"+ep.getexamplelastname());
			
//			if(fname.getText().equals("Testfirstname1")) {
//				System.out.println("Firstname field value is:"+fname.getText());
//			}
//			
//			if(lname.getText().equals("Testlastname1")) {
//				System.out.println("Lastname field value is:"+lname.getText());
//			}
			
			
			//Radio buttons - Years of experience

			//List<WebElement> radioelements = driver.findElements(By.xpath("input[type='radio']"));
			
			List<WebElement> radioelements = ep.getexampleyearsradioelements();

			int sizeradioelements = radioelements.size();

			System.out.println("Number of radio elements:" + sizeradioelements);
			
			for (int i=0;i<sizeradioelements;i++) {
				
				WebElement radio = radioelements.get(i);
				
				radio.click();
				
				if (radio.isSelected()){
					System.out.println("Years of experience selected is: " + ep.getexampleyearradio(radio));
					
					Thread.sleep(3000);
				}

				
			}
			
			//Checkbox - Profession
			
			List<WebElement> checkboxelements = ep.getprofessioncheckboxelements();

			int sizecheckboxelements = checkboxelements.size();

			System.out.println("Number of checkbox elements:" + sizecheckboxelements);
			
			for (int i=0;i<sizecheckboxelements;i++) {
				
				WebElement checkbox = checkboxelements.get(i);
				
				checkbox.click();
				
				if (checkbox.isSelected()){
					System.out.println("Profession selected is: " + ep.getexampleprofessioncheckbox(checkbox));
					
					Thread.sleep(3000);
				}

				
			}
			
			
			//Drop-downs
			
			Select mydropdown = ep.getexamplecontinentsdropdownelements();
			
			String dropdowntext = null;
			
			boolean check1 = mydropdown.isMultiple();
			
			if(check1==true) {
				System.out.println("Allows selection of multiple items");
			}
			
			else {
				System.out.println("Allows selection of single item");
			}
			
			List<WebElement> mydropdownelements = mydropdown.getOptions();
			
			System.out.println("Continents Options are:");
			
			for (WebElement ele:mydropdownelements) {
				
				dropdowntext = ep.getdropdownelementtext(ele);
				System.out.println(dropdowntext);
			}
			
			int mydropdownsize = mydropdownelements.size();
			
			System.out.println("Number of dropdown elements:" + mydropdownsize);
			
			for (int i=0;i<mydropdownsize;i++) {
				
				mydropdown.selectByIndex(i);
				
				System.out.println("The selected value from continent dropdown is:" + mydropdown.getFirstSelectedOption().getText());
				
				
				
				Thread.sleep(3000);
			}
			
			
			
			//multi-select Drop-downs	
			
			Select mymultiselectdropdown = ep.getexampleseleniumcommandsdropdownelements();
			
						
			boolean check2 = mymultiselectdropdown.isMultiple();
			
			if(check2==true) {
				System.out.println("Allows selection of multiple items");
			}
			
			else {
				System.out.println("Allows selection of single item");
			}
			
			List<WebElement> mymultiselectdropdownelements = mymultiselectdropdown.getOptions();
			
			System.out.println("Selenium commands Options are:");
			
			for (WebElement ele:mymultiselectdropdownelements) {
				
				dropdowntext = ep.getdropdownelementtext(ele);
				System.out.println(dropdowntext);
			}
			
			int mymultiselectdropdownsize = mymultiselectdropdownelements.size();
			
			for (int i=0;i<mymultiselectdropdownsize;i++) {
				
								
				// key chord string
				
				//String mykeychord = Keys.chord(Keys.CONTROL,Keys.ENTER);
				
				
				mymultiselectdropdown.selectByIndex(i);
			
				List<WebElement> myselectedoptions = mymultiselectdropdown.getAllSelectedOptions();
				
				System.out.println("The selected options from selenium commands are:");
				
				for(WebElement myele:myselectedoptions) {
					
					dropdowntext = ep.getdropdownelementtext(myele);
					System.out.println(dropdowntext);
				}
			
				
				
				
				
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

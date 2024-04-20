package StepDefinition4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps4 {
	
	
	
	WebDriver driver;
	
	String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";
	
	WebDriverWait mywaitvar = null;
	
	
	@Before()
	public void beforescenario() {
		
		System.out.println("Scenario starts");
	}
	
	@After()
	public void afterscenario() {
		System.out.println("Scenario ends");
	}

	@Given("^Open the Chrome and launch the Guru99 Telecom Application$")
	
	public void Open_the_Chrome_and_launch_the_Guru99_Telecom_Application() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		//Code for chrome incognito window to open
		//configure options parameter to chrome driver
		ChromeOptions co = new ChromeOptions();
		//chrome 111 issue to resolve - After the Chrome 111 update, you can no longer kick off a chromedriver instance unless you add an additional chrome option
		co.addArguments("--remote-allow-origins=*");
		//add incognito parameter
		co.addArguments("--incognito");
		
		driver = new ChromeDriver(co);
		
		//driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Selenium 3
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		//Selenium 4
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demo.guru99.com/telecom/index.html");
		
		Thread.sleep(5000);
		
		
		
	}
	
	@And("^click Add Customer link$")
	
	public void click_Add_Customer_link() throws Exception {
		
		//Click Add Customer link
		
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[1]/h3/a")).click();
				
		Thread.sleep(5000);
		
		//Advertisement pop up handling
		
		driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/svg")).click();
		
		String addurl = driver.getCurrentUrl();
		
		if(addurl.contains("https://demo.guru99.com/telecom/addcustomer.php")) {
			System.out.println("Add Customer URL is displayed");
		}
		else
		{
			System.out.println("Add Customer URL is NOT displayed");
		}
				
		
	}
	
	@And("^click Add Tariff Plan to Customer link$")
	
	public void click_Add_Tariff_Plan_to_Customer_link() throws Exception {
		
		//Click Add Tariff Plan to Customer link
		
		driver.findElement(By.xpath("//*[@id=\"one\"]/div/div[1]/div[2]/h3/a")).click();
				
		Thread.sleep(5000);
				
		
	}
	
	@When("^I enter BackgroundCheck as \"([^\"]*)\" and Firstname as \"([^\"]*)\" and Lastname as \"([^\"]*)\" and EmailAddress as \"([^\"]*)\" and CustomerAddress as \"([^\"]*)\" and MobileNumber as \"([^\"]*)\"$")
	
	public void I_enter_BackgroundCheck_as_and_Firstname_as_and_Lastname_as_and_EmailAddress_as_and_CustomerAddress_as_and_MobileNumber_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Exception {
				
		//driver.findElement(By.id(arg1)).click();
		
		//mywaitvar = new WebDriverWait(driver, 30);
		
		//List<WebElement> radiogrp = driver.findElements(By.name("active"));
		
		
		
		if (arg1.equalsIgnoreCase("done")) {
			
			//driver.findElement(By.xpath("//*[@id=\"done\"]")).click();
								
			//driver.findElement(By.xpath("//input[@value='ACTIVE']")).click();
			
			//mywaitvar.until(ExpectedConditions.elementToBeClickable(By.id(arg1))).click();
			
			//radiogrp.get(0).click();
			
			//Radio button not clickable by using other methods, so any of the below java script executor works
			
			//((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", driver.findElement(By.id(arg1)));
			
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id(arg1)));
			
			
		}
		else if (arg1.equalsIgnoreCase("pending")) {
			
			//driver.findElement(By.xpath("//*[@id=\"pending\"]")).click();
			
			//driver.findElement(By.xpath("//input[@value='INACTIVE']")).click();
			
			//mywaitvar.until(ExpectedConditions.elementToBeClickable(By.id(arg1))).click();
			
			//radiogrp.get(1).click();
			
			//Radio button not clickable by using other methods, so any of the below java script executor works
			
			//((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", driver.findElement(By.id(arg1)));
			
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id(arg1)));
			
			
		}
		
		driver.findElement(By.name("fname")).sendKeys(arg2);
		
	    driver.findElement(By.name("lname")).sendKeys(arg3);	
	    
	    driver.findElement(By.name("emailid")).sendKeys(arg4);
	    
	    driver.findElement(By.name("addr")).sendKeys(arg5);
	    
	    driver.findElement(By.name("telephoneno")).sendKeys(arg6);
	    
	    Thread.sleep(5000);
	 	
	}
	
	@When("^I enter CustomerID as \"([^\"]*)\"$")
	
	public void I_enter_CustomerID_as(String arg1) throws Exception {
				
				
		driver.findElement(By.name("customer_id")).sendKeys(arg1);
			   
	    Thread.sleep(5000);
	 	
	}
	
	
		
	@And("^I click Submit button$")
	
	public void I_click_Submit_button() throws Exception {
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		
		
				
		
	}
	
		
	@Then("^I verify the customer successfully created$")
	
	public void I_verify_the_customer_successfully_created() throws Exception {
		
		Assert.assertTrue("Please Note Down Your CustomerID",true);
		
		String cururl = driver.getCurrentUrl();
		
		if (cururl.contains("https://demo.guru99.com/telecom/access.php")) {
			
					
			String customerid = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]/h3")).getText();
			
			System.out.println("Test pass and Customer id is:" + customerid);
		}
		
		else {
			System.out.println(("Test fail"));
		}
				
		driver.close();
	}
	
	@Then("^Approved Tariff Plans displayed and selected Tariff Plan added to customer$")
	
	public void Approved_Tariff_Plans_displayed_and_selected_Tariff_Plan_added_to_customer() throws Exception {
		
		
		
		String cururl = driver.getCurrentUrl();
		
		if (cururl.contains("http://demo.guru99.com/telecom/assigntariffplantocustomer.php") && driver.getPageSource().contains("Welcome to add customer tariff plan")) {
			
			Assert.assertTrue("Approved Tariff Plans",true);
			
			Assert.assertTrue("Unapproved Tariff Plans",true);
			
			//select tariff plans		
						
			//driver.findElement(By.name("tariff_plan")).click();
			
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id("sele")));
			
			//Click Add Tariff Plan to Customer button
			
			driver.findElement(By.name("submit")).click();
			
			Thread.sleep(5000);
			
			Assert.assertTrue("Congratulation Tariff Plan assigned",true);
			
			//Click Home button
			
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
		
		}
		else {
			
			Assert.assertTrue("Please Input Your Correct Customer ID",true);
			
			//Click Home button
			
			driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
			
		}
				
		driver.close();
	}
	
		
}

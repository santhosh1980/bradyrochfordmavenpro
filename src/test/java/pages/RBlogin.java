package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RBlogin {
	
	WebDriver driver;
	
	By rbusername = By.id("userName");
	
	By rbpassword= By.id("password");
	
	By rblawlinkloginbutton = By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img");
	
	
	public RBlogin(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//set username
	
	public void setusername(String strUsername) {
		
		this.driver.findElement(rbusername).sendKeys(strUsername);
	}
	
	//set password
	
	public void setpassword(String strPassword) {
		
		this.driver.findElement(rbpassword).sendKeys(strPassword);
	}
	
	//click lawlinklogin button
	
	public void clicklawlinklogin() {
		
		this.driver.findElement(rblawlinkloginbutton).click();
	}
	
	
}

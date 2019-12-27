package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myRBlogin {

	WebDriver driver;

	@FindBy(id = "userName")

	WebElement rbusername;

	@FindBy(id = "password")

	WebElement rbpassword;

	@FindBy(xpath = "//*[@id=\"loginpanel\"]/form/p[3]/a/img")

	WebElement rblawlinkloginbutton;

	@FindBy(className = "submit")

	WebElement rbCIDloginbutton;

	

	public myRBlogin(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	// set username

	public void setusername(String strUsername) {

		rbusername.sendKeys(strUsername);
	}

	// set password

	public void setpassword(String strPassword) {

		rbpassword.sendKeys(strPassword);
	}

	// click lawlinklogin button

	public void clicklawlinklogin() {

		rblawlinkloginbutton.click();
	}

	// click CIDlogin button

	public void clickCIDlogin() {

		rbCIDloginbutton.click();
	}

	
}

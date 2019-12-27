package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myRBcommon {

	WebDriver driver;

	@FindBy(name = "userRef")

	WebElement rbuserRef;

	@FindBy(name = "surname")

	WebElement rbsurname;

	@FindBy(name = "firstName")

	WebElement rbfirstname;
	
	

	public myRBcommon(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	// set UserRef

	public void setuserRef(String strUserRef) {

		rbuserRef.sendKeys(strUserRef);
	}

	// set surname

	public void setsurname(String strsurname) {

		rbsurname.sendKeys(strsurname);
	}

	// set firstname

	public void setfirstname(String strfirstname) {

		rbfirstname.sendKeys(strfirstname);
	}
}

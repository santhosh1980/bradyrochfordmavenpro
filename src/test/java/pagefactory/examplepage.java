package pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class examplepage {

	WebDriver driver;

	@FindBy(name = "firstname")

	WebElement exfirstname;

	@FindBy(name = "lastname")

	WebElement exlastname;

	/*
	 * @FindBys({
	 * 
	 * @FindBy(id="calcSearchTerm"),
	 * 
	 * @FindBy(name="calcSearchTerm") })
	 */

	@FindBy(id = "calcSearchTerm")

	WebElement calcsearchbox;

	public examplepage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	// set firstname

	public void setexamplefirstname(String strexfirstname) {

		exfirstname.sendKeys(strexfirstname);
	}

	// set lastname

	public void setexamplelastname(String strexlastname) {

		exlastname.sendKeys(strexlastname);
	}

	// get firstname

	public String getexamplefirstname() {

		String ftext = exfirstname.getAttribute("value");

		return ftext;
	}

	// get lastname

	public String getexamplelastname() {

		String ltext = exlastname.getAttribute("value");

		return ltext;
	}

	// radio elements - Years of experience

	public List<WebElement> getexampleyearsradioelements() {

		List<WebElement> radioelementsyears = driver.findElements(By.name("exp"));

		return radioelementsyears;
	}

	// get selected year radio

	public String getexampleyearradio(WebElement yearradio) {

		String yearradiotext = yearradio.getAttribute("value");

		return yearradiotext;
	}

	// checkbox elements - profession

	public List<WebElement> getprofessioncheckboxelements() {

		List<WebElement> checkboxelementsprofession = driver.findElements(By.name("profession"));

		return checkboxelementsprofession;
	}

	// get selected profession checkbox

	public String getexampleprofessioncheckbox(WebElement professioncheckbox) {

		String professioncheckboxtext = professioncheckbox.getAttribute("value");

		return professioncheckboxtext;
	}

	// drop down elements - Continents

	public Select getexamplecontinentsdropdownelements() {

		Select mysingleselectdropdown = new Select(driver.findElement(By.name("continents")));

		return mysingleselectdropdown;
	}

	// drop down elements - selenium commands

	public Select getexampleseleniumcommandsdropdownelements() {

		Select mymultiselectdropdown = new Select(driver.findElement(By.name("selenium_commands")));

		return mymultiselectdropdown;
	}

	// Link elements

	public List<WebElement> getlinkelements() {

		List<WebElement> linkelements = driver.findElements(By.tagName("a"));

		return linkelements;
	}

	// get link text

	public String getlinktext(WebElement linkele) {

		String linktext = linkele.getText();

		return linktext;
	}

	// set calculator search text value

	public void setcalcseartchtext(String calctext) {

		calcsearchbox.sendKeys(calctext);
	}

	// search anchor elements

	public List<WebElement> getsearchanchorelements() {

		List<WebElement> searchanchorelements = driver.findElements(By.cssSelector("div#calcSearchOut a"));

		return searchanchorelements;
	}

}

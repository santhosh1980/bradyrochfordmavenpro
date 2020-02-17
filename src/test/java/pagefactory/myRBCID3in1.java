package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myRBCID3in1 {

	WebDriver driver;

	@FindBy(name = "clientRef")

	WebElement rbclientRef;

	@FindBy(name = "chkCRO")

	WebElement rbCID3in1CRO;

	@FindBy(name = "chkJudg")

	WebElement rbCID3in1Judg;

	@FindBy(name = "chkIsi")

	WebElement rbCID3in1ISI;

	@FindBy(xpath = "/html/body/div/div[3]/form/div[4]/div/input")

	WebElement rbCID3in1Next;

	@FindBy(name = "compNum")

	WebElement rbCID3in1CompanyNumber;

	@FindBy(id = "Find")

	WebElement rbCID3in1CompanyFind;

	@FindBy(xpath = "//*[@id=\"0\"]")

	WebElement rbCID3in1CompanyConfirm;

	@FindBy(name = "surname")

	WebElement rbCID3in1Judgmentsurname;

	@FindBy(name = "firstName")

	WebElement rbCID3in1Judgmentfirstname;

	@FindBy(name = "isi-last-name")

	WebElement rbCID3in1ISIsurname;

	@FindBy(name = "isi-first-name")

	WebElement rbCID3in1ISIfirstname;

	@FindBy(xpath = "/html/body/div/div[3]/div[1]/div[2]/table/tbody/tr[2]/td[5]/input")

	WebElement rbCID3in1AddJudgment;

	@FindBy(xpath = "/html/body/div/div[3]/div[1]/div[3]/table/tbody/tr[1]/td[5]/input")

	WebElement rbCID3in1AddISI;

	@FindBy(xpath = "/html/body/div/div[3]/div[1]/div[5]/div/input")

	WebElement rbCID3in1Submit;

	@FindBy(xpath = "//*[@id=\"all_reports\"]/a/p")

	WebElement rbCID3in1PDF;

	public myRBCID3in1(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	// set CID 3in1 clientRef

	public void setclientRef(String strClientRef) {

		rbclientRef.sendKeys(strClientRef);
	}

	// Click CID 3in1 CRO

	public void clickCID3in1CRO() {

		rbCID3in1CRO.click();
	}

	// Click CID 3in1 Judgment & Bankruptcy

	public void clickCID3in1Judg() {

		rbCID3in1Judg.click();
	}

	// Click CID 3in1 ISI

	public void clickCID3in1ISI() {

		rbCID3in1ISI.click();
	}

	// Click CID 3in1 Next

	public void clickCID3in1Next() {

		rbCID3in1Next.click();
	}

	// set CID 3in1 company number

	public void setcompanynumber(String strcompanynumber) {

		rbCID3in1CompanyNumber.sendKeys(strcompanynumber);
	}

	// Click CID 3in1 Company Find

	public void clickCID3in1CompanyFind() {

		rbCID3in1CompanyFind.click();
	}

	// Click CID 3in1 Company Confirm

	public void clickCID3in1CompanyConfirm() {

		rbCID3in1CompanyConfirm.click();
	}

	// set judgment/bankruptcy surname

	public void setjudgsurname(String strsurname) {

		rbCID3in1Judgmentsurname.sendKeys(strsurname);
	}

	// set judgment/bankruptcy firstname

	public void setjudgfirstname(String strfirstname) {

		rbCID3in1Judgmentfirstname.sendKeys(strfirstname);
	}

	// set ISI surname

	public void setisisurname(String strsurname) {

		rbCID3in1ISIsurname.sendKeys(strsurname);
	}

	// set ISI firstname

	public void setisifirstname(String strfirstname) {

		rbCID3in1ISIfirstname.sendKeys(strfirstname);
	}

	// Click Add Judgment

	public void clickCID3in1AddJudgment() {

		rbCID3in1AddJudgment.click();
	}

	// Click Add ISI

	public void clickCID3in1AddISI() {

		rbCID3in1AddISI.click();
	}

	// Click Submit

	public void clickCID3in1Submit() {

		rbCID3in1Submit.click();
	}

	// Click PDF

	public void clickCID3in1PDF() {

		rbCID3in1PDF.click();
	}
}

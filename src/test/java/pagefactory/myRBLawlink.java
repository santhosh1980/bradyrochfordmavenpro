package pagefactory;

import java.sql.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myRBLawlink {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"header_right\"]/p/span/a")

	WebElement rbLawlinkLoginNowLink;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[3]/li[2]/a")

	WebElement rbLawlinkBankruptcyLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div/form/table[2]/tbody/tr[2]/td[3]/a/img")

	WebElement rbLawlinkAddSearch;

	@FindBy(name = "search")

	WebElement rbLawlinkSearch;

	@FindBy(name = "viewReports")

	WebElement rbLawlinkBankruptcyViewReports;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/table/tbody/tr[2]/td/a")

	WebElement rbLawlinkBankruptcyPDF;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[3]/li[1]/a")

	WebElement rbLawlinkJudgementLink;

	@FindBy(name = "viewJudgments")

	WebElement rbLawlinkJudgementViewJudgements;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/div[1]/p/a[2]")

	WebElement rbLawlinkJudgementPDF;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[3]/li[4]/a")

	WebElement rbLawlinkCompanyLink;

	@FindBy(name = "compNumber")

	WebElement rbCompanyNumber;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[1]/li[2]/a")

	WebElement rbLawlinkDirectorLink;

	@FindBy(name = "dirName")

	WebElement rbDirectorName;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[3]/li[3]/a")

	WebElement rbLawlinkISILink;

	@FindBy(xpath = "//*[@id=\"isi_reports\"]/a/table/tbody/tr/td[2]/p")

	WebElement rbLawlinkISIPDF;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[2]/li/a")

	WebElement rbLawlinkClosingSearchLink;

	@FindBy(name = "chkJudg")

	WebElement rbLawlinkClosingCheckJudgBox;

	@FindBy(name = "next")

	WebElement rbLawlinkClosingNext;

	@FindBy(id = "AddName")

	WebElement rbLawlinkClosingAddName;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/table[2]/tbody/tr[3]/td/input")

	WebElement rbLawlinkClosingOnlineSubmitLink;

	@FindBy(xpath = "//*[@id=\"all_reports\"]/a/p")

	WebElement rbLawlinkClosingPDF;

	@FindBy(name = "chkDeeds")

	WebElement rbLawlinkClosingCheckDeedsBox;

	@FindBy(name = "requiredBy")

	WebElement rbLawlinkClosingRequiredBy;

	@FindBy(xpath = "//*[@id=\"step3\"]/table/tbody/tr[3]/td[2]/input[2]")

	WebElement rbLawlinkClosingdeliverBy;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/table[3]/tbody/tr[3]/td/input")

	WebElement rbLawlinkClosingOfflineSubmitLink;

	@FindBy(name = "chkCRO")

	WebElement rbLawlinkClosingCheckCROBox;

	@FindBy(name = "compNum")

	WebElement rbClosingCompanyNumber;

	@FindBy(className = "right")

	WebElement rbLawlinkClosingCompanyFind;

	@FindBy(name = "chkPlan")

	WebElement rbLawlinkClosingCheckPlanningBox;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/table[2]/tbody/tr[3]/td/input")

	WebElement rbLawlinkClosingPlanningSubmitLink;

	@FindBy(name = "chkReceiverOfFines")

	WebElement rbLawlinkClosingCheckROFBox;

	@FindBy(id = "chkSheriff")

	WebElement rbLawlinkClosingCheckSheriffBox;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[1]/li[3]/a")

	WebElement rbLawlinkWatchlistLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/table/tbody/tr[2]/td[2]/a")

	WebElement rbLawlinkNewWatchlistLink;

	@FindBy(id = "radCompany")

	WebElement rbLawlinkWatchType;

	@FindBy(name = "compNum")

	WebElement rbWatchlistCompanyNumber;

	@FindBy(xpath = "//*[@id=\"companyWatch\"]/table/tbody/tr[2]/td[3]/input")

	WebElement rbLawlinkWatchlistFind;

	@FindBy(id = "chkStatus")

	WebElement rbLawlinkWatchlistStatusChange;

	@FindBy(id = "chkARD")

	WebElement rbLawlinkWatchlistARD;

	@FindBy(xpath = "//*[@id=\"compform\"]/table/tbody/tr[6]/td[3]/input")

	WebElement rbLawlinkWatchlistSubmit;

	@FindBy(name = "chkWindup")

	WebElement rbLawlinkClosingCheckWindingUpBox;

	public myRBLawlink(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	// Click Lawlink Login Now Link

	public void clickLawlinkLoginNowlink() {

		rbLawlinkLoginNowLink.click();
	}

	// Click Lawlink Bankruptcy Link

	public void clickLawlinkBankruptcylink() {

		rbLawlinkBankruptcyLink.click();
	}

	// Click Lawlink Add name to Search link

	public void clickLawlinkAddSearchLink() {

		rbLawlinkAddSearch.click();
	}

	// Click Lawlink Search link

	public void clickLawlinkSearchLink() {

		rbLawlinkSearch.click();
	}

	// Click Lawlink Bankruptcy View Reports link

	public void clickLawlinkBankruptcyViewReportsLink() {

		rbLawlinkBankruptcyViewReports.click();
	}

	// Click Lawink Bankruptcy PDF link

	public void clickLawlinkBankruptcyPDFLink() {

		rbLawlinkBankruptcyPDF.click();
	}

	// Click Lawlink Judgement Link

	public void clickLawlinkJudgementlink() {

		rbLawlinkJudgementLink.click();
	}

	// Click Lawlink Judgement View Judgements link

	public void clickLawlinkJudgementViewJudgementsLink() {

		rbLawlinkJudgementViewJudgements.click();
	}

	// Click Lawink Judgement PDF link, Click Lawlink Company PDF link

	public void clickLawlinkJudgementPDFLink() {

		rbLawlinkJudgementPDF.click();
	}

	// Click Lawlink Company Link

	public void clickLawlinkCompanylink() {

		rbLawlinkCompanyLink.click();
	}

	// Set company number

	public void setcompanynumber(String strcompanynumber) {

		rbCompanyNumber.sendKeys(strcompanynumber);
	}

	// Click Lawlink Director Link

	public void clickLawlinkDirectorlink() {

		rbLawlinkDirectorLink.click();
	}

	// Set director name

	public void setdirectorname(String strdirectorname) {

		rbDirectorName.sendKeys(strdirectorname);
	}

	// Click Lawlink ISI Link

	public void clickLawlinkISIlink() {

		rbLawlinkISILink.click();
	}

	// Click Lawink ISI PDF link

	public void clickLawlinkISIPDFLink() {

		rbLawlinkISIPDF.click();
	}

	// Click Lawlink Closing Search Link

	public void clickLawlinkClosingSearchlink() {

		rbLawlinkClosingSearchLink.click();
	}

	// select the Lawlink Closing Search Checkbox - Judgment/Bankruptcy & Personal
	// Insolvency (ISI)

	public void selectLawlinkClosingCheckJudgBox() {

		rbLawlinkClosingCheckJudgBox.click();
	}

	// Click Lawlink Closing Search Next link

	public void clickLawlinkClosingNextLink() {

		rbLawlinkClosingNext.click();
	}

	// Click Lawlink Closing Search Add Name

	public void clickLawlinkClosingAddNameLink() {

		rbLawlinkClosingAddName.click();
	}

	// Click Lawlink Closing Search Online Submit Link

	public void clickLawlinkClosingOnlineSubmitlink() {

		rbLawlinkClosingOnlineSubmitLink.click();
	}

	// Click Lawink Closing Search PDF link

	public void clickLawlinkClosingPDFLink() {

		rbLawlinkClosingPDF.click();
	}

	// Select Registry of Deeds checkbox

	public void selectLawlinkClosingCheckDeedsBox() {

		rbLawlinkClosingCheckDeedsBox.click();
	}

	// Set Required by

	public void setrequiredby(String strrequiredby) {

		rbLawlinkClosingRequiredBy.sendKeys(strrequiredby);
	}

	// Set Deliver by

	public void setdeliverby() {

		rbLawlinkClosingdeliverBy.click();
	}

	// Click Lawlink Closing Search Offline Submit Link

	public void clickLawlinkClosingOfflineSubmitlink() {

		rbLawlinkClosingOfflineSubmitLink.click();
	}

	// select the Lawlink Closing Search CRO Checkbox

	public void selectLawlinkClosingCheckCROBox() {

		rbLawlinkClosingCheckCROBox.click();
	}

	// Set Closing search company number

	public void setclosingcompanynumber(String strclosingcompanynumber) {

		rbClosingCompanyNumber.sendKeys(strclosingcompanynumber);
	}

	// Click Lawlink Closing Search Company find link

	public void clickLawlinkClosingCompanyFindLink() {

		rbLawlinkClosingCompanyFind.click();
	}

	// select the Lawlink Closing Search Checkbox - Planning

	public void selectLawlinkClosingCheckPlanningBox() {

		rbLawlinkClosingCheckPlanningBox.click();
	}

	// Click Lawlink Closing Search Offline Planning Submit Link

	public void clickLawlinkClosingPlanningSubmitlink() {

		rbLawlinkClosingPlanningSubmitLink.click();
	}

	// select the Lawlink Closing Search Checkbox - Receiver of Fine

	public void selectLawlinkClosingCheckROFBox() {

		rbLawlinkClosingCheckROFBox.click();
	}

	// select the Lawlink Closing Search Checkbox - Sheriff

	public void selectLawlinkClosingCheckSheriffBox() {

		rbLawlinkClosingCheckSheriffBox.click();
	}

	// Click Lawlink Watchlist link

	public void clickLawlinkWatchlistLink() {

		rbLawlinkWatchlistLink.click();
	}

	// Click Lawlink New Watchlist link

	public void clickLawlinkNewWathclistLink() {

		rbLawlinkNewWatchlistLink.click();
	}

	// Select Lawlink Watch type

	public void clickLawlinkWatchType() {

		rbLawlinkWatchType.click();
	}

	// Set watchlist company number

	public void setwatchlistcompanynumber(String strwatchlistcompanynumber) {

		rbWatchlistCompanyNumber.sendKeys(strwatchlistcompanynumber);
	}

	// Click Lawlink Watchlist Find

	public void clickLawlinkWatchlistFindLink() {

		rbLawlinkWatchlistFind.click();
	}

	// Select Lawlink Watchlist Status Change

	public void clickLawlinkWatchlistStatusChange() {

		rbLawlinkWatchlistStatusChange.click();
	}

	// Select Lawlink Watchlist ARD

	public void clickLawlinkWatchlistARD() {

		rbLawlinkWatchlistARD.click();
	}

	// Click Lawlink Watchlist Submit

	public void clickLawlinkWatchlistSubmit() {

		rbLawlinkWatchlistSubmit.click();
	}

	// select the Lawlink Closing Search Checkbox - Winding up

	public void selectLawlinkClosingCheckWindingUpBox() {

		rbLawlinkClosingCheckWindingUpBox.click();
	}
}

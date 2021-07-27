package pagefactory;

import java.util.List;
import java.sql.Date;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/form/p[2]/input")

	WebElement rbLawlinkBankruptcyAcceptCharge;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/form/p[3]/input")

	WebElement rbLawlinkJudgmentAcceptCharge;

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

	@FindBy(xpath = "//*[@id=\"plan1\"]/table/tbody/tr[4]/td/span/a")

	WebElement rbLawlinkClosingAnotherPlanningSearchLink;
	
	@FindBy(xpath = "//*[@id=\"receiverOfFines1\"]/table/tbody/tr[6]/td/span/a")

	WebElement rbLawlinkClosingAnotherReceiverOfFineSearchLink;
	
	@FindBy(xpath ="//*[@id=\"sheriff1\"]/table/tbody/tr[6]/td/span/a" )

	WebElement rbLawlinkClosingAnotherSheriffSearchLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/table[2]/tbody/tr[3]/td/input")

	WebElement rbLawlinkClosingPlanningSubmitLink;

	@FindBy(name = "chkReceiverOfFines")

	WebElement rbLawlinkClosingCheckROFBox;

	@FindBy(id = "chkSheriff")

	WebElement rbLawlinkClosingCheckSheriffBox;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[1]/li[3]/a")

	WebElement rbLawlinkWatchlistLink;

	@FindBy(xpath = "//*[@id=\"leftmenu\"]/ul[1]/li[5]/a")

	WebElement rbLawlinkViewWatchlistLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/table/tbody/tr[2]/td[2]/a")

	WebElement rbLawlinkNewWatchlistLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/p[2]/a")

	WebElement rbLawlinkWatchlistHereLink;

	@FindBy(css = "input[value='Delete Selected Item(s)']")

	WebElement rbLawlinkDeleteSelectedWatchlistItemButton;

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
	
	@FindBy(name = "windupCompNum")

	WebElement rbLawlinkWindingUpCompanyNumber;
	
	@FindBy(id = "Find")

	WebElement rbLawlinkWindingUpFind;
	
	@FindBy(id = "0")

	WebElement rbLawlinkAddWindingUpCompany;

	@FindBy(xpath = "//*[@id=\"header_right\"]/ul/li[1]/a")

	WebElement rbLawlinkHomeLink;

	@FindBy(xpath = "//*[@id=\"header_right\"]/ul/li[2]/a")

	WebElement rbLawlinkAboutUsLink;

	@FindBy(xpath = "//*[@id=\"header_right\"]/ul/li[3]/a")

	WebElement rbLawlinkSubscribeLink;

	@FindBy(xpath = "//*[@id=\"header_right\"]/ul/li[4]/a")

	WebElement rbLawlinkCostsLink;

	@FindBy(xpath = "//*[@id=\"header_right\"]/ul/li[5]/a")

	WebElement rbLawlinkSupportLink;

	@FindBy(xpath = "//*[@id=\"header_right\"]/ul/li[6]/a")

	WebElement rbLawlinkContactUsLink;

	@FindBy(xpath = "//*[@id=\"panel_col_1\"]/div[2]/p/a")

	WebElement rbLawlinkEmailHomeLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/p[3]/a")

	WebElement rbLawlinkEmailCostLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/p[2]/a")

	WebElement rbLawlinkEmailSupportLink;

	@FindBy(xpath = "//*[@id=\"panel_col_2\"]/p[4]/a")

	WebElement rbLawlinkEmailContactUsSupportLink;

	@FindBy(xpath = "//*[@id=\"panel_col_2\"]/p[5]/a")

	WebElement rbLawlinkEmailContactUsReigstrationLink;

	@FindBy(xpath = "//*[@id=\"panel_col_2\"]/p[6]/a")

	WebElement rbLawlinkEmailContactUsBillingLink;

	@FindBy(xpath = "//*[@id=\"panel\"]/div[1]/p[4]/a")

	WebElement rbLawlinkEmailClosingSearchLink;

	@FindBy(id = "emailAddress")

	WebElement rbLawlinkCaptchaEmailAddress;

	@FindBy(id = "emailSubject")

	WebElement rbLawlinkCaptchaEmailSubject;

	@FindBy(id = "emailContent")

	WebElement rbLawlinkCaptchaEmailContent;

	@FindBy(id = "captchaAnswer")

	WebElement rbLawlinkCaptchaAnswer;

	@FindBy(name = "Submit")

	WebElement rbLawlinkCaptchaSubmit;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/p[2]/a")

	WebElement rbLawlinkCaptchaGoBack;

	@FindBy(xpath="//*[@id=\"leftmenu\"]/ul[1]/li[1]/a")

	WebElement rbLawlinkCompanyCompanyLink;

	@FindBy(xpath="//*[@id=\"leftmenu\"]/ul[1]/li[3]/a")

	WebElement rbLawlinkCompanyBusinessLink;

	@FindBy(xpath="//*[@id=\"panel\"]/div[1]/table/tbody/tr/td[1]/a")

	WebElement rbLawlinkBusinessNumberLink;

	@FindBy(name="acceptCharge")

	WebElement rbLawlinkAcceptChargeLink;

	@FindBy(className="input")

	WebElement rbLawlinkGetDirectorDetailsLink;

	@FindBy(xpath="//*[@id=\"leftmenu\"]/ul[1]/li[5]/a")

	WebElement rbLawlinkCompanyDocumentLink;

	@FindBy(name = "documentGroup")

	WebElement rbLawlinkDocumentType;

	@FindBy(name="Submit")

	WebElement rbLawlinkAcceptChargeSubmit;

	@FindBy(name="docButton")

	WebElement rbLawlinkDocumentOrder;

	@FindBy(xpath="//*[@id=\"leftmenu\"]/ul[1]/li[4]/a")

	WebElement rbLawlinkSubmissionNUmberLink;

	@FindBy(name="submissionNum")

	WebElement rbSubmissionNumber;

	@FindBy(name="submissionDocNum")

	WebElement rbSubmissionDocNumber;

	@FindBy(xpath="//*[@id=\"form1\"]/table/tbody/tr[3]/td/input[1]")

	WebElement rbLawlinkWebDownloadRadioButton;

	@FindBy(xpath="//*[@id=\"form1\"]/table/tbody/tr[3]/td/input[2]")

	WebElement rbLawlinkDeliverByEmailRadioButton;

	@FindBy(xpath="//*[@id=\"formgeneric\"]/table/tbody/tr[1]/td[1]/input")

	WebElement rbLawlinkViewOnlineRadioButton;

	@FindBy(xpath="//*[@id=\"formgeneric\"]/table/tbody/tr[2]/td[1]/input")

	WebElement rbLawlinkEmailRadioButton;

	@FindBy(xpath="//*[@id=\"panel\"]/div[1]/form/table/tbody/tr[6]/td[2]/input")

	WebElement rbLawlinkSendEmailSubmit;

	@FindBy(xpath="//*[@id=\"form2\"]/table/tbody/tr[2]/td[2]/input")

	WebElement rbLawlinkImageDownloadWebDownloadRadioButton;

	@FindBy(xpath="//*[@id=\"form2\"]/table/tbody/tr[3]/td[2]/input")

	WebElement rbLawlinkImageDownloadEmailRadioButton;

	@FindBy(xpath="//*[@id=\"panel\"]/div[1]/table[1]/tbody/tr/td")

	WebElement rbLawlinkEmailDeliveryText;

	@FindBy(xpath="//*[@id=\"sub_content\"]/p")

	WebElement rbLawlinkNumberofImageboxesText;


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

	// Click Lawink Bankruptcy AcceptCharge Button

	public void clickLawlinkBankruptcyAcceptChargeButton() {

		rbLawlinkBankruptcyAcceptCharge.click();
	}

	// Click Lawink Judgment AcceptCharge Button

	public void clickLawlinkJudgmentAcceptChargeButton() {

		rbLawlinkJudgmentAcceptCharge.click();
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

	// select the Lawlink Closing Search Planning - Another planning search link

	public void clickLawlinkClosingAnotherPlanningSearchLink() {

		rbLawlinkClosingAnotherPlanningSearchLink.click();
	}
	
	// select the Lawlink Closing Search ROF - Another receiver of fine search link

	public void clickLawlinkClosingAnotherReceiverOfFineSearchLink() {

		rbLawlinkClosingAnotherReceiverOfFineSearchLink.click();
	}
	
	// select the Lawlink Closing Search Sheriff - Another Sheriff search link

	public void clickLawlinkClosingAnotherSheriffSearchLink() {

		rbLawlinkClosingAnotherSheriffSearchLink.click();
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

	// Click Lawlink View Watchlist link

	public void clickLawlinkViewWatchlistLink() {

		rbLawlinkViewWatchlistLink.click();
	}

	// Click Lawlink New Watchlist link

	public void clickLawlinkNewWathclistLink() {

		rbLawlinkNewWatchlistLink.click();
	}

	// Click Lawlink Watchlist Here link

	public void clickLawlinkWathclistHereLink() {

		rbLawlinkWatchlistHereLink.click();
	}

	// Click Lawlink Delete Selected Watchlist Item Button

	public void clickLawlinkDeleteSelectedWatchlistItemButton() {

		rbLawlinkDeleteSelectedWatchlistItemButton.click();
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
	
	// Set Winding up Company Number

	public void setLawlinkClosingWindingUpCompanyNumber(String strwindingupcompanynum) {

		rbLawlinkWindingUpCompanyNumber.sendKeys(strwindingupcompanynum);
	}
	
	// Click Winding up Find

	public void clickLawlinkClosingWindingUpFind() {

		rbLawlinkWindingUpFind.click();
	}
	
	// Click Add Winding up Company

	public void clickLawlinkAddWindingUpCompany() {

		rbLawlinkAddWindingUpCompany.click();
	}

	// Click Lawlink Home Link

	public void clickLawlinkHomeLink() {

		rbLawlinkHomeLink.click();
	}

	// Click Lawlink About Us Link

	public void clickLawlinkAboutUsLink() {

		rbLawlinkAboutUsLink.click();
	}

	// Click Lawlink Subscribe Link

	public void clickLawlinkSubscribeLink() {

		rbLawlinkSubscribeLink.click();
	}

	// Click Lawlink Costs Link

	public void clickLawlinkCostsLink() {

		rbLawlinkCostsLink.click();
	}

	// Click Lawlink Support Link

	public void clickLawlinkSupportLink() {

		rbLawlinkSupportLink.click();
	}

	// Click Lawlink Contact Us Link

	public void clickLawlinkContactUsLink() {

		rbLawlinkContactUsLink.click();
	}

	// Click Lawlink Email Home Link

	public void clickLawlinkEmailHomeLink() {

		rbLawlinkEmailHomeLink.click();
	}

	// Click Lawlink Email Cost Link

	public void clickLawlinkEmailCostLink() {

		rbLawlinkEmailCostLink.click();
	}

	// Click Lawlink Email Support Link

	public void clickLawlinkEmailSupportLink() {

		rbLawlinkEmailSupportLink.click();
	}

	// Click Lawlink Email Contact Us Support Link

	public void clickLawlinkEmailContactUsSupportLink() {

		rbLawlinkEmailContactUsSupportLink.click();
	}

	// Click Lawlink Email Contact Us Register Link

	public void clickLawlinkEmailContactUsRegistrationLink() {

		rbLawlinkEmailContactUsReigstrationLink.click();
	}

	// Click Lawlink Email Contact Us Billing Link

	public void clickLawlinkEmailContactUsBillingLink() {

		rbLawlinkEmailContactUsBillingLink.click();
	}

	// Click Lawlink Email Closing Search Link

	public void clickLawlinkEmailClosingSearchLink() {

		rbLawlinkEmailClosingSearchLink.click();
	}

	// set captcha email address

	public void setcaptchaemailaddress(String strcaptchaemailaddress) {

		rbLawlinkCaptchaEmailAddress.sendKeys(strcaptchaemailaddress);
	}

	// set captcha email subject

	public void setcaptchaemailsubject(String strcaptchaemailsubject) {

		rbLawlinkCaptchaEmailSubject.sendKeys(strcaptchaemailsubject);
	}

	// set captcha email content

	public void setcaptchaemailcontent(String strcaptchaemailcontent) {

		rbLawlinkCaptchaEmailContent.sendKeys(strcaptchaemailcontent);
	}

	// set captcha answer

	public void setcaptchaanswer(String strcaptchaanswer) {

		rbLawlinkCaptchaAnswer.sendKeys(strcaptchaanswer);
	}

	// Click Lawlink Captcha Submit

	public void clickLawlinkCaptchaSubmit() {

		rbLawlinkCaptchaSubmit.click();
	}

	// Click Lawlink Captcha Go back

	public void clickLawlinkCaptchaGoBack() {

		rbLawlinkCaptchaGoBack.click();
	}

	// Click Lawlink Company/Business - Company Link

	public void clickLawlinkCompanyCompanylink() {

		rbLawlinkCompanyCompanyLink.click();
	}

	// Click Lawlink Company/Business - Business Link

	public void clickLawlinkCompanyBusinesslink() {

		rbLawlinkCompanyBusinessLink.click();
	}

	// Click Lawlink Company/Business - Business Number Link from search results

	public void clickLawlinkBusinessNumberlink() {

		rbLawlinkBusinessNumberLink.click();
	}

	// Click Lawlink Company/Business - Accept Charge Link 

	public void clickLawlinkAcceptChargelink() {

		rbLawlinkAcceptChargeLink.click();
	}

	// Click Lawlink Company/Business - Director - Get Director Details Link 

	public void clickLawlinkGetDirectorDetailslink() {

		rbLawlinkGetDirectorDetailsLink.click();;
	}

	// Click Lawlink Company/Business - Document Link

	public void clickLawlinkCompanyDocumentlink() {

		rbLawlinkCompanyDocumentLink.click();
	}

	// Select Document type

	public void setdocumenttype(String doctype) {

		Select doctypedropdown = new Select(rbLawlinkDocumentType);
		doctypedropdown.selectByVisibleText(doctype);
	}

	// Click Lawlink Company/Business - Accept Charge Submit Link 

	public void clickLawlinkAcceptChargeSubmitlink() {

		rbLawlinkAcceptChargeSubmit.click();
	}

	// Click Lawlink Company/Business - Document Order Link 

	public void clickLawlinkDocumentOrderlink() {

		rbLawlinkDocumentOrder.click();
	}

	// Click Lawlink Company/Business - Submission NUmber Link

	public void clickLawlinkCompanySubmissionNumberlink() {

		rbLawlinkSubmissionNUmberLink.click();
	}

	// Set submission number

	public void setsubmissionnumber(String strsubmissionnumber) {

		rbSubmissionNumber.sendKeys(strsubmissionnumber);
	}

	// Set submission document number

	public void setsubmissiodocnnumber(String strsubmissiondocnumber) {

		rbSubmissionDocNumber.sendKeys(strsubmissiondocnumber);
	}

	// Click Web Download radio button - Submission Number search

	public void clickLawlinkWebDownloadRadioButton() {

		rbLawlinkWebDownloadRadioButton.click();
	}

	// Click Delivery By Email radio button - Submission Number search

	public void clickLawlinkDeliveryByEmailRadioButton() {

		rbLawlinkDeliverByEmailRadioButton.click();
	}

	// Click View Online radio button

	public void clickLawlinkViewOnlineRadioButton() {

		rbLawlinkViewOnlineRadioButton.click();
	}

	// Click Email radio button

	public void clickLawlinkEmailRadioButton() {

		rbLawlinkEmailRadioButton.click();
	}

	// Click Send Email Submit button

	public void clickLawlinkSendEmailSubmit() {

		rbLawlinkSendEmailSubmit.click();
	}

	// Click Web Download radio button - Image download

	public void clickLawlinkImageDownloadWebDownloadRadioButton() {

		rbLawlinkImageDownloadWebDownloadRadioButton.click();
	}

	// Click Delivery By Email radio button - Image download

	public void clickLawlinkImageDownloadEmailRadioButton() {

		rbLawlinkImageDownloadEmailRadioButton.click();
	}

	// Lawlink Company/Business - Document Order Links 

	public List<WebElement> LawlinkDocumentOrderlinks() {

		List<WebElement> imagedownloadlinks = driver.findElements(By.cssSelector("table.ReportChoiceInfo td.blue11 a"));

		return imagedownloadlinks;
	}

	// Lawlink Company/Business - Image download checkboxes 

	public List<WebElement> LawlinkImageDownloadCheckboxes() {

		List<WebElement> imagedownloadcheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

		return imagedownloadcheckboxes;
	}

	// Lawlink Company/Business - Image View Links 

	public List<WebElement> LawlinkImageViewLinks() {

		List<WebElement> imageviewlinks = driver.findElements(By.cssSelector("ul.orange-list li"));

		return imageviewlinks;
	}

	// Delivery By Email radio button - Image download - Verify email delivery text

	public String verifyLawlinkImageDownloadEmailDeliveryText() {

		String emaildeliverytext = rbLawlinkEmailDeliveryText.getText();

		return emaildeliverytext;
	}

	// Lawlink Company/Business - Image view - Verify Number of image text selected for viewing

	public String verifyLawlinkNumberofImagecheckboxViewText() {

		String imageviewtotaltext = rbLawlinkNumberofImageboxesText.getText();

		return imageviewtotaltext;
	}

	// Lawlink - Explicit wait of Document order button

	public void Lawlinkexplicitwaitdocbutton() {

		WebDriverWait mywaitvar = null;

		mywaitvar = new WebDriverWait(driver, 80);

		mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.name("docButton")));

	}

	// Lawlink - Explicit wait of Document order button

	public void Lawlinkexplicitwaitdownloadpdf() {

		WebDriverWait mywaitvar = null;

		mywaitvar = new WebDriverWait(driver, 50);

		mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"all_reports\"]/a/p")));

	}

	// Lawlink  - Watchlist Remove - Director checkboxes - with reference

	public List<WebElement> LawlinkWatchlistRemoveDirectorCheckboxeswithreference(String reference) {

		List<WebElement> watchlistelementscheckboxes=driver.findElements(By.id(reference));

		return watchlistelementscheckboxes;
	}

	// Lawlink  - Watchlist Remove - Director checkboxes - without reference

	public List<WebElement> LawlinkWatchlistRemoveDirectorCheckboxeswithoutreference() {

		List<WebElement> watchlistelementscheckboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));

		return watchlistelementscheckboxes;
	}

	// Lawlink  - Bankruptcy match checkboxes 

	public List<WebElement> LawlinkBankruptcyMatchCheckboxes() {

		List<WebElement> bankruptcycheckboxelements = driver.findElements(By.xpath(".//*[starts-with(@name,'namesCheckBox')]"));

		return bankruptcycheckboxelements;
	}

	// Lawlink  - Judgment match checkboxes 

	public List<WebElement> LawlinkJudgmentMatchCheckboxes() {

		List<WebElement> judgmentcheckboxelements = driver.findElements(By.xpath(".//*[starts-with(@name,'JUDG_NAME')]"));

		return judgmentcheckboxelements;
	}

	// Lawlink  - Lispenden match checkboxes 

	public List<WebElement> LawlinkLispendenMatchCheckboxes() {

		List<WebElement> lispendencheckboxelements = driver.findElements(By.xpath(".//*[starts-with(@name,'namesCheckBox')]"));

		return lispendencheckboxelements;
	}

	// Lawlink  - Director match checkboxes 

	public List<WebElement> LawlinkDirectorMatchCheckboxes() {

		List<WebElement> directorcheckboxelements = driver.findElements(By.xpath(".//*[starts-with(@name,'DIR')]"));

		return directorcheckboxelements;
	}

	// Lawlink  - Directorship match links 

	public List<WebElement> LawlinkDirectorshipMatchLinks() {

		List<WebElement> directorshipcheckboxelements = driver.findElements(By.xpath(".//a[contains(@href,'report-choice')]"));

		return directorshipcheckboxelements;
	}

	// Lawlink  - Web table Directorship match links 

	public List<WebElement> LawlinkWebtableDirectorshipMatchLinks(int dirship) {

		String webtablexpath = "//*[@id=\"panel\"]/div[1]/table["+(dirship)+"]";

		WebElement webtable=driver.findElement(By.xpath(webtablexpath));

		List<WebElement> webtablerows = webtable.findElements(By.tagName("tr"));

		return webtablerows;
	}

	// Click Web Table Directorship Individual row links

	public void clickLawlinkWebtableDirectorshipIndividualRowLink(int directorship, int webtabletabledirectorshipindividualrow) {

		String webtabletabledirectorshipindividualrowxpath = "//*[@id=\"panel\"]/div[1]/table["+(directorship)+"]/tbody/tr["+(webtabletabledirectorshipindividualrow+2)+"]/td[1]/strong/a";

		driver.findElement(By.xpath(webtabletabledirectorshipindividualrowxpath)).click();
	}

	// Lawlink Company/Business - Bankruptcy/ISI cost

	public String LawlinkBankruptcyAcceptChargeCost() {

		String bankruptcycost = rbLawlinkBankruptcyAcceptCharge.getAttribute("value");

		return bankruptcycost;
	}

	// Lawlink Company/Business - Judgment cost

	public String LawlinkJudgmentAcceptChargeCost() {

		String judgmentcost = rbLawlinkJudgmentAcceptCharge.getAttribute("value");

		return judgmentcost;
	}

	// Lawlink planning - Set Planning address

	public void setplanningaddress(int planningcount,String planningaddress) {

		String planaddressxpath=null;

		if(planningcount==1) {

			planaddressxpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/form/table/tbody/tr[2]/td/textarea";
		}
		else {

			planaddressxpath="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/form["+(planningcount)+"]/table/tbody/tr[1]/td/textarea";
		}

		driver.findElement(By.xpath(planaddressxpath)).sendKeys(planningaddress);

	}


	// Lawlink planning - Set Planning county

	public void setplanningcounty(int planningcount,String planningcountyarea) {

		String plancountyareaxpath=null;

		if(planningcount==1) {

			plancountyareaxpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/form/table/tbody/tr[3]/td[2]/select";
		}
		else {

			plancountyareaxpath="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/form["+(planningcount)+"]/table/tbody/tr[2]/td[2]/select";
		}

		driver.findElement(By.xpath(plancountyareaxpath)).sendKeys(planningcountyarea);

	}

	// Lawlink receiver of fine - First name

	public void setreceiveroffinefirstname(int rofcount,String roffirstname) {

		String roffirstnamexpath=null;

		if(rofcount==1) {

			roffirstnamexpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form/table/tbody/tr[2]/td[2]/input";
		}
		else {

			roffirstnamexpath="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(rofcount)+"]/table/tbody/tr[1]/td[2]/input";
		}

		driver.findElement(By.xpath(roffirstnamexpath)).sendKeys(roffirstname);

	}

	// Lawlink receiver of fine - Last name

	public void setreceiveroffinelastname(int rofcount,String roflastname) {

		String roflastnamexpath=null;

		if(rofcount==1) {

			roflastnamexpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form/table/tbody/tr[3]/td[2]/input";
		}
		else {

			roflastnamexpath="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(rofcount)+"]/table/tbody/tr[2]/td[2]/input";
		}

		driver.findElement(By.xpath(roflastnamexpath)).sendKeys(roflastname);

	}
	
	// Lawlink receiver of fine - Address

	public void setreceiveroffineaddress(int rofcount,String rofaddress) {

		String rofaddressxpath=null;

		if(rofcount==1) {

			rofaddressxpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form/table/tbody/tr[4]/td/textarea";
		}
		else {

			rofaddressxpath= "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(rofcount)+"]/table/tbody/tr[3]/td/textarea";
		}

		driver.findElement(By.xpath(rofaddressxpath)).sendKeys(rofaddress);

	}
	
	// Lawlink receiver of fine - County

	public void setreceiveroffinecounty(int rofcount,String rofcounty) {

		String rofcountyxpath=null;

		if(rofcount==1) {

			rofcountyxpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form/table/tbody/tr[5]/td[2]/select";
		}
		else {

			rofcountyxpath= "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(rofcount)+"]/table/tbody/tr[4]/td[2]/select";
		}

		driver.findElement(By.xpath(rofcountyxpath)).sendKeys(rofcounty);

	}
	
	// Lawlink sheriff - First name

	public void setsherifffirstname(int sheriffcount,String sherifffirstname) {

		String sherifffirstnamexpath=null;

		if(sheriffcount==1) {

			sherifffirstnamexpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form[1]/table/tbody/tr[2]/td[2]/input";
		}
		else {

			sherifffirstnamexpath="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(sheriffcount)+"]/table/tbody/tr[1]/td[2]/input";
		}

		driver.findElement(By.xpath(sherifffirstnamexpath)).sendKeys(sherifffirstname);

	}
	
	// Lawlink sheriff - Last name

	public void setsherifflastname(int sheriffcount,String sherifflastname) {

		String sherifflastnamexpath=null;

		if(sheriffcount==1) {

			sherifflastnamexpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form[1]/table/tbody/tr[3]/td[2]/input";
		}
		else {

			sherifflastnamexpath= "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(sheriffcount)+"]/table/tbody/tr[2]/td[2]/input";
		}

		driver.findElement(By.xpath(sherifflastnamexpath)).sendKeys(sherifflastname);

	}
	
	// Lawlink sheriff - Address

	public void setsheriffaddress(int sheriffcount,String sheriffaddress) {

		String sheriffaddressxpath=null;

		if(sheriffcount==1) {

			sheriffaddressxpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form[1]/table/tbody/tr[4]/td/textarea";
		}
		else {

			sheriffaddressxpath= "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(sheriffcount)+"]/table/tbody/tr[3]/td/textarea";
		}

		driver.findElement(By.xpath(sheriffaddressxpath)).sendKeys(sheriffaddress);

	}
	
	// Lawlink sheriff - County

	public void setsheriffcounty(int sheriffcount,String sheriffcounty) {

		String sheriffcountyxpath=null;

		if(sheriffcount==1) {

			sheriffcountyxpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form[1]/table/tbody/tr[5]/td[2]/select";
		}
		else {

			sheriffcountyxpath= "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div/form["+(sheriffcount)+"]/table/tbody/tr[4]/td[2]/select";
		}

		driver.findElement(By.xpath(sheriffcountyxpath)).sendKeys(sheriffcounty);

	}


}

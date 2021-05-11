package pagefactory;

import java.sql.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
}

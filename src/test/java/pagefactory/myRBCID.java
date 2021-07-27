package pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myRBCID {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[1]/a")

	WebElement rbCIDLink;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[7]/a")

	WebElement rbCIDBankruptcyLink;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/form/table/tbody/tr[6]/td/input")

	WebElement rbCIDAddSearch;

	@FindBy(name = "viewReports")

	WebElement rbCIDViewReports;
	
	@FindBy(xpath = "//*[@id=\"topLinks\"]/tbody/tr[2]/td[2]/a")

	WebElement rbCIDBusinessReports;
	
	@FindBy(xpath = "//*[@id=\"topLinks\"]/tbody/tr[3]/td[2]/a")

	WebElement rbCIDCompanyReports;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/table/tbody/tr[2]/td/a")

	WebElement rbCIDPDF;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/form/table/tbody/tr[11]/td/input[1]")

	WebElement rbCIDBankruptcySearch;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[4]/a")

	WebElement rbCIDBusinessLink;

	@FindBy(name = "compNumber")

	WebElement rbCompanyNumber;

	@FindBy(xpath = "//*[@id=\"form1\"]/table/tbody/tr[9]/td[2]/input[1]")

	WebElement rbCIDBusinessSearch;
	
	@FindBy(xpath = "//*[@id=\"sub_content\"]/table/tbody/tr/td[1]/a")

	WebElement rbCIDBusinessSearchResultsLink;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[2]/a")

	WebElement rbCIDCompanyLink;

	@FindBy(name = "compName")

	WebElement rbCompanyName;

	@FindBy(xpath = "//*[@id=\"form1\"]/table/tbody/tr[14]/td[2]/input[1]")

	WebElement rbCIDCompanySearch;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[8]/a")

	WebElement rbCIDISILink;

	@FindBy(xpath = "//*[@id=\"all_reports\"]/a")

	WebElement rbCIDISIPDF;
	
	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[5]/a")

	WebElement rbCIDDirectorLink;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[6]/a")

	WebElement rbCIDJudgementLink;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/form/table[2]/tbody/tr[7]/td/input[1]")

	WebElement rbCIDJudgementSearch;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[9]/a")

	WebElement rbCIDWatchlistLink;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[11]/a")

	WebElement rbCIDNewWatchlistLink;
	
	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[10]/a")

	WebElement rbCIDViewWatchlistLink;
	
	@FindBy(xpath = "//*[@id=\"sub_content\"]/table/tbody/tr[38]/td[2]/input")

	WebElement rbCIDWatchlistViewDeleteSelectedItemLink;
	
	@FindBy(xpath = "//*[@id=\"sub_content\"]/p[2]/a")

	WebElement rbCIDWatchlistHereLink;
	
	@FindBy(css = "input[value='Delete Selected Item(s)']")

	WebElement rbCIDDeleteSelectedWatchlistItemButton;
	
	@FindBy(id = "radCompany")

	WebElement rbCIDWatchType;

	@FindBy(name = "compNum")

	WebElement rbWatchlistCompanyNumber;

	@FindBy(xpath = "//*[@id=\"companyWatch\"]/table/tbody/tr[2]/td[3]/input")

	WebElement rbCIDWatchlistFind;

	@FindBy(id = "chkStatus")

	WebElement rbCIDWatchlistStatusChange;

	@FindBy(id = "chkARD")

	WebElement rbCIDWatchlistARD;

	@FindBy(xpath = "//*[@id=\"compform\"]/table/tbody/tr[7]/td[3]/input")

	WebElement rbCIDWatchlistSubmit;

	@FindBy(xpath = "//*[@id=\"top_menu\"]/li[1]/a")

	WebElement rbCIDHomeLink;

	@FindBy(xpath = "//*[@id=\"top_menu\"]/li[2]/a")

	WebElement rbCIDAboutUsLink;

	@FindBy(xpath = "//*[@id=\"top_menu\"]/li[3]/a")

	WebElement rbCIDSubscribeLink;

	@FindBy(xpath = "//*[@id=\"top_menu\"]/li[4]/a")

	WebElement rbCIDCostsLink;

	@FindBy(xpath = "//*[@id=\"top_menu\"]/li[5]/a")

	WebElement rbCIDSupportLink;

	@FindBy(xpath = "//*[@id=\"top_menu\"]/li[6]/a")

	WebElement rbCIDContactUsLink;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/p[2]/a")

	WebElement rbCIDEmailSupportLink;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/p[1]/a")

	WebElement rbCIDEmailCostLink;

	@FindBy(xpath = "//*[@id=\"address\"]/ul[3]/li[2]/a")

	WebElement rbCIDEmailContactUsLink;

	@FindBy(id = "emailAddress")

	WebElement rbCIDCaptchaEmailAddress;

	@FindBy(id = "emailSubject")

	WebElement rbCIDCaptchaEmailSubject;

	@FindBy(id = "emailContent")

	WebElement rbCIDCaptchaEmailContent;

	@FindBy(id = "captchaAnswer")

	WebElement rbCIDCaptchaAnswer;

	@FindBy(name = "Submit")

	WebElement rbCIDCaptchaSubmit;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/p[2]/a")

	WebElement rbCIDCaptchaGoBack;
	
	@FindBy(name="acceptCharge")

	WebElement rbCIDAcceptCharge;
	
	@FindBy(name="docButton")

	WebElement rbCIDDocumentOrder;
	
	@FindBy(xpath="//*[@id=\"sub_content\"]/form/table/tbody/tr[4]/td[2]/input")

	WebElement rbCIDAcceptChargeSubmit;
	
	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[3]/a")

	WebElement rbCIDDocumentLink;
	
	@FindBy(name="documentGroup")

	WebElement rbCIDDocumentType;
	
	@FindBy(xpath = "//*[@id=\"form1\"]/table/tbody/tr[4]/td[2]/input[1]")

	WebElement rbCIDDocumentSearch;
	
	@FindBy(xpath="//*[@id=\"sub_content\"]/form/table/tbody/tr[1]/td[1]/input")
	
	WebElement rbCIDViewOnlineRadioButton;
	
	@FindBy(xpath="//*[@id=\"sub_content\"]/form/table/tbody/tr[2]/td[1]/input")
	
	WebElement rbCIDEmailRadioButton;
	
	@FindBy(xpath="//*[@id=\"sub_content\"]/form/table/tbody/tr[7]/td[2]/input")
	
	WebElement rbCIDSendEmailSubmit;
	
	@FindBy(xpath="//*[@id=\"form2\"]/table/tbody/tr[2]/td[2]/input")
	
	WebElement rbCIDImageDownloadWebDownloadRadioButton;
	
	@FindBy(xpath="//*[@id=\"form2\"]/table/tbody/tr[3]/td[2]/input")
	
	WebElement rbCIDImageDownloadEmailRadioButton;
	
	@FindBy(name="dirName")

	WebElement rbCIDDirectorName;
	
	@FindBy(name="Submit4")

	WebElement rbCIDDirectorSearch;
	
	@FindBy(id = "watchLinkAll")

	WebElement rbCIDWatchLinkAll;
	
	@FindBy(name="btnAcceptChargeDirWatchAll")

	WebElement rbCIDDirectorAcceptChargeDirWatchAll;
	
	@FindBy(name="continue")

	WebElement rbCIDDirectorWatchlistContinue;
	
	@FindBy(xpath="//*[@id=\"watchDirectorsModal\"]/p[3]/a")
	
	WebElement rbCIDWatchDirectorsModelButton;
	
	@FindBy(name="watchReferenceDirs")

	WebElement rbCIDDirectorWatchlistReference;
	
	@FindBy(name="addReference")

	WebElement rbCIDDirectorAddReference;
	
	@FindBy(xpath="//*[@id=\"sub_content\"]/p[2]")
	
	WebElement rbCIDNumberofImageboxesText;
	

	public myRBCID(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
	}

	// Click CID Link

	public void clickCIDlink() {

		rbCIDLink.click();
	}

	// Click CID rbonline Bankruptcy Search link

	public void clickCIDBankruptcyLink() {

		rbCIDBankruptcyLink.click();
	}

	// Click CID Add name to Search link

	public void clickCIDAddSearchLink() {

		rbCIDAddSearch.click();
	}

	// Click CID View Reports link

	public void clickCIDViewReportsLink() {

		rbCIDViewReports.click();
	}
	
	// Click CID Business Reports link

	public void clickCIDBusinessReportsLink() {

		rbCIDBusinessReports.click();
	}
	
	// Click CID Company Reports link

	public void clickCIDCompanyReportsLink() {

		rbCIDCompanyReports.click();
	}

	// Click CID PDF link

	public void clickCIDPDFLink() {

		rbCIDPDF.click();
	}

	// Click CID Bankruptcy Search link, Click CID ISI Search link

	public void clickCIDBankruptcySearchLink() {

		rbCIDBankruptcySearch.click();
	}

	// Click CID Business link

	public void clickCIDBusinessLink() {

		rbCIDBusinessLink.click();
	}

	// set company number

	public void setcompanynumber(String strcompanynumber) {

		rbCompanyNumber.sendKeys(strcompanynumber);
	}

	// Click CID Business Search button

	public void clickCIDBusinessSearchLink() {

		rbCIDBusinessSearch.click();
	}
	
	// Click CID Business Search Results Link

	public void clickCIDBusinessSearchResultsLink() {

		rbCIDBusinessSearchResultsLink.click();
	}

	// Click CID Company link

	public void clickCIDCompanyLink() {

		rbCIDCompanyLink.click();
	}

	// set company name

	public void setcompanyname(String strcompanyname) {

		rbCompanyName.sendKeys(strcompanyname);
	}

	// Click CID Company Search button

	public void clickCIDCompanySearchLink() {

		rbCIDCompanySearch.click();
	}

	// Click CID ISI link

	public void clickCIDISILink() {

		rbCIDISILink.click();
	}

	// Click CID ISI PDF link

	public void clickCIDISIPDFLink() {

		rbCIDISIPDF.click();
	}
	
	// Click CID Director SearchLink

	public void clickCIDDirectorlink() {

		rbCIDDirectorLink.click();
	}

	// Click CID JudgementLink

	public void clickCIDJudgementlink() {

		rbCIDJudgementLink.click();
	}

	// Click CID Judgement Search link

	public void clickCIDJudgementSearchLink() {

		rbCIDJudgementSearch.click();
	}

	// Click CID Watchlist link

	public void clickCIDWathclistLink() {

		rbCIDWatchlistLink.click();
	}

	// Click CID New Watchlist link

	public void clickCIDNewWathclistLink() {

		rbCIDNewWatchlistLink.click();
	}
	
	// Click CID View Watchlist link

	public void clickCIDViewWathclistLink() {

		rbCIDViewWatchlistLink.click();
	}
	
	// Click CID View Watchlist Delete Selected Item link

	public void clickCIDWathclistViewDeleteSelectedItemLink() {

		rbCIDWatchlistViewDeleteSelectedItemLink.click();
	}
	
	// Click CID Watchlist Here link

	public void clickCIDWathclistHereLink() {

		rbCIDWatchlistHereLink.click();
	}
	
	// Click CID Delete Selected Watchlist Item Button

	public void clickCIDDeleteSelectedWatchlistItemButton() {

		rbCIDDeleteSelectedWatchlistItemButton.click();
	}


	// Select CID Watch type

	public void clickCIDWatchType() {

		rbCIDWatchType.click();
	}

	// Set watchlist company number

	public void setwatchlistcompanynumber(String strwatchlistcompanynumber) {

		rbWatchlistCompanyNumber.sendKeys(strwatchlistcompanynumber);
	}

	// Click CID Watchlist Find

	public void clickCIDWatchlistFindLink() {

		rbCIDWatchlistFind.click();
	}

	// Select CID Watchlist Status Change

	public void clickCIDWatchlistStatusChange() {

		rbCIDWatchlistStatusChange.click();
	}

	// Select CID Watchlist ARD

	public void clickCIDWatchlistARD() {

		rbCIDWatchlistARD.click();
	}

	// Click CID Watchlist Submit

	public void clickCIDWatchlistSubmit() {

		rbCIDWatchlistSubmit.click();
	}

	// Click CID Home Link

	public void clickCIDHomeLink() {

		rbCIDHomeLink.click();
	}

	// Click CID About Us Link

	public void clickCIDAboutUsLink() {

		rbCIDAboutUsLink.click();
	}

	// Click CID Subscribe Link

	public void clickCIDSubscribeLink() {

		rbCIDSubscribeLink.click();
	}

	// Click CID Costs Link

	public void clickCIDCostsLink() {

		rbCIDCostsLink.click();
	}

	// Click CID Support Link

	public void clickCIDSupportLink() {

		rbCIDSupportLink.click();
	}

	// Click CID Contact Us Link

	public void clickCIDContactUsLink() {

		rbCIDContactUsLink.click();
	}

	// Click CID Email Support Link

	public void clickCIDEmailSupportLink() {

		rbCIDEmailSupportLink.click();
	}

	// Click CID Email Cost Link

	public void clickCIDEmailCostLink() {

		rbCIDEmailCostLink.click();
	}

	// Click CID Email Contact Us Link

	public void clickCIDEmailContactUsLink() {

		rbCIDEmailContactUsLink.click();
	}

	// set captcha email address

	public void setcaptchaemailaddress(String strcaptchaemailaddress) {

		rbCIDCaptchaEmailAddress.sendKeys(strcaptchaemailaddress);
	}

	// set captcha email subject

	public void setcaptchaemailsubject(String strcaptchaemailsubject) {

		rbCIDCaptchaEmailSubject.sendKeys(strcaptchaemailsubject);
	}

	// set captcha email content

	public void setcaptchaemailcontent(String strcaptchaemailcontent) {

		rbCIDCaptchaEmailContent.sendKeys(strcaptchaemailcontent);
	}

	// set captcha answer

	public void setcaptchaanswer(String strcaptchaanswer) {

		rbCIDCaptchaAnswer.sendKeys(strcaptchaanswer);
	}

	// Click CID Captcha Submit

	public void clickCIDCaptchaSubmit() {

		rbCIDCaptchaSubmit.click();
	}
	
	// Click CID Captcha Go back

	public void clickCIDCaptchaGoBack() {

			rbCIDCaptchaGoBack.click();
	}

	// Click CID Accept Charge

	public void clickCIDAcceptCharge() {

		rbCIDAcceptCharge.click();
	}
	
	// Click CID Document Order

	public void clickCIDDocumentOrder() {

		rbCIDDocumentOrder.click();
	}
	
	// Click CID Accept Charge Submit

	public void clickCIDAcceptChargeSubmit() {

			rbCIDAcceptChargeSubmit.click();
	}
		
	
	// Click CID Document link

	public void clickCIDDocumentLink() {

			rbCIDDocumentLink.click();
	}
	
	// Select Document type

	public void setdocumenttype(String doctype) {
			
		Select doctypedropdown = new Select(rbCIDDocumentType);
			doctypedropdown.selectByVisibleText(doctype);
	}
	
	// Click CID Document Search button

	public void clickCIDDocumentSearchLink() {

			rbCIDDocumentSearch.click();
	}
	
	// Click View Online radio button

	public void clickCIDViewOnlineRadioButton() {

			rbCIDViewOnlineRadioButton.click();
	}
		
	// Click Email radio button

	public void clickCIDEmailRadioButton() {

			rbCIDEmailRadioButton.click();
	}
		
	// Click Send Email Submit button

	public void clickCIDSendEmailSubmit() {

			rbCIDSendEmailSubmit.click();
	}
	
	// Click Web Download radio button - Image download

	public void clickCIDImageDownloadWebDownloadRadioButton() {

			rbCIDImageDownloadWebDownloadRadioButton.click();
	}
		
	// Click Delivery By Email radio button - Image download

	public void clickCIDImageDownloadEmailRadioButton() {

			rbCIDImageDownloadEmailRadioButton.click();
	}
	
	// set Director Name

	public void setdirectorname(String strdirectorname) {

			rbCIDDirectorName.sendKeys(strdirectorname);
	}
	
	// Click CID Director Search button

	public void clickCIDDirectorSearchLink() {

			rbCIDDirectorSearch.click();
	}
	
	// Click CID Director Watch All Selected button

	public void clickCIDDirectorWatchAllSelectedLink() {

				rbCIDWatchLinkAll.click();
	}
	
	// Click CID Director Accept Charge Director Watch All Link

	public void clickCIDDirectorAcceptChargeDirWatchAllLink() {

				rbCIDDirectorAcceptChargeDirWatchAll.click();
	}
	
	// Click CID Director Watchlist - Director Added - Continue

	public void clickCIDDirectorWatchlistAddedContinue() {

				rbCIDDirectorWatchlistContinue.click();
	}
	
	// Click CID Director Watchlist - view watchlist

	public void clickCIDDirectorWatchDirectorsModelButton() {

				rbCIDWatchDirectorsModelButton.click();
	}
	
	// set Director Watchlist Reference

	public void setdirectorwatchlistreference(String strdirectorwatchlistreference) {

				rbCIDDirectorWatchlistReference.sendKeys(strdirectorwatchlistreference);
	}
	
	// Click CID Director Watchlist - Add Reference Button

	public void clickCIDDirectorWatchlistAddReference() {

				rbCIDDirectorAddReference.click();
	}
	
	// Lawlink Company/Business - Document Order Links 
	
	public List<WebElement> CIDDocumentOrderlinks() {

				List<WebElement> imagedownloadlinks = driver.findElements(By.xpath(".//a[contains(@href,'sub-search-accept-charge')]"));
					
				return imagedownloadlinks;
	}
	
	// CID Company/Business - Image download checkboxes 
	
	public List<WebElement> CIDImageDownloadCheckboxes() {

				List<WebElement> imagedownloadcheckboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
						
				return imagedownloadcheckboxes;
	}
	
	// CID Company/Business - Image View Links 
	
	public List<WebElement> CIDImageViewLinks() {

				List<WebElement> imageviewlinks = driver.findElements(By.cssSelector("ul.list_bullet li"));
							
				return imageviewlinks;
	}
	
	// CID Company/Business - Image view - Verify Number of image text selected for viewing

	public String verifyCIDNumberofImagecheckboxViewText() {

				String imageviewtotaltext = rbCIDNumberofImageboxesText.getText();
					
				return imageviewtotaltext;
	}
		
	// CID Business - Verify Business Search Cost

	public String verifyCIDBusinessSearchCostText() {

				String businesscost = driver.findElement(By.name("acceptCharge")).getAttribute("value");
							
				return businesscost;
	}
		
	// CID  - Explicit wait of Document order button

	public void CIDexplicitwaitdocbutton() {

			WebDriverWait mywaitvar = null;
			
			mywaitvar = new WebDriverWait(driver, 80);

			mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.name("docButton")));

	}
	
	// CID  - Watchlist Add - Director checkboxes 
	
	public List<WebElement> CIDWatchlistAddDirectorCheckboxes() {

		List<WebElement> directorelementsCheckboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		return directorelementsCheckboxes;
	}
	
	// CID  - Watchlist Remove - Director checkboxes - with reference
	
	public List<WebElement> CIDWatchlistRemoveDirectorCheckboxeswithreference(String reference) {

		List<WebElement> watchlistelementscheckboxes=driver.findElements(By.id(reference));
			
		return watchlistelementscheckboxes;
	}
	
	// CID  - Watchlist Remove - Director checkboxes - without reference
	
	public List<WebElement> CIDWatchlistRemoveDirectorCheckboxeswithoutreference() {

			List<WebElement> watchlistelementscheckboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
				
			return watchlistelementscheckboxes;
	}
	
	// CID  - Bankruptcy - Matching elements checkbox
	
	public List<WebElement> CIDBankruptcyMatchCheckboxeselements() {

			List<WebElement> matchcheckboxelements = driver.findElements(By.xpath(".//*[starts-with(@name,'namesCheckBox')]"));

			return matchcheckboxelements;
	}
	
	// CID  - Judgment - Matching Judgment elements checkbox
	
	public List<WebElement> CIDJudgmentMatchJudgmentCheckboxeselements() {

		List<WebElement> judgmentchekboxelements = driver.findElements(By.xpath("//input[starts-with(@name, 'JUDG_NAME')]"));

		return judgmentchekboxelements;
	}
	
	// CID  - Judgment - Matching Lis Pendens elements checkbox
	
	public List<WebElement> CIDJudgmentMatchLispendensCheckboxeselements() {

		List<WebElement> lispendcheckboxelements = driver.findElements(By.xpath("//input[starts-with(@name,'namesCheckBox')]"));

		return lispendcheckboxelements;
	}
}

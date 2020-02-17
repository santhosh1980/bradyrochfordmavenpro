package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[6]/a")

	WebElement rbCIDJudgementLink;

	@FindBy(xpath = "//*[@id=\"sub_content\"]/form/table[2]/tbody/tr[7]/td/input[1]")

	WebElement rbCIDJudgementSearch;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[9]/a")

	WebElement rbCIDWatchlistLink;

	@FindBy(xpath = "//*[@id=\"left_menu\"]/ul/li[11]/a")

	WebElement rbCIDNewWatchlistLink;

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

}

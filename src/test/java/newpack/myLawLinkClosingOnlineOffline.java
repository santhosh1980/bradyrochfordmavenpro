package newpack;

import org.testng.annotations.Test;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.tools.ant.taskdefs.condition.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBLawlink;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myLawLinkClosingOnlineOffline {

	@Test
	public void myLawLinkClosingOnlineOfflineViewResults() {
		WebDriver driver = null;

		WebDriverWait mywaitvar = null;

		Logger log = Logger.getLogger("");

		String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

		String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestDataOnlineOffline.xlsx";

		ExcelDataConfig excel = new ExcelDataConfig(datapath);

		Random rand = new Random();

		// create chrome instance
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		// create firefox instance

		//System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		//create IE instance
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\U35035\\eclipse-workspace\\Microsoftwebdriver\\MicrosoftWebDriver.exe");


		// utility.dbconnect();

		try {

			
			for (int i = 0; i <= excel.getrownum(1); i++) {

				
				driver = new ChromeDriver();
				
				//driver = new FirefoxDriver();
				
				//driver = new EdgeDriver();

				myRBlogin rb = new myRBlogin(driver);

				myRBcommon rbcom = new myRBcommon(driver);

				myRBLawlink rblawlink = new myRBLawlink(driver);

				driver.manage().window().maximize();

				// base url

				// String baseurl="https://qa.lawlink.ie";

				// BVT

				String baseurl = excel.getData(4, 0, 0);

				// UAT

				// String baseurl=excel.getData(4, 0, 1);

				// Staging

				// String baseurl=excel.getData(4, 0, 2);

				driver.get(baseurl);

				log.debug("Opening website");

				// driver.findElement(By.xpath("//*[@id=\"header_right\"]/p/span/a")).click();

				rblawlink.clickLawlinkLoginNowlink();

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				log.debug("Opening Login screen");

				// pass credential and submit
				
				Thread.sleep(5000);

				rb.setusername(excel.getData(1, i, 0));

				rb.setpassword(excel.getData(1, i, 1));

				Thread.sleep(5000);

				// Resi value from DB

				// String Resi = utility.sqlconnector(excel.getData(1, i, 0));

				// RESI value status from excel file searching through users

				String Resi = null;

				for (int m = 0; m <= excel.getrownum(3); m++) {
					if ((excel.getData(3, m, 0)).equalsIgnoreCase(excel.getData(1, i, 0))) {
						Resi = excel.getData(3, m, 1);
						break;
					}
				}

				System.out.println("RESI value status is:" + Resi);

				// Click login button

				// driver.findElement(By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img")).click();

				rb.clicklawlinklogin();

				// click closing search button
				Thread.sleep(5000);

				// driver.findElement(By.xpath("//*[@id=\"leftmenu\"]/ul[2]/li/a")).click();

				rblawlink.clickLawlinkClosingSearchlink();

				log.debug("Clicking Closing search button");

				// capture screenshot 1

				utility.fullscreenshotcapture(driver, "closingsearch");

				// Pass search values and click search button

				// driver.findElement(By.id("userRef")).sendKeys("myautocheck"+rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				// select the checkbox - Judgment/Bankruptcy & Personal Insolvency (ISI)
				// searches, Registry of Deeds

				// driver.findElement(By.id("chkJudg")).click();

				rblawlink.selectLawlinkClosingCheckJudgBox();

				// driver.findElement(By.id("chkDeeds")).click();

				rblawlink.selectLawlinkClosingCheckDeedsBox();

				// Fill values for offline search

				// driver.findElement(By.name("requiredBy")).sendKeys("23/10/2020");

				rblawlink.setrequiredby("23/10/2020");

				// driver.findElement(By.xpath("//*[@id=\"step3\"]/table/tbody/tr[3]/td[2]/input[2]")).click();

				rblawlink.setdeliverby();

				// Click Next button

				// driver.findElement(By.name("next")).click();

				rblawlink.clickLawlinkClosingNextLink();

				// pass Surname, firstname for online search then click add button

				for (int j = 2; j < excel.getcolnum(1, i); j += 2) {

					// driver.findElement(By.name("surname")).sendKeys(excel.getData(1, i, j));

					// driver.findElement(By.name("firstName")).sendKeys(excel.getData(1, i, j +
					// 1));

					// driver.findElement(By.id("AddName")).click();
					
					Thread.sleep(5000);

					rbcom.setsurname(excel.getData(1, i, j));

					rbcom.setfirstname(excel.getData(1, i, j + 1));

					rblawlink.clickLawlinkClosingAddNameLink();

					Thread.sleep(5000);
				}

				// pass Firstname, surname, Date and Address for offline search

				int offcount = 1;

				for (int k = 0; k < excel.getcolnum(2, i); k += 5) {

					Thread.sleep(5000);

					// driver.findElement(By.id("deeds_firstname")).sendKeys(excel.getData(2, i,
					// k));

					// driver.findElement(By.id("deeds_surname")).sendKeys(excel.getData(2, i,
					// k+1));

					// driver.findElement(By.id("deeds_from")).sendKeys(excel.getDateData(2, i,
					// k+2));

					// driver.findElement(By.id("deeds_to")).sendKeys(excel.getDateData(2, i, k+3));

					// driver.findElement(By.id("deeds_address")).sendKeys(excel.getData(2, i,
					// k+4));

					String fname = null;
					String lname = null;
					String deedsfrom = null;
					String deedsto = null;
					String deedsaddress = null;

					if ((Resi == null) || (Resi.isEmpty())) {
						Resi = "NO";
					}

					if (offcount == 1 && (Resi.equalsIgnoreCase("NO") || Resi.equalsIgnoreCase("YES"))) {
						fname = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[1]/td[2]/input";
						lname = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[2]/td[2]/input";
						deedsfrom = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[3]/td[2]/input[1]";
						deedsto = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[3]/td[2]/input[2]";
						deedsaddress = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[4]/td/textarea";
					}

					else if (offcount != 1 && (Resi.equalsIgnoreCase("NO") || Resi.equalsIgnoreCase("YES"))) {
						fname = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form["
								.concat(String.valueOf(offcount)).concat("]/table/tbody/tr[1]/td[2]/input");
						lname = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form["
								.concat(String.valueOf(offcount)).concat("]/table/tbody/tr[2]/td[2]/input");
						deedsfrom = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form["
								.concat(String.valueOf(offcount)).concat("]/table/tbody/tr[3]/td[2]/input[1]");
						deedsto = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form["
								.concat(String.valueOf(offcount)).concat("]/table/tbody/tr[3]/td[2]/input[2]");
						deedsaddress = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form["
								.concat(String.valueOf(offcount)).concat("]/table/tbody/tr[4]/td/textarea");
					}

					driver.findElement(By.xpath(fname)).sendKeys(excel.getData(2, i, k));

					driver.findElement(By.xpath(lname)).sendKeys(excel.getData(2, i, k + 1));

					driver.findElement(By.xpath(deedsfrom)).sendKeys(excel.getDateData(2, i, k + 2));

					driver.findElement(By.xpath(deedsto)).sendKeys(excel.getDateData(2, i, k + 3));

					driver.findElement(By.xpath(deedsaddress)).sendKeys(excel.getData(2, i, k + 4));

					// Click another registry of deeds search button

					if (k + 5 < excel.getcolnum(2, i)) {
						driver.findElement(By.xpath("//*[@id=\"deeds1\"]/table/tbody/tr[5]/td/span/a")).click();
					}

					offcount++;

					Thread.sleep(5000);
				}

				// capture screenshot 2

				utility.fullscreenshotcapture(driver, "searchvalue");

				System.out.println("Values passed");

				// Click submit button

				// driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/table[3]/tbody/tr[3]/td/input")).click();

				rblawlink.clickLawlinkClosingOfflineSubmitlink();

				// Thread.sleep(30000);

				// Click download pdf button

				mywaitvar = new WebDriverWait(driver, 50);

				mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"all_reports\"]/a/p")));

				// driver.findElement(By.xpath("//*[@id=\"all_reports\"]/a/p")).click();

				rblawlink.clickLawlinkClosingPDFLink();

				log.debug("Clicking download pdf button");

				Thread.sleep(5000);

				// verify pdf

				utility.verifyPDFInURL(driver);

				// Write to Excel - PDF URL

				String pdfurl = utility.getPDFURL(driver);

				excel.writeData(1, i, 21, pdfurl);

				// Download PDF

				// utility.downloadPDF(driver);

				// close chrome
				driver.quit();

				System.out.println("Browser closed");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			// capture exception screenshot

			utility.screenshotcapture(driver, "exception");
		}
		// utility.dbclose();

	}

}

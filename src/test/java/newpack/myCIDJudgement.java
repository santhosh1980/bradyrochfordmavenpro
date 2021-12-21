package newpack;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBCID;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myCIDJudgement {

	@Test
	public void myCIDJudgementViewResults() throws Exception {

		WebDriver driver;

		String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

		String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestDataOnline.xlsx";

		ExcelDataConfig excel = new ExcelDataConfig(datapath);

		Random rand = new Random();

		// create chrome instance
		System.setProperty("webdriver.chrome.driver", driverpath);

		for (int i = 0; i <= excel.getrownum(3); i++) {

			driver = new ChromeDriver();

			myRBlogin rb = new myRBlogin(driver);
			
			myRBcommon rbcom = new myRBcommon(driver);
			
			myRBCID rbcid = new myRBCID(driver);

			// create firefox instance

			// System.setProperty("webdriver.firefox.marionette",
			// "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			// DesiredCapabilities dc = DesiredCapabilities.firefox();

			// dc.setCapability("marionette", true);

			// driver = new FirefoxDriver();

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// base url

			String baseurl = "https://staging.cid.ie";

			driver.get(baseurl);

			// get webelements

			// WebElement name = driver.findElement(By.id("userName"));

			// WebElement pass = driver.findElement(By.id("password"));

			// pass credential and submit

			rb.setusername(excel.getData(3, i, 0));

			rb.setpassword(excel.getData(3, i, 1));

			Thread.sleep(5000);

			// click submit button

			// driver.findElement(By.className("submit")).click();

			rb.clickCIDlogin();

			// Click CID and rbonline Judgment Search link

			//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[1]/a")).click();

			//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[6]/a")).click();
			
			rbcid.clickCIDlink();
			
			rbcid.clickCIDJudgementlink();

			// capture screenshot 1

			utility.screenshotcapture(driver, "judgment CID");

			// Pass judgment search values and click search button

			// driver.findElement(By.name("userRef")).sendKeys("myautotest" +
			// rand.nextInt(1000));

			rbcom.setuserRef("myautotest" + rand.nextInt(1000));

			int m = 3;

			// pass Surname and firstname and then click add button

			for (int j = 2; j < excel.getcolnum(3, i); j += 2) {

				//driver.findElement(By.name("surname")).sendKeys(excel.getData(3, i, j));

				//driver.findElement(By.name("firstName")).sendKeys(excel.getData(3, i, j + 1));

				//driver.findElement(By.xpath("//*[@id=\"sub_content\"]/form/table[1]/tbody/tr[6]/td/input")).click();
				
				rbcom.setsurname(excel.getData(3, i, j));
				
				rbcom.setfirstname(excel.getData(3, i, j + 1));
				
				rbcid.clickCIDAddSearchLink();

				m++;

				Thread.sleep(5000);
			}

			// capture screenshot 2

			utility.screenshotcapture(driver, "searchvaluejudgmentCID");

			System.out.println("Values passed");

			// Click search button

			//driver.findElement(By.xpath("//*[@id=\"sub_content\"]/form/table[2]/tbody/tr[7]/td/input[1]")).click();
			
			rbcid.clickCIDJudgementSearchLink();

			Thread.sleep(15000);

			// Capture judgment cost

			utility.screenshotcapture(driver, "judgment CID cost");

			// Take cost, write to excel and Click accept charge button

			String cost = driver
					.findElement(By.xpath("//*[@id=\"sub_content\"]/form/table/tbody/tr[" + m + "]/td/input"))
					.getAttribute("value");

			System.out.println(cost);

			excel.writeData(3, i, 20, cost);

			// Click accept charge button

			driver.findElement(By.xpath("//*[@id=\"sub_content\"]/form/table/tbody/tr[" + m + "]/td/input")).click();

			// select judgment matches

			// List<WebElement>
			// judelements=driver.findElements(By.xpath(".//*[starts-with(@name,'JUDG_NAME')]"));

			//List<WebElement> judelements = driver.findElements(By.xpath("//input[starts-with(@name, 'JUDG_NAME')]"));
			List<WebElement> judelements = rbcid.CIDJudgmentMatchJudgmentCheckboxeselements();
			int numberofjudgements = judelements.size();

			for (int k = 1; k <= numberofjudgements; k++) {

				driver.findElement(By.name("JUDG_NAME" + k)).click();
			}

			// select Lis Pendens matches

			//List<WebElement> lispendelements = driver.findElements(By.xpath("//input[starts-with(@name,'namesCheckBox')]"));
			List<WebElement> lispendelements = rbcid.CIDJudgmentMatchLispendensCheckboxeselements();
			int numberoflispendens = lispendelements.size();

			for (int k = 1; k <= numberoflispendens; k++) {

				driver.findElement(By.name("namesCheckBox" + k)).click();
			}

			Thread.sleep(5000);

			// Click View Judgments/LisPendens button

			driver.findElement(By.name("viewJudgments")).click();

			Thread.sleep(5000);

			// Click pdf button

			//driver.findElement(By.xpath("//*[@id=\"sub_content\"]/table[1]/tbody/tr[2]/td/a")).click();
			
			rbcid.clickCIDPDFLink();

			Thread.sleep(5000);

			// Write to Excel - PDF URL

			String pdfurl = utility.getPDFURL(driver);

			excel.writeData(3, i, 21, pdfurl);

			// excel.writeData(1, i, 20);

			// Window handle

			// utility.windowhandle(driver);

			// close chrome
			driver.quit();

			System.out.println("Browser closed");
		}

	}

}

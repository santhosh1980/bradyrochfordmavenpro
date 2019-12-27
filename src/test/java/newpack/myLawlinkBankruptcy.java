package newpack;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBLawlink;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myLawlinkBankruptcy {

	@Test
	public void myLawlinkBankruptcyViewResults() throws Exception {

		WebDriver driver;

		String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

		String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestDataOnline.xlsx";

		ExcelDataConfig excel = new ExcelDataConfig(datapath);
		Random rand = new Random();

		// create chrome instance
		System.setProperty("webdriver.chrome.driver", driverpath);

		for (int i = 0; i <= excel.getrownum(4); i++) {

			driver = new ChromeDriver();

			myRBlogin rb = new myRBlogin(driver);
			
			myRBcommon rbcom = new myRBcommon(driver);
			
			myRBLawlink rblawlink = new myRBLawlink(driver);

			// create firefox instance

			// System.setProperty("webdriver.firefox.marionette",
			// "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			// DesiredCapabilities dc = DesiredCapabilities.firefox();

			// dc.setCapability("marionette", true);

			// driver = new FirefoxDriver();

			driver.manage().window().maximize();

			// base url

			String baseurl = "https://qa.lawlink.ie";

			driver.get(baseurl);

			//driver.findElement(By.xpath("//*[@id=\"header_right\"]/p/span/a")).click();
			
			rblawlink.clickLawlinkLoginNowlink();

			// get webelements

			// WebElement name = driver.findElement(By.id("userName"));

			// WebElement pass = driver.findElement(By.id("password"));

			// pass credential and submit

			rb.setusername(excel.getData(4, i, 0));

			rb.setpassword(excel.getData(4, i, 1));

			Thread.sleep(5000);

			// Click login button

			// driver.findElement(By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img")).click();

			rb.clicklawlinklogin();

			// click Bankruptcy search button
			Thread.sleep(5000);

			//driver.findElement(By.xpath("//*[@id=\"leftmenu\"]/ul[3]/li[2]/a")).click();
			
			rblawlink.clickLawlinkBankruptcylink();

			// capture screenshot 1

			utility.screenshotcapture(driver, "bankruptcy lawlink");

			// Pass judgment search values and click search button

			// driver.findElement(By.name("userRef")).sendKeys("myautotest" +
			// rand.nextInt(1000));

			rbcom.setuserRef("myautotest" + rand.nextInt(1000));

			// pass Surname and firstname and then click add button

			for (int j = 2; j < excel.getcolnum(4, i); j += 2) {

				//driver.findElement(By.name("surname")).sendKeys(excel.getData(4, i, j));

				//driver.findElement(By.name("firstName")).sendKeys(excel.getData(4, i, j + 1));

				//driver.findElement(By.xpath("//*[@id=\"panel\"]/div/form/table[2]/tbody/tr[2]/td[3]/a/img")).click();
				
				rbcom.setsurname(excel.getData(4, i, j));
				
				rbcom.setfirstname(excel.getData(4, i, j + 1));
				
				rblawlink.clickLawlinkAddSearchLink();
				

				Thread.sleep(5000);
			}

			// capture screenshot 2

			utility.screenshotcapture(driver, "searchvaluebankruptcylawlink");

			System.out.println("Values passed");

			// Click search button

			//driver.findElement(By.name("search")).click();
			
			rblawlink.clickLawlinkSearchLink();

			Thread.sleep(15000);

			// Capture bankruptcy cost

			utility.screenshotcapture(driver, "bankruptcy lawlink cost");

			// Take cost, write to excel and Click accept charge button

			String cost = driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/form/p[2]/input"))
					.getAttribute("value");

			System.out.println(cost);

			excel.writeData(4, i, 20, cost);

			driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/form/p[2]/input")).click();

			// select bankruptcy matches

			List<WebElement> elements = driver.findElements(By.xpath(".//*[starts-with(@name,'namesCheckBox')]"));

			int numberofelements = elements.size();

			for (int k = 1; k <= numberofelements; k++) {

				driver.findElement(By.name("namesCheckBox" + k)).click();
			}

			Thread.sleep(5000);

			// Click view reports button

			//driver.findElement(By.name("viewReports")).click();
			
			rblawlink.clickLawlinkBankruptcyViewReportsLink();

			Thread.sleep(5000);

			// Click pdf button

			//driver.findElement(By.xpath("//*[@id=\"sub_content\"]/table/tbody/tr[2]/td/a")).click();
			
			rblawlink.clickLawlinkBankruptcyPDFLink();

			Thread.sleep(5000);

			// Write to Excel - PDF URL

			String pdfurl = utility.getPDFURL(driver);

			excel.writeData(4, i, 21, pdfurl);

			// Window handle

			// utility.windowhandle(driver);

			// close chrome
			driver.quit();

			System.out.println("Browser closed");
		}

	}

}

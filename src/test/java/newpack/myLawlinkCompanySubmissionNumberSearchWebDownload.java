package newpack;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;
import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBLawlink;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myLawlinkCompanySubmissionNumberSearchWebDownload {

	@Test
	public void myLawlinkCompanySubmissionNumberSearchWebDownloadViewResults() throws Exception {
		
		try {

			WebDriver driver;
			
			WebDriverWait mywaitvar = null;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(12); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);
				
				myRBcommon rbcom = new myRBcommon(driver);
				
				myRBLawlink rblawlink = new myRBLawlink(driver);

				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://qa.lawlink.ie";

				driver.get(baseurl);

				//driver.findElement(By.xpath("//*[@id=\"header_right\"]/p/span/a")).click();
				
				rblawlink.clickLawlinkLoginNowlink();

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(12, i, 0));

				rb.setpassword(excel.getData(12, i, 1));

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img")).click();

				rb.clicklawlinklogin();

				// passed values

				System.out.println("Values passed");

				// Click Company/Business - Company Search link

				//driver.findElement(By.xpath("//*[@id="leftmenu"]/ul[1]/li[1]/a")).click();
				
				rblawlink.clickLawlinkCompanyCompanylink();
				
				//Click Company/Business - Submission Number Search link
				
				rblawlink.clickLawlinkCompanySubmissionNumberlink();

				// Pass search values and click search button

				// driver.findElement(By.name("userRef")).sendKeys("mysantest"+
				// rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				//driver.findElement(By.name("compNumber")).sendKeys(excel.getNumericData(3, i, 3));
				
				//Fill in submission number and submission document number
				
				rblawlink.setsubmissionnumber(excel.getNumericData(12, i, 3));
				
				rblawlink.setsubmissiodocnnumber(excel.getNumericData(12, i, 4));
				
				//Click Web Download button
				
				rblawlink.clickLawlinkWebDownloadRadioButton();
				
				//Click search button
				
				rblawlink.clickLawlinkSearchLink();
				
								
				Thread.sleep(30000);	
				
				System.out.println("Image downloaded successfully");
				
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

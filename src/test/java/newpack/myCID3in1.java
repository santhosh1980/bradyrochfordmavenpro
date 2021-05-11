package newpack;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBCID;
import pagefactory.myRBCID3in1;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myCID3in1 {

	@Test
	public void myCID3in1ViewResults() throws Exception {
		// to use chrome
		try {

			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(8); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);

				myRBCID3in1 rbcid3in1 = new myRBCID3in1(driver);

				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url login

				String baseurl = "https://qa.cid.ie";

				driver.get(baseurl);

				rb.setusername(excel.getData(8, i, 0));

				rb.setpassword(excel.getData(8, i, 1));

				rb.clickCIDlogin();

				System.out.println("CID logged in");

				// 3 in 1 URL in next tab

				((JavascriptExecutor) driver).executeScript("window.open()");

				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

				driver.switchTo().window(tabs.get(1));

				String directurl = "https://qa.cid.ie/CID/3in1search_new/";

				driver.get(directurl);

				// Set client reference number

				rbcid3in1.setclientRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				// Click CRO

				rbcid3in1.clickCID3in1CRO();

				// Click Judgment & Bankruptcy

				rbcid3in1.clickCID3in1Judg();

				// Click Personal Insolvency (ISI)

				rbcid3in1.clickCID3in1ISI();

				Thread.sleep(3000);

				// Select Next button

				rbcid3in1.clickCID3in1Next();

				// Pass company number and click add button

				for (int j = 2; j < excel.getcolnum(8, i); j++) {

					rbcid3in1.setcompanynumber(excel.getNumericData(8, i, j));

					rbcid3in1.clickCID3in1CompanyFind();

					rbcid3in1.clickCID3in1CompanyConfirm();

					Thread.sleep(3000);
				}

				// pass judgment/bankruptcy names and click add button

				for (int k = 0; k < excel.getcolnum(9, i); k += 2) {

					rbcid3in1.setjudgsurname(excel.getData(9, i, k));

					rbcid3in1.setjudgfirstname(excel.getData(9, i, k + 1));

					rbcid3in1.clickCID3in1AddJudgment();

					Thread.sleep(3000);
				}

				// pass isi names and click add button

				for (int m = 0; m < excel.getcolnum(10, i); m += 2) {
					
					rbcid3in1.setisisurname(excel.getData(10, i, m));
					
					rbcid3in1.setisifirstname(excel.getData(10, i, m+1));
					
					rbcid3in1.clickCID3in1AddISI();
					
					Thread.sleep(3000);

				}

				//Click submit button
				
				rbcid3in1.clickCID3in1Submit();
				
				Thread.sleep(5000);
				
				// Click download pdf button
				
				rbcid3in1.clickCID3in1PDF();
				
				// Write to Excel - PDF URL

				String pdfurl = utility.getPDFURL(driver);

				excel.writeData(8, i, 21, pdfurl);
				
				
				
				// close chrome
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

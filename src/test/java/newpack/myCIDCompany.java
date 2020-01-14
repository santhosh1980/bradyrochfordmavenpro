package newpack;

import java.util.Random;

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

public class myCIDCompany {

	@Test
	public void myCIDCompanyViewResults() throws Exception {
		// to use chrome
		try {

			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(1); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);
				
				myRBcommon rbcom = new myRBcommon(driver);
				
				myRBCID rbcid = new myRBCID(driver);


				driver.manage().window().maximize();

				// base url

				String baseurl = "https://qa.cid.ie";

				driver.get(baseurl);

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(1, i, 0));

				rb.setpassword(excel.getData(1, i, 1));

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.className("submit")).click();;

				rb.clickCIDlogin();

				// passed values

				System.out.println("Values passed");

				// Click CID and Company Search link

				//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[1]/a")).click();

				//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[2]/a")).click();
				
				rbcid.clickCIDlink();
				
				rbcid.clickCIDCompanyLink();

				// Pass search values and click search button

				// driver.findElement(By.id("userRef")).sendKeys("mysantest"+
				// rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				//driver.findElement(By.name("compName")).sendKeys(excel.getData(1, i, 2));
				
				//rbcid.setcompanyname(excel.getData(1, i, 2));
				
				rbcid.setcompanynumber(excel.getNumericData(1, i, 3));

				// *[@id="form1"]/table/tbody/tr[14]/td[2]/input[1]

				//driver.findElement(By.xpath("//*[@id=\"form1\"]/table/tbody/tr[14]/td[2]/input[1]")).click();
				
				rbcid.clickCIDCompanySearchLink();

				// Click accept charge button

				driver.findElement(By.name("acceptCharge")).click();

				Thread.sleep(5000);

				// Capture company report

				utility.screenshotcapture(driver, "companyreport");

				driver.findElement(By.xpath("//*[@id=\"topLinks\"]/tbody/tr[3]/td[2]/a")).click();

				Thread.sleep(5000);

				// excel.writeData(0, i, 3);

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

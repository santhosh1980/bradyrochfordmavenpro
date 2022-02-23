package newpack;

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
import pagefactory.myRBlogin;

public class myCIDWatchlist {

	@Test
	public void myCIDWatchlistViewResults() throws Exception {
		// to use chrome
		try {
			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);
			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(2); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);
				
				myRBCID rbcid = new myRBCID(driver);

				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://nonprod.cid.ie";

				driver.get(baseurl);

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(2, i, 0));

				rb.setpassword(excel.getData(2, i, 1));

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.className("submit")).click();

				rb.clickCIDlogin();

				// passed values

				System.out.println("Values passed");

				// Click CID button

				//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[1]/a")).click();
				
				rbcid.clickCIDlink();
				
				// Click Watchlist link

				//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[9]/a")).click();
				
				rbcid.clickCIDWathclistLink();

				// Click New watchlist link

				//driver.findElement(By.xpath("//*[@id=\"left_menu\"]/ul/li[11]/a")).click();
				
				rbcid.clickCIDNewWathclistLink();

				// Select watch type

				//driver.findElement(By.id("radCompany")).click();
				
				rbcid.clickCIDWatchType();

				// Pass company name

				// driver.findElement(By.name("compName")).sendKeys(excel.getData(0, i, 2));

				// Pass company id, click find button and add company to confirmed search

				for (int j = 3; j < excel.getcolnum(2, i); j++) {

					//Pass company number
					
					//driver.findElement(By.name("compNum")).sendKeys(excel.getNumericData(2, i, j));
					
					rbcid.setwatchlistcompanynumber(excel.getNumericData(2, i, j));
					
					// Click find button

					//driver.findElement(By.xpath("//*[@id=\"companyWatch\"]/table/tbody/tr[2]/td[3]/input")).click();
					
					rbcid.clickCIDWatchlistFindLink();

					Thread.sleep(5000);
					// Add company to the confirmed searches

					driver.findElement(By.xpath("//*[@id=\"0\"]")).click();

				}

				// Select the watches required - status change and annual return date

				//driver.findElement(By.id("chkStatus")).click();
				
				rbcid.clickCIDWatchlistStatusChange();

				//driver.findElement(By.id("chkARD")).click();
				
				rbcid.clickCIDWatchlistARD();

				// Click submit button

				//driver.findElement(By.xpath("//*[@id=\"compform\"]/table/tbody/tr[7]/td[3]/input")).click();
				
				rbcid.clickCIDWatchlistSubmit();

				// excel.writeData(0, i, 3);

				// close chrome

				Thread.sleep(5000);
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

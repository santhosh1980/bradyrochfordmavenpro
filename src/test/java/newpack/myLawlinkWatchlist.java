package newpack;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBLawlink;
import pagefactory.myRBlogin;

public class myLawlinkWatchlist {

	@Test
	public void myLawlinkWatchlistViewResults() throws Exception {
		// to use chrome
		try {

			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(4); i++) {

				driver = new ChromeDriver();

				myRBlogin rb = new myRBlogin(driver);
				
				myRBLawlink rblawlink = new myRBLawlink(driver);

				driver.manage().window().maximize();

				// base url

				String baseurl = "https://qa.lawlink.ie";

				driver.get(baseurl);

				// get webelements

				// WebElement name=driver.findElement(By.id("userName"));

				// WebElement pass=driver.findElement(By.id("password"));

				// pass credential

				rb.setusername(excel.getData(4, i, 0));

				rb.setpassword(excel.getData(4, i, 1));

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img")).click();

				rb.clicklawlinklogin();

				// passed values

				System.out.println("Values passed");

				// Click Watchlist link

				//driver.findElement(By.xpath("//*[@id=\"leftmenu\"]/ul[1]/li[3]/a")).click();
				
				rblawlink.clickLawlinkWatchlistLink();

				// Click New wathclist link

				//driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/table/tbody/tr[2]/td[2]/a")).click();
				
				rblawlink.clickLawlinkNewWathclistLink();

				// Select watch type

				//driver.findElement(By.id("radCompany")).click();
				
				rblawlink.clickLawlinkWatchType();

				// Pass company name

				// driver.findElement(By.name("compName")).sendKeys(excel.getData(0, i, 2));

				// Pass company id

				//driver.findElement(By.name("compNum")).sendKeys(excel.getNumericData(0, i, 3));
				
				rblawlink.setwatchlistcompanynumber(excel.getNumericData(0, i, 3));

				Thread.sleep(5000);

				// Click find button

				//driver.findElement(By.xpath("//*[@id=\"companyWatch\"]/table/tbody/tr[2]/td[3]/input")).click();
				
				rblawlink.clickLawlinkWatchlistFindLink();

				Thread.sleep(5000);
				// Add company to the confirmed searches

				driver.findElement(By.xpath("//*[@id=\"0\"]")).click();

				// Select the watches required - status change and annual return date

				//driver.findElement(By.id("chkStatus")).click();
				
				rblawlink.clickLawlinkWatchlistStatusChange();

				//driver.findElement(By.id("chkARD")).click();
				
				rblawlink.clickLawlinkWatchlistARD();

				// Click submit button

				//driver.findElement(By.xpath("//*[@id=\"compform\"]/table/tbody/tr[6]/td[3]/input")).click();
				
				rblawlink.clickLawlinkWatchlistSubmit();

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

package newpack;

import java.util.ArrayList;
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

public class myLawlinkDirector {

	@Test
	public void myLawlinkDirectorViewResults() throws Exception {
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
				
				myRBcommon rbcom = new myRBcommon(driver);
				
				myRBLawlink rblawlink = new myRBLawlink(driver);

				driver.manage().window().maximize();

				// base url

				String baseurl = "https://qa.lawlink.ie";

				driver.get(baseurl);

				//driver.findElement(By.xpath("//*[@id=\"header_right\"]/p/span/a")).click();
				
				rblawlink.clickLawlinkLoginNowlink();

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

				// Click Director

				//driver.findElement(By.xpath("//*[@id=\"leftmenu\"]/ul[1]/li[2]/a")).click();
				
				rblawlink.clickLawlinkDirectorlink();
				
				
				// Pass search values and click search button

				// driver.findElement(By.name("userRef")).sendKeys("mysantest"+
				// rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				//driver.findElement(By.name("dirName")).sendKeys(excel.getData(4, i, 2));
				
				rblawlink.setdirectorname(excel.getData(4, i, 2));

				// Click accept charge button

				driver.findElement(By.name("acceptCharge")).click();

				Thread.sleep(5000);

				// take the count of number of directors

				List<WebElement> boxes = driver.findElements(By.className("blue11"));

				int numberOfBoxes = boxes.size();

				// System.out.println("Number of Directors listed is:" + numberOfBoxes);

				int dircount = numberOfBoxes / 4;

				System.out.println("Number of Directors listed is:" + dircount);

				// Select all the director

				for (int m = 0; m < dircount; m++) {

					driver.findElement(By.name("DIR" + m)).click();
				}

				Thread.sleep(5000);

				// Click Get Director Details button

				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/form/table/tbody/tr["
						+ (dircount + 2) + "]/td/input")).click();

				// Test - Select all company numbers from each table

				for (int tab = 0; tab < dircount; tab++) {
					String tableXpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[" + (tab + 1) + "]";
					WebElement baseTable = driver.findElement(By.xpath(tableXpath));

					List<WebElement> tableRows = baseTable.findElements(By.tagName("tr"));
					int inTabSize = tableRows.size();
					for (int inTab = 0; inTab < inTabSize; inTab++) {
						if (inTab != 0) {
							// Click company number
							String xpth = "/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[" + (tab + 1)
									+ "]/tbody/tr[" + (inTab + 1) + "]/td[1]/strong/a";
							driver.findElement(By.xpath(xpth)).click();
							utility.screenshotcapture(driver, "Director");

							// Select accept charge button
							driver.findElement(By.name("acceptCharge")).click();
							utility.screenshotcapture(driver, "DirectorDetail");

							// click view PDF
							driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/div[1]/p/a[2]")).click();

							// Switch to PDF screen and close it
							ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
							driver.switchTo().window(tabs.get(1));
							driver.close();

							// Switch back to main screen and Go back to company select screen - 2 screen
							// previous
							driver.switchTo().window(tabs.get(0));
							driver.navigate().back();
							driver.navigate().back();

						}
						// System.out.println(tableRows.get(inTab).getText());
					}
				}

				// Test - End select all company numbers

				// excel.writeData(0, i, 3);

				Thread.sleep(5000);

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

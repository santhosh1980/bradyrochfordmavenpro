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
import pagefactory.myRBLawlink;
import pagefactory.myRBcommon;
import pagefactory.myRBlogin;

public class myLawlinkDirectorWatchlistRemoveAll {

	@Test
	public void myLawlinkDirectorWatchlistRemoveAllViewResults() throws Exception {
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
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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

				// driver.findElement(By.className("submit")).click();

				rb.clicklawlinklogin();

				// passed values

				System.out.println("Values passed");

				
				
				// Click Lawlink Watchlist link

				rblawlink.clickLawlinkWatchlistLink();
				
				//Click View Watchlist Link
				
				rblawlink.clickLawlinkViewWatchlistLink();
				
				
				// capture screenshot 1

				utility.screenshotcapture(driver, "Current watchlist");
				
				
				//List<WebElement> watchlistelements=driver.findElements(By.cssSelector("input[type='checkbox']"));
				
			
				List<WebElement> watchlistelements=rblawlink.LawlinkWatchlistRemoveDirectorCheckboxeswithoutreference();
				
				int numberwatchlistelements = watchlistelements.size();
				
				System.out.println("Number of watchlist elements available are:" + numberwatchlistelements);
				
				if(numberwatchlistelements>0)
				{
				
				//Select all checkboxes
					for(WebElement ele : watchlistelements) {
						
						if(!(ele.isSelected())) {
							System.out.println(ele.getAttribute("name"));
							ele.click();
							
						}
					}
				
				
					Thread.sleep(5000);
					
					// Click Lawlink View Watchlist Delete Selected Item link
					
										
					//driver.findElement((By.cssSelector("input[value='Delete Selected Item(s)']"))).click();
					
					rblawlink.clickLawlinkDeleteSelectedWatchlistItemButton();
					
					
					//Click return to watchlist after deletion
					
					rblawlink.clickLawlinkWathclistHereLink();
					
	
					// close chrome
	
					Thread.sleep(5000);
					
					// capture screenshot 1
	
					utility.screenshotcapture(driver, "Current watchlist after delete");
					
					
				
				}
				driver.quit();

				System.out.println("Browser closed");
				
				//exit from loop, need to execute only once
				break;

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

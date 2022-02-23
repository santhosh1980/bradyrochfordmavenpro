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

public class myCIDDirectorWatchlistWithoutReference {

	@Test
	public void myCIDDirectorWatchlistWithoutReferenceViewResults() throws Exception {
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

				rb.setusername(excel.getData(4, i, 0));

				rb.setpassword(excel.getData(4, i, 1));

				// RESI value status of user

				// System.out.println("RESI value status is:" + utility.sqlconnector());

				// click submit button

				// driver.findElement(By.className("submit")).click();

				rb.clickCIDlogin();

				// passed values

				System.out.println("Values passed");

				// Click CID button

				rbcid.clickCIDlink();
				
				// Click Director Search link

				rbcid.clickCIDDirectorlink();
				
				
				// capture screenshot 1

				utility.screenshotcapture(driver, "Director CID");
				
				//Set user reference
				
				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				//Set Director Name
				
				rbcid.setdirectorname(excel.getData(4, i, 2));
				
				//Click Search Button
				
				rbcid.clickCIDDirectorSearchLink();
				
				//Select all directors from the search results
				
				/*List<WebElement> direlements = driver.findElements(By.xpath("//input[starts-with(@name, 'DIR')]"));
				
				int numdirelements = direlements.size();
				
				for (int k=0; k<numdirelements-1; k++) {
					
					driver.findElement(By.name("DIR" + k)).click();
				}*/
				
				//List<WebElement> directorelements=driver.findElements(By.cssSelector("input[type='checkbox']"));
				
				List<WebElement> directorelements = rbcid.CIDWatchlistAddDirectorCheckboxes();
				
				int numberdirectorelements = directorelements.size();
				
				System.out.println("Number of Directors available are:" + numberdirectorelements);
				
				//Select all checkboxes
				for(WebElement ele : directorelements) {
					
					if(!(ele.isSelected())) {
						System.out.println(ele.getAttribute("value"));
						ele.click();
						
					}
				}
				
				
				Thread.sleep(5000);
				
				//Select Watch all selected button
				
				rbcid.clickCIDDirectorWatchAllSelectedLink();
				
				//Select Accept Charge button
				
				rbcid.clickCIDDirectorAcceptChargeDirWatchAllLink();
				
				
				
				Thread.sleep(5000);
				
				
				//Select No continue button - Watchlist - Directors added
				
				rbcid.clickCIDDirectorWatchlistAddedContinue();
				
				//click here button to view watchlist
				
				rbcid.clickCIDDirectorWatchDirectorsModelButton();
				

				// close chrome

				Thread.sleep(5000);
				
				// capture screenshot 1

				utility.screenshotcapture(driver, "Director Watchlist");
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

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

public class myCIDDirector_NOTCOMPLETED {

	@Test
	public void myCIDDirectorViewResults() throws Exception {
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

				String baseurl = "https://uat.cid.ie";

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

				// driver.findElement(By.className("submit")).click();;

				rb.clickCIDlogin();

				// passed values

				System.out.println("Values passed");

				// Click CID and Director Search link

								
				rbcid.clickCIDlink();
				
				rbcid.clickCIDDirectorlink();

				// Pass search values and click search button

				// driver.findElement(By.id("userRef")).sendKeys("mysantest"+
				// rand.nextInt(1000));

				rbcom.setuserRef("myautotest" + rand.nextInt(1000));

				Thread.sleep(5000);

				//Enter Director Name
				
				rbcid.setdirectorname(excel.getData(4, i, 2));
				
				
				//Click Director search button
				
				rbcid.clickCIDDirectorSearchLink();
				
				Thread.sleep(5000);
				
				//Click Select and View all button
				
				rbcid.clickCIDDirectorSelectViewAllLink();
				
				//Click Accept Charge Select View All Link
				
				rbcid.clickCIDDirectorAcceptChargeDirSelectViewAllLink();
				
				
				//Take screenshot
				
				utility.screenshotcapture(driver, "DirectorDetailAll");
				
				
				
				/*

				//List<WebElement> directorresutls = driver.findElements(By.xpath(".//*[starts-with(@id,'directorLink')]"));
				
				List<WebElement> directorresultsmatch=rbcid.CIDDirectorSearchMatchDirectorelements();
				
				int numberdirectorresults = directorresultsmatch.size();
				
				System.out.println("Number of Director results available are:" + numberdirectorresults);

				Thread.sleep(5000);
				
				
				
				//Click all Director results link one by one
				for(WebElement ele : directorresultsmatch) {
					
					//Click Director
					
					ele.click();
					
					//Click Accept Charge button
					
					rbcid.clickCIDDirectorSearchAcceptCharge();
					
					//Take screenshot
					
					utility.screenshotcapture(driver, "DirectorDetail");
					
					//Click Back button and come to Director search results screen
					
					driver.navigate().back();
						
				}
				
				*/
				

				

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

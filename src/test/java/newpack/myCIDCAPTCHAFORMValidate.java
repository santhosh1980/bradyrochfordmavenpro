package newpack;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBCID;
import pagefactory.myRBlogin;

public class myCIDCAPTCHAFORMValidate {

	@Test
	public void myCIDCAPTCHAFORMValidateViewResults() throws Exception {
		// to use chrome
		try {
			WebDriver driver;

			String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";

			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestData.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);
			
			//Random rand = new Random();

			// create chrome instance
			System.setProperty("webdriver.chrome.driver", driverpath);

			for (int i = 0; i <= excel.getrownum(11); i++) {

				driver = new ChromeDriver();

				//myRBlogin rb = new myRBlogin(driver);
				
				myRBCID rbcid = new myRBCID(driver);

				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://qa.cid.ie";

				driver.get(baseurl);
				
				if(i==0){
					
					//Click CID Support link

					rbcid.clickCIDSupportLink();
					
					Thread.sleep(5000);
					
					//Click CID Email Support link
					
					rbcid.clickCIDEmailSupportLink();
					
					Thread.sleep(5000);
					
					//Click Submit
					
					rbcid.clickCIDCaptchaSubmit();
					
					
					
				}
				else if (i==1)  {
					
					//Click CID Cost link

					rbcid.clickCIDCostsLink();
					
					Thread.sleep(5000);
					
					//Click CID Email Cost Link
					
					rbcid.clickCIDEmailCostLink();
					
					Thread.sleep(5000);
					
					//Click Submit
					
					rbcid.clickCIDCaptchaSubmit();
					
				}
				
				else {
					
					//Click CID Contact Us Link

					rbcid.clickCIDContactUsLink();
					
					Thread.sleep(5000);
					
					//Click CID Email Contact Us Link
					
					rbcid.clickCIDEmailContactUsLink();
					
					Thread.sleep(5000);
					
					//Click Submit
					
					rbcid.clickCIDCaptchaSubmit();
				}
					
				String[] Errorhead = {"Support", "CID", "Contact Us"};
				
				//Validate error messages
				
				String expectederror =Errorhead[i]+"\n" + 
						"There was an error processing your feedback.\n" + 
						"You must enter Email Address\n" + 
						"You must enter Subject\n" + 
						"You must enter Comments\n" + 
						"You must enter the text as shown in the image\n" + 
						"Go back";
				
				String actualerror = driver.findElement(By.id("sub_content")).getText();
				
				//Assert.assertEquals(expectederror, actualerror);
				
				//System.out.println("error text matches");
				
				SoftAssert softassert = new SoftAssert();
				
					
				softassert.assertEquals(actualerror, expectederror);
				
				System.out.println("Line of code execute even assertion fails");
				
								
				
				
				utility.screenshotcapture(driver, "CIDCaptcha");
				
				/*if(actualerror.contains(expectederror))
				{
					System.out.println("error text matches");
				}
				else
				{
					System.out.println("error text not matches");
				}*/
				//Click Go back
				
				rbcid.clickCIDCaptchaGoBack();
				
				
				
						
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

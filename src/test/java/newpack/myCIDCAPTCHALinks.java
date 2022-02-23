package newpack;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBCID;
import pagefactory.myRBlogin;

public class myCIDCAPTCHALinks {

	@Test
	public void myCIDCAPTCHALinksViewResults() throws Exception {
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

				String baseurl = "https://nonprod.cid.ie";

				driver.get(baseurl);
				
				if(i==0){
					
					//Click CID Support link

					rbcid.clickCIDSupportLink();
					
					Thread.sleep(5000);
					
					//Click CID Email Support link
					
					rbcid.clickCIDEmailSupportLink();
					
					Thread.sleep(5000);
					
				}
				else if (i==1)  {
					
					//Click CID Cost link

					rbcid.clickCIDCostsLink();
					
					Thread.sleep(5000);
					
					//Click CID Email Cost Link
					
					rbcid.clickCIDEmailCostLink();
					
					Thread.sleep(5000);
					
				}
				
				else {
					
					//Click CID Contact Us Link

					rbcid.clickCIDContactUsLink();
					
					Thread.sleep(5000);
					
					//Click CID Email Contact Us Link
					
					rbcid.clickCIDEmailContactUsLink();
					
					Thread.sleep(5000);
				}
					
								
				
				//Enter CAPTCHA Form Email 
				
				rbcid.setcaptchaemailaddress(excel.getData(11, i, 0));
				
				//Enter CAPTCHA Form Subject
				
				rbcid.setcaptchaemailsubject(excel.getData(11, i, 1));
				
				//Enter CAPTCHA Form Comments
				
				rbcid.setcaptchaemailcontent(excel.getData(11, i, 2));
				
				Thread.sleep(15000);
				
				//Enter CAPTCHA WORD
				
				
				
				//Click Submit
				
				rbcid.clickCIDCaptchaSubmit();
				
				Thread.sleep(3000);
				
				String[] heading = {"Support", "CID", "Contact Us"};
				
				String thankyoutext = heading[i]+"\n" + 
						"Thank you for your feedback.\n" + 
						"One of our representatives will contact you shortly.";
				
				//String bodytext1=driver.findElement(By.tagName("body")).getText();
				
				String bodytext2=driver.findElement(By.id("sub_content")).getText();
				
				if(bodytext2.contains(thankyoutext))
				{
					System.out.println("Thank you text matches");
				}
				else
				{
					System.out.println("Thank you text not matches");
				}
				
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

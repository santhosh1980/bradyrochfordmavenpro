package newpack;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.junit.Assert;
import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBCID;
import pagefactory.myRBLawlink;
import pagefactory.myRBlogin;

public class myLawlinkCAPTCHALinks {

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

			for (int i = 0; i <= excel.getrownum(12); i++) {

				driver = new ChromeDriver();

				//myRBlogin rb = new myRBlogin(driver);
				
				myRBLawlink rblawlink = new myRBLawlink(driver);

				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// base url

				String baseurl = "https://qa.lawlink.ie";

				driver.get(baseurl);
				
				if(i==0){
					
					//Click Lawlink Home link

					rblawlink.clickLawlinkHomeLink();
					
					Thread.sleep(5000);
					
					//Click Lawlink Email Home Link
					
					rblawlink.clickLawlinkEmailHomeLink();
					
					Thread.sleep(5000);
					
				}
				else if (i==1)  {
					
					//Click Lawlink Cost link

					rblawlink.clickLawlinkCostsLink();
					
					Thread.sleep(5000);
					
					//Click Lawlink Email Cost link
					
					rblawlink.clickLawlinkEmailCostLink();
					
					Thread.sleep(5000);
					
				}
				
				else if (i==2)  {
					
					//Click Lawlink Support link

					rblawlink.clickLawlinkSupportLink();
					
					Thread.sleep(5000);
					
					//Click Lawlink Email Support link
					
					rblawlink.clickLawlinkEmailSupportLink();
					
					Thread.sleep(5000);
					
				}
				
				else if (i==3)  {
					
					//Click Lawlink Contact Us link

					rblawlink.clickLawlinkContactUsLink();
					
					Thread.sleep(5000);
					
					//Click Lawlink Contact Us Support link
					
					rblawlink.clickLawlinkEmailContactUsSupportLink();
					
					Thread.sleep(5000);
					
				}
				
				else if (i==4)  {
					
					//Click Lawlink Contact Us link

					rblawlink.clickLawlinkContactUsLink();
					
					Thread.sleep(5000);
					
					//Click Lawlink Contact Us Register link
					
					rblawlink.clickLawlinkEmailContactUsRegistrationLink();
					
					Thread.sleep(5000);
					
				}
				
				else if (i==5)  {
					
					//Click Lawlink Contact Us link

					rblawlink.clickLawlinkContactUsLink();
					
					Thread.sleep(5000);
					
					//Click Lawlink Contact Us Billing link
					
					rblawlink.clickLawlinkEmailContactUsBillingLink();
					
					Thread.sleep(5000);
					
				}
				
				else  {
					
					//Click Lawlink Closing Search link

					rblawlink.clickLawlinkClosingSearchlink();
					
					Thread.sleep(5000);
					
					//Click Lawlink Email Closing Search link
					
					rblawlink.clickLawlinkEmailClosingSearchLink();
					
					Thread.sleep(5000);
					
				}
				
				
				//Enter CAPTCHA Form Email 
				
				rblawlink.setcaptchaemailaddress(excel.getData(12, i, 0));
				
				//Enter CAPTCHA Form Subject
				
				rblawlink.setcaptchaemailsubject(excel.getData(12, i, 1));
				
				//Enter CAPTCHA Form Comments
				
				rblawlink.setcaptchaemailcontent(excel.getData(12, i, 2));
				
				Thread.sleep(15000);
				
				//Enter CAPTCHA WORD
				
				
				
				//Click Submit
				
						
				rblawlink.clickLawlinkCaptchaSubmit();
				
				Thread.sleep(3000);
				
				
				
				String[] heading = {"Lawlink", "Costs", "Support", "Contact Us","Contact Us","Contact Us","Closing Search"};
				
				String thankyoutext = heading[i]+"\n" + 
						"Thank you for your feedback.\n" + 
						"One of our representatives will contact you shortly.";
				
				//String bodytext1=driver.findElement(By.tagName("body")).getText();
				
				String bodytext2=driver.findElement(By.id("sub_content")).getText();
				
				Assert.assertEquals(thankyoutext, bodytext2);
				
				
				
				/*if(bodytext2.contains(thankyoutext))
				{
					System.out.println("Thank you text matches");
				}
				else
				{
					System.out.println("Thank you text not matches");
				}*/
				
				driver.quit();

				System.out.println("Browser closed");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

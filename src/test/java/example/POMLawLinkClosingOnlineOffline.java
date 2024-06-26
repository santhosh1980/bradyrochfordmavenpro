package example;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import lib.utility;
import pagefactory.myRBlogin;
import pages.RBlogin;

public class POMLawLinkClosingOnlineOffline {
	
	

	@Test
	public void myLawLinkClosingOnlineOfflineViewResults()
	{	
		WebDriver driver=null;
		
		WebDriverWait mywaitvar =null;
		
		Logger log = Logger.getLogger("");
		
		String driverpath = "C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";
		
		String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\TestDataOnlineOffline.xlsx";
		
		ExcelDataConfig excel= new ExcelDataConfig(datapath);
		
		
		
		Random rand = new Random();
		
		//create chrome instance
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		
		//utility.dbconnect();
		
	
			try
			{
				
		
			
				
			
			//ExcelDataConfig excel= new ExcelDataConfig("C:\\Users\\SThekkeNeetiath\\eclipse-workspace\\Data\\TestDataOnlineOffline.xlsx");
		
		
			
			for (int i=0;i<=excel.getrownum(1);i++) {		
			
				
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\SThekkeNeetiath\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			//RBlogin rb=new RBlogin(driver);
			
			myRBlogin rb=new myRBlogin(driver);
						
			//create firefox instance
			
			//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			//DesiredCapabilities dc = DesiredCapabilities.firefox();
			
			//dc.setCapability("marionette", true);
			
			//driver = new FirefoxDriver();
			
			
			driver.manage().window().maximize();
			
						
			
			//base url
			
			//String baseurl="https://qa.lawlink.ie";
			
			//BVT
			
			String baseurl=excel.getData(4, 0, 0);
			
			//UAT
			
			//String baseurl=excel.getData(4, 0, 1);
			
			//Staging
			
			//String baseurl=excel.getData(4, 0, 2);
			
			
			driver.get(baseurl);
			
			log.debug("Opening website");
						
						
			driver.findElement(By.xpath("//*[@id=\"header_right\"]/p/span/a")).click();
			
			//get webelements
			
			//WebElement name=driver.findElement(By.id("userName"));
			
			//WebElement pass=driver.findElement(By.id("password"));
			
			//POM model call
			
			rb.setusername(excel.getData(1, i, 0));
			
			rb.setpassword(excel.getData(1, i, 1));
			
			log.debug("Opening Login screen");
			
			//pass credential and submit
			
			//name.sendKeys(excel.getData(1, i, 0));
			
			//pass.sendKeys(excel.getData(1, i, 1));
			
			Thread.sleep(5000);
			
			//Resi value from DB
			
			//String Resi = utility.sqlconnector(excel.getData(1, i, 0));
			
					
			//RESI value status from excel file searching through users
			
			String Resi=null;
			
			for (int m=0;m<=excel.getrownum(3);m++) {
				if ((excel.getData(3, m, 0)).equalsIgnoreCase(excel.getData(1, i, 0))){
					Resi=excel.getData(3, m, 1);
					break;
				}
			}
			
			System.out.println("RESI value status is:" + Resi );
			
			//Click login button
			
			//driver.findElement(By.xpath("//*[@id=\"loginpanel\"]/form/p[3]/a/img")).click();
			
			rb.clicklawlinklogin();
			
			//click closing search button
			Thread.sleep(5000);
						
			driver.findElement(By.xpath("//*[@id=\"leftmenu\"]/ul[2]/li/a")).click();
			
			log.debug("Clicking Closing search button");
			
			//capture screenshot 1
			
			utility.fullscreenshotcapture(driver, "closingsearch");
			
			
			
			//Pass search values and click search button
			
			driver.findElement(By.id("userRef")).sendKeys("myautocheck"+rand.nextInt(1000));
			
			//select the checkbox - Judgment/Bankruptcy & Personal Insolvency (ISI) searches, Registry of Deeds
			
			driver.findElement(By.id("chkJudg")).click();
			
			driver.findElement(By.id("chkDeeds")).click();
			
			//Fill values for offline search
			
			driver.findElement(By.name("requiredBy")).sendKeys("23/10/2020");
			
			driver.findElement(By.xpath("//*[@id=\"step3\"]/table/tbody/tr[3]/td[2]/input[2]")).click();
			
			//Click Next button
			
			driver.findElement(By.name("next")).click();
			
			
			
			//pass Surname, firstname for online search then click add button
			
			for (int j=2;j<excel.getcolnum(1, i);j+=2) {
		
			driver.findElement(By.name("surname")).sendKeys(excel.getData(1, i, j));
			
			driver.findElement(By.name("firstName")).sendKeys(excel.getData(1, i, j+1));
			
			driver.findElement(By.id("AddName")).click();
			
			Thread.sleep(5000);
			}
			
			//pass Firstname, surname, Date and Address for offline search 
			
			int offcount = 1;
			
			for (int k=0;k<excel.getcolnum(2, i);k+=5) {
				
			Thread.sleep(5000);
			
			
			//driver.findElement(By.id("deeds_firstname")).sendKeys(excel.getData(2, i, k));
			
			//driver.findElement(By.id("deeds_surname")).sendKeys(excel.getData(2, i, k+1));
			
			//driver.findElement(By.id("deeds_from")).sendKeys(excel.getDateData(2, i, k+2));
			
			//driver.findElement(By.id("deeds_to")).sendKeys(excel.getDateData(2, i, k+3));
			
			//driver.findElement(By.id("deeds_address")).sendKeys(excel.getData(2, i, k+4));
		
			String fname=null;
			String lname=null;
			String deedsfrom=null;
			String deedsto=null;
			String deedsaddress=null;
			
			if ((Resi==null)||(Resi.isEmpty()))
			{
					Resi="NO";
			}
			
			if(offcount==1 && (Resi.equalsIgnoreCase("NO")||Resi.equalsIgnoreCase("YES"))) {
				fname="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[1]/td[2]/input";
				lname="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[2]/td[2]/input";
				deedsfrom="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[3]/td[2]/input[1]";
				deedsto="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[3]/td[2]/input[2]";
				deedsaddress="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[1]/table/tbody/tr[4]/td/textarea";
			}
			
			else if (offcount!=1 && (Resi.equalsIgnoreCase("NO")||Resi.equalsIgnoreCase("YES"))) {
				fname="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[".concat(String.valueOf(offcount)).concat("]/table/tbody/tr[1]/td[2]/input");
				lname="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[".concat(String.valueOf(offcount)).concat("]/table/tbody/tr[2]/td[2]/input");
				deedsfrom="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[".concat(String.valueOf(offcount)).concat("]/table/tbody/tr[3]/td[2]/input[1]");
				deedsto="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[".concat(String.valueOf(offcount)).concat("]/table/tbody/tr[3]/td[2]/input[2]");
				deedsaddress="/html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[2]/tbody/tr[4]/td/div/form[".concat(String.valueOf(offcount)).concat("]/table/tbody/tr[4]/td/textarea");
			}
			
			
			driver.findElement(By.xpath(fname)).sendKeys(excel.getData(2, i, k));
			
			driver.findElement(By.xpath(lname)).sendKeys(excel.getData(2, i, k+1));
			
			driver.findElement(By.xpath(deedsfrom)).sendKeys(excel.getDateData(2, i, k+2));
			
			driver.findElement(By.xpath(deedsto)).sendKeys(excel.getDateData(2, i, k+3));
			
			driver.findElement(By.xpath(deedsaddress)).sendKeys(excel.getData(2, i, k+4));
			
			//Click another registry of deeds search button
			
			if(k+5<excel.getcolnum(2, i)) {
			driver.findElement(By.xpath("//*[@id=\"deeds1\"]/table/tbody/tr[5]/td/span/a")).click();
			}
			
			offcount++;
			
			Thread.sleep(5000);
			}
			
			
			//capture screenshot 2
			
			utility.fullscreenshotcapture(driver, "searchvalue");
			
			System.out.println("Values passed");
			
			//Click submit button
			
			
			
			driver.findElement(By.xpath("//*[@id=\"panel\"]/div[1]/table[3]/tbody/tr[3]/td/input")).click();
			
			
			
			//Thread.sleep(30000);
			
			//Click download pdf button
			
			mywaitvar = new WebDriverWait(driver, Duration.ofSeconds(50));
			
			mywaitvar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"all_reports\"]/a/p")));
			
			driver.findElement(By.xpath("//*[@id=\"all_reports\"]/a/p")).click();
			
			log.debug("Clicking download pdf button");
			
			
						
			Thread.sleep(5000);
			
			//verify pdf
			
			utility.verifyPDFInURL(driver);
			
			//Write to Excel - PDF URL
			
			String pdfurl = utility.getPDFURL(driver);
			
			excel.writeData(1, i, 21, pdfurl);
			
			//Download PDF
			
			//utility.downloadPDF(driver);
			
					
			
			//close chrome
			driver.quit();
			

			System.out.println("Browser closed");
			}
			
	}
	catch (Exception e)
	{
		// TODO: handle exception
		System.out.println(e.getMessage());
		//capture exception screenshot 
		e.printStackTrace();
		
		utility.screenshotcapture(driver, "exception");
	}
			//utility.dbclose();
		
}

}

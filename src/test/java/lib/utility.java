package lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessBuffer;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class utility {

	static String dbUrl = "";
	static String username = "";
	static String password = "";
	static Connection con;
	
	
	public static void scrollscreen(WebDriver driver, int xaxis, int yaxis){

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			// This  will scroll  the page left/right or up/down by  mentioned pixel horizontal/vertical
			//x axis 0 and y axis  1000 means vertical move down
			//x axis 0 and y axis  -1000 means vertical move up
	        js.executeScript("window.scrollBy(xaxis,yaxis)");
	        
	       

			System.out.println("Scrolled");
		} catch (Exception e) {
			System.out.println("Exception while scrolling " + e.getMessage());
		}

	}
	
	
	public static void scrollendofpage(WebDriver driver){

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			        
	        //scroll till end of page
			
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			System.out.println("Scrolled");
		} catch (Exception e) {
			System.out.println("Exception while scrolling " + e.getMessage());
		}

	}
	
	

	public static void screenshotcapture(WebDriver driver, String screenshotname) {

		try {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File(
					"./screenshot/" + screenshotname + String.valueOf(LocalDateTime.now()).replace(":", ".") + ".png"));

			System.out.println("screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}

	}
	
	public static void fullscreenshotcapture(WebDriver driver, String screenshotname) {

		try {

			Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			
			ImageIO.write(screenshot.getImage(),"PNG",new File(
					"./screenshot/" + screenshotname + String.valueOf(LocalDateTime.now()).replace(":", ".") + ".png"));
			
		
			
			System.out.println("screenshot taken");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}

	}
	
	public static String extendedscreenshotcapture(WebDriver driver, String screenshotname) {
		
		String path=null;

		try {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);
			
			path = System.getProperty("user.dir") + "/screenshot/" + screenshotname + String.valueOf(LocalDateTime.now()).replace(":", ".") + ".png";
			
			//path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
			
			File destination = new File(path);

			FileUtils.copyFile(source, destination);
			
			

			
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot" + e.getMessage());
		}
		
		return path;
		
		

	}

	public static void windowhandle(WebDriver driver) throws Exception {

		String parent = driver.getWindowHandle();

		System.out.println("Parent window id is:" + parent);

		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();

		System.out.println("total window is:" + count);

		for (String child : allWindows) {

			if (!parent.equalsIgnoreCase(child)) {

				driver.switchTo().window(child);

				Thread.sleep(5000);

				driver.close();

			}
		}

		driver.switchTo().window(parent);

		System.out.println("Parent window title is:" + driver.getTitle());

		Thread.sleep(5000);

		driver.close();
	}
	
	public static void verifyPDFInURL(WebDriver driver) throws Exception {
		
		int wincnt = driver.getWindowHandles().size();
		
		System.out.println("total window is:" + wincnt);
		
		//switch to the new window opened
		
		if(wincnt>1) {
			
			int windownumber=0;
			
			for (String winhandle :  driver.getWindowHandles() ) {
				
				driver.switchTo().window(winhandle);
				
				System.out.println(driver.getCurrentUrl());
				
				windownumber++;
				
				if (windownumber==2) {
					
					String verifytext = "PLEASE SEARCH in the appropriate records for all entries\r\n" + 
							"relating to unsatisfied Judgments, Revivals, Decrees, Rules,\r\n" + 
							"Orders, Registrations relating to Real and Chattel Real Estate,\r\n" + 
							"Lis Pendens Recognisances, Crown Bonds, Judgments at the suit\r\n" + 
							"of the Crown or the State, Statutes, Inquisitions and Acceptance of\r\n" + 
							"Office registered, re-registered or redocketed against." ;
					
					//Assert.assertTrue(verifyPDFContent(driver.getCurrentUrl(), verifytext));
					
					boolean val = verifyPDFContent(driver.getCurrentUrl(), verifytext);
					
					if (val==true) 
						System.out.println("Text matches");
					
					else 
						System.out.println("Text not matches");
					
					
				}
			}
			
		}

		
	}
	
public static String getPDFURL(WebDriver driver) throws Exception {
		
		int wincnt = driver.getWindowHandles().size();
		
		String winpdfurl = null;
			
		//switch to the pdf window opened
		
		if(wincnt>1) {
			
			int windownumber=0;
			
			for (String winhandle :  driver.getWindowHandles() ) {
				
				driver.switchTo().window(winhandle);
				
				
				windownumber++;
				
				if (windownumber==2 || windownumber==3) {
					
					winpdfurl = driver.getCurrentUrl();
										
				}
				
				
			}
			
		}
		
		return winpdfurl;
		
	}

/*public static void downloadPDF(WebDriver driver) throws Exception {
	
	int wincnt = driver.getWindowHandles().size();
	
	String winpdfurl = null;
		
	//switch to the pdf window opened
	
	if(wincnt>1) {
		
		int windownumber=0;
		
		for (String winhandle :  driver.getWindowHandles() ) {
			
			driver.switchTo().window(winhandle);
			
			
			windownumber++;
			
			if (windownumber==2) {
				
				winpdfurl = driver.getCurrentUrl();
				
				String downloadFilepath = "C:\\Users\\U35035";
				 
			    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			    chromePrefs.put("profile.default_content_settings.popups", 0);
			    chromePrefs.put("download.default_directory", downloadFilepath);
			       
			    ChromeOptions options = new ChromeOptions();
			    options.setExperimentalOption("prefs", chromePrefs);
			    options.addArguments("--test-type");
			    options.addArguments("--disable-extensions"); //to disable browser extension popup
			    options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
			    driver.findElement(By.xpath("//*[@id=\"icon\"]/iron-icon")).click();
			    			    
			    System.out.println("Download success");
			      
									
			}
		}
		
	}
	
	
	
}*/
	
	public static boolean verifyPDFContent(String strURL, String reqTextInPDF) throws Exception {
		
		boolean flag = false;
		
		String parsedText = null;
		
		URL url = new URL(strURL);
		BufferedInputStream fileToParse = new BufferedInputStream(url.openStream());
		PDDocument doc = PDDocument.load(fileToParse);
		
	
			
		PDFTextStripper pdfStripper = new PDFTextStripper();
		//Include the below code to read the PDF for a range of pages only, otherwise it will read all
		//pdfStripper.setStartPage(1);
		//pdfStripper.setEndPage(1);
			
			
		parsedText = pdfStripper.getText(doc);
		doc.close();
		//bis.close();
		
		System.out.println("+++++++++++++++++");
		System.out.println(parsedText);
		System.out.println("+++++++++++++++++");

		if(parsedText.contains(reqTextInPDF)) {
			flag=true;
		}
		
		System.out.println(flag);
		return flag;
		
		
		
		
	}

	public static void dbconnect() throws Exception {

		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		dbUrl = "jdbc:mysql://z1diigrbmysql02.diigeu.local:63132/rbsubscriptions";

		// Database Username
		username = "bumblebee";

		// Database Password
		password = "sCrYcssrtJFAX5YT";

		// Load mysql jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Create Connection to DB
		con = DriverManager.getConnection(dbUrl, username, password);

		
	}

	public static String sqlconnector(String uname) throws Exception {

		Statement stmt;
		// Create Statement Object
		stmt = con.createStatement();
				
				
		// Query to Execute
		String query = "select RESI_VALUE_USER from rbsubscriptions.RBCustomerSubscriber where user_name = '" + uname
				+ "';";

		// Execute the SQL Query. Store results in ResultSet
		ResultSet rs = stmt.executeQuery(query);

		String resi_value_user = "";

		// While Loop to iterate through all data and print results
		while (rs.next()) {
			resi_value_user = rs.getString(1);
			// String myAge = rs.getString(2);
			// System. out.println(myName+" "+myAge);

		}
		

		return resi_value_user;

	}
	
	public static void dbclose() throws Exception {
		// closing DB Connection
				con.close();
	}
	
	public static WebDriver webdrivermanagebrowser(String browsername) throws Exception {
		
		WebDriver driver = null;
		
		//Webdriver manager for chrome
		if(browsername.equalsIgnoreCase("Chrome")){
			
		  driver = WebDriverManager.chromedriver().create();
		  
		}
		
		  //Webdriver manager for firefox
		else if (browsername.equalsIgnoreCase("Firefox")){
		  driver = WebDriverManager.firefoxdriver().create();
		}
		
		  //Webdriver manager for edge
		else if (browsername.equalsIgnoreCase("Edge")){
		  driver = WebDriverManager.edgedriver().create();
		}
		  String baseurl="https://nonprod.lawlink.ie";
			driver.get(baseurl);
			return driver;
	}
	
	public static WebDriver browserstart(String browsername) throws Exception {
		
		WebDriver driver = null;
		
		String driverpath;
		
		//chrome driver
		if(browsername.equalsIgnoreCase("Chrome")) {
			
						
			//Set Chrome driver path and create chrome instance
			driverpath="C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			
			//Code for chrome incognito window to open
			//configure options parameter to chrome driver
			ChromeOptions co = new ChromeOptions();
			//chrome 111 issue to resolve - After the Chrome 111 update, you can no longer kick off a chromedriver instance unless you add an additional chrome option
			co.addArguments("--remote-allow-origins=*");
			//add incognito parameter
			co.addArguments("--incognito");
			
					
			//Desired capabilities are supported only selenium 3, not supported in selenium 4
			
			
			// DesiredCapabilities object
			//DesiredCapabilities dc = DesiredCapabilities.chrome();
			//set capability to browser
			//dc.setCapability(ChromeOptions.CAPABILITY, co);
			
			
			//driver = new ChromeDriver();
			driver = new ChromeDriver(co);
			
		}
		
		//firefox driver
		else if (browsername.equalsIgnoreCase("Firefox")) {
			
			//Set Firefox driver path and create firefox instance
			driverpath="C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverpath);
			
						
			driver = new FirefoxDriver();
		}
		
		//internet explorer driver
		else if (browsername.equalsIgnoreCase("Edge")) {
					
			//Set IE driver path and create IE instance
			//driverpath="C:\\Users\\U35035\\eclipse-workspace\\Microsoftwebdriver\\MicrosoftWebDriver.exe";
			driverpath="C:\\Users\\U35035\\eclipse-workspace\\Microsoftwebdriver\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", driverpath);
						
			driver = new EdgeDriver();
		}
		
		String baseurl="https://nonprod.lawlink.ie";
		driver.get(baseurl);
		return driver;
	}
	
	public static void keyenter() throws Exception {
		
		Robot robot;
		
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER); //press enter key
			robot.keyRelease(KeyEvent.VK_ENTER); //release enter key
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	


}

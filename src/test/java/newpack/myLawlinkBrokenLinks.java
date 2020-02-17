package newpack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myLawlinkBrokenLinks {

	WebDriver driver;

	@Test
	public void BrokenLinksResults() throws Exception {

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String baseurl = "https://qa.lawlink.ie";

		String url = "";

		driver.get(baseurl);

		HttpURLConnection huc = null;

		int respcode = 200;

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			System.out.println(url);

			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			if (!url.startsWith(baseurl)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			
			huc= (HttpURLConnection)(new URL(url).openConnection());
			
			huc.setRequestMethod("HEAD");
            
            huc.connect();
            
            respcode = huc.getResponseCode();
            
            if(respcode >= 400){
                System.out.println(url+" is a broken link");
            }
            else{
                System.out.println(url+" is a valid link");
            }
			

		}

	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {

		driver.close();

	}
}

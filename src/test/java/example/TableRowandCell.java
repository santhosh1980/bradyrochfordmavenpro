package example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableRowandCell {

	WebDriver driver;

	@Test
	public void TableRowandCellResults() throws Exception {

		driver.manage().window().maximize();

		String baseurl = "http://demo.guru99.com/test/web-table-element.php";

		driver.get(baseurl);
		
		//Number of columns
		
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		int tcol = columns.size();
		
		
		
		//Number of rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		
		int trow = rows.size();
		
		//Print
		
		System.out.println("Number of columns:" + tcol);
		
		System.out.println("Number of rows:" + trow);
		
		
		
		for (int i=1;i<=trow;i++) {
			
							
				System.out.println("Row:"+i);
				
				String company = "/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td[1]/a";
				
				String group = "/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td[2]";
				
				String previousclose = "/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td[3]";
				
				String currentprice = "/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td[4]";
				
				String percentchange = "/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td[5]/font";
				
				System.out.println("Company:"+ driver.findElement(By.xpath(company)).getText());
				
				System.out.println("Group:"+ driver.findElement(By.xpath(group)).getText());
				
				System.out.println("Previous Close:"+ driver.findElement(By.xpath(previousclose)).getText());
				
				System.out.println("Current Price:"+ driver.findElement(By.xpath(currentprice)).getText());
				
				System.out.println("Percent Change:"+ driver.findElement(By.xpath(percentchange)).getText());
				
				System.out.println("");
				
			
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

package example;

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

public class Testtooltip {

	WebDriver driver;

	@Test
	public void TesttooltipResults() throws Exception {

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		String baseurl = "https://www.guru99.com/";
		
		String tooltip;
		
		String text;

		driver.get(baseurl);

		// List<WebElement> Testing =
		// driver.findElements(By.xpath("//*[@id=\"java_technologies\"]/li"));

		// List<WebElement> Testing =
		// driver.findElements(By.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/"));

		// List<WebElement> Testing =
		// driver.findElements(By.xpath(".//*[starts-with(@xpath,'/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[1]')]"));

		// int Testingcount = Testing.size();

		// Testing - 9

		for (int i = 1; i <= 9; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[1]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[1]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");
			 

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Live projects - 14

		for (int i = 1; i <= 14; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[2]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[2]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Performance Testing - 2

//		for (int i = 1; i <= 2; i++) {
//
//			String tooltip = driver.findElement(By
//					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[3]/li[" + i + "]/a"))
//					.getAttribute("title");
//
//			String text = driver.findElement(By
//					.xpath("/html/body/div[2]/section[4]/div/div/div/div/div/div/div/div[1]/div/ul[3]/li[" + i + "]/a"))
//					.getText();
//
//			if (!tooltip.equals(text)) {
//
//				System.out.println("Tooltip is " + tooltip);
//
//				System.out.println("Text is " + text);
//
//			}
//
//		}

		// SAP - 20

		for (int i = 1; i <= 20; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[2]/div/ul[1]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[2]/div/ul[1]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Defect tools - 3

		for (int i = 1; i <= 3; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[3]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[3]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Enterprise Testing - 3

		for (int i = 1; i <= 3; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[4]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[1]/div/ul[4]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// AI - 8

		for (int i = 1; i <= 8; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[3]/div/ul[1]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[3]/div/ul[1]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Web - 23

		for (int i = 1; i <= 23; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[3]/div/ul[2]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[3]/div/ul[2]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Test Management - 3

		for (int i = 1; i <= 3; i++) {

			 tooltip = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[3]/div/ul[3]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By
					.xpath("/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[3]/div/ul[3]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Big data - 17

		for (int i = 1; i <= 17; i++) {

			 tooltip = driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[2]/div/ul[2]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[2]/div/ul[2]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			//replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		// Must learn - 30

		for (int i = 1; i <= 30; i++) {

			 tooltip = driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[4]/div/ul[1]/li["+i+"]/a"))
					.getAttribute("title");

			 text = driver.findElement(By.xpath(
					"/html/body/div[1]/div/div/div/main/div/article/div/div[1]/div[2]/div[4]/div/ul[1]/li["+i+"]/a"))
					.getText();
			 
			 //replacing all characters except alpha numeric
			 
			 //text=text.replaceAll("[^a-zA-Z0-9]", "");
			 
			 //replace everything that is not word character (a-z in any case, 0-9 or _) or whitespace or brackets or slash or period or  plus or hyphen sign or hash sign
			 
			 text=text.replaceAll("[^\\w\\s\\(\\)\\/\\.\\+\\-\\#]", "");

			if (!tooltip.trim().equals(text.trim())) {

				System.out.println("Tooltip is " + tooltip);

				System.out.println("Text is " + text);

			}

		}

		Thread.sleep(5000);

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

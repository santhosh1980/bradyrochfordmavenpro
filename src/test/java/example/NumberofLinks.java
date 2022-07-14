package example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pagefactory.examplepage;

public class NumberofLinks {
	@Test
	public void NumberofLinksResults() {

		WebDriver driver = null;

		try {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

			// System.setProperty("webdriver.gecko.driver","C:\\Users\\U35035\\eclipse-workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");

			driver = new ChromeDriver();

			examplepage ep = new examplepage(driver);

			// WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://www.calculator.net/");

			/*
			 * List<WebElement> linkelements = ep.getlinkelements();
			 * 
			 * int linkelementssize = linkelements.size();
			 * 
			 * for (int i=0;i<linkelementssize;i++) {
			 * 
			 * WebElement linkelement = linkelements.get(i);
			 * 
			 * String linktextvalue = ep.getlinktext(linkelement);
			 * 
			 * System.out.println("Link:"+i+"is "+linktextvalue); }
			 */

			Thread.sleep(3000);

			ep.setcalcseartchtext("mortgage");

			List<WebElement> searchanchorelements = ep.getsearchanchorelements();

			int searchanchorelementssize = searchanchorelements.size();

			System.out.println("Link size is: " + searchanchorelementssize);

			for (int i = 0; i < searchanchorelementssize; i++) {

				WebElement searchanchorelement = searchanchorelements.get(i);

				String searchanchortextvalue = ep.getlinktext(searchanchorelement);

				System.out.println("Link:" + i + "is " + searchanchortextvalue);
			}

			Thread.sleep(3000);

			driver.quit();

		} catch (Exception ae) {
			// TODO: handle exception

			System.out.println(ae.getMessage());
			driver.quit();

		}

	}
}

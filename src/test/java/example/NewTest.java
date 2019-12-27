package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	private WebDriver driver;

	@Test
	public void f() {

		// base urls and title
		String baseurl = "http://demo.guru99.com/test/login.html";

		String expectedtitle = "Login Page";

		String actualtitle = "";

		// launch chrome and direct to base url

		driver.get(baseurl);

		actualtitle = driver.getTitle();

		// compare the title

		if (actualtitle.contentEquals(expectedtitle)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

	@BeforeTest
	public void beforeTest() {

		// to use chrome

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\U35035\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {

		// close chrome
		driver.close();
	}

}

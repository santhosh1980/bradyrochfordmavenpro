package example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;
import pagefactory.examplepage;

public class Fakenamegenerator {
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

			//Selenium 3
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Selenium 4
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://www.fakenamegenerator.com/");
			
			String datapath = "C:\\Users\\U35035\\eclipse-workspace\\Data\\empdata.xlsx";

			ExcelDataConfig excel = new ExcelDataConfig(datapath);

			Thread.sleep(3000);
			
			String[][] result= new String[10][10];
			
			for (int i=0, j=0;i<=excel.getrownum(2);i++) {
				
				//Select Gender
				
				ep.setfakegender(excel.getData(2, i, 0));
				
				//Select Name
				
				ep.setfakename(excel.getData(2, i, 1));
				
				//Select Country
				
				ep.setfakecountry(excel.getData(2, i, 2));
				
				//for (int j=21;j<26;j++) {
				
				
				//Click Generate
				
				ep.clickgenerate();

				Thread.sleep(3000);
				
				
				
								
				String nameresult = ep.getnameresult();
				
				String fulladdressresult = ep.getfulladdressresult();
				
				String extrainforesult = ep.getextrainforesult();
				
				result[i][j]=nameresult;
				
				result[i][j+1]=fulladdressresult;
				
				result[i][j+2]=extrainforesult;
				
				//excel.writeData(2, i, j, addressresult);
				
				//excel.writeData(2, i, j+1, extraresult);
				}
			
			for (int i=0,j=0,k=21;i<=excel.getrownum(2);i++) {
				
				excel.writeData(2, i, k, result[i][j]);
				
				excel.writeData(2, i, k+1, result[i][j+1]);
				
				excel.writeData(2, i, k+2, result[i][j+2]);
			}
				

			

			driver.quit();

		} catch (Exception ae) {
			// TODO: handle exception

			System.out.println(ae.getMessage());
			driver.quit();

		}

	}
}

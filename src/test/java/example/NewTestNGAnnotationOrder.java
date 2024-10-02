package example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNGAnnotationOrder {
	
	@BeforeSuite
	
	public void beforesuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	
	public void aftersuite() {
		System.out.println("After suite");
	}
	
	@BeforeTest
	
	public void beforetest() {
		System.out.println("Before test");
	}
	
	@AfterTest
	
	public void aftertest() {
		System.out.println("After test");
	}
	
	@BeforeClass
	
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	
	public void afterclass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	
	public void beforemethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	
	public void aftermethod() {
		System.out.println("After method");
	}
	
	@Test
	
	public void testcase1() {
		System.out.println("testcase1");
	}
	
	@Test
	
	public void testcase2() {
		System.out.println("testcase2");
	}
  
}

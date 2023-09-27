package TestNGtwo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotations {
	
	@BeforeSuite
	void bs(){
		System.out.println("this is before suite method");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is after suite method");
		System.out.println("this is after suite method");
	}
	
	@BeforeTest
	void m() {
		System.out.println("This is before test method");
	}
	
	@AfterTest
	void n() {
		System.out.println("This is after test method");
	}
	@BeforeClass
	void cls() {
		System.out.println("this is before class");
	}
	@AfterClass
	void cls2() {
		System.out.println("this is after class");
	}
	@BeforeMethod
	void mt() {
		System.out.println("this is before method");
	}
	@AfterMethod
	void mt2() {
		System.out.println("this is after method");
	}
	
	@Test
	void abc(){
		
		System.out.println("this is abc from class1");
		
	}
	
	@Test
	void xyz() {
		
		System.out.println("this is xyz form class2");
	}
	
	
}

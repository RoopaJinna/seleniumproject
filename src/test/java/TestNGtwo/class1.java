package TestNGtwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	
	@Test
	void abc(){
		
		System.out.println("this is abc from class1");
		
	}
	@BeforeTest
	void m() {
		System.out.println("This is before test method");
	}
	
	@BeforeSuite
	void bs(){
		System.out.println("this is before suite method");
	}
	
	@AfterSuite
	void as() {
		System.out.println("this is after suite method");
	}
}

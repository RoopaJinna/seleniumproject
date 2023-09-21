package TestNGtwo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class2 {
	
	@Test
	void xyz() {
		
		System.out.println("this is xyz form class2");
	}
	
	@AfterTest
	void n() {
		System.out.println("This is after test method");
	}

}

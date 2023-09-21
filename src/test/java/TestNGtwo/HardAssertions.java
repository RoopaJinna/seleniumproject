package TestNGtwo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test() {
		int x = 10;
		int y=20;
		
		/*
		 * if(x==y){ System.out.println("test passed"); } else {
		 * System.out.println("test failed"); }
		 */
		Assert.assertEquals(x>y,true,"x is greater than y");
	}
}

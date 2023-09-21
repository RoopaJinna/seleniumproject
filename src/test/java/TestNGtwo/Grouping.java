package TestNGtwo;

import org.testng.annotations.Test;

public class Grouping {
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail() {
		System.out.println("this is login by email");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginByfacebook() {
		System.out.println("this is login by facebook");
	}
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter() {
		System.out.println("this is login by twitter");
	}
	@Test(priority=4, groups={"sanity","regression"})
	void signupByemail() {
		System.out.println("signup by email");
	}
	@Test(priority=5, groups={"regression"})
	void signupByfacebook() {
		System.out.println("signup by facebook");
	}
	@Test(priority=6, groups={"regression"})
	void signupBytwitter() {
		System.out.println("signup by twitter");
	}
	@Test(priority=7, groups={"sanity","regression"})
	void paymentindollar() {
		System.out.println("payment in dollar");
	}
	@Test(priority=8, groups={"sanity"})
	void paymentinrupees() {
		System.out.println("payment in rupees");
	}
	@Test(priority=9, groups={"regression"})
	void paymentReturnByBank() {
		System.out.println("payment return by bank");
	}

}

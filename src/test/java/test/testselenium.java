package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(30);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("roopa.jinna11@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Roopa@123");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		driver.quit();
		}

}

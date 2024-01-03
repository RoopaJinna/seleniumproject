package TestNG;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGtwo.ExtentReportManager.class)

public class NewTest3 {
	ChromeDriver driver = new ChromeDriver();
	private String empName;
	@Test(priority = 0)
  	void login() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']/parent::a")).isDisplayed();
		System.out.println("Login Successful...");
  	}
	@Test(priority = 1, dependsOnMethods= {"login"})
	void employeeInformation() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PIM']/parent::a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Employee List']/parent::li")).click();
		Thread.sleep(2000);
		WebElement recordsFoundElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
		if (recordsFoundElement.isDisplayed()) {
            System.out.println("Validation Passed: 'Records Found' is displayed.");
        } else {
            System.out.println("Validation Failed: 'Records Found' is not displayed.");
        }
		//driver.quit();
	}

	@Test(priority = 2, dependsOnMethods= {"employeeInformation"})
	void addNewEmployee() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PIM']/parent::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add Employee']/parent::li")).click();
		Thread.sleep(2000);
		int randomNumber = new Random().nextInt(1000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Employee"+randomNumber);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("LN"+randomNumber);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		empName = driver.findElement(By.xpath("//input[@name='firstName']")).getAttribute("value");
		Thread.sleep(2000);
		System.out.println("Created Employee is....."+empName);
		System.out.println("Record created successflly");
		//driver.quit();
		
	}
	@Test(priority = 2, dependsOnMethods= {"employeeInformation"})
	void editEmployeeInformation() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PIM']/parent::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(empName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button']/i)[last()]")).click();
		Thread.sleep(2000);
		int randomNumber = new Random().nextInt(1000);
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys("MN"+randomNumber);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Record Modified successflly");
		driver.quit();
	}
}
	

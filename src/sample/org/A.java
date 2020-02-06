package sample.org;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A {
	static WebDriver d;

	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		d = new ChromeDriver();

	}

	@AfterClass
	public static void afterclass() {
		d.quit();
	}

	@AfterMethod
	public void after() {
		Date d = new Date();
		System.out.println("end time " + d);

	}

	@BeforeMethod
	public void befor() {
		Date d = new Date();
		System.out.println("start time " + d);

	}

	

	@Test(dataProvider="Sample")
	
	public void test4(String s1,String s2,String s3,String s4) {
		d.get("https://www.facebook.com/");

		WebElement q = d.findElement(By.id("email"));
		q.sendKeys(s1);
		
		WebElement q1 = d.findElement(By.id("pass"));
		q1.sendKeys(s2);
		
		WebElement q2 = d.findElement(By.name("firstname"));
		q2.sendKeys(s3);
		
		WebElement q3 = d.findElement(By.name("lastname"));
		q3.sendKeys(s4);


		WebElement q4 = d.findElement(By.id("loginbutton"));
		q4.click();
		
	}
	
	@DataProvider(name="Sample")
	public Object[][] data() {
		
		return new Object[][] {
			
			{"gobi@gmail.com","2345566123","gobi","nath"},
			{"gopi@gmail.com","88756408765","gopi","krishnan"},
			{"kavin@gmail.com","ugftfufgjhgyfg","kavin","palanisami"}
			
			
			
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}











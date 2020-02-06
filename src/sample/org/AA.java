package sample.org;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AA {
	 WebDriver d;
	@BeforeClass
	public  void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		 d=new ChromeDriver();
		

	}
	@AfterClass
	public  void afterclass() {
	d.quit();	
	}
	@AfterMethod
	public  void after() {
	Date d=new Date();
	System.out.println("end time "+d);

	}
	@BeforeMethod
	public  void befor() {
		Date d=new Date();
		System.out.println("start time "+d);

	}
	@Test()
	public  void test() {
		d.get("https://www.facebook.com/");
		WebElement q = d.findElement(By.id("email"));
		q.sendKeys("4243655768676");
		
		WebElement q1 = d.findElement(By.id("pass"));
		q1.sendKeys("Gobi28396");

		WebElement q2 = d.findElement(By.id("loginbutton"));
		q2.click();

	}

}

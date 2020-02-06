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
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CC {
	static WebDriver d;
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver", "D:\\gobi042\\Selenium042\\driver\\chromedriver.exe");
		 d=new ChromeDriver();
		

	}
	@AfterClass
	public static void afterclass() {
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
	@Parameters({"user","pass"})
	@Test()
	public  void test(@Optional("420boys")String a,@Optional("hiokjuhgt") String c) {
		d.get("https://www.facebook.com/");
		WebElement q = d.findElement(By.id("email"));
		q.sendKeys(a);
		
		WebElement q1 = d.findElement(By.id("pass"));
		q1.sendKeys(c);

		WebElement q2 = d.findElement(By.id("loginbutton"));
		q2.click();

	}

}

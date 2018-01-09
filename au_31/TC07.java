package au_31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC07 {

	WebDriver driver;
	String url;

	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		url = "http://www.flipkart.com";
	}
	
	@Test
	public void atTest() throws Exception{		
		driver.get(url);
		Thread.sleep(2000);
		//Click on Login
		driver.findElement(By.xpath("//a[@href = '/account/login?ret=/']")).click();
		Thread.sleep(2000);
		
		//Enter user id
		driver.findElement(By.xpath("//input[@class = '_2zrpKA']")).sendKeys("User1");

	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}

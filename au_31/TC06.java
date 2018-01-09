package au_31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC06 {

	WebDriver driver;
	String url;

	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
	}
	
	@Test
	public void atTest() throws Exception{		
		driver.get(url);
		Thread.sleep(2000);
		//Click Google Search
		driver.findElement(By.name("btnK")).click();
		System.out.println("Search Clicked");
		Thread.sleep(5000);
		//Click Sign In
		driver.findElement(By.id("gb_70")).click();
		System.out.println("Sign In Clicked");
		Thread.sleep(5000);
		driver.navigate().back();
		//Click Gmail Link
		driver.findElement(By.className("gb_P")).click();
		System.out.println("Gmail Link Clicked");
		
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}

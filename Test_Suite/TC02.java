package Test_Suite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {

	WebDriver driver;
	String url;
	
	@Before
	public void LauncgBrowser()
	{
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		url = "http://www.gmail.com";
		
		
	}
	
	@Test
	public void atTest() throws Exception
	{
		driver.get(url);
		
		//Enter Email id
		
		driver.findElement(By.id("identifierId")).sendKeys("riteshsinha229@gmail.com");
		Thread.sleep(2000);
		
		//Enter Next 
		//Locating Element using Xpath
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("b94e6def388");
		//Enter Next
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
	}
	

}

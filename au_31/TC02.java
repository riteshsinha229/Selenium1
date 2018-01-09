package au_31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {

	WebDriver driver;
	String url;

	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
	}
	
	@Test
	public void atTest() throws Exception{		
		driver.get(url);
		Thread.sleep(4000);
		//Click More
					
		//driver.findElement(By.xpath("//descendant::div[@class = 'mTxt'][5]")).click();
				
		//driver.findElement(By.xpath("//div[text() = 'More']")).click();
		
		
		driver.findElement(By.xpath("//li[5]/a/div")).click();
		Thread.sleep(4000);
		
		System.out.println("Clicked More");
	}
	@After
	public void closeBrowser(){
		driver.quit();
	}
	
}

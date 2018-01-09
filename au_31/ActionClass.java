package au_31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

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
		//Mouse Over : More
			
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//descendant::div[@class = 'mTxt'][5]")));
				act.build().perform();  //Note

		
		//driver.findElement(By.xpath("//descendant::div[@class = 'mTxt'][5]")
		
		//driver.findElement(By.xpath("//li[5]/a/div")).click();
		
		
		System.out.println("Clicked More");
		
		Thread.sleep(4000);
		
		//Click on MCA
		driver.findElement(By.xpath("//a[@title = 'MCA']")).click();
		Thread.sleep(8000);
		System.out.println("Clicked MCA");
	}
	@After
	public void closeBrowser(){
		driver.quit();
	}
	
}

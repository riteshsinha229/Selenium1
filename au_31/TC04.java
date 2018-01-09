package au_31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC04 {

	WebDriver driver;
	String url;

	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		url = "http://www.flipkart.com/";
	}
	
	@Test
	public void atTest() throws Exception{		
		driver.get(url);
		Thread.sleep(2000);
		
		//Mouse over : Elect
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text() = 'Electronics']")));
		act.build().perform();
		Thread.sleep(1000);
		
		System.out.println("moved to electronics");
		
		//Click on Motorola
		driver.findElement(By.xpath("//span[text() = 'Motorola']")).click();
		
		System.out.println("moved to Motorola");
		
	}
	
}

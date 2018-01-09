package Assert_Example;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {
	
	
	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.google.com";
		driver.navigate().to(url);
	}
	
	@Test
	public void atTest(){
		
		//driver.get(url);
		//Validate Page title
		
		String exp_title = "Google";
		System.out.println("Exp title is :" + exp_title);
		
		String act_title = driver.getTitle();
		System.out.println("Act title is :" + act_title);
		
		/*if(exp_title.equals(act_title)){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}*/
		
		Assert.assertEquals(exp_title, act_title);
		
		System.out.println("Hello");
		
		/*if(driver.findElement(By.linkText("Windows Phone")).isDisplayed()){
			System.out.println("Displayed");
		}else{
			System.out.println("Mpt disp");
		}*/
		
		Assert.assertTrue(driver.findElement(By.linkText("Windows Phone")).isDisplayed());
		System.out.println("Displayed");
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}


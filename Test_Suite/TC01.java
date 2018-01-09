package Test_Suite;

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
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.gmail.com";
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		
		/*if(driver.findElement(By.id("Email")).isEnabled()){
			System.out.println("Enable");
		}else{
			System.out.println("Disable");
		}*/
		
		Assert.assertTrue(driver.findElement(By.id("Email")).isEnabled());
		System.out.println("Enabled");
		
		//Enter user id
		driver.findElement(By.id("Email")).sendKeys("atyagi.mails");
		
		//Click on Next button
		driver.findElement(By.id("next")).click();
		
		Thread.sleep(2000);
		String exp_email = "atyagi.mails@gmail.com";
		String act_email = driver.findElement(By.id("email-display")).getText();
		System.out.println("Act email is : " + act_email);
		
		Assert.assertEquals(exp_email, act_email);
		System.out.println("Correct email is displayed");
		
		//Verify checkbox
		Assert.assertTrue(driver.findElement(By.name("PersistentCookie")).isSelected());
		System.out.println("Checked");
		
		
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}

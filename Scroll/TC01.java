package Scroll;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		url = "http://www.naukri.com";
		
		//driver.findElement(By.name("")).
	}
	
	@Test
	public void atTestNaukri() throws Exception{
		driver.get(url);
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0, 2000);");
		
		//((JavascriptExecutor)driver).executeScript("scroll(0, 2000);");  //Scroll down
		
		Thread.sleep(2000);
		
		//((JavascriptExecutor)driver).executeScript("scroll(600, 0);");   //Scroll up
	}
	
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
	
}

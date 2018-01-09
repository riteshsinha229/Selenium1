package au_31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC03 {

	WebDriver driver;
	String url;
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.myhcl.com";
	}
	
	@Test
	public void atTest() throws InterruptedException{
		driver.get(url);
		
		//Select Value from drop down
		//new Select(driver.findElement(By.id("ddlDomain"))).selectByIndex(4);  //Geo
		
		//new Select(driver.findElement(By.id("ddlDomain"))).selectByValue("HCLISD");
		
		new Select(driver.findElement(By.id("ddlDomain"))).selectByVisibleText("HCLTECH");
		
		Thread.sleep(5000);
	}
	
	@After
	public void atAfter(){
		driver.quit();
	}
	
}


package myPack1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {
	
	WebDriver driver;
	String url;
	
	@Test
	public void launchBrowser(){
		driver = new FirefoxDriver();
		
		//WebDriver is an interface and we are creating an object reference
		//of type WebDriver instantiating an object of FirefoxDriver class.
		
		driver.manage().window().maximize();
		//It will Maximize the window.
		
		url = "http://www.google.com";
		
		driver.navigate().to(url);
		//It will navigate us to the given url.
		//driver.get(url);
		
		//driver.quit();
		//it will close all the opened WebDriver instances.
		
		driver.close(); 
		//It will close the current WebDriver instance.
	}

}

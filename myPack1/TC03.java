package myPack1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC03 {
	
	WebDriver driver;
	String url;
	
	@Test
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
		driver.navigate().to(url);
		driver.quit();
	}
}

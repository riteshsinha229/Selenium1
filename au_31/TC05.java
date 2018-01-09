package au_31;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC05 {

	WebDriver driver;
	String url;

	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://ksrtc.in/oprs-web/";
	}
	
	@Test
	public void atTest() throws Exception{		
		driver.get(url);
		Thread.sleep(2000);
		
		//Click on "Search For Bus" Button.
		
		driver.findElement(By.name("searchBtn")).click();
		Thread.sleep(2000);
		
		//Handle JavaScript Alert
		Alert alrt = driver.switchTo().alert();
		
		System.out.println(alrt.getText());
		
		alrt.accept();  //Clicks on OK of alert.
		
		//alrt.dismiss();
		
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}

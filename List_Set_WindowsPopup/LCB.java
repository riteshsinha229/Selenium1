package List_Set_WindowsPopup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LCB {
	
	WebDriver driver;
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}

}


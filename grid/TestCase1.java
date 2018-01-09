package grid;

import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.opera.core.systems.OperaSettings.Capability;


public class TestCase1 {

	WebDriver driver;
	String nodeURL = "http://192.168.0.104:1111/wd/hub";


	@BeforeTest
	public void atBeforeTest() throws Exception{
		
		String browser = "ff";
		//String platform = "Windows";		
				
		System.out.println("hi");
		
		DesiredCapabilities capability = new DesiredCapabilities();
		if(browser.equalsIgnoreCase("ff")){
			
			capability = DesiredCapabilities.firefox();
			capability.setBrowserName("firefox");
			capability.setPlatform(Platform.WIN10);
			System.out.println("hi2");
			driver = new RemoteWebDriver(new URL(nodeURL),capability);
		}



	}
	
	@Test
	public void atTest() throws Exception{
		
		System.out.println("hi3");
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		
	}
}

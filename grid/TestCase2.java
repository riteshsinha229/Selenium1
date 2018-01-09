package grid;

import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.opera.core.systems.OperaSettings.Capability;


public class TestCase2 {

	WebDriver driver;
	String nodeURL = "http://192.168.0.104:6666/wd/hub";


	@BeforeTest
	public void atBeforeTest() throws Exception{
		
		String browser = "chrome";
		//String platform = "Windows";		
				
		System.out.println("hi------T1");
		
		DesiredCapabilities capability = new DesiredCapabilities();
		if(browser.equalsIgnoreCase("chrome")){
			
			capability = DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WIN10);
			System.out.println("hi2----T2");
			driver = new RemoteWebDriver(new URL(nodeURL),capability);
		}



	}
	
	@Test
	public void atTest() throws Exception{
		
		System.out.println("hi3---T3");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
}

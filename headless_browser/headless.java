package headless_browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class headless {

	WebDriver driver;
	String url;
	
	@Before
	public void launchBrowser(){
		
		System.out.println("1");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar file\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("window-size=1400,800");
		//options.addArguments("headless");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		System.out.println("2");
		
		url = "http://www.myhcl.com";
	}
	
	@Test
	public void atTest() throws IOException{
		driver.get(url);
			System.out.println("browser started");
		//Reading Xpath from Properties File
		Properties prop = new Properties();
		File f1 = new File(System.getProperty("user.dir")+"\\src\\or.properties");
		FileInputStream file = new FileInputStream(f1);
			prop.load(file);
		
		//Select Value from drop down
		new Select(driver.findElement(By.id(prop.getProperty("Select_Domain")))).selectByIndex(4);  //Geo 
		
		//new Select(driver.findElement(By.id("ddlDomain"))).selectByValue("HCLISD");
		
		//new Select(driver.findElement(By.id("ddlDomain"))).selectByVisibleText("HCLTECH");
	}
	
	@After
	public void atAfter(){
		//driver.quit();
	}
	
}


package iFrame_Example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	WebDriver driver;
	String url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe";
	@Before
	public void launchBrowser(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudhir_goel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver= new ChromeDriver();
		driver=new FirefoxDriver();
		
		//driver.manage().deleteAllCookies();
		//driver.navigate().refresh();
		//driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Test
	public void atTest() throws Exception{
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//html/body/iframe")));
		
		System.out.println("inside i-frame");
		
		
	}
	@After
	public void closeBrowser(){
		//driver.close();
		}
	}

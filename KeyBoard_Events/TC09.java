package KeyBoard_Events;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC09 {

	WebDriver driver;
	String url;
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		url = "http://www.google.com";
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		
		//Enter some string 
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		Thread.sleep(1000);
		
		//String a = "//html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
		String a = "//ul[@class='sbsb_b']/li[";
		
		int i = 1;
		String b = "]/div/div[2]";

		String xp = a + i + b;
		
		try{
			while(driver.findElement(By.xpath(xp)).isDisplayed()){
				xp = a + i + b;
				
				String s = driver.findElement(By.xpath(xp)).getText();
				System.out.println(s);
				
				if(s.equalsIgnoreCase("javatpoint")){
					driver.findElement(By.xpath(xp)).click();  //clicked on javatpoint.
					break;
				}
				
				i++;
			}
		}catch(Exception e){
			System.out.println("All element has been read.");
		}
	}
	
	@After
	public void atAfter(){
		//driver.quit();
	}
	
}

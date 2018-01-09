package KeyBoard_Events;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC02 {

	WebDriver driver;
	String url;
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		url = "http://www.naukri.com";
	}
	
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(4000);
		
		//Select exp : 
		//new Select(driver.findElement(By.xpath("//input[@class = 'sdTxt w85']"))).selectByIndex(4);
		
		System.out.println("Hii");
		/*
		WebElement elem = driver.findElement(By.xpath("//*[text()='Search']"));
		elem.sendKeys(Keys.TAB);
		elem.sendKeys(Keys.ENTER);*/
		
		
		driver.findElement(By.xpath("//*[@id='qsbClick']/span[1]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id='skill']/div[1]/div[2]/input")).sendKeys("Java");
		
		

		System.out.println("Hii22");
		
		
		//String js = "arguments[0].style.height='auto'; arguments[0].value='Java';";

		//((JavascriptExecutor) driver).executeScript(js, elem);

		
		//driver.findElement(By.name("qp")).sendKeys("Java");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		//Press Tab key
		driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		
		//Press Arrow Down	
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		
	}
	
	@After
	public void atAfter(){
		//driver.quit();
	}
	
}

package Test_Suite;

import junit.framework.Assert;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC03 {
	
	WebDriver driver;
	String url;
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		url = "http://www.facebook.com";
	}
	
	//@Ignore
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(4000);
		
		//driver.findElement(By.id("//*[@id='day']")).click();
		//System.out.println("Select clicked");
		
		/*Actions action = new Actions(driver);    
		WebElement optionsList = driver.findElement(By.xpath("(//select)[2]"));
		action.moveToElement(optionsList);*/

		
		//Print all elements of Select class Day
		//List<WebElement> options = driver.findElements(By.xpath("(//select)[1]/option"));
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='day']/option"));
		
		System.out.println("Print all values of Drop Down Menu");
		
		for(WebElement option : options) {
			System.out.println(option.getText());			
		}		
		
		
		//select given value
		System.out.println("Selected Value");
		
		for(WebElement option : options) {
			//System.out.println("Inside loop"+option.getText());
			
		    if (option.getText().equals("20")) {
		    	System.out.println(option.getText());
		        option.click();
		        break;
		    }
		}			
	//print all the elements of selected month	
List<WebElement> options1 = driver.findElements(By.xpath("//*[@id='month']/option"));
		
		System.out.println("Print all values of Drop Down Menu");
		
		for(WebElement option : options1) {
			System.out.println(option.getText());			
		}		
		
		
		//select given value
		System.out.println("Selected Value");
		
		for(WebElement option : options1) {
			//System.out.println("Inside loop"+option.getText());
			
		    if (option.getText().equals("Jun")) {
		    	System.out.println(option.getText());
		        option.click();
		        break;
		    }
		}	
		
		Thread.sleep(4000);
		//Male radio
		String radioType = driver.findElement(By.id("u_0_8")).getAttribute("type");
		Thread.sleep(4000);
		if(radioType.equalsIgnoreCase("radio")){
			System.out.println("Its a radio button");
			
			//Select
			//Assert.assertTrue(driver.findElement(By.id("u_0_e")).isSelected());
			
			if(driver.findElement(By.id("u_0_8")).isSelected()){
				System.out.println("Male is selected");
			}else{
				
				System.out.println("Male is not selected");
				
				//Select
				driver.findElement(By.id("u_0_8")).click();
				
				//Verify
				Assert.assertTrue(driver.findElement(By.id("u_0_8")).isSelected());
				System.out.println("Selected now");
				
			}

		}else{
			System.out.println("Other webElement");
		}	
			
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
		
	}
}

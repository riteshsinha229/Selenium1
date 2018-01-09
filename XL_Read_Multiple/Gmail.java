package XL_Read_Multiple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail extends ReadData {

	protected String GetUserName;
	protected String GetPassword;
	
	public Gmail() throws Exception {
		super();
	}
	
	WebDriver driver;
	protected List<DataFieldValues> dataSheetList = readDatafromExcel("C:\\test\\TestData.xlsx", "Data");
	
		
			@BeforeTest
			public void LaunchBrowser() {
				System.out.println("Hi");
				driver = new FirefoxDriver();
				driver.get("https://www.gmail.com");
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
			}	
	
	@Test
	public void login() throws InterruptedException{
		
		if(dataSheetList.size()==0) {
			
			System.out.println("No Data Found");
		}
		else
		{
			for(DataFieldValues gData : dataSheetList) {
				
				GetUserName = gData.getUserName();
				GetPassword = gData.getPassword();
				
				System.out.println("GetUserName:"+GetUserName);
				System.out.println("GetPassword:"+GetPassword);
				
				
				
				driver.findElement(By.id("identifierId")).clear();
				driver.findElement(By.id("identifierId")).sendKeys(GetUserName);
				
				//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
				//Enter Next 
				//Locating Element using xpath
				//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
				//Thread.sleep(2000);
				
				//Clear Password
				//driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).clear();
				//Enter Password
				//driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(GetPassword);
				
				Thread.sleep(2000);
				
				//Click Next
				//driver.findElement(By.xpath("//span[text()='Next']")).click();
				
				
				//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
				//Click Logout
				//driver.findElement(By.xpath(xpathExpression))
				
				
			}
			
		}
		
		
	}
	

}











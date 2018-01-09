package POC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String url,username,password, flag, testcase;

		Utility u = new Utility();		
		int rownum = u.getRowCount();		
		UtEnv.rowNum = rownum;
		
		username = u.xlRead("Username");
		password = u.xlRead("Password");
		testcase = u.xlRead("Test Cases");
		flag = u.xlRead("Script Run Flag ");
	
		/*	while(flag.equals("Yes")){
			
			if(testcase.equals("TC01")) {
				
			}
		
			if(testcase.equals("TC02")) {
				
			}
			if(testcase.equals("TC03")) {
				
			}
			if(testcase.equals("TC04")) {
				
			}
			if(testcase.equals("TC05")) {
				
			}
			
			
			rownum = rownum + 1;
			UtEnv.rowNum = rownum;
			flag = u.xlRead("Script Run Flag ");
			testcase = u.xlRead("Test Cases");
			
		}
		
		*/	
		
		
		
		
		
		
		
		
	
		while(flag.equals("Yes")){
		
			System.out.println("Inside while : "+UtEnv.rowNum);	

			driver = new FirefoxDriver();
			//driver.manage().window().maximize();
			
			url = "http://www.gmail.com";
			driver.get(url);
			
			
			
			driver.findElement(By.id("identifierId")).sendKeys(username);
			Thread.sleep(2000);
			
			//Enter Next 
			//Locating Element using Xpath
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(6000);
	
			
			
// Verifying Password field			
			boolean blnResult;
			blnResult = driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).isDisplayed();
			if(blnResult == true) {
				blnResult = true;
			}else {
				blnResult = false;
				u.WriteToExcel("Fail");
			}
			
			
			//Enter Password
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys(password);
			//Enter Next
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();		
			
			
			
			
		
			rownum = rownum + 1;
			UtEnv.rowNum = rownum;
			flag = u.xlRead("Script Run Flag ");	
			username = u.xlRead("Username");
			password = u.xlRead("Password");
		
			
			driver.close();
		}
		
		System.out.println("Completed");
		
		

	}

}









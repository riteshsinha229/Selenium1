package Read_Excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01{

	WebDriver driver;
	String url;
	
	String filePath = "C:\\test\\testData.xls";
	int sheetNum = 0;
	
	@BeforeMethod
	public void launchBrowser(){
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		url = "http://www.naukri.com";
	}
	@Test
	public void atTest() throws Exception{
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class = 'searchJob']")).click();
		Thread.sleep(2000);
		
		//Read From Xl
		System.out.println("Filepath:"+filePath);
		String data[][] = ReadDataFrmXL.readData(filePath, sheetNum);
		
		System.out.println("After read from excel");
		String vSkill = data[1][0];
		String vLocation = data[1][1];
		
		System.out.println("vskill:"+vSkill);
		System.out.println("vlocation:"+vLocation);
		
		
		driver.findElement(By.name("qp")).sendKeys(vSkill);
		driver.findElement(By.name("ql")).sendKeys(vLocation);
		
		
		
	}

	@AfterMethod
	public void closeBrowser(){
		System.out.println("After Method");
	}
}

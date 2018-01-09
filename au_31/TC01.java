package au_31;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {

	WebDriver driver;
	String url;
	
	@BeforeMethod
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		url = "http://www.myhcl.com";
	}
	
	@Test
	public void atTest() throws IOException{
		driver.get(url);
			
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
	
	@AfterTest
	public void atAfter(){
		//driver.quit();
	}
	
}

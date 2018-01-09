package Report;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC02 {
	
	WebDriver driver;
	String url;
	ExtentReports report; //Report Started
	ExtentTest logger;   // Logger
	public String TestCaseName;
	
	File outputFile = null;
	File outputReportFile = null;
  
	
	@Test
   
	public void launchBrowser(){
		
		//TestCaseName = Thread.currentThread().getStackTrace()[1].getClassName();
		report = ExtentFactory.getInstance();	
		
	    logger = report.startTest("TC02 - Verify Browsing");
		
		driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		url = "http://www.google.com";
		driver.navigate().to(url);
		
		logger.log(LogStatus.INFO, "Browser Started");
		driver.get("http://www.google.com");
		System.out.println("Inside Test");
		logger.log(LogStatus.INFO, "Application is up & running");
		
		report.endTest(logger);
		report.flush();
		
		driver.close();


}
	
}

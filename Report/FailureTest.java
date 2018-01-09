package Report;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FailureTest {
	
	ExtentReports report; //Report Started
	ExtentTest logger;   // Logger
	
	WebDriver driver;
	
	File outputFile = null;
	File outputReportFile = null;
	public static String FilePath;
	//public String TestCaseName;
	
	@Test
	public void captureScreenShot() throws Exception{
		
		//TestCaseName = Thread.currentThread().getStackTrace()[1].getClassName();		
		report = ExtentFactory.getInstance();	
		
	    logger = report.startTest("TC01 - Verify Title");
	    
		driver = new FirefoxDriver();		
		logger.log(LogStatus.INFO, "Browser Started");
		driver.get("http://www.gmail.com");
		System.out.println("Inside Test");
		logger.log(LogStatus.INFO, "Application is up & running");
		
		//Enter Email id
		System.out.println("Inside Test");
		
		driver.findElement(By.id("identifierId1234")).sendKeys("riteshsinha229@gmail.com");
		
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	
	public void teardown(ITestResult result) throws IOException {
		
		System.out.println("Inside teardown");
		if(ITestResult.FAILURE==result.getStatus()) {
			
			
			System.out.println("Hii");
			String screenShotPath = Utility.capture(driver, result.getName());
			logger.log(LogStatus.FAIL, FilePath);
			logger.log(LogStatus.FAIL, result.getThrowable());
            logger.log(LogStatus.FAIL, "Snapshot below: " + logger.addScreenCapture(screenShotPath));
		}
		report.endTest(logger);
		report.flush();
		driver.quit();
		
	}
	
}






	

	




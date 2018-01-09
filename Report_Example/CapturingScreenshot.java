package Report_Example;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 
public class CapturingScreenshot
{
    ExtentReports extent;
    ExtentTest test;
    WebDriver driver;
     
    @BeforeTest
    public void init()
    {
    	System.out.println("hi");
        extent = new ExtentReports("C:\\Users\\HP\\eclipse-workspace\\Selenium\\Output\\MyReport.html", true);
        System.out.println("extent");
    }
    
     
    @Test
    public void captureScreenshot()
    {
        test = extent.startTest("captureScreenshot");
        driver = new FirefoxDriver();
        driver.get("http://www.automationtesting.in");
        String title = driver.getTitle();
        Assert.assertEquals("Home - Automation Test", title);
        test.log(LogStatus.PASS, "Test Passed");
    }
     
    @AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            String screenShotPath = GetScreenShot.capture(driver, "screenShotName");
            test.log(LogStatus.FAIL, result.getThrowable());
            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
        }
        extent.endTest(test);
    }
     
         
    @AfterTest
    public void endreport()
    {
        driver.close();
        extent.flush();
        extent.close();
    }
}

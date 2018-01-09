package XL_Read_Multiple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class GmailBaseTest extends ReadData{
	
	public GmailBaseTest() throws Exception{
		super();
     }

	WebDriver driver;
	
	protected List<DataFieldValues> dataSheetList = readDatafromExcel("C:\\test\\TestData.xlsx", "Data");
	
			
			@BeforeTest
			public void LaunchBrowser() {
		
				driver = new FirefoxDriver();
				driver.get("www.gmail.com");
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
			}


	}

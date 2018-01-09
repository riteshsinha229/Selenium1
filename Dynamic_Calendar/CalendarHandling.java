package Dynamic_Calendar;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class CalendarHandling {
 
	public static void main(String[] args) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefox driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
 
		driver.get("http://www.redbus.in/");
		
		//Click on Calendar
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		Thread.sleep(4000);
		
		//Xpath upto All Tds of Calendar
					
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		
		int total_node = dates.size();
		
		//print specific date
		
		for(int i=0;i<total_node;i++)
		{
			
			String date = dates.get(i).getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				dates.get(i).click();
				
				System.out.println("date = " +date);
				
				break;
			}
			
		}
		
		
	}
 
}
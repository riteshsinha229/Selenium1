package Assert_Example;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Example {

	public static void main(String[] args) {


		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar file\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		driver = new ChromeDriver(options);	
		
		String url = "http://www.google.com";
		driver.navigate().to(url);
		System.out.println("2");
		
		
		
	}

}

package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MailSend {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(4000);
		//driver.manage().window().maximize();
		
		//Enter Email id
		
				driver.findElement(By.id("identifierId")).sendKeys("riteshsinha229@gmail.com");
				Thread.sleep(2000);
				
				//Enter Next 
				//Locating Element using Xpath
				driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
				Thread.sleep(2000);
				
				//Enter Password
				driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("b94e6def388");
				//Click Next
				driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
				Thread.sleep(4000);
				
				//Click Compose Button
				driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
				Thread.sleep(4000);
				
				//Enter recipients id
				driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("ritesh_sinha299@rediffmail.com");
				
				System.out.println("inside To");
				
				Thread.sleep(4000);
				//Click Cc
				driver.findElement(By.xpath("//span[text()='Cc']")).click();
				
				System.out.println("Cc clicked");
				
				Thread.sleep(4000);
				//Enter Cc
				driver.findElement(By.xpath("//textarea[@name='cc']")).sendKeys("riteshsinha229@gmail.com");
				
				System.out.println("Inside Cc");
				
				Thread.sleep(2000);
				//Enter subject
				driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test_Mail");
				
				System.out.println("Subject Entered");
				
				Thread.sleep(2000);
				
				//Type Message Inside Body
				
				driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("First Test Email Using Selenium Webdriver");
				
				System.out.println("Message Printed");
				
				//Click Attach 
				
				driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
				System.out.println("Attachment Clicked");
				
	
					
					//AutoIT Starts from here rt.grt= Runtime.getRuntime().exec
					
				Process proc = Runtime.getRuntime().exec("C:\\AutoIT\\fileupload.exe");
				
				
				
		}

}

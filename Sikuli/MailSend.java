package Sikuli;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.api.robot.desktop.DesktopMouse;

public class MailSend {

	public static void main(String[] args) throws InterruptedException {
		
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
				
				//Sikuli Starts
				
				ScreenRegion screen = new DesktopScreenRegion();
				Mouse mouse = new DesktopMouse();
				Keyboard kb = new DesktopKeyboard();
				
				//Locating Target Image ie. Path Image to Appear on Desktop Screen
				Target target = new ImageTarget(new File("C:/Users/HP/eclipse-workspace/Selenium/image/path.PNG"));
				//Target the Region
				ScreenRegion region = screen.find(target);
				System.out.println("Target Located");
				
				//Click On Centre of Target Image
				mouse.click(region.getCenter());
				//Write the path of Attachment for Loading
				kb.type("C:\\Users\\HP\\Desktop\\Selenium Codes\\selenium.txt");
				
				System.out.println("Path Typed by Desktop Keyboard");
				
				//Target the Systems OPEN button
				target = new ImageTarget(new File("C:/Users/HP/eclipse-workspace/Selenium/image/open.PNG"));
				//Target the Region
				region = screen.find(target);
				System.out.println("Target2 Located");
						
				//Click On Centre of Target Image
				mouse.click(region.getCenter());

				
				

	}

}

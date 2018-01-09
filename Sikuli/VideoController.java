package Sikuli;

import java.io.File;
import java.io.IOException;

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
import org.sikuli.api.visual.Canvas;
import org.sikuli.api.visual.DesktopCanvas;

public class VideoController {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=wj_n8AvesWE");
		driver.manage().window().maximize();
	
		//Sikuli Starts
		
		ScreenRegion screen = new DesktopScreenRegion();
		Mouse mouse = new DesktopMouse();
		//Keyboard kb = new DesktopKeyboard();
		
		
		Target target = new ImageTarget(new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\image\\Skip.PNG"));
		
		//Target the Region
		ScreenRegion region = screen.find(target); //waiting for Target to appear on Screen, Timeout after *0 seconds.
		
		System.out.println("Target Skip Located");
				
		//Click On Centre of Target Image
		mouse.click(region.getCenter());	
		
		Thread.sleep(7000);	
		
		//Locate 2nd Target ie. Next
		target = new ImageTarget(new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\image\\Next.PNG"));
		
		ScreenRegion r = screen.wait(target, 80000); //waiting for Target to appear on Screen, Timeout after *0 seconds.
		r=screen.find(target); //Locating the Target Image in the Desktop Screen.
		
		Canvas canvas = new DesktopCanvas();
		canvas.addBox(r);
		canvas.addLabel(r, "We Found it!!");
		
		
		canvas.display(3); //Display the Canvas  for 3 seconds.
		
		if(r==null) {
			
			System.out.println("Not Found any Image");
		}
		else {
			
			mouse.click(r.getCenter());  //use the Mouse Object to Click on the Centre of the Target Region.
			
			System.out.println("Next Clicked");
			Thread.sleep(7000);
			
			
		}
		
		driver.quit();

	}

}

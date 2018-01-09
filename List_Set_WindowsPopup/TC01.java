package List_Set_WindowsPopup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TC01 extends LCB{

	@Test
	public void atTest() throws Exception{
		
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);

		Set<String> mySet = driver.getWindowHandles();
		System.out.println("Total wins are : " + mySet.size());
		
		Iterator<String> Itr = mySet.iterator();
		List<String> myL = new ArrayList<String>();
		
		for(int i = 0; i<mySet.size(); i++){
			
			myL.add(Itr.next());
		}
		
		System.out.println(myL);
		
		driver.switchTo().window(myL.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(myL.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(myL.get(0));
		System.out.println(driver.getTitle());
		
		driver.switchTo().defaultContent();
	}
}

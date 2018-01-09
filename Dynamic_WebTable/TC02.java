package Dynamic_WebTable;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC02 extends LCB{

	@Test
	public void atTest() throws Exception{
		driver.get("http://www.indianrail.gov.in/train_Schedule.html");
		
		driver.findElement(By.id("lccp_trnname")).sendKeys("4682");
		driver.findElement(By.name("getIt")).click();
		
		Thread.sleep(2000);
		//Select all TD inside Table(find xpath of TD bcoz station name is inside table td)
		List<WebElement> xRows = driver.findElements(By.xpath("//table[@class = 'table_border_both']//td"));
		
		int total_nodes = xRows.size();
		
		for(int i=0; i<=total_nodes; i++)
		{
			String col = xRows.get(i).getText();    //select row then select node using i & then get text of that node.
			
			if(col.equals("DEOBAND" ))
			{
				System.out.println("Station Found");
				break;
			}
			
		}
		
		/* WebElement table = driver.findElement(By.xpath("//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table"));
		
		List<WebElement> xRows = table.findElements(By.tagName("tr"));
		System.out.println("Total rows are : " + xRows.size());
		
		String a= "//html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/table/tbody/tr[";
		int i = 2;
		String b = "]/td[3]";

		String xpStation = a + i + b;
		
		for(i = 2; i<=xRows.size(); i++){
			xpStation = a + i + b;
			
			String statioName = driver.findElement(By.xpath(xpStation)).getText();
			
			System.out.println(statioName);
			
			if(statioName.equalsIgnoreCase("deoband")){
				System.out.println("Station Found");
				break;
			}
		} */
	}
}

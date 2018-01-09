package Report;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentFactory{
	
	static File outputFile = null;
	static File outputReportFile = null;
	public static String FilePath;	
	static ExtentReports report; //Report Started
	static ExtentTest logger;
	
	public static ExtentReports getInstance() {

		
		//System.out.println("TestCaseName = "+TestCaseName);
		String FolderPath = System.getProperty("user.dir");
		String Report = "Report";
	    //String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());	    
	    FilePath = FolderPath + "\\Output\\" + Report;
	    outputFile = new File(FilePath);
	    outputFile.mkdir();		
	    String TestReport = "TestReport";
 
	    
		report = new ExtentReports(outputFile + "\\" + TestReport + ".html", false); 
		
		report
				.addSystemInfo("Selenium Version", "2.53");
		 	
				
		return report;
		
	}
}
package Report;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
public class Utility {
     
    public static String capture(WebDriver driver,String screenShotName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String timeStamp1 = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        
        String dest = System.getProperty("user.dir") +"\\Output"+ "\\Report\\" +screenShotName+"_" + timeStamp1 +".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
}

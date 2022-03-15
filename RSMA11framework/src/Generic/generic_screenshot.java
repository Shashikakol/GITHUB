package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class generic_screenshot 
{
public static void getPhoto(WebDriver driver) throws IOException
{
	String photo="./photos";
	Date d = new Date();
	String d1 = d.toString();
	String d2 = d1.replaceAll(":", "-");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	File dts = new File(photo+d2+".jpeg");
	
	FileUtils.copyFile(scr, dts);
	
}
}

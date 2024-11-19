package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SeleniumUtility {
	/**
	 * this method for work on implicitWait
	 * @param driver
	 * @param MaxTime
	 */
	public void implicitWait(WebDriver driver,int MaxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(MaxTime));
	}
	/**
	 * this generic method works on alert operations
	 * @param driver 
	 * @param value
	 */
	public void Alert(WebDriver driver,String value)
	
	{
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys(value);
	}
	
	public void takesScreenshot(WebDriver driver,String value)throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File f=new File(value);
		Files.copy(src, f);

	}
	public void frames(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void frames(WebDriver driver,String AttributeValue)
	{
		driver.switchTo().frame(AttributeValue);
	}
	public  void frames1(WebDriver driver, String value)
	{
		driver.switchTo().frame(value);
	}
	public void MaximizeWindow(WebDriver driver)
	{ 
		driver.manage().window().maximize();
	}
	public void NavigateToUrl( WebDriver driver, String url)
	{
		driver.get(url);
	}
	public String captureSceenshot(WebDriver driver, String ScreenshotName) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./TakeSceenshots/"+ScreenshotName+".png");
		Files.copy(src, f);
		return f.getAbsolutePath(); //used in extent reports
	}
	
	
	
	
	

}

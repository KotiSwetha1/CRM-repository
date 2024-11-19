package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import PomRepository.HomePage;
import PomRepository.LoginPage;

public class BaseClass {

	public  WebDriver driver;
	public static WebDriver sdriver; //its only for listeners class
	public	SeleniumUtility su=new SeleniumUtility();
	public PropertiesUtility pu=new PropertiesUtility();
	public ExcelUtility ex=new ExcelUtility();
	public JavaUtility jUtil=new JavaUtility();
	
	@BeforeSuite(alwaysRun = true)
	public void DBConnection()
	{
		System.out.println("db connection created");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional("chrome") String BROWSER) throws Exception
	{      
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		sdriver=driver; // this sdriver is intialized and will be used in Listeners.
		su.implicitWait(driver, 15);
		su.MaximizeWindow(driver);
		String Url=pu.getDataFromPropertiesFile("URL");
		su.NavigateToUrl(driver,Url);
		System.out.println("browser launch succesfully");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws Exception
	{
		String UN=pu.getDataFromPropertiesFile("UserName");
		String PWD=	pu.getDataFromPropertiesFile("Password");
		LoginPage l=new LoginPage(driver);
		l.LoginApp(UN, PWD);
		System.out.println("login done succesfully");
	}
	@AfterMethod(alwaysRun=true)
	public void logOutOperation() throws Exception
	{
		HomePage h=new HomePage(driver);
		h.getsignOutOperation(driver);
		System.out.println("logout done");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser()
	{
		driver.close();
		System.out.println("browser close succesfully");
	}

	@AfterSuite(alwaysRun=true)
	public void SignOutOperation()
	{
		System.out.println("close the db connection");
	}


}

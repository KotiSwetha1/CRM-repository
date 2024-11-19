package Sample;

import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import genericUtility.BaseClass;

public class TC_001  extends BaseClass{
	@Test
	public void TestCase() throws Exception
	{ 
//		SeleniumUtility su=new SeleniumUtility();
//		PropertiesUtility pu=new PropertiesUtility();
//		ExcelUtility ex=new ExcelUtility();
//		String Url=pu.getDataFromPropertiesFile("Url");
//		 WebDriver driver=new ChromeDriver();
//		 su.implicitWait(driver, 15);
//		 su.MaximizeWindow(driver);
//		 driver.get(Url);
//		 String UserName=pu.getDataFromPropertiesFile("UserName");
//		 String Pwd=pu.getDataFromPropertiesFile("PassWord");
//		 LoginPage l=new LoginPage(driver);
//		 l.LoginApp(UserName, Pwd);
		HomePage h=new HomePage(driver);
		 h.clickOnLeadsMenu();
		 LeadsPage led=new LeadsPage(driver);
		 led.clickPlusIcon();
		 CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		 String fname=ex.getDataFromExcel("Leads", 1, 1);
		 String lastName=ex.getDataFromExcel("Leads", 1, 2);
		 String Company=ex.getDataFromExcel("Leads", 1, 3);
		 cn.CreateNewLead(fname, lastName, Company);
//		 h.getsignOutOperation(driver);
//		 driver.close();
		
		
			
	}

}

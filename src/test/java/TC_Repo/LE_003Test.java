package TC_Repo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import genericUtility.BaseClass;
@Listeners(genericUtility.ListenersEmplimentation.class)
public class LE_003Test extends BaseClass{
	@Test(groups="smoke")
	public void TestCase3 ()throws Exception
	{
		HomePage h=new HomePage(driver);
		h.clickOnLeadsMenu();
		LeadsPage led=new LeadsPage(driver);
		led.clickPlusIcon();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		 String fname=ex.getDataFromExcel("Leads", 7, 1);
		 String lastName=ex.getDataFromExcel("Leads", 7, 2);
		 String Company=ex.getDataFromExcel("Leads", 7, 3);
		 cn.CreateNewLead(lastName, lastName,  Company);
		 
		
	}
}

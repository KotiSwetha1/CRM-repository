package Sample;

import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.CreateNewOrganizationPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import PomRepository.OrganizationsPage;
import genericUtility.BaseClass;

public class TC_002 extends  BaseClass
{
	@Test
	public void TestCase2 ()throws Exception
	{
		HomePage h=new HomePage(driver);
		h.clickOnLeadsMenu();
		LeadsPage led=new LeadsPage(driver);
		led.clickPlusIcon();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		 String fname=ex.getDataFromExcel("Leads", 1, 1);
		 String lastName=ex.getDataFromExcel("Leads", 1, 2);
		 String Company=ex.getDataFromExcel("Leads", 1, 3);
		 String title=ex.getDataFromExcel("Leads", 4, 4);
		 String phone=ex.getDataFromExcel("Leads", 4, 5);
		 String mobile=ex.getDataFromExcel("Leads", 4, 6);
		 String Nofemp=ex.getDataFromExcel("Leads", 4, 7);
		 String street=ex.getDataFromExcel("Leads", 4, 8);
		 String pobox=ex.getDataFromExcel("Leads", 4, 9);
		 String postal=ex.getDataFromExcel("Leads", 4, 10);
		 String city=ex.getDataFromExcel("Leads", 4, 11);
		 String country=ex.getDataFromExcel("Leads", 4, 12);
		 String state=ex.getDataFromExcel("Leads", 4, 13);
		 
		 cn.CreateNewLead(lastName, lastName, Company, title, phone, mobile, mobile, Nofemp, street, pobox, postal, city, country, state);
	}
}

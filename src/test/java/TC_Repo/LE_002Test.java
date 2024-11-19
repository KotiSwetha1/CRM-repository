package TC_Repo;

import org.testng.annotations.Test;

import PomRepository.CreateNewLeadPage;
import PomRepository.HomePage;
import PomRepository.LeadsPage;
import genericUtility.BaseClass;

public class LE_002Test extends BaseClass {
	@Test
	public void TestCase2 ()throws Exception
	{
		HomePage h=new HomePage(driver);
		h.clickOnLeadsMenu();
		LeadsPage led=new LeadsPage(driver);
		led.clickPlusIcon();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		 String fname=ex.getDataFromExcel("Leads", 4, 1);
		 String lastName=ex.getDataFromExcel("Leads", 4, 2);
		 String Company=ex.getDataFromExcel("Leads", 4, 3);
		 String title=ex.getDataFromExcel("Leads", 4, 4);
		 String phone=ex.getDataFromExcel("Leads", 4, 5);
		 String email=ex.getDataFromExcel("Leads", 4, 6);
		 String mobile=ex.getDataFromExcel("Leads", 4, 7);
		 String Nofemp=ex.getDataFromExcel("Leads", 4, 8);
		 String street=ex.getDataFromExcel("Leads", 4, 9);
		 String pobox=ex.getDataFromExcel("Leads", 4, 10);
		 String postal=ex.getDataFromExcel("Leads", 4, 11);
		 String city=ex.getDataFromExcel("Leads", 4, 12);
		 String country=ex.getDataFromExcel("Leads", 4, 13);
		 String state=ex.getDataFromExcel("Leads", 4, 14);
		 
		 cn.CreateNewLead(fname, lastName, Company, title, phone, email, mobile, Nofemp, street, pobox, postal, city, country, state);
	}


}

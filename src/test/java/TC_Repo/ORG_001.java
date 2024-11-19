package TC_Repo;

import org.testng.annotations.Test;

import PomRepository.CreateNewOrganizationPage;
import PomRepository.HomePage;
import PomRepository.OrganizationsPage;
import genericUtility.BaseClass;

public class ORG_001 extends BaseClass {
	@Test(groups="smoke")
	public void org_001() throws Exception
	{

		HomePage h=new HomePage(driver);
		h.clickOnOrganizationsMenu();
		OrganizationsPage og=new OrganizationsPage(driver);
		og.ClickorgPlusIcon();
		int randomNumber=jUtil.getRandomNumber(1000);
		CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
		String orgname=ex.getDataFromExcel("Organizations", 1,1);
		String website=ex.getDataFromExcel("Organizations", 1,2);
		String empname=ex.getDataFromExcel("Organizations", 1,3);
		co.CreateNewOeganization(orgname+randomNumber, website, empname);
		System.out.println("testcase org1 is executed");
	}
}


















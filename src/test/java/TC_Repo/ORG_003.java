package TC_Repo;

import org.testng.annotations.Test;

import PomRepository.CreateNewOrganizationPage;
import PomRepository.HomePage;
import PomRepository.OrganizationsPage;
import genericUtility.BaseClass;

public class ORG_003 extends BaseClass {
	@Test
	public void org_003() throws Exception
	{
		HomePage h=new HomePage(driver);
		h.clickOnOrganizationsMenu();
		OrganizationsPage og=new OrganizationsPage(driver);
		og.ClickorgPlusIcon();
		int randomNumber=jUtil.getRandomNumber(1000);
		CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
		String orgname=ex.getDataFromExcel("Organizations", 7,1);
		String website=ex.getDataFromExcel("Organizations", 7,2);
		String billingAddress=ex.getDataFromExcel("Organizations", 7,3);
		String billingCity=ex.getDataFromExcel("Organizations", 7, 4);
		String billingState=ex.getDataFromExcel("Organizations", 7, 5);
		co.CreateNewOeganization(orgname+randomNumber, website, billingAddress, billingCity, billingState);

	}
	

}

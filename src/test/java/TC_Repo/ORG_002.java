package TC_Repo;

import org.testng.annotations.Test;

import PomRepository.CreateNewOrganizationPage;
import PomRepository.HomePage;
import PomRepository.OrganizationsPage;
import genericUtility.BaseClass;

public class ORG_002 extends BaseClass 
{ @Test(groups= {"smoke" ,"regration"})
	public void org_002() throws Exception
	{
	HomePage h=new HomePage(driver);
	h.clickOnOrganizationsMenu();
	OrganizationsPage og=new OrganizationsPage(driver);
	og.ClickorgPlusIcon();
	int randomNumber=jUtil.getRandomNumber(1000);
	CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
	String orgname=ex.getDataFromExcel("Organizations", 4,1);
	String website=ex.getDataFromExcel("Organizations", 4,2);
	String empname=ex.getDataFromExcel("Organizations", 4,3);
	String phn=ex.getDataFromExcel("Organizations", 4, 4);
	String otherphn=ex.getDataFromExcel("Organizations", 4, 5);
	String email=ex.getDataFromExcel("Organizations", 4, 6);
	co.CreateNewOeganization(orgname+randomNumber, website, empname,phn, otherphn, email);
	System.out.println("testcase org2 is executed");

	}

}

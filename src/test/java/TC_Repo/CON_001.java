package TC_Repo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomRepository.ContactsPage;
import PomRepository.CreatingNewContactPage;
import PomRepository.HomePage;
import genericUtility.BaseClass;
@Listeners(genericUtility.ListenersEmplimentation.class)
public class CON_001 extends BaseClass {
	@Test
	public void con_001() throws Exception
	{
		HomePage h=new HomePage(driver);
		h.clickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.ClickContactsPlusIcon();
		CreatingNewContactPage cnp=new CreatingNewContactPage(driver);
		String fname=ex.getDataFromExcel("Contacts", 1, 1);
		String lname=ex.getDataFromExcel("Contacts", 1, 2);
		String title=ex.getDataFromExcel("Contacts", 1, 3);
		cnp.CreateNewContact(fname, lname, title);
	}
	@Test
	public void sample()
	{
		System.out.println("sample method executed");
	}

}

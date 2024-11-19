package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@href='index.php?module=Leads&action=index']")
	private WebElement LeadsButton;
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']")
	private WebElement Organizations;
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement Contacts;
	@FindBy(xpath="(//img[@border='0'])[3]")
	private WebElement icon;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutoperation;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public WebElement getLeadsButton()
	{
		return LeadsButton;
		
	}
	public WebElement getOrganizations()
	{
		return Organizations;
		
	}
	public WebElement getContacts()
	{
		return Contacts;
		
	}
	public WebElement geticon()
	{
		return icon;
	}
	public WebElement getsignOutoperation() {
		return signOutoperation;
		
	}
	public void getsignOutOperation(WebDriver driver) throws Exception
	{
		Actions a=new Actions(driver);
		a.moveToElement(geticon()).perform();
		Thread.sleep(2000);
		 getsignOutoperation().click();
			
		
	}
	public void clickOnLeadsMenu()
	{
		getLeadsButton().click();
		
	}
	public void clickOnOrganizationsMenu()
	{
		getOrganizations().click();
	}
	public void clickOnContactsMenu()
	{
		getContacts().click();
		}

}
package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OeganizationName;
	@FindBy(xpath="//input[@name='website']")
	private WebElement WebSite;
	@FindBy(xpath="//input[@id='employees']")
	private WebElement Employees;
	@FindBy(xpath="//input[@id='phone']")
	private WebElement Phone;
	@FindBy(xpath="//input[@id='otherphone']")
	private WebElement OtherPhoneNumber;
	@FindBy(xpath="//input[@id='email1']")
	private WebElement Email1;
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAdress;
	@FindBy(xpath="//input[@id='bill_city']")
	private WebElement BillingCity;
	@FindBy(xpath="//input[@id='bill_state']")
	private WebElement BillingState;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;
	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public WebElement getOeganizationName() {
		return OeganizationName;
	}
	public WebElement getWebSite() {
		return WebSite;
	}
	public WebElement getEmployees() {
		return Employees;
	}
	public WebElement getPhone() {
		return Phone;
	}
	public WebElement getOtherPhoneNumber() {
		return OtherPhoneNumber;
	}
	public WebElement getEmail1() {
		return Email1;
	}
	public WebElement getBillingAdress() {
		return BillingAdress;
	}
	public WebElement getBillingCity() {
		return BillingCity;
	}
	public WebElement getBillingState() {
		return BillingState;
	}
	public WebElement getSaveButton() {
		return SaveButton;
		
	}
	// this business library create a new Organizationpage
	public void CreateNewOeganization(String OrgName,String WebSite,String Employee)
	{
		getOeganizationName().sendKeys(OrgName);
		getWebSite().sendKeys(WebSite);
		getEmployees().sendKeys( Employee);
		getSaveButton().click();
		
		
	}
	public void CreateNewOeganization(String OrgName,String WebSite,String Employee,String Phone,String Otherphn,String Email)
	{
		getOeganizationName().sendKeys(OrgName);
		getWebSite().sendKeys(WebSite);
		getEmployees().sendKeys( Employee);
		getPhone().sendKeys(Phone);
		getOtherPhoneNumber().sendKeys(Otherphn);
		getEmail1().sendKeys(Email);
		getSaveButton().click();
		
		
	}
	public void CreateNewOeganization(String OrgName,String WebSite,String BillingAdress,String BillingCity,String BillingState)
	{
		getOeganizationName().sendKeys(OrgName);
		getWebSite().sendKeys(WebSite);
		getBillingAdress().sendKeys(BillingAdress);
		getBillingCity().sendKeys(BillingCity);
		getBillingState().sendKeys(BillingState);
		getSaveButton().click();
		
		
		
	}
	public void CreateNewOeganization(String OrgName,String WebSite,String Employee,String Phone,String Otherphn,String Email,String BillingAdress,String BillingCity,String BillingState)
	{
		getOeganizationName().sendKeys(OrgName);
		getWebSite().sendKeys(WebSite);
		getEmployees().sendKeys( Employee);
		getPhone().sendKeys(Phone);
		getOtherPhoneNumber().sendKeys(Otherphn);
		getEmail1().sendKeys(Email);
		getBillingAdress().sendKeys( BillingAdress);
		getBillingCity().sendKeys(BillingCity);
		getBillingState().sendKeys(BillingState);
		getSaveButton().click();
		
		
		
	}
	

	
	

}

package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	@FindBy(xpath="//input[@name='company']")
	private WebElement Company;
	@FindBy(xpath="//input[@name='designation']")
	private WebElement Title;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phone;
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement Mobile;
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement NoOfEmployees;
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement Street;
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement PoBox;
	@FindBy(xpath="//input[@name='code']")
	private WebElement PostalCode;
	@FindBy(xpath="//input[@name='city']")
	private WebElement City;
	@FindBy(xpath="//input[@name='country']")
	private WebElement Country;
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	@FindBy(xpath="//input[@accesskey='S']")
	private WebElement SaveButton;
	public CreateNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getCompany() {
		return Company;
	}
	public WebElement getTitle() {
		return Title;
	}
	public WebElement getPhone() {
		return Phone;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getNoOfEmployees() {
		return NoOfEmployees;
	}
	public WebElement getStreet() {
		return Street;
	}
	public WebElement getPoBox() {
		return PoBox;
	}
	public WebElement getPostalCode() {
		return PostalCode;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}
	/**
	 * this library to create a new lead page based on firstname,lastname,company
	 * @param firstname
	 * @param Lastname
	 * @param Company
	 */
	public void CreateNewLead(String firstname,String Lastname,String Company)
	{
		getFirstName().sendKeys(firstname);
		getLastName().sendKeys(Lastname);
		getCompany().sendKeys(Company);
		getSaveButton().click();
	}
	
	public void CreateNewLead(String firstname,String Lastname,String Company,String Title,String Phone,String Mobile,String Email,String NoOfEmployees,
			String Street,String PoBox,String PostalCode,String City,String Country,String State)
	{
		getFirstName().sendKeys(firstname);
		getLastName().sendKeys(Lastname);
		getCompany().sendKeys(Company);
		getTitle().sendKeys(Title);
		getPhone().sendKeys(Phone);
		getMobile().sendKeys(Mobile);
		getEmail().sendKeys(Email);
		getNoOfEmployees().sendKeys(NoOfEmployees);
		getStreet().sendKeys(Street);
		getPoBox().sendKeys(PoBox);
		getPostalCode().sendKeys(PostalCode);
		getCity().sendKeys(City);
		getCountry().sendKeys(Country);
		getState().sendKeys(State);
		getSaveButton().click();
	}
	public void CreateNewLead(String firstname,String Lastname,String Company,String Phone,String Title,String Mobile,String Email,String NoOfEmployees)
	{
		getFirstName().sendKeys(firstname);
		getLastName().sendKeys(Lastname);
		getCompany().sendKeys(Company);
		getTitle().sendKeys(Title);
		getPhone().sendKeys(Phone);
		getMobile().sendKeys(Mobile);
		getEmail().sendKeys(Email);
		getNoOfEmployees().sendKeys(NoOfEmployees);
	}
	public void CreateNewLead(String firstname,String Lastname,String Company,String Street,String PoBox,String PostalCode,String City,String Country,String State)
	{
		getFirstName().sendKeys(firstname);
		getLastName().sendKeys(Lastname);
		getCompany().sendKeys(Company);
		getStreet().sendKeys(Street);
		getPoBox().sendKeys(PoBox);
		getPostalCode().sendKeys(PostalCode);
		getCity().sendKeys(City);
		getCountry().sendKeys(Country);
		getState().sendKeys(State);
		getSaveButton().click();
	}
	

}

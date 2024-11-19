package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement ContactsPlusIcon;
	
	public ContactsPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public WebElement getContactsPlusIcon() {
		return ContactsPlusIcon;
	}
	public void ClickContactsPlusIcon()
	{
		getContactsPlusIcon().click();
	}
	

}

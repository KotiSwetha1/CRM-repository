package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement PlusIcon;
	public  OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}	
	
	
	public WebElement getPlusIcon() {
		return PlusIcon;
	}
	public void ClickorgPlusIcon()
	{
		getPlusIcon().click();
	}
	
	
	

}

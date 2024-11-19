package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement PlusIcon;
	public LeadsPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public WebElement getPlusIcon()
	{
		return PlusIcon;
		
	}
	/**
	 * this is a business library to click on new create lead icon in leads page
	 */
	public void clickPlusIcon()
	{
		getPlusIcon().click();
	}

}

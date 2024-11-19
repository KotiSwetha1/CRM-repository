package PomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/**
	 * this is for find the path of the element
	 */
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userNameTextField;

	@FindBy(xpath="//input[@name='user_password']")
	private WebElement PasswordTextField;

	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement LoginButtonTextField;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	/**
	 * public constructor
	 * this  get methods generated for call that path
	 * @return
	 */
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButtonTextField() {
		return LoginButtonTextField;
	}

	/**
	 * Business library
	 * this loginApp method generated for userInput flexibility
	 * @param UserName
	 * @param Password
	 */
	public void LoginApp(String UserName,String Password)
	{
		getUserNameTextField().sendKeys(UserName);
		getPasswordTextField().sendKeys(Password);
		getLoginButtonTextField().click();
		
	}


}

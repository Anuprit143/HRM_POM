package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import constants.AppConstants;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "inputUsername")
	private WebElement username;
	
	@FindBy(how = How.ID, using = "inputPassword")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement btn_login;
	
	public void enterUsername()
	{
		username.sendKeys(AppConstants.email);
	}
	
	public void enterPassword()
	{
		password.sendKeys(AppConstants.pwd);
	}
	
	public void clickOnLoginBtn()
	{
		btn_login.submit();
	}
}

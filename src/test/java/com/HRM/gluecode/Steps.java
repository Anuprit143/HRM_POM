package com.HRM.gluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.AppConstants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageobjects.LoginPage;

 
public class Steps {
	WebDriver driver;
	LoginPage login;
	
	
	@Given("^I am on Login Page$")
	public void I_am_on_Login_Page(){
		System.setProperty("webdriver.chrome.driver",AppConstants.chromeDriverLocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(AppConstants.loginUrl);
	}
 
	@When("^I fill in \"Email\" with\"([^\"]*)\"$")
	public void i_Enter_Username()  {
		//login = new LoginPage(driver);
		login.enterUsername();
	}
 
	@And("^I fill in \"Password\" with \"([^\\\"]*)\\\"$")
	public void i_Enter_Password()
	{
		login.enterPassword();
	}
	
	@And("^ I click on \"Login\" button\"$")
	public void click_On_Login_Button()
	{
		login.clickOnLoginBtn();
	}
	
	@Then("^ I should be on \"Dashboard\" page \"$")
	public void navigate_To_Dashboard()
	{
		System.out.println("I am on Dashboard Page");
	}
	
}
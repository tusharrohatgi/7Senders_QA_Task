package com.komoot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Tushar
 * 
 *         This Page Class is created for Login Webpage in the application
 *         Page Factory is implemented 
 *         The weblements to be used in the selenium tests are located via xpath and stored in this class
 *		   The methods in the class are used to perform actions over the identified webelements
 */


public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'Accept All')]")
	private WebElement Proxy_Accept;

	@FindBy(xpath = "//body/div[@id='pageMountNode']/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]")
	private WebElement Login_Signup_button;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_input;

	@FindBy(xpath = "//div[contains(text(),'Continue with Email')]")
	private WebElement continue_with_email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//body/div[@id='pageMountNode']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/button[1]")
	private WebElement Login_button;

	@FindBy(xpath = "//div[contains(text(),'tushar0407')]")
	private WebElement Login_user;

	public void continue_with_email_click() {
		continue_with_email.click();
	}

	public void enter_password(String pass) {
		password.sendKeys(pass);
	}

	public void Login_button_click() {
		Login_button.click();
	}

	public String get_login_user() {
		String details = Login_user.getText();
		return details;
	}

	public void proxy_click() {
		Proxy_Accept.click();

	}

	public void input_email(String email) {
		email_input.sendKeys(email);

	}

	public void Login_Signup_button_click() {
		Login_Signup_button.click();

	}

}

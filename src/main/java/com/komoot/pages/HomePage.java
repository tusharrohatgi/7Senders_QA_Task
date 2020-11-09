package com.komoot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Tushar
 * 
 *         This Page Class is created for Home page in the application
 *         Page Factory is implemented 
 *         The weblements to be used in the selenium tests are located via xpath and stored in this class
 *		   The methods in the class are used to perform actions over the identified webelements
 */


public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='pageMountNode']/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement Discover;

	@FindBy(xpath = "//body/div[@id='pageMountNode']/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement Route_Planner;

	@FindBy(xpath = "//body/div[@id='pageMountNode']/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
	private WebElement Features;

	@FindBy(xpath = "//span[contains(text(),'Shop')]")
	private WebElement Shop;

	public void Discover_Tours() {
		Discover.click();
	}

	public void Route_Planner() {
		Route_Planner.click();
	}

	public void Features() {
		Features.click();
	}

	public void Shop_click() {
		Shop.click();
	}
}

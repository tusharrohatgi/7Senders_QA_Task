/**
 * 
 */
package com.komoot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Tushar
 * 
 *         This Page Class is created for Discover Webpage in the application
 *         Page Factory is implemented 
 *         The weblements to be used in the selenium tests are located via xpath and stored in this class
 *		   The methods in the class are used to perform actions over the identified webelements
 */
public class DiscoverPage {

	public WebDriver driver;

	public DiscoverPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Hiking trails & Routes')]")
	private WebElement hiking_link;

	@FindBy(xpath = "//div[@id='pageMountNode']/div[1]/div[2]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement Search_Button;

	public void Hiking_Tours_Click() {
		hiking_link.click();
	}
	
	public void SearchButton_Click(){
		Search_Button.click();
	}
}


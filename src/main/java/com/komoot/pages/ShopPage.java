package com.komoot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Tushar
 * 
 *         This Page Class is created for Shop Webpage in the application
 *         Page Factory is implemented 
 *         The weblements to be used in the selenium tests are located via xpath and stored in this class
 *		   The methods in the class are used to perform actions over the identified webelements
 */


public class ShopPage {
	
	public WebDriver driver;
	
	public ShopPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//div[contains(text(),'Explore Maps')]")
	private WebElement Explore_Maps;
	
	@FindBy(xpath="//div[contains(text(),'Komoot Premium')]") 
	private WebElement Komoot_Premium;

	
	public void ExploreMaps_Click()
	{
		Explore_Maps.click();
	}
	
	public void KomootPremium_Click()
	{
	Komoot_Premium.click();
	}
}

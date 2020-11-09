package com.komoot.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Tushar
 * 
 *         This Page Class is created for Route Planner Webpage in the application
 *         Page Factory is implemented 
 *         The weblements to be used in the selenium tests are located via xpath and stored in this class
 *		   The methods in the class are used to perform actions over the identified webelements
 */


public class RoutePlannerPage {

	public WebDriver driver;
	
	public RoutePlannerPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@id='pageMountNode']/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]") 
	WebElement Search_box;
	
	@FindBy(xpath="//*[contains(text(),'Set as Destination')]") 
	WebElement Set_Destination;
	
	public void Search_box_click ()
	{
		Search_box.click();
	}
	public void Send_Search_Data(String location)
	{
		Search_box.sendKeys(location);
		Search_box.sendKeys(Keys.ENTER);
	}
	
	public void Destination_click()
	{
		Set_Destination.click();
		
	}
	
}

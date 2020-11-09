package com.komoot.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.komoot.pages.DiscoverPage;
import com.komoot.pages.HomePage;
import com.komoot.pages.LoginPage;
import com.komoot.pages.RoutePlannerPage;
import com.komoot.pages.ShopPage;
/**
 * @author Tushar
 * 
 *         This Class includes a total of 5 test cases for the web application URL: https://www.komoot.com/
 *         The test cases are written using TestNG testing framework
 *         Each test case is independent of each other and can be run individually
 *		   
 */
public class KomootAppTestCases {

	public WebDriver driver;

	@BeforeTest
	public void Browsersetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.komoot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void LoginPageTest() throws IOException {

		LoginPage login_obj = new LoginPage(driver);
		login_obj.proxy_click();
		login_obj.Login_Signup_button_click();
		login_obj.input_email("tushar.graduate@gmail.com");
		login_obj.continue_with_email_click();
		login_obj.enter_password("tushar");
		login_obj.Login_button_click();

		System.out.println("Login is successful with username as " + login_obj.get_login_user());
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile1,
				new File("C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Screenshots\\Login.png"));
	}

	@Test(priority = 2)
	public void HomePageTest() throws InterruptedException, IOException {
		LoginPage obj2 = new LoginPage(driver);
		obj2.proxy_click();
		HomePage obj_home = new HomePage(driver);
		obj_home.Discover_Tours();
		Thread.sleep(5000);
		File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile2,
				new File("C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Screenshots\\Discover.png"));
		obj_home.Route_Planner();
		Thread.sleep(5000);
		File screenshotFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile3,
				new File("C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Screenshots\\Routes.png"));
		obj_home.Features();
		System.out.println("TestCase 2 executed");
		File screenshotFile4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile4,
				new File("C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Screenshots\\Features.png"));
	}

	@Test(priority = 3)
	public void DiscoveryTours_Test() throws InterruptedException, IOException {
		LoginPage obj3 = new LoginPage(driver);
		obj3.proxy_click();
		HomePage obj_home2 = new HomePage(driver);
		obj_home2.Discover_Tours();
		DiscoverPage obj_disc = new DiscoverPage(driver);
		obj_disc.Hiking_Tours_Click();
		obj_disc.SearchButton_Click();
		System.out.println("TestCase 3 executed");
		File screenshotFile5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile5,
				new File("C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Screenshots\\Discovery_filter_page.png"));
	}

	@Test(priority = 4)
	public void RoutePlanner_Test() throws IOException {

		LoginPage obj4 = new LoginPage(driver);
		obj4.proxy_click();
		HomePage obj_home3 = new HomePage(driver);
		obj_home3.Route_Planner();
		RoutePlannerPage obj_route = new RoutePlannerPage(driver);
		obj_route.Search_box_click();
		obj_route.Send_Search_Data("Alt-Moabit, Berlin");
		obj_route.Destination_click();
		System.out.println("TestCase 4 executed");
		File screenshotFile6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile6,
				new File("C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Screenshots\\Route_SetDestination.png"));
	}

	@Test
	public void ShopTest() throws InterruptedException, IOException {

		LoginPage obj5 = new LoginPage(driver);
		obj5.proxy_click();
		HomePage obj_home4 = new HomePage(driver);
		obj_home4.Shop_click();
		ShopPage obj_shop = new ShopPage(driver);
		obj_shop.ExploreMaps_Click();
		Thread.sleep(3000); // Additional sleep added to observe the movement of cursor from Explore Maps to Kommoot Premium
		obj_shop.KomootPremium_Click();
		System.out.println("TestCase 5 executed");
		File screenshotFile7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile7,
				new File("C:\\Users\\Kriti\\Maven_workspace\\Assignment\\Screenshots\\Shop.png"));

	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}
}

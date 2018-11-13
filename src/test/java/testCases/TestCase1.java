package testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.HomePage;
import pageObjects.MobilePage;
import utilities.browserInvocation;

public class TestCase1  extends browserInvocation{
	 
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		//Step 1: Goto site "http://live.guru99.com/"
		driver.get(prop.getProperty("baseurl"));
	}
	@Test
	public void testTestCase1() throws InterruptedException {
		//Step 2: Verify the title page
		HomePage hp = new HomePage(driver);
		String actualHomeTitle = hp.getHomePageTitle().getText();
		//System.out.println(prop.getProperty("expectedHomeTitle"));
		Assert.assertEquals(actualHomeTitle, prop.getProperty("expectedHomeTitle"));
		
		//Step 3: click on 'MOBILE' menu
		hp.getMobile().click();
		//Step 4:Verify the title of page
		MobilePage mp = new MobilePage(driver);
		String actualMobileTitle = mp.getMobilePageTitle().getText();
		Assert.assertEquals(actualMobileTitle, prop.getProperty("expectedMobileTitle"));
		//Step 5: Sort by name 
		Select s = new Select(mp.getMobileSortingByName());
		s.selectByVisibleText("Name");
		Thread.sleep(2000L);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
}

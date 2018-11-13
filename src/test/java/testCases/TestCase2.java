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
import pageObjects.SonyXperia;
import utilities.browserInvocation;

public class TestCase2  extends browserInvocation{
	 
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		//Step 1: Goto site "http://live.guru99.com/"
		driver.get(prop.getProperty("baseurl"));
	}
	@Test
	public void testTestCase2() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		//Step 2: click on 'MOBILE' menu
		hp.getMobile().click();
		//Step 3: From the list of mobile, read the cost of Sony Xperia
		MobilePage mp = new MobilePage(driver);
		String price1 =mp.getSonyXperiaCost().getText();
		//Step 4: Click on Sony Xperia mobile
		mp.getSonyXperiaMobile().click();
		//Step 5:
		SonyXperia sx = new SonyXperia(driver);
		String price2 = sx.getSonyXperiaCost().getText();
		//Step 6: Compare value in step 3 & step 5
		Assert.assertEquals(price1, price2);
		Thread.sleep(2000L);
				
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}

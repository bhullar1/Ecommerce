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

import pageObjects.Cart;
import pageObjects.HomePage;
import pageObjects.MobilePage;
import pageObjects.SonyXperia;
import utilities.browserInvocation;

public class TestCase3  extends browserInvocation{
	 
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		//Step 1: Goto site "http://live.guru99.com/"
		driver.get(prop.getProperty("baseurl"));
		
	}
	@Test
	public void testTestCase3() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		//Step 2: click on 'MOBILE' menu
		hp.getMobile().click();
		//Step 3: Click on "ADD TO CART" for Sony Xperia
		MobilePage mp = new MobilePage(driver);
		mp.getSonyXperiaAddToCart().click();;
		//Step 4: Change "QTY" value to 1000 and click on "UPDATE" button
		Cart c = new Cart(driver);
		c.getQty().clear();
		c.getQty().sendKeys("1000");
		c.clickUpdate().click();
		
		//Step 5: Verify the error message
		Assert.assertEquals(c.getActualCartMessage().getText(),prop.getProperty("expectedCartMessage"));
		
		//Step 6:Click on "EMPTY CART" link in he footer
		c.clickEmptyCart().click();
		//Step 7: Verify that "SHOPPING CART IS EMPTY"
		Assert.assertEquals(prop.getProperty("expectedEmptyCart"),c.getEmptyCartMessage());
		Thread.sleep(1000L);
				
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}

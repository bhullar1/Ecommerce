package testCases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

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
import pageObjects.Popup;
import pageObjects.SonyXperia;
import utilities.browserInvocation;

public class TestCase4  extends browserInvocation{
	 
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		//Step 1: Goto site "http://live.guru99.com/"
		driver.get(prop.getProperty("baseurl"));
		
	}
	@Test
	public void testTestCase4() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		//Step 2: click on 'MOBILE' menu
		hp.getMobile().click();
		//Step 3: Click on "ADD TO COMPARE" two mobiles
		MobilePage mp = new MobilePage(driver);
		mp.clickSonyAddToCompare().click();
		mp.clickIphoneAddToCompare().click();
		//Step 4: Click on "COMPARE" button
		mp.clickOnCompare().click();;
		//switch to window
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parent = it.next();
		String child = it.next();
		        
	    driver.switchTo().window(child);
	    Thread.sleep(1000L);
	  //Step 5: Verify pop up window with header "COMPARE PRODUCTS"and check that compare products reflect in list
        Popup p = new Popup(driver);
        String actual = p.getPopupHeader().getText();
        //String expected = "COMPARE PRODUCTS";
        
        Thread.sleep(1000L);
	    Assert.assertEquals(actual,prop.getProperty("expectedPopupHeader"));
	    
	    if(!(p.getSonyXperiaCount().size()>0 && p.getIphoneCount().size()>0)) {
	    	Assert.assertTrue(false);
	    
	    }
	    p.clickOnCloseWindow().click();
	    driver.switchTo().window(parent);    	
		Thread.sleep(1000L);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}

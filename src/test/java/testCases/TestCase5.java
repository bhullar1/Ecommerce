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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import pageObjects.Cart;
import pageObjects.CreateAccount;
import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.MobilePage;
import pageObjects.MyWishlistPage;
import pageObjects.MyaccountPage;
import pageObjects.Popup;
import pageObjects.SonyXperia;
import pageObjects.TvPage;
import utilities.browserInvocation;

public class TestCase5  extends browserInvocation{
	 
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		//Step 1: Goto site "http://live.guru99.com/"
		driver.get(prop.getProperty("baseurl"));
		
	}
	@Test(dataProvider = "getData")
	public void testTestCase5(String firstName,String middleName,String lastName,String email,String password,String
			confirmPassword, String emailRx, String message) throws InterruptedException {
		HomePage hp = new HomePage(driver);
		
		//Step 2: click on "My Account" link
		hp.clickOnMyAccount().click();
		Thread.sleep(1000);
		Login l =new Login(driver);
		l.clickOnCreateAccount().click();
		
		//Step 3: fill new user information 
		CreateAccount ca = new CreateAccount(driver);
		ca.setFirstName().clear();
		ca.setFirstName().sendKeys(firstName);
		ca.setMiddleName().clear();
		ca.setMiddleName().sendKeys(middleName);
		ca.setLastName().clear();
		ca.setLastName().sendKeys(lastName);
		ca.setPassword().clear();
		ca.setEmail().clear();
		ca.setEmail().sendKeys(email);
		ca.setPassword().sendKeys(password);
		ca.setConfirmPasswor().clear();
		ca.setConfirmPasswor().sendKeys(confirmPassword);
		Thread.sleep(1000L);
		//Step 4: click on "REGISTER" button
		ca.clickOnRegister().click();
		Thread.sleep(1000);
		//Step 5: Verify registration is done
		MyaccountPage ma = new MyaccountPage(driver);
	    String msg = ma.getWelcomeMessage().getText();
	    System.out.println(msg);
	    if(!(msg.contains("WELCOME"))) {
	    	Assert.assertTrue(false);
	    }
	    //Step 6: goto TV menu
	    
	    ma.clickOnTV().click();;
	    Thread.sleep(1000);
	    
	    //Step 7: Add product in wishlist
	    
	    TvPage tp = new TvPage(driver);
	    tp.getAddToWishlist().click();
	    //Step 8: Click on share wishlist
	    MyWishlistPage mw = new MyWishlistPage(driver);
	    mw.getShareWishlist().click();
	    //Step 9:enter email and message and share it
	    ma.setReceiverEmail().sendKeys(emailRx);
	    ma.setMessage().sendKeys(message);
	    ma.clickOnShareWishlist().click();
	    Thread.sleep(1000);
	 	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@DataProvider
	public Object[][] getData() {
		int i = (int) (Math.random()*1000);
		Object[][] data = new Object[1][8];
		data[0][0] = "Gurjeet";
		data[0][1] = "Singh";
		data[0][2] = "Bhullar";
		data[0][3] = "gurjeet@out"+i+".com";
		data[0][4] = "qwerty";
		data[0][5] = "qwerty";
		data[0][6]= "asdfg@out.com";
		data[0][7]= "my products";
		return data;
	}
	
	
	
}

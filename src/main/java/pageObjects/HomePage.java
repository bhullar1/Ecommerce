package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By homePageTitle = By.xpath("//div[@class='page-title']/h2");
	By mobile = By.linkText("MOBILE");
	By myAccount = By.xpath("(//a[@title='My Account'])[2]");
	
	public WebElement getHomePageTitle() {
		return driver.findElement(homePageTitle);
	}
	public WebElement getMobile() {
		return driver.findElement(mobile);
	}
	public WebElement clickOnMyAccount() {
		return driver.findElement(myAccount);
	}
	
	
	
	

}

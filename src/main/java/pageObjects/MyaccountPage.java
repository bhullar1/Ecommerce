package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyaccountPage {
	public WebDriver driver;

	public MyaccountPage(WebDriver driver) {
		this.driver = driver;
	}
	By welcomeMessage = By.xpath("//p[@class='welcome-msg']");
	By tv = By.linkText("TV");
	By email = By.id("email_address");
	By msg = By.id("message");
	By shareWishlist = By.xpath("//button[@title='Share Wishlist']");
	
	public WebElement getWelcomeMessage() {
		return driver.findElement(welcomeMessage);
	}

	public WebElement clickOnTV() {
		return driver.findElement(tv);
	}
	public WebElement setReceiverEmail() {
		return driver.findElement(email);
	}
	public WebElement setMessage() {
		return driver.findElement(msg);
	}
	public WebElement clickOnShareWishlist() {
		return driver.findElement(shareWishlist);
	}
}

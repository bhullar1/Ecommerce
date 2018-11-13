package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	public WebDriver driver;
	public Cart(WebDriver driver) {
		this.driver = driver;
	}
	By qty = By.cssSelector("*[title='Qty']");
	By update = By.cssSelector("*[title='Update']");
	By actual = By.xpath("//li[@class='error-msg']/ul/li/span");
	By emptyCart = By.xpath("//*[@id='empty_cart_button']/span");
	By emptyCartMessage = By.cssSelector("div[class='page-title'] h1:nth-child(1)");
	
	public WebElement getQty() {
		return driver.findElement(qty);
	}
	 
	public WebElement clickUpdate() {
		return driver.findElement(update);
	}

	public WebElement getActualCartMessage() {
		return driver.findElement(actual);
	}
	public WebElement clickEmptyCart() {
		return driver.findElement(emptyCart);
	}
	public WebElement getEmptyCartMessage() {
		return driver.findElement(emptyCartMessage);
	}
}

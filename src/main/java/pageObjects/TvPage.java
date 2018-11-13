package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TvPage {
	public WebDriver driver;

	public TvPage(WebDriver driver) {
		this.driver = driver;
	}
	By addToWishlist = By.linkText("Add to Wishlist");
	
	public WebElement getAddToWishlist() {
		return driver.findElement(addToWishlist);
	}
	

}

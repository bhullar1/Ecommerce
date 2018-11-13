package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistPage {

	public WebDriver driver;

	public MyWishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By shareWishlist = By.xpath("//button[@title='Share Wishlist']");
	public WebElement getShareWishlist() {
		return driver.findElement(shareWishlist);
	}
}

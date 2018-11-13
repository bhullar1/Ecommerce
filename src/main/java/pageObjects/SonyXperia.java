package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SonyXperia {
	public WebDriver driver;

	public SonyXperia(WebDriver driver) {
		this.driver = driver;
	}

	By sonyXperiaCost = By.cssSelector("span[id='product-price-1']");
	
	public WebElement getSonyXperiaCost() {
		return driver.findElement(sonyXperiaCost);
	}
}

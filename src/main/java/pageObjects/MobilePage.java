package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilePage {

	public WebDriver driver;

	public MobilePage(WebDriver driver) {
		this.driver = driver;
	}
	 By mobilePageTitle = By.xpath("//div[@class='page-title category-title']/h1");
	 By mobileSorting = By.cssSelector("select[title='Sort By']");
	 By sonyXperiaCost = By.cssSelector("span[id='product-price-1']");
	 By sonyXperiaMobile = By.cssSelector("a[title='Xperia']");
	 By sonyXperiaAddToCart = By.xpath("//a[@title='Xperia']/following-sibling::div[1]/div[3]/button/span");
	 By sonyXperiaAddToCompare = By.xpath("//a[@title='Xperia']/following-sibling::div[1]/div[3]/ul/li[2]/a");
	 By iphoneAddToCompare = By.xpath("//a[@title='IPhone']/following-sibling::div[1]/div[3]/ul/li[2]/a");
     By compare = By.cssSelector("button[title='Compare']");
	public WebElement getMobilePageTitle() {
		return driver.findElement(mobilePageTitle);
	}
	
	public WebElement getMobileSortingByName() {
		return driver.findElement(mobileSorting);
	}
	public WebElement getSonyXperiaCost() {
		return driver.findElement(sonyXperiaCost);
	}
	public WebElement getSonyXperiaMobile() {
		return driver.findElement(sonyXperiaMobile);
	}
	public WebElement getSonyXperiaAddToCart() {
		return driver.findElement(sonyXperiaAddToCart);
	}
	public WebElement clickSonyAddToCompare() {
		return driver.findElement(sonyXperiaAddToCompare);
	}
	public WebElement clickIphoneAddToCompare() {
		return driver.findElement(iphoneAddToCompare);
	}
	public WebElement clickOnCompare() {
		return driver.findElement(compare);
	}
	 
	
}

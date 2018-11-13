package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {
	public WebDriver driver;
	public Popup(WebDriver driver) {
		this.driver = driver;
	}
	By actualPopupHeader = By.xpath("//*[@id=\"top\"]/body/div/div[1]/h1");
	By checkSony = By.xpath("//a[@title='Sony Xperia']");
	By checkIphone = By.xpath("//a[@title='IPhone']");
	By close = By.xpath("//*[@title='Close Window']");
	
	public WebElement getPopupHeader() {
		return driver.findElement(actualPopupHeader);
	}
	public List<WebElement> getSonyXperiaCount() {
		return driver.findElements(checkSony);
	}
	public List<WebElement> getIphoneCount() {
		return driver.findElements(checkIphone);
	}

	public WebElement clickOnCloseWindow() {
		return driver.findElement(close);
	}
}

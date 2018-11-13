package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	By createAccount = By.xpath("//a[@title='Create an Account']/span");
	
	public WebElement clickOnCreateAccount() {
		return driver.findElement(createAccount);
	}
	
}

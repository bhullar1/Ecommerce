package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount {
	public WebDriver driver;
	
	public CreateAccount(WebDriver driver) {
		this.driver = driver;
	}
	By firstName = By.id("firstname");
	By middleName = By.id("middlename");
	By lastName = By.id("lastname");
	By email = By.id("email_address");
	By password = By.id("password");
	By confirmPassword = By.id("confirmation");
	By register = By.xpath("//button[@title='Register']");
	
	public WebElement setFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement setMiddleName() {
		return driver.findElement(middleName);
	}
	public WebElement setLastName() {
		return driver.findElement(lastName);
	}public WebElement setPassword() {
		return driver.findElement(password);
	}public WebElement setConfirmPasswor() {
		return driver.findElement(confirmPassword);
	}public WebElement clickOnRegister() {
		return driver.findElement(register);
	}
	public WebElement setEmail() {
		return driver.findElement(email);
	}
	
	
			}

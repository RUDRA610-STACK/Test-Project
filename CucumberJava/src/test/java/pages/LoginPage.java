package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	By txt_username=By.id("user-name");
	By txt_password=By.id("password");
	By txt_login=By.id("login-button");
	//initialize WebElement
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//constructor declaration
	}
	public void enter_Username(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enter_Password(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(txt_login).click();
	}
	public void enter_Username2(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enter_Password2(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clickLogin2() {
		driver.findElement(txt_login).click();
	}

}

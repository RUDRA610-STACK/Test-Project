package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	By txt_username=By.id("user-name");
	By txt_password=By.id("password");
	By txt_login=By.id("login-button");
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
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
	

}

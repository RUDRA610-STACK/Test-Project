package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	@FindBy(id="user-name")
	@CacheLookup
	WebElement txt_Username;
	@FindBy(id="password")
	WebElement txt_Password;
	@FindBy(id="login-button")
	WebElement login_button;
	WebDriver driver;
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enter_Username(String username) {
		txt_Username.sendKeys(username);
	}
	public void enter_Password(String password) {
		txt_Password.sendKeys(password);
	}
	public void clickLogin() {
		login_button.click();
	}
	
}

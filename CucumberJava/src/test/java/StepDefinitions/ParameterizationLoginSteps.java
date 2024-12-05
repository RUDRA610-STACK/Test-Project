package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterizationLoginSteps {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@Given("Browser is opened")
	public void browser_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
	    String driverPath=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", driverPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	    driver.manage().window().maximize();
	}

	@And("User navigate to loginPage")
	public void user_navigate_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://www.saucedemo.com/v1/");
	}

	@When("^User enter (.*) and (.*)")
	public void user_enter_username(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("User clicks login button")
	public void user_enters_login() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("login-button")).click();
	}
	@Then("User is on Homepage")
	public void user_is_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    if(driver.getCurrentUrl().equals("https://www.saucedemo.com/v1/inventory.html")) {
	    	System.out.println("User has logged in Successfully");
	    }
	    else {
	    	System.out.println("Please enter correct credentials");
	    }
	}

	@And("User close the browser")
	public void user_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	    driver.quit();
	}
}

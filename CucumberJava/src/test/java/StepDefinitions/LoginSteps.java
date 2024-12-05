package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver=null;
	@SuppressWarnings("deprecation")
	@Given("User navigate to login page URL")
	public void user_navigate_to_login_page_url() {
	    // Write code here that turns the phrase above into concrete actions
		String project_path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project_path+"/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		System.out.println("User is on login page");	
	}

	@When("User enter username")
	public void user_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		System.out.println("User enter username");
	}

	@And("User enter password")
	public void user_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		System.out.println("User enter password");
	}

	@And("User click login button")
	public void user_enter_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("User click login button");
	}

	@Then("User should be on welcome page")
	public void user_should_be_on_welcome_page() {
	    // Write code here that turns the phrase above into concrete actions
		if(driver.findElement(By.xpath("//h1[@class=\"post-title\"]")).isDisplayed()) {
			System.out.println("User is on welcome page");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	    
	}

}

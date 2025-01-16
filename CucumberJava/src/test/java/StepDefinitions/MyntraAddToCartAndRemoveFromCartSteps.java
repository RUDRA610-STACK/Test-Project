package StepDefinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.MyntraHomePage_PF;

public class MyntraAddToCartAndRemoveFromCartSteps {
	WebDriver driver=null;
	MyntraHomePage_PF myntra;
	@SuppressWarnings("deprecation")
	@Before
	public void browserSetUp() {
		String chromePath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", chromePath+"//src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void tearDown() {
//		driver.close();
//		driver.quit();
	}
	@Given("User navigate to myntra")
	public void user_navigate_to_myntra() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.myntra.com/");
	}

	@And("Went for Mens T-shirt collection")
	public void went_for_mens_t_shirt_collection() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		myntra=new MyntraHomePage_PF(driver);
		myntra.hoverOnMenCollection();
		myntra.men_Tshirt();
		Thread.sleep(6000);
	}

	@When("User select any product")
	public void user_select_any_product() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		myntra.select_Tshirt();
		System.out.println("Tshirt selected");
		Thread.sleep(6000);
	}

	@And("User select the size and clik on Add to Cart")
	public void user_select_the_size_and_clik_on_add_to_cart() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("size is yet to be selected");
//		myntra.select_Size();
		System.out.println("size selected");
		Thread.sleep(6000);
		myntra.addToCartanyProduct();
		Thread.sleep(6000);
	}
	@Then("User should be able to view that product in Add to cart page")
	public void user_should_be_able_to_view_that_product_in_add_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@And("Place order button also must be present in add to cart page")
	public void place_order_button_also_must_be_present_in_add_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("User click on remove button")
	public void user_click_on_remove_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@And("click remove again from the pop-up")
	public void click_remove_again_from_the_pop_up() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("the cart should be empty")
	public void the_cart_should_be_empty() {
	    // Write code here that turns the phrase above into concrete actions
	}
}

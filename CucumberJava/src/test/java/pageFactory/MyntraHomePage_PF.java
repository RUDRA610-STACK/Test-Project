package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraHomePage_PF {
	@FindBy(xpath="//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']")
	WebElement myntra_Logo;
	@FindBy(xpath="//a[@data-group='men']")
	WebElement men_Collection;
	@FindBy(xpath="//a[@data-reactid='31']")
	WebElement men_Tshirt;
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement select_Tshirt;
	@FindBy(xpath="//button/p[@class='size-buttons-unified-size']")
	WebElement select_Size;
	@FindBy(xpath="//p[@class='size-buttons-unified-size']")
	WebElement addToCart_button;
	@FindBy(xpath="//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	WebElement cart;
	@FindBy(xpath="//button[text()='REMOVE']")
	WebElement removeFromCart;
	@FindBy(xpath="//button[@class='inlinebuttonV2-base-actionButton ']")
	WebElement removeFromCart_popUp;
	@FindBy(xpath="//div[text()='PLACE ORDER']")
	WebElement placeOrder_button;
	@FindBy(xpath="//h1[text()='Men Black Polo Collar Monochrome T-shirt']")
	WebElement tshirt_Name;
	@FindBy(xpath="//div[@class='emptyCart-base-emptyDesc']")
	WebElement cart_Empty_Text;
	WebDriver driver;
	public MyntraHomePage_PF(WebDriver drive) {
		this.driver=drive;
		PageFactory.initElements(drive, this);
	}
	public void hoverOnMenCollection() {
		Actions action=new Actions(driver);
		action.moveToElement(men_Collection).build().perform();
	}
	public void men_Tshirt() {
		men_Tshirt.click();
	}
	public void select_Tshirt() {
		select_Tshirt.click();
	}
	public void select_Size() {
		select_Size.click();
	}
	public String tshirt_Name() {
		String tshirt_name=tshirt_Name.getText();
		return tshirt_name;
	}
	public void addToCartanyProduct() {
		addToCart_button.click();
	}
	public void removeFromCart() {
		removeFromCart.click();
	}
	public void removeFromCart_PopUp() {
		removeFromCart_popUp.click();
	}
	
	
}

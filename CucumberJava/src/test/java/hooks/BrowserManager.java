
package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	OptionManager options=new OptionManager();
	public static WebDriver driver;
	public WebDriver startBrowser() {
		String browserName="chrome";
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options.getChromeOption());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(options.getEdgeOption());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
		
	}
	public void stopBrowser() {
		driver.close();
		driver.quit();
	}
	public void navigateToURL(String url) {
		driver.get(url);
	}
}

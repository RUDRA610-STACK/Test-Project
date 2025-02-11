package hooks;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OptionManager {
	public ChromeOptions getChromeOption() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, option);
		option.merge(caps);
		return option;
	}
	public EdgeOptions getEdgeOption() {
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(ChromeOptions.CAPABILITY, option);
		option.merge(caps);
		return option;
	}
}

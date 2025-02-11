package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	BrowserManager manager=new BrowserManager();
	@Before
	public void beforeScenario() {
		System.out.println("Setup gets executed");
		manager.startBrowser();
	}
	@After
	public void afterScenario() {
		manager.stopBrowser();
		System.out.println("Teardown gets executed");
	}
}

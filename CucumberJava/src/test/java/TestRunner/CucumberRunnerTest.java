package TestRunner;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.ReadPropertiesFile;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome= true,
plugin={"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
tags= "@smoke9"


		)
public class CucumberRunnerTest {
	@BeforeClass
	public static void beforClass() throws IOException {
		ReadPropertiesFile.config();
	}
	@BeforeClass
	public static void afterClass() {
	}

}

package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions", "hooks"},
monochrome= true,
plugin={"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "rerun:target/rerun.txt"},
tags= "@smoke9"


		)
public class CucumberRunnerTest {
	
}

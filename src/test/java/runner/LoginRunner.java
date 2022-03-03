package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "steps", 
		monochrome = true, 
		//tags = { "@Scenario1"},
		dryRun = false,
		plugin = {
		"pretty", 
		"html:target/cucumber", 
		"json:target/cucumber.json" 
		}
		)
public class LoginRunner {

}

package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue= "StepDefinition3", tags= "@resetmultipledata",

dryRun = false,
monochrome = true,
plugin={"html:target/cucumber-html-report", "json:target/cucumber.json","pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"}
)
public class Runner {

}

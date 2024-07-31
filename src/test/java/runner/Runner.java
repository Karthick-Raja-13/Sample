package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features = {"src/test/resources/features/add.feature"},
glue="steps",
plugin= {
		"html:src/test/resources/results",
		"pretty"
})
public class Runner extends AbstractTestNGCucumberTests {

}

package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		format={"pretty","html:reporter/html","json:report/json/cucumber.json"},
		tags={"@test_cucumbr"},
		features ="src/main/java/cucumber_demo",
		glue={"cucumber"}
		
		)


public class Testrunner extends AbstractTestNGCucumberTests {
	

}

package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/?/Documents/sample-gradle/src/main/java/features",
        plugin = {"pretty", "html:target/cucumber"},
        glue = {"StepDefinition"},
        strict = true)

public class mainrunner {
}

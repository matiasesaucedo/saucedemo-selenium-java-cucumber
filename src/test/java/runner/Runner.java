package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepsDefinitions", "hooks"},
        plugin = {"pretty", "html:target/cucumber-html-reports", "json:cucumber.json"}
)

public class Runner {

}

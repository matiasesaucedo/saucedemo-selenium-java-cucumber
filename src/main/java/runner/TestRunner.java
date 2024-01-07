package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = {"/src/main/java/stepDefinitions", "/src/main/java/utility"},
        plugin = {"pretty", "html:target/cucumber-html-reports", "json:cucumber.json"}
)

public class TestRunner {

}

package modules;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","json:target/json/result.json","junit:target/cucumber.xml", "html:target/html/results.html"},
        features = {"src/test/ressources/feature"},
        glue = {"step_definitions"}


)

public class TestRunner {
    //TODO create test run configuration
}

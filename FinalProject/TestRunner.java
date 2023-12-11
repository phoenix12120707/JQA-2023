package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(strict = true,
        features = {"src/Features/Tests.feature"},
       glue ={"classpath:Steps"},
        tags = "@Smoke",
        plugin = {"json:target/cucumber.json"},
        monochrome = true
)
public class TestRunner{
}
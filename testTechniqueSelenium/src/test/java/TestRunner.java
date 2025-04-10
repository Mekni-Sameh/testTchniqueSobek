import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/specs/features"},
plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber-reports"},
tags = ("@connexionOK,@connexionKO"),
snippets =SnippetType.CAMELCASE,
monochrome = true

)

public class TestRunner {

}

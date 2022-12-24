package com.sauce.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-html-reports.html",
                "json:target/cucumber.json"},

        features = "src/test/resources/features",
        glue = "com/sauce/stepDefs",
        dryRun = false,
        tags = "@wip"

)

public class CukesRunner {

}

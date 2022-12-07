package com.ulus.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/ulus/stepdef",
        dryRun = false,
        stepNotifications = true,
        tags = ""
)


public class CukesRunner {

}

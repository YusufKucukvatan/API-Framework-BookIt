package com.bookit.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/bookit/stepDefinitions"},
        monochrome = true,
        strict = true,
        dryRun = true,
        tags = "@api"
)
public class CucumberRunner {
}

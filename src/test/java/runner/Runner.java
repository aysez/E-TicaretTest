package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:report/default-cucumber-reports.html",
                "json:report/json-reports/cucumber.json",
                "junit:report/xml-report/cucumber.xml",
                "rerun:report/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"stepdefinitions.uitesting", "hooks"},
        tags = "@smoke",
        dryRun = false

)
public class Runner {

}


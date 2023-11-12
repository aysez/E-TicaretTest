package hooks;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.Driver;

public class Hooks {
    public static WebDriver driver;


    @After
    public void tearDownScenarios(Scenario scenario) {
        System.out.println("Senaryo after methodu");
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());
            Driver.closeDriver();
        }

    }
}
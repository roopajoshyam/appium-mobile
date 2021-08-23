package com.appium.mobile.runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

@CucumberOptions(features = { "src/test/java/com/appium/mobile/features" },

        glue = { "com.appium.mobile.stepDefinitions" },

        /*
         * format = { "pretty", "html:target/cucumber-reports/cucumber-pretty",
         * "json:target/cucumber-reports/CucumberTestReport.json",
         * "rerun:target/cucumber-reports/re-run.txt" },
         */
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:TestResults/cucumber-reports/TestAutomation.html",
                "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt" }, monochrome = true, dryRun = false /*,tags = { "@Start" }*/)

public class CucumberTest {

    private static TestNGCucumberRunner testRunner;

    @Before
    public void beforeScenario(Scenario scenario) {
        Reporter.assignAuthor("Roopa J");
    }

    @BeforeClass
    private void launchTest() {

        testRunner = new TestNGCucumberRunner(CucumberTest.class);

    }

    @Test(description = "Apps", dataProvider = "Feature")
    public void login(CucumberFeatureWrapper cFeature) {
        testRunner.runCucumber(cFeature.getCucumberFeature());
    }

    @DataProvider(name = "Feature")
    public Object[][] getFeatures() {
        return testRunner.provideFeatures();
    }

    @AfterClass
    public static void report() {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extentconfig.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", System.getProperty("os.name"));
        testRunner.finish();
    }
}

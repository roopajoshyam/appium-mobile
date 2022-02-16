package com.appium.mobile.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"},
        glue = {"classpath:com.appium.mobile.stepDefinitions"},
        plugin = {
                "io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"
        },
        monochrome = true
)
public class JunitRunnerTest {

    /**
     * Will be executed before the feature files.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Starting feature test run");
    }
    /**
     * Will be executed after the feature files.
     */
    @AfterClass
    public static void tearDown() {
        System.out.println("Finishing feature test run");
    }
}

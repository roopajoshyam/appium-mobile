package com.appium.mobile.stepDefinitions;

import com.appium.mobile.Capabilities;
import com.appium.mobile.pages.SignUp;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MyStepdefs extends Capabilities {

    private SignUp signUp;

    @Before
    public void setup()throws Exception{
        setupDriver();
    }
    @Given("^Input username and password$")
    public void inputUsernameAndPassword() {
        System.out.println("Step 1");
        signUp = new SignUp(appiumDriver);
        signUp.EnterCredentials();
    }

    @Then("^Select login button$")
    public void SelectLoginButton() {
        System.out.println("Step 2");
        signUp = new SignUp(appiumDriver);
        signUp.SelectLogin();
    }

    @Then("^Click on login$")
    public void ClickOnLoginButton() {
        System.out.println("Step 2");
        signUp = new SignUp(appiumDriver);
        signUp.ClickLogin();
    }

    @And("^Verify login$")
    public void verifyLogin() {
        System.out.println("Step 3");
        signUp = new SignUp(appiumDriver);
        signUp.VerifyLogin();
        signUp.logout();
    }

    @After
    public void stop(){
        stopServer();
    }
}

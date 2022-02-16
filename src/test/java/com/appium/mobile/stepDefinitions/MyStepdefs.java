package com.appium.mobile.stepDefinitions;

import com.appium.mobile.Capabilities;
import com.appium.mobile.CapabilitiesOld;
import com.appium.mobile.pages.SignUp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs extends Capabilities {

    private SignUp signUp;

    @Before
    public void setup()throws Exception{
        System.out.println("Step 0 in setting up driver");
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

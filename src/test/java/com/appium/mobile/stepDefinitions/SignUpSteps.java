//package com.appium.mobile.stepDefinitions;
//
//import com.appium.mobile.Capabilities;
//import com.appium.mobile.CapabilitiesNew;
//import com.appium.mobile.pages.SignUp;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class SignUpSteps extends Capabilities {
//
//    private SignUp signUp;
//
//    @Before
//    public void setup()throws Exception{
//        System.out.println("Step 0 in setting up driver");
//        setupDriver();
//    }
//
//    @Given("Select signup button")
//    public void selectSignupButton() {
//        System.out.println("Step 2");
//        signUp = new SignUp(appiumDriver);
//        signUp.SelectSignUP();
//    }
//
//    @Then("Input name")
//    public void inputName() {
//        signUp = new SignUp(appiumDriver);
//        signUp.EnterName();
//    }
//
//    @Then("Input email")
//    public void inputEmail() {
//        signUp = new SignUp(appiumDriver);
//        signUp.EnterEmail();
//    }
//
//    @Then("Input password")
//    public void inputPassword() {
//        signUp = new SignUp(appiumDriver);
//        signUp.EnterPassword();
//    }
//
//    @And("Click on signup")
//    public void clickOnSignup() {
//        signUp = new SignUp(appiumDriver);
//        signUp.ClickSignUP();
//    }
//    @And("^Verify login$")
//    public void verifyLogin() {
//        System.out.println("Step 3");
//        signUp = new SignUp(appiumDriver);
//        signUp.VerifyLogin();
//        signUp.logout();
//    }
//
//    @After
//    public void stop(){
//        stopServer();
//    }
//}

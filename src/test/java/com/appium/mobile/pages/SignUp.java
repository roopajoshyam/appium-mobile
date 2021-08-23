package com.appium.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
    AppiumDriver<MobileElement> driver;

    public SignUp(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @iOSXCUITFindBy(id = "btnSignIn")
    @AndroidFindBy(accessibility = "btnSignIn")
    MobileElement btnSignIn;

    @iOSXCUITFindBy(id = "btnSignUp")
    @AndroidFindBy(accessibility = "btnSignUp")
    MobileElement btnSignUp;

    @iOSXCUITFindBy(id = "txtInputEmail")
    @AndroidFindBy(accessibility = "txtInputEmail")
    MobileElement txtInputEmail;

    @iOSXCUITFindBy(id = "txtInputPassword")
    @AndroidFindBy(accessibility = "txtInputPassword")
    MobileElement txtInputPassword;

    @iOSXCUITFindBy(id = "btnLogin")
    @AndroidFindBy(accessibility = "btnLogin")
    MobileElement btnLogin;

    @iOSXCUITFindBy(id = "btnHome")
    @AndroidFindBy(accessibility = "btnHome")
    MobileElement btnHome;

    public void SelectLogin(){
        btnSignIn.click();
    }

    public void EnterCredentials(){
        txtInputEmail.sendKeys("jroopa@mailinator.com");
        txtInputPassword.sendKeys("123456");
    }

    public void ClickLogin(){
        btnLogin.click();
    }

    public boolean VerifyLogin(){
        return btnHome.isDisplayed();
    }

    public void logout(){
        btnHome.click();
    }
}

package com.appium.mobile;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.drivers.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CapabilitiesOld extends DesiredCapabilities {

    public static AppiumDriver<MobileElement> appiumDriver;
    public static ExtentReports extent;
    private static ExtentHtmlReporter htmlReporter;
    static String Createdreport;
    private static SimpleDateFormat calendarDate;
    public static AndroidDriver androidDriver;
    public static IOSDriver iosDriver;


    public AppiumDriver<MobileElement> setupDriver() throws Exception {
        appiumDriver = preparation();
        return appiumDriver;
    }

    private AppiumDriverLocalService service;
    protected AppiumDriver<MobileElement> preparation() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        capabilities.setCapability(MobileCapabilityType.UDID, "d7c45d58"); //RZ8N71L331Y
        capabilities.setCapability("appPackage", "com.rn_app");
        capabilities.setCapability("appActivity", "com.rn_app.MainActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//        capabilities.setCapability(MobileCapabilityType.ACCEPT_SSL_CERTS, false);
//        capabilities.setCapability("INSTALL_GRANT_RUNTIME_PERMISSIONS", "true");
        androidDriver = new AndroidDriver<>("dzNeCACvT9CFsRV5qo4P6ZNe54Zp1NA065V7GTEc3v41", capabilities, "RNApp", "CodedTest");
        System.out.println("success---------");
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver;

//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
//        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/app/rn_app_3.app");
//        capabilities.setCapability(MobileCapabilityType.UDID, "54F5C5A4-2C2A-4B3E-B08B-0D1E5562B82C");
//
//        iosDriver = new IOSDriver<>("dzNeCACvT9CFsRV5qo4P6ZNe54Zp1NA065V7GTEc3v41", capabilities);
//        System.out.println("success---------");
//        iosDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        return androidDriver;
    }

    public static ExtentReports createTestResult(String fileName) {
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/TestResults/" + fileName);

        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        htmlReporter.start();
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extentconfig.xml");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;

    }

    public static ExtentReports createReport() {
        calendarDate = new SimpleDateFormat("yyyy.MMMMM.dd hh:mm:aaa");
        Createdreport = "Android" + "TestAutomation" + calendarDate.format(new Date()) + ".html";
        return CapabilitiesOld.createTestResult(Createdreport);
    }

//    @AfterSuite
    public void stopServer() {
        androidDriver.quit();
//        iosDriver.quit();
    }

}

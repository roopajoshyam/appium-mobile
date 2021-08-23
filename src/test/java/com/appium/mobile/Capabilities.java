package com.appium.mobile;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Capabilities extends DesiredCapabilities {

    public static AppiumDriver<MobileElement> appiumDriver;
    public static ExtentReports extent;
    private static ExtentHtmlReporter htmlReporter;
    static String Createdreport;
    private static SimpleDateFormat calendarDate;

    public AppiumDriver<MobileElement> setupDriver() throws Exception {
        appiumDriver = preparation();

        return appiumDriver;
    }

    protected AndroidDriver androidDriver;
    private AppiumDriverLocalService service;
    protected AppiumDriver<MobileElement> preparation() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("deviceName", "d7c45d58");
        capabilities.setCapability("appPackage", "com.rn_app");
        capabilities.setCapability("appActivity", "com.rn_app.MainActivity");
//        capabilities.setCapability("app", System.getenv("BITRISE_APK_PATH"));
        capabilities.setCapability("automationName", "UiAutomator2");
//        service = AppiumDriverLocalService
//                .buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node"))
//                        .withAppiumJS(new File("/Users/roopa.j/.nvm/versions/node/v12.14.1/bin/appium")).withIPAddress("0.0.0.0")
//                        .usingPort(4727).withLogFile(new File("/tmp/AppiumLogs.txt")));
//        service.start();
//        String service_url = service.getUrl().toString();
//        System.out.println("Appium Service Address: " + service_url);
//        androidDriver = new AndroidDriver(new URL(service_url), capabilities)
        androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return androidDriver;
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
        return Capabilities.createTestResult(Createdreport);
    }

    public void stopServer() {

//        service.stop();
    }

}

package com.caculator.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;
    @BeforeClass
    public void setupAppium(){
        try {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid","e6e4dc80");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","10");
        capabilities.setCapability("appPackage","com.bng.calculator");
        capabilities.setCapability("appActivity","com.bng.calc.MainActivity");
        capabilities.setCapability("automationName","UiAutomator2");



            driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

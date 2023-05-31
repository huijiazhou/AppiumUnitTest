package com.example.appiumunittest;

import android.app.Activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumUITest {

    private AndroidDriver driver;

    @Before
    public void init(String[] args) {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");//平台
        desiredCapabilities.setCapability("appium:deviceName", "RedMi");//设备名称，随意
        desiredCapabilities.setCapability("appium:uuid", "8KE5T19621012235");//连接的设备id，adb devices可获取
        desiredCapabilities.setCapability("appium:newCommandTimeout", 60);
        desiredCapabilities.setCapability("appium:noSign", true);//不通过appium二次签名
        desiredCapabilities.setCapability("appium:unicodeKeyboard", true);
        desiredCapabilities.setCapability("appium:resetKeyboard", true);
        desiredCapabilities.setCapability("appium:noReset", true); //不重置app数据
        desiredCapabilities.setCapability("appium:autoGrantPermission", true);
        desiredCapabilities.setCapability("appium:appPackage", "com.xrapp.holospace");//包名
        desiredCapabilities.setCapability("appium:appActivity", "com.xrapp.holospace.ui.SplashActivity");//启动页
// 混合模式，同时测试native和h5
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4732/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test(){

       String activity =  driver.currentActivity();
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.android.navigationsample:id/play_btn");


    }
    @After
    public void end(){

    }
}

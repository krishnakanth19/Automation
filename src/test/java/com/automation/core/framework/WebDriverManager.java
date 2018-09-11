package com.automation.core.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver initializeWebDriver(){
        String chromePath = FrameWorkConstants.CHROME_DRIVER_PATH;
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver getDriver(){
        if (driver == null){
            driver = initializeWebDriver();
        }
        return driver;
    }

    public static void killDriver(){
        if (driver != null){
            driver.close();
            driver.quit();
        }
    }
}

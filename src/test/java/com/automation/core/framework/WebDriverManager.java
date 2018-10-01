package com.automation.core.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver initializeWebDriver(){
        String chromePath = FrameWorkConstants.CHROME_DRIVER_PATH;
        System.setProperty("webdriver.chrome.driver",chromePath);
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");                         //Run in headless mode. i.e. no browser open.
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

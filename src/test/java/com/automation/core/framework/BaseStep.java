package com.automation.core.framework;

import com.automation.core.utils.Util;
import com.automation.core.utils.WebContext;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseStep {

    static final Logger LOG = Logger.getLogger(BaseStep.class);
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public BaseStep(String name){
        try {
            DOMConfigurator.configure("src/log4j.xml");
            logScenarioDetails(name);
            this.driver = WebDriverManager.getDriver();
            this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        }catch (Exception e){
            LOG.error("Unable to initialize WebDriver",e);
        }
    }

    public void openPage(String url){
        LOG.info("Open Page URL: "+url);
        this.driver.navigate().to(url);
        this.driver.manage().window().maximize();
        WebContext.setValue("APPLICATION_URL",url);
    }

    public void logScenarioDetails(String name){
        LOG.info("Scenario Name: "+name);
        LOG.info("Start Time: "+ Util.getCurrentDateAndTime());
    }

    public void closeBrowser(){
        WebDriverManager.killDriver();
    }
}

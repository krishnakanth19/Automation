package com.automation.pageobjects;

import com.automation.core.framework.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamplePage extends BasePage {
    public SamplePage(WebDriver driver) {
        super(driver);
    }

    static final Logger logger = Logger.getLogger(SamplePage.class);

    @FindBy(xpath = "//div[contains(text()),'FEETS']")
    private WebElement feets;


    public void clickFeets(){
        waitUntilElementToBeClickable(feets,10);
        feets.click();
    }
}

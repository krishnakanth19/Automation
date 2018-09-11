package com.automation.core.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    protected void waitUntilElementToBeClickable(WebElement element,int timeInSeconds){
        new WebDriverWait(driver,timeInSeconds).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForElementVisible(WebElement element,int timeInSeconds){
        new WebDriverWait(driver,timeInSeconds).until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForInvisibilityOfElementLocated(WebElement element,int timeInSeconds){
        new WebDriverWait(driver,timeInSeconds).until(ExpectedConditions.invisibilityOf(element));
    }

    protected void waitForVisibilityOfElementLocatedBy(By element,int timeInSeconds){
        new WebDriverWait(driver,timeInSeconds).until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}

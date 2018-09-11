package com.automation.pageobjects;

import com.automation.core.framework.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage {
    public Login(WebDriver driver) {
        super(driver);
    }

    static final Logger logger = Logger.getLogger(Login.class);

    @FindBy(id = "INT_USERNAME")
    private WebElement userName;

    @FindBy(id = "INT_PASSWORD")
    private WebElement password;

    @FindBy(id = "INT_LOGIN_BTN")
    private WebElement btnLogin;

    @FindBy(id = "lst-ib")
    private WebElement searchBar;

    public void login(String uName, String psw){
        /*waitForElementVisible(userName,10);
        userName.clear();
        userName.sendKeys(uName);
        password.clear();
        password.sendKeys(psw);
        btnLogin.click();*/
        waitForElementVisible(searchBar,10);
        searchBar.sendKeys("TestNG");
    }
}

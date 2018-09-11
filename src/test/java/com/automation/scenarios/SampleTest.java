package com.automation.scenarios;

import com.automation.core.framework.BaseStep;
import com.automation.pageobjects.Login;
import com.automation.pageobjects.SamplePage;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTest extends BaseStep {
    public SampleTest(String name) {
        super(name);
    }

    private SamplePage sp = new SamplePage(getDriver());
    private Login login = new Login(getDriver());
    static final Logger logger = Logger.getLogger(SampleTest.class);

    @BeforeSuite
    @Parameters({"url","uName","psw"})
    public void loginPage(String url, String uName, String psw){
        logger.info("Launching URL: "+url);
        openPage(url);
        login.login(uName,psw);
    }

    @Test(priority = 1)
    public void gotoFeetsHome(){
        //sp.clickFeets();
    }

}

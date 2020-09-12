package com.techproed.smokeTests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcLoginTest extends TestBase {

    @Test
    public void test(){
        driver.get(ConfigurationReader.getProperty("fhc_login"));

        FhcTripLoginPage loginPage = new FhcTripLoginPage(driver);
        loginPage.UserName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.Password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.login.click();


    }
}

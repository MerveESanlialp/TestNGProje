package com.techproed.tests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.pages.GooglePage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {

    @Test
    public void aramaTesti() {
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
        FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage(driver);
       fhcTripLoginPage.UserName.sendKeys("manager2");
       fhcTripLoginPage.Password.sendKeys("Man1ager2!");
       fhcTripLoginPage.login.click();
    }
}

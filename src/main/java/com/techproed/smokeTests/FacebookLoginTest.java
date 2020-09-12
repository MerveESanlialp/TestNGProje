package com.techproed.smokeTests;

import com.techproed.pages.FacebookLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FacebookLoginTest extends TestBase {

    @Test
    public void girisTest(){
        driver.get("http://www.facebook.com");

        FacebookLoginPage LoginPage = new FacebookLoginPage(driver);
        LoginPage.email.sendKeys(ConfigurationReader.getProperty("fb_email"));
        LoginPage.Password.sendKeys(ConfigurationReader.getProperty("fb_pass"));

    }

}

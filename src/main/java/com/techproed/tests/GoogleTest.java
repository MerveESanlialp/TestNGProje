package com.techproed.tests;

import com.techproed.pages.GooglePage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {

    @Test
    public void aramaTesti(){
        driver.get("http://www.google.com");
        GooglePage googlePage = new GooglePage(driver);

        googlePage.aramaKutusu.sendKeys("Selamlar");
    }



}

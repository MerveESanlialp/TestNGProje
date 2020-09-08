package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ornek_AmazonKayitSayfasi extends TestBase {

    @Test

    public void test01(){
        driver.get("http://www.amazon.com");
        WebElement button = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);

        action.moveToElement(button).perform();
        WebElement startHereLink = driver.findElement(By.partialLinkText("Start here."));
        startHereLink.click();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Amazon Registration");

    }

    @Test
    public void test02(){
        driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        WebElement name = driver.findElement(By.id("ap_customer_name"));
        name.sendKeys("Merve Sanlialp");

        WebElement email = driver.findElement(By.id("ap_email"));
        email.click();
        email.sendKeys("sanlialpmerve@gmail.com");

        driver.findElement(By.id("ap_password")).sendKeys("Bilmemki01");
        driver.findElement(By.id("ap_password_check")).sendKeys("Amazon06.");
        driver.findElement(By.id("continue")).click();
    }

    @Test
    public void buyukKucukYazma() throws Exception {
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("merhaba ");

        // bu sekilde her karakteri buyuk yapar
        Actions actions = new Actions(driver);
        actions.moveToElement(searchBox).click()
                .keyDown(Keys.SHIFT)
                .sendKeys("merhaba")
                .keyUp(Keys.SHIFT)
                .sendKeys(" nasılsınız")
                .perform();



    }


}

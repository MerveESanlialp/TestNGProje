package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
    /*
    Assert.assertTrue
    Assert.assertFalse
    Assert.assertEquals

    SoftAssert kullaniminin Hard Assert kullanimindan farklari:
    1.SoftAssert eger test basarisizsa, kalan kismi da calistiriyor
    2.SoftAssert classindan nesne olusturmak zorundayiz
     */

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void test01(){
        SoftAssert sf = new SoftAssert();
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        sf.assertFalse(title.contains("Amazon"));
        sf.assertTrue(title.contains("Car"));
        sf.assertEquals("Online",title);

        sf.assertAll();

    }

    @Test
    public void test02(){
        driver.get("http://a.testaddressbook.com/sign_in");
        SoftAssert softAssert = new SoftAssert();

        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        softAssert.assertTrue(emailKutusu.getText().equals("testtechproed@gmail.com"));

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");
        softAssert.assertTrue(sifreKutusu.getText().equals("testtechproed@gmail.com"));

        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();

        WebElement signOutLinki = driver.findElement(By.partialLinkText("Sign out"));
        boolean gorunuyorMu = signOutLinki.isDisplayed();
        softAssert.assertAll();



    }
}

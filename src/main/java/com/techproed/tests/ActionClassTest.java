package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassTest extends TestBase {

    @Test
    public void sagTiklama(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        // bir Webelement sag tiklamak icin kodu kullaniriz;
        // actions class

        actions.contextClick(element).perform();
    }

    @Test
    public void ciftTiklama(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction]"));
        Actions actions = new Actions(driver);
        // bir Elemente double click yapmak istiyorsak, doubleclick
        actions.doubleClick(button).perform();
    }

    @Test
    public void hoverOver(){
        driver.get("http://www.amazon.com");
        WebElement menu = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        // mouse'u istedigimiz webelemnt'in uzerine goturmek istiyorsak,
        // moveToElement methodunu kullanabiliriz.
        actions.moveToElement(menu).perform();

    }

    @Test
    public void asagiYukari(){
        driver.get("http://www.amazon.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.END).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.PAGE_UP).perform();

    }

}

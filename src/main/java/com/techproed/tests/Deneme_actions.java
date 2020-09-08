package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Deneme_actions {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
    }

    @Test
    public void doubleClick(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement cifttikla = driver.findElement(By.xpath("//button[@ondblclick='myFunction']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(cifttikla).perform();
    }

    @Test
    public void contextClick(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement sagtikla = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(sagtikla).perform();
    }

    @Test
    public void dragAndDrop() throws Exception{
        driver.get("https://demoqa.com/droppable/");
        Thread.sleep(5000);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable,drop).perform();
        Thread.sleep(10000);

    }





}

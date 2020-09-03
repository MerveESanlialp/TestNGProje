package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JSAlertTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void jsAlertTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();

        String Alertmessage = driver.switchTo().alert().getText();
        System.out.println(Alertmessage);
        driver.switchTo().alert().accept();

    }

    @Test
    public void jsConfirmTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirm.click();
        String confirmMessage = driver.switchTo().alert().getText();
        System.out.println(confirmMessage);
        //Alertin icindeki "Cancel" buttonuna bastik
        driver.switchTo().alert().dismiss();


    }

    @Test
    public void jspromptTest() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement confirm = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        confirm.click();
        String promptMessage = driver.switchTo().alert().getText();
        System.out.println(promptMessage);
        //Alertin icindeki "Cancel" buttonuna bastik
        driver.switchTo().alert().sendKeys("Test NG");
        driver.switchTo().alert().accept();
    }

}

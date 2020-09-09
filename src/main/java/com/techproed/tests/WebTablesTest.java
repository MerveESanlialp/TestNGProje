package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesTest {
    WebDriver driver;
    @BeforeClass

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void WebTable(){
        giris();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> basliklar = driver.findElements(By.xpath("//thead/tr/th"));
        for(WebElement baslik : basliklar){
            System.out.println(  baslik.getText()  );

        }

    }


    @Test
    public void belirliBirSutunYazdirma(){
        giris();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // //tbody/tr/td[4] -> Burada 4. sütun'u yazdırıyoruz.
        // buradaki 4 sayısını değiştirerek istediğimiz kolon(sütun)'u yazdırabiliriz.
        List<WebElement> dorduncuSutun = driver.findElements(By.xpath("//tbody/tr/td[4]"));
        for(WebElement veri : dorduncuSutun){
            System.out.println( veri.getText() );
        }
    }


    @Test
    public void calisri(){
        giris();
        hucreYazdir(3,5);
        hucreYazdir(5,2);
        hucreYazdir(2,1);
        hucreYazdir(9,4);
    }

    public void hucreYazdir(int satir, int sutun){
        String xpathDegerim = "//tbody/tr[" + satir + "]/td["+ sutun +  "] ";
        WebElement hucre = driver.findElement(By.xpath(xpathDegerim));
        System.out.println(hucre.getText());
    }
}

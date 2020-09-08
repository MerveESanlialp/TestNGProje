package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadTest extends TestBase {

    @Test
    public void dosyaVarMi(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));

        String kullaniciDosyaYolu = System.getProperty("user.dir");

        String pomXmlDosyaYolu = kullaniciDosyaYolu + "/pom.xml";

        boolean varMi = Files.exists(Paths.get(pomXmlDosyaYolu));
        Assert.assertTrue(varMi);
    }

    @Test

    public void DosyaUpload(){
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement choosefile = driver.findElement(By.id("file-upload"));
        choosefile.sendKeys("/Users/mesanlialp/Desktop/Techpro/logo.png");

        WebElement uploadButonu = driver.findElement(By.id("file-submit"));
        uploadButonu.click();

        WebElement FileUploaded = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(FileUploaded.isDisplayed());


    }

    @Test

    public void fileDownload(){
        driver.get("http://the-internet.herokuapp.com/download");
        WebElement amsterdamLinki = driver.findElement(By.partialLinkText("Amsterdam.jpg"));
        amsterdamLinki.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean varMi = Files.exists(Paths.get("/Users/mesanlialp/Downloads/Amsterdam.jpg"));
        Assert.assertTrue(varMi);



    }
}

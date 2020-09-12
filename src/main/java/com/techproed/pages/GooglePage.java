package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    WebDriver driver;
    public GooglePage(WebDriver driver){
        this.driver = driver;
        // parametre olarak gelen driver nesnesini, bu class'ta oluşturduğumuz
        // (9. satırdaki) driver nesnesine eşitledik. Bu şekilde yeniden boş bir
        // driver oluşturmak yerine, zaten halihazırda kullandığımız driver'ı bu nesneye
        // eşitlemiş olduk.
        PageFactory.initElements(driver,this);
    }

    @FindBy( name = "q" )
    public WebElement aramaKutusu;  // findElement
    /*
    @FindBy ( xpath = "//tbody/tr")
    public List<WebElement> liste;  // findElements (s harfine dikkat)
    */







}

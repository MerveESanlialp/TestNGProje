package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcTripHotelCreatePage {

    WebDriver driver;
    public FhcTripHotelCreatePage(WebDriver driver){
       this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy( id = "Code")
    public WebElement Code;

    @FindBy( id = "Name")
    public WebElement Name;

    @FindBy( id = "Address")
    public WebElement Address;

    @FindBy( id = "Phone")
    public WebElement Phone;

    @FindBy( id = "Email")
    public WebElement Email;

    @FindBy( id = "IDGroup")
    public WebElement IDGroup;

    @FindBy( id = "btnSubmit")
    public WebElement save;






}

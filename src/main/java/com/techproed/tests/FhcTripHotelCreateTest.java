package com.techproed.tests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ 	Keys.ENTER);
    }

    @Test
    public void Test(){
        giris();
        FhcTripHotelCreatePage fhcTripHotelCreatePage = new FhcTripHotelCreatePage(driver);
        fhcTripHotelCreatePage.Code.sendKeys("1234567");
        fhcTripHotelCreatePage.Name.sendKeys("Merve Sanlialap");
        fhcTripHotelCreatePage.Address.sendKeys("Entengasse");
        fhcTripHotelCreatePage.Phone.sendKeys("+12343565");
        fhcTripHotelCreatePage.Email.sendKeys("sjdjsb@gmail.com");
        Select select = new Select(fhcTripHotelCreatePage.IDGroup);
        select.selectByIndex(2);
        fhcTripHotelCreatePage.save.click();
    }

}

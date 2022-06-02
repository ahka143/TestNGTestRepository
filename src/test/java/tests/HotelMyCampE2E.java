package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class HotelMyCampE2E {

    @Test
    public void createHotel() throws InterruptedException {
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        //1.Tests packagenin altına class olusturun: CreateHotel
        //2.Bir metod olusturun: createHotel
        //3.https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //4.Login butonuna tiklayip Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //a. Username: manager
        //b. Password: Manager1!

       wait.until(ExpectedConditions.elementToBeClickable(hotelMyCampPage.birinciLoginButonu));
        hotelMyCampPage.birinciLoginButonu.click();
        hotelMyCampPage.userNameTextBox.sendKeys(ConfigReader.getProperty("hmcValidUserName"));
        hotelMyCampPage.passwordTextBox.sendKeys(ConfigReader.getProperty("hmcValidPassword"));

        //5.Login butonuna tıklayın.
        hotelMyCampPage.ikinciLoginButonu.click();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hotelMyCampPage.hotelManagementbutton.click();
        hotelMyCampPage.hotelListButonu.click();
        hotelMyCampPage.addHotelButonu.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        hotelMyCampPage.codeTextBox.sendKeys("12345");
        hotelMyCampPage.nameTextBox.sendKeys("ahmet");
        hotelMyCampPage.adressTextBox.sendKeys("elazig");
        hotelMyCampPage.phoneTextBox.sendKeys("353534445");
        hotelMyCampPage.emailTextBox.sendKeys("dffd@dgdfg.com");

        Select select = new Select(hotelMyCampPage.igGroupDDM);
        select.selectByValue("1");
        //8. Save butonuna tıklayın.
        hotelMyCampPage.saveButonu.click();
        wait.until(ExpectedConditions.elementToBeClickable(hotelMyCampPage.insertedText));
        hotelMyCampPage.insertedText.click();

        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelMyCampPage.insertedText.isDisplayed());
        //10. OK butonuna tıklayın.
        hotelMyCampPage.okButton.click();
        Driver.closeDriver();
    }
}

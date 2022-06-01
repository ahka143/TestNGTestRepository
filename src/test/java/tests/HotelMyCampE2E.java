package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampE2E {

    @Test
    public void createHotel() {
        HmcPage hmcPage =new HmcPage();
        //1.Tests packagenin altına class olusturun: CreateHotel
        //2.Bir metod olusturun: createHotel
        //3.https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //4.Login butonuna tiklayip Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //a. Username: manager
        //b. Password: Manager1!
        hmcPage.birinciLoginButonu.click();
        hmcPage.userNameTextBox.sendKeys(ConfigReader.getProperty("hmcValidUserName"));
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("hmcValidPassword"));

        //5.Login butonuna tıklayın.
        hmcPage.ikinciLoginButonu.click();
        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hmcPage.hotelManagementbutton.click();
        hmcPage.hotelListButonu.click();
        hmcPage.addHotelButonu.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        hmcPage.codeTextBox.sendKeys("12345");
        hmcPage.nameTextBox.sendKeys("ahmet");
        hmcPage.adressTextBox.sendKeys("elazig");
        hmcPage.phoneTextBox.sendKeys("353534445");
        hmcPage.emailTextBox.sendKeys("dffd@dgdfg.com");

        Select select=new Select(hmcPage.igGroupDDM);
        select.selectByValue("1");
        //8. Save butonuna tıklayın.
        hmcPage.saveButonu.click();
        hmcPage.insertedText.click();

        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hmcPage.insertedText.isDisplayed());
        //10. OK butonuna tıklayın.
        hmcPage.okButton.click();
    }
}

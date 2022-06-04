package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {
    BrcPage brcPage;

    @Test
    public void positiveLoginTest() {
        brcPage = new BrcPage();
// Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkloginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //login butonuna tikla

        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String expectedKullanici = ConfigReader.getProperty("brcValidUsername");
        String actualKullaci = brcPage.kullaniciAdiElementi.getText();

        Assert.assertEquals(actualKullaci,expectedKullanici,"Giris Yapilamadi");
        Driver.closeDriver();
    }
}

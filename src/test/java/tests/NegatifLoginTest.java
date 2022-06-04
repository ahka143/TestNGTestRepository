package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTest {

    BrcPage brcPage;
    @Test
    public void wrongPasswordTest() throws InterruptedException {
        brcPage=new BrcPage();
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkloginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        //login butonuna tikla

        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya  sekilde girilemedigini test et
       Assert.assertTrue(brcPage.ilkloginButonu.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void wrongEmailTest() throws InterruptedException {
        brcPage=new BrcPage();
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkloginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        //login butonuna tikla

        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya  sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ilkloginButonu.isDisplayed());
      Driver.closeDriver();


    }

    @Test
    public void wrongEmailAndPasswordTest() throws InterruptedException {
        brcPage=new BrcPage();
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcPage.ilkloginButonu.click();
        //test data user email: customer@bluerentalcars.com ,
        brcPage.emailTextBox.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        //test data password : 12345
        brcPage.passwordTextBox.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        //login butonuna tikla

        brcPage.ikinciLoginButonu.click();
        //Degerleri girildiginde sayfaya  sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ilkloginButonu.isDisplayed());
         Driver.closeDriver();


    }
}

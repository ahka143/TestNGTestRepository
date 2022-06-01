package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTest {

    BrcPage brcPage=new BrcPage();
    @Test
    public void wrongPasswordTest() throws InterruptedException {

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
       Thread.sleep(2000);
        Driver.closeDriver();
    }

    @Test
    public void wrongEmailTest() throws InterruptedException {
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
        Thread.sleep(3000);
     //  Driver.closeDriver();


    }

    @Test
    public void wrongEmailAndPasswordTest() throws InterruptedException {
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
        Thread.sleep(3000);
        // Driver.closeDriver();


    }
}

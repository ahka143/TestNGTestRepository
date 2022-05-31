package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Guru99Page;
import utilities.ConfigReader;
import utilities.Driver;

public class DemoGuruTest {
    @Test
    public void test01() {
        Guru99Page guru99Page = new Guru99Page();

        // http://demo.guru99.com/test/drag_drop.html url e git
        Driver.getDriver().get(ConfigReader.getProperty("guru99Url"));
        Actions actions = new Actions(Driver.getDriver());
        // DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.bankButonuElementi, guru99Page.debitAccountElementi).perform();
        // CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.salesButonu, guru99Page.creditAccountElementi).perform();
        // DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.birinciBesBinButonuElementi, guru99Page.debitAmountElementi).perform();
        // CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.ikinciBesBinButonuElementi, guru99Page.creditAmountElementi).perform();
        // Perfect butonun goruntulendigini dogrulayin
        Assert.assertTrue(guru99Page.perfectButonuElementi.isDisplayed());
        Driver.closeDriver();
    }
}

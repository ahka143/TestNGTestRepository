package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Guru99Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class DemoGuruTestsHtmlRapor extends TestBaseRapor {

    @Test
    public void test01() {

        extentTest=extentReports.createTest("Demo Guru Sitesi test ","Drag and Drop ozelligi calismali");
        Guru99Page guru99Page = new Guru99Page();

        // http://demo.guru99.com/test/drag_drop.html url e git
        Driver.getDriver().get(ConfigReader.getProperty("guru99Url"));
        extentTest.info("Basatili bir sekilde ana sayfaya gider");
        Actions actions = new Actions(Driver.getDriver());
        // DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.bankButonuElementi, guru99Page.debitAccountElementi).perform();
        extentTest.info("bank butonunu Debit side Account bolumune surukler");
        // CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.salesButonu, guru99Page.creditAccountElementi).perform();
        extentTest.info("Sales butonunu credit side Account bolumune surukler");
        // DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.birinciBesBinButonuElementi, guru99Page.debitAmountElementi).perform();
        extentTest.info("5000 butonunu Debit side Amound bolumune surukler");
        // CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
        actions.dragAndDrop(guru99Page.ikinciBesBinButonuElementi, guru99Page.creditAmountElementi).perform();
        extentTest.info("5000 butonunu credit side amount bolumune surukler");
        // Perfect butonun goruntulendigini dogrulayin
        Assert.assertTrue(guru99Page.perfectButonuElementi.isDisplayed());
        extentTest.pass("Perfect butonu goruntulendi");
        extentReports.flush();
        Driver.closeDriver();
    }
}

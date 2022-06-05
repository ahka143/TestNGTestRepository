package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class AmazonHucreTestiHtmlRapor extends TestBaseRapor {
AmazonPage amazonPage;
    @Test
    public void hucretesti()  {
        extentTest=extentReports.createTest("hucre sayisi");
        //webtable’da 3. satir 7.sutundaki yazinin “Home Services” yazisi
        //icerdigini test edin
        amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon anasayfaya gider");
        String expectedStr = "Home Services";
        String actualStr = hucredekiDatayiBul(3, 7);
        Assert.assertTrue(actualStr.contains(expectedStr));
        extentTest.pass("3.satir 7.sutunda 'Home Services ' icerdigini test eder.");
        Driver.closeDriver();
        extentReports.flush();

    }
    public String hucredekiDatayiBul(int satir, int sutun) {
        amazonPage = new AmazonPage();
        //AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
        //bana hucredeki yaziyi getirecek bir method olusturun

        return Driver.getDriver().findElement(By.xpath("//tr[" + satir + "]//td[" + sutun + "]")).getText();
    }

}

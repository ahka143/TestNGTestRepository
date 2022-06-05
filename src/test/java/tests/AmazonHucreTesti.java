package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonHucreTesti {
    AmazonPage amazonPage;

    @Test
    public void hucretesti()  {
        //webtable’da 3. satir 7.sutundaki yazinin “Home Services” yazisi
        //icerdigini test edin
        amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedStr = "Home Services";
        String actualStr = hucredekiDatayiBul(3, 7);
        Assert.assertTrue(actualStr.contains(expectedStr));
        Driver.closeDriver();

    }

    public String hucredekiDatayiBul(int satir, int sutun) {
        amazonPage = new AmazonPage();
        //AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
        //bana hucredeki yaziyi getirecek bir method olusturun

        return Driver.getDriver().findElement(By.xpath("//tr[" + satir + "]//td[" + sutun + "]")).getText();
    }
}

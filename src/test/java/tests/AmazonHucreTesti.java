package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonHucreTesti {
AmazonPage amazonPage;

    @Test
    public void testName() {
        //webtable’da 3. satir 2.sutundaki yazinin “Home Services” yazisi
        //icerdigini test edin
        amazonPage=new AmazonPage();



    }

    public String hucredekiDatayiBul(int satir, int sutun) {
amazonPage=new AmazonPage();
        //AmazonPage sayfasinda istedigim satir ve sutun sayisi ile cagirdigimda
        //bana hucredeki yaziyi getirecek bir method olusturun

        return   Driver.getDriver().findElement(By.xpath("//tr["+satir+"]//td["+sutun+"]")).getText();
    }
}

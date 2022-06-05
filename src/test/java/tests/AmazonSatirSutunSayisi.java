package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSatirSutunSayisi {
    AmazonPage amazonPage;

    @Test
    public void satirSayisi() {
        amazonPage = new AmazonPage();
        //Bu class’in altinda bir test method olusturun : satirSayisi() ve webtable’da 10 satir oldugunu
        //test edin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        Assert.assertEquals(amazonPage.anasayfaWebTableSatirlarElementi.size(), 10);
        Driver.closeDriver();
    }

    @Test
    public void sutunSayisi() {
        //Yeni bir method olusturun : sutunSayisi() ve yazi olan sutun sayisinin 7oldugunu test edin
        amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        int yaziliSutunSayisi = 0;
        for (int i = 0; i <amazonPage.anasayfaWebTableSutunlarElementi.size() ; i++) {
            if (!amazonPage.anasayfaWebTableSutunlarElementi.get(i).getText().isEmpty()){
                yaziliSutunSayisi++;
            }
        }
        Assert.assertEquals(yaziliSutunSayisi,7);
        Driver.closeDriver();
    }

}

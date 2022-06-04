package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.Facebookpage;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q2_DependsOn {
    /*
   birbirine bagimli testler olusturun..
   .beforClass olusturup setUp ayarlarini yapin..
     birbirine bagimli testler olusturarak;
         ilk once facebook a gidin
         sonra facebook a bagimli olarak google a gidin,
         daha sonra google a bagimli olarak amazon a gidin
   driver i kapatin
*/


    @Test(groups = "grup1")
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Driver.closeDriver();
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.closeDriver();
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }
}

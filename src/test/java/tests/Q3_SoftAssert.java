package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class Q3_SoftAssert {

    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     *     T1 : Choose price low to high with soft Assert
     *     T2 : Verify item prices are sorted from low to high with hard Assert
     */
    SaucedemoPage saucedemoPage ;

    @Test
    public void test01() {
        saucedemoPage=new SaucedemoPage();

        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));

        saucedemoPage.userNameElementi.sendKeys("standard_user");
        saucedemoPage.passwordElementi.sendKeys("secret_sauce");
        Actions actions = new Actions(Driver.getDriver());
        actions.click(saucedemoPage.loginButonuElementi).perform();

        SoftAssert softAssert = new SoftAssert();
        Select select = new Select(saucedemoPage.ddm);

        select.selectByValue("lohi");
        WebElement secim = select.getFirstSelectedOption();
        softAssert.assertTrue(secim.isDisplayed(), "low to high unselected");

        softAssert.assertAll();





        Assert.assertTrue(secim.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void test02() {
        saucedemoPage=new SaucedemoPage();

        Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));

        saucedemoPage.userNameElementi.sendKeys("standard_user");
        saucedemoPage.passwordElementi.sendKeys("secret_sauce");
        Actions actions = new Actions(Driver.getDriver());
        actions.click(saucedemoPage.loginButonuElementi).perform();
        Select select = new Select(saucedemoPage.ddm);

        select.selectByValue("lohi");

        List<Double> fiyatLarList=new ArrayList<>();

        for (WebElement each: saucedemoPage.fiyatListesi
             ) {
            fiyatLarList.add(Double.parseDouble(each.getText().replace("$","")));

        }
        System.out.println(fiyatLarList);

        for (int i = 0; i <saucedemoPage.fiyatListesi.size() ; i++) {
            Assert.assertEquals((Double.parseDouble(saucedemoPage.fiyatListesi.get(i).getText()
                    .replace("$",""))),fiyatLarList.get(i));
        }

    }
}

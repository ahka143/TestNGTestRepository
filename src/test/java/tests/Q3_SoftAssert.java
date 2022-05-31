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

public class Q3_SoftAssert {

    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     *     T1 : Choose price low to high with soft Assert
     *     T2 : Verify item prices are sorted from low to high with hard Assert
     */


    @Test
    public void test01() {
        SaucedemoPage saucedemoPage = new SaucedemoPage();

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
}

package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class RoomCreateTest {

    @Test
    public void RoomCreateTest() throws InterruptedException {
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
//1. Tests packagenin altına class olusturun: D18_HotelRoomCreation
//2. Bir metod olusturun: RoomCreateTest()
        //3.https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //4.Login butonuna tiklayip Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //a. Username: manager
        //b. Password: Manager1!

        wait.until(ExpectedConditions.elementToBeClickable(hotelMyCampPage.birinciLoginButonu));
        hotelMyCampPage.birinciLoginButonu.click();
        hotelMyCampPage.userNameTextBox.sendKeys(ConfigReader.getProperty("hmcValidUserName"));
        hotelMyCampPage.passwordTextBox.sendKeys(ConfigReader.getProperty("hmcValidPassword"));

        //5.Login butonuna tıklayın.
        hotelMyCampPage.ikinciLoginButonu.click();

//6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        hotelMyCampPage.hotelManagementbutton.click();
        hotelMyCampPage.hotelRoomsButonu.click();
        hotelMyCampPage.addHotelRoomButonu.click();

//7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Select select = new Select(hotelMyCampPage.odaSecimDDM);
        select.selectByValue("1033");
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB + "234")
                .sendKeys(Keys.TAB + "dsdg")
                .sendKeys(Keys.TAB + "dgfgsdf").perform();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", hotelMyCampPage.saveButonu);
        actions.sendKeys(Keys.TAB + "hjkhjk").perform();
        actions.dragAndDrop(hotelMyCampPage.odaUcretiUcYuz, hotelMyCampPage.ucretTextBox).perform();

        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB + "2")

                .sendKeys(Keys.TAB + "2").perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .perform();


//8. Save butonuna basin.

        hotelMyCampPage.saveButonu.click();
        wait.until(ExpectedConditions.elementToBeClickable(hotelMyCampPage.insertedText));
        hotelMyCampPage.insertedText.click();
//9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelMyCampPage.insertedText.isDisplayed());
//10. OK butonuna tıklayın.
        hotelMyCampPage.okButton.click();
//11. Hotel rooms linkine tıklayın.
        Driver.getDriver().navigate().refresh();
        actions.moveToElement(hotelMyCampPage.ikinciHotelRoomsButonu).click().perform();
//12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
        Assert.assertTrue(hotelMyCampPage.listOfHotelRoomsText.isDisplayed());
        Driver.closeDriver();
    }
}

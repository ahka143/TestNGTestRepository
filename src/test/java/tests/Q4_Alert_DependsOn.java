package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class Q4_Alert_DependsOn {

    @Test
    public void test01() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin

        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2. CLICK ME of JavaScript Alert e tıklayın
        Driver.getDriver().findElement(By.xpath("(//div[@class='section-title'])[1]")).click();
        // 3. pop up text i alın
        String actualPopupText = Driver.getDriver().switchTo().alert().getText();
        // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
        String expectedPopUpText = "I am an alert box!";
        Assert.assertEquals(actualPopupText, expectedPopUpText, "Popup text farkli");
        // 5. pop up i kabul edin
        Driver.getDriver().switchTo().alert().accept();
        Driver.closeDriver();


    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        // Yine ayni class da baska test methodu olusturun
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
        Driver.getDriver().findElement(By.xpath("(//div[@class='section-title'])[4]")).click();
        // 3.  pop up text i alın
        String actualPopUpText = Driver.getDriver().switchTo().alert().getText();
        // 4. Mesajın "Press a button!" olduğunu doğrulayın
        String expectedPopUpText = "Press a button!";
        Assert.assertEquals(actualPopUpText, expectedPopUpText, "PopUp mesaji farkli");
        // 5. Açılır pencereyi kapat
        Driver.getDriver().switchTo().alert().dismiss();
        // 6. pop up i iptal edin,
        // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
        WebElement cancelYazisiElementi = Driver.getDriver().findElement(By.xpath("//*[text()='You pressed Cancel!']"));
        Assert.assertTrue(cancelYazisiElementi.isDisplayed());
        // 8. alert1'e göre dependsOnMethods kullanın
        Driver.closeDriver();
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Facebookpage {
    public Facebookpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
    public WebElement kullaniciEmailKutusuElementi;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordGirisKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonuElementi;

    @FindBy(xpath = "//*[text()='Invalid username or password']")
    public WebElement girilemediyaziElementi;
}

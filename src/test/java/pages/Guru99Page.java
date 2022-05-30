package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Guru99Page {

    public Guru99Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='button button-orange'])[5]")
    public WebElement bankButonuElementi;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[2]")
    public WebElement debitAccountElementi;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[3]")
    public WebElement debitAmountElementi;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[4]")
    public WebElement creditAccountElementi;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[5]")
    public WebElement creditAmountElementi;

    @FindBy(xpath = "(//a[@class='button button-orange'])[6]")
    public WebElement salesButonu;

    @FindBy(xpath = "(//a[@class='button button-orange'])[2]")
    public WebElement birinciBesBinButonuElementi;

    @FindBy(xpath = "(//a[@class='button button-orange'])[4]")
    public WebElement ikinciBesBinButonuElementi;

    @FindBy(xpath = "(//a[@class='button button-green'])[1]")
    public WebElement perfectButonuElementi;

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {

    public HmcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Log in")
    public WebElement birinciLoginButonu;

    @FindBy(css = "#UserName")
    public WebElement userNameTextBox;

    @FindBy(css = "#Password")
    public WebElement passwordTextBox;

    @FindBy(css = "#btnSubmit")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = "//*[.='Hotel Management']")
    public WebElement hotelManagementbutton;

    @FindBy (xpath = "(//i[@class='icon-calendar'])[2]")
    public  WebElement hotelListButonu;

    @FindBy (xpath = "//*[.='Add Hotel ']")
    public WebElement addHotelButonu;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[1]")
    public WebElement codeTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[2]")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[3]")
    public WebElement adressTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[4]")
    public WebElement phoneTextBox;

    @FindBy(xpath = "(//input[@class='form-control input-lg required'])[5]")
    public WebElement emailTextBox;

    @FindBy (xpath = "//select[@id='IDGroup']")
    public WebElement igGroupDDM;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement saveButonu;

    @FindBy(className = "bootbox-body")
    public WebElement insertedText;

    @FindBy (className = "btn btn-primary")
    public WebElement okButton;


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//li[@id='navLogon']")
    public WebElement birinciLoginButonu;

   @FindBy(xpath = "//input[@class='form-control required']")
   public WebElement userNameTextBox;

   @FindBy(xpath = "//input[@class='form-control required password']")
   public WebElement passwordTextBox;

   @FindBy(xpath = "//input[@id='btnSubmit']")
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

    @FindBy(xpath = "//div[@class='bootbox-body']")
   public WebElement insertedText;

   @FindBy (xpath = "//button[@class='btn btn-primary']")
   public WebElement okButton;
}

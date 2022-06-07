package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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
    @FindBy (xpath = "(//i[@class='icon-calendar'])[3]")
    public  WebElement hotelRoomsButonu;

    @FindBy (xpath = "//span[@class='hidden-480']")
    public WebElement addHotelRoomButonu;

   @FindBy (xpath = "//*[.='Add Hotel ']")
   public WebElement addHotelButonu;

   @FindBy (xpath = "(//select[@class='form-control input-lg required'])[1]")
   public WebElement odaSecimDDM;

   @FindBy (xpath = "(//a[@class='label label-success'])[2]")
   public WebElement odaUcretiUcYuz;

   @FindBy (xpath = "//input[@class='form-control input-lg required ui-droppable']")
   public WebElement ucretTextBox;

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

   @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement listOfHotelRoomsText;

   @FindBy (xpath = "//*[text()='Hotelrooms']")
    public WebElement ikinciHotelRoomsButonu;


    @FindBy(tagName = "h1")
    public WebElement ourRestourantYazisi;

    @FindBy(xpath = "//div[@style='background-image: url(/siteTemplate/images/about.jpg);']")
    public WebElement solTaraftakiResim;

    @FindBy (xpath = "//div[@class='col-md-7 py-5 wrap-about pb-md-5 ftco-animate fadeInUp ftco-animated']")
    public  WebElement resminSagindakiAciklama;

    @FindBy (xpath = "//li[@id='navRestaurant']")
    public WebElement restourantSayfasiLinki;

    @FindBy (xpath = "//div[@class='col-md-6']")
    public List<WebElement> restourantMenuSutunList;



}

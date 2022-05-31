package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SaucedemoPage {

    public SaucedemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user-name")
    public WebElement userNameElementi;

    @FindBy(css = "input[id='password']")
    public WebElement passwordElementi;

    @FindBy(id = "login-button")
    public WebElement loginButonuElementi;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    public WebElement birinciUrunAddToChart;
    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    public WebElement ikinciUrunAddToChart;
    @FindBy(css = "#add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement ucuncuUrunAddToChart;
    @FindBy(css = "#add-to-cart-sauce-labs-fleece-jacket")
    public WebElement dorduncuUrunAddToChart;
    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    public WebElement besinciUrunAddToChart;
    @FindBy(css = "#add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement altinciUrunAddToChart;

    @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")
    public WebElement birinciUrunFiyatElementi;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[2]")
    public WebElement ikinciUrunFiyatElementi;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[3]")
    public WebElement ucuncuUrunFiyatElementi;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[4]")
    public WebElement dorduncuUrunFiyatElementi;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[5]")
    public WebElement besinciUrunFiyatElementi;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[6]")
    public WebElement altinciUrunFiyatElementi;

    @FindBy(css = ".product_sort_container")
    public WebElement ddm;
}

package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestOtomasyonuPage {

    public TestOtomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='search-input']")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucu;

    @FindBy(partialLinkText ="APPLEL")
    public WebElement ilkUrun;


    @FindBy(className = "menu-icon-text")
    public WebElement accountLink;

    @FindBy(id = "email")
    public WebElement emailLogin;

    @FindBy(id = "password")
    public WebElement passwordLogin;

    @FindBy(id = "submitlogin")
    public WebElement signinButton;

    @FindBy(className = "text-white")
    public WebElement wrongLogin;

    @FindBy(xpath = "//*[@class=' heading-sm mb-4']")
    public WebElement urunIsmi;

    @FindBy(xpath = "//*[@class='add-to-cart']")
    public WebElement addToCartLink;

    @FindBy(xpath = "(//*[@class='menu-icon-text'])[3]")
    public WebElement yourCartLink;

    @FindBy(xpath = "//*[@class='product-title text-center']")
    public WebElement sepettekiUrunIsmi;






}

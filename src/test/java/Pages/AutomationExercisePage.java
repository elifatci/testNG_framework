package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExercisePage {

    public AutomationExercisePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginButon;

    @FindBy(xpath = "(//*[@type='email'])[1]")
    public WebElement loginEmailKutusu;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement loginButonu;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedinAsLinki;

    @FindBy(partialLinkText = "ogout")
    public WebElement logOutLinki;

    @FindBy(className = "login-form")
    public WebElement loginToYourAccount;

    @FindBy(className = "signup-form")
    public WebElement newSignUpDogrulamasi;

    @FindBy(partialLinkText = "ccount")
    public WebElement deleteLinki;

    @FindBy(xpath = "//*[@style='color: red;']")
    public WebElement yanlisGirisText;

    @FindBy(xpath = "//*[@type='text']")
    public WebElement newUserIsimLinki;

    @FindBy(xpath = "(//*[@type='email'])[2]")
    public WebElement newUserMailLinki;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement newUserSignupButon;

    @FindBy(xpath = "//*[@style='color: red;']")
    public WebElement mailAdresiZatenMevcutText;

    @FindBy(className = "col-sm-4")
    public List<WebElement> anasayfaUrunListesi;

    @FindBy(partialLinkText = "Contact")
    public WebElement contactUs;

    @FindBy(xpath = "(//*[@class='title text-center'])[2]")
    public WebElement getInTouch;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement contactNameLinki;

    @FindBy(xpath = "//*[@name='submit']")
    public WebElement contactSubmit;

    @FindBy(xpath = "(//*[@style='display: block;'])[1]")
    public WebElement contactSuccessMessage;

    @FindBy(xpath = "//*[@class='fa fa-home']")
    public WebElement homeLinki;

    @FindBy(partialLinkText = "Cases")
    public WebElement testCaseLink;

    @FindBy(xpath = "//b")
    public WebElement testCaseText;

    @FindBy(partialLinkText = "Products")
    public WebElement productsButton;


    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    public WebElement firstProductViewProductLink;

    @FindBy(className = "product-information")
    public WebElement productDetail;

    @FindBy(id = "search_product")
    public WebElement searchProductBox;

    @FindBy(id = "submit_search")
    public WebElement searchSubmit;

    @FindBy(className = "features_items")
    public WebElement searchedProductsDetail;

    @FindBy(xpath = "//a[text()=' Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscriptionText;

    @FindBy(id = "susbscribe_email")
    public WebElement subscribeEmailBox;

    @FindBy(id = "success-subscribe")
    public WebElement successSubscribeText;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
    public WebElement firstProductAddToCart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShopping;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement secondProductAddToCart;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(className = "product_image")
    public List<WebElement> cartList;

    @FindBy(xpath = "(//td)[9]")
    public WebElement firstProductPrice;

    @FindBy(xpath = "(//td)[11]")
    public WebElement firstProductTotalPrice;

    @FindBy(xpath = "(//td)[15]")
    public WebElement secondProductPrice;

    @FindBy(xpath = "(//td)[17]")
    public WebElement secondProductTotalPrice;

    @FindBy(xpath = "(//td)[10]")
    public WebElement firstProductQuantity;

    @FindBy(xpath = "(//td)[16]")
    public WebElement secondProductQuantity;

    @FindBy(id = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//*[@class='btn btn-default cart']")
    public WebElement addToCart;

    @FindBy(className = "disabled")
    public WebElement cartQuantitySize;


}

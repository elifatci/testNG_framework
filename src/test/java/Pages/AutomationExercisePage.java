package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExercisePage {

    public AutomationExercisePage() {

        PageFactory.initElements(Driver.getDriver(), this);
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


    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")
    public WebElement firstProductAddToCartLink;

    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutLink;

    @FindBy(partialLinkText = "Register")
    public WebElement registerLoginLink;


    @FindBy(id = "id_gender2")
    public WebElement genderButton;

    @FindBy(partialLinkText = "ontinue")
    public WebElement continueButton;

    @FindBy(className = "checkout-information")
    public WebElement adressDetail;

    @FindBy(className = "form-control")
    public WebElement textArea;

    @FindBy(partialLinkText = "rder")
    public WebElement placeOrderButton;

    @FindBy(name = "name_on_card")
    public WebElement cardName;


    @FindBy(id = "submit")
    public WebElement payAndConfirmOrder;

    @FindBy(xpath = "(//*[@class='alert-success alert'])[1]")
    public WebElement successMessage;

    @FindBy(className = "cart_quantity_delete")
    public WebElement deleteProductButton;

    @FindBy(className = "product_image")
    public WebElement productImage;


    @FindBy(id = "accordian")
    public WebElement categoryTable;

    @FindBy(xpath = "(//a[@data-toggle='collapse'])[1]")
    public WebElement womenLink;

    @FindBy(xpath = "(//a[text()='Dress '])[1]")
    public WebElement categoryDressLink;

    @FindBy(css = ".title.text-center")
    public WebElement womenDressProductsText;

    @FindBy(xpath = "(//a[@data-toggle='collapse'])[2]")
    public WebElement menLink;

    @FindBy(xpath = "(//a[text()='Tshirts '])[1]")
    public WebElement menTshirtsLink;

    @FindBy(css = ".title.text-center")
    public WebElement menTshirtText;

    @FindBy(className = "brands_products")
    public WebElement brandsText;


    @FindBy(xpath = "//*[@class='pull-right']")
    public List<WebElement> brandsList;

    @FindBy(className = "features_items")
    public WebElement brandsPage;

    @FindBy(className = "features_items")
    public WebElement allProductsPage;

    @FindBy(css = ".title.text-center")
    public WebElement searchedProductsText;

    @FindBy(xpath = "(//*[@class='col-sm-12'])[1]")
    public WebElement writeYourReviewText;

    @FindBy(css = "#name")
    public WebElement writeYourNameBox;

    @FindBy(id = "button-review")
    public WebElement writeYourSubmitButton;

    @FindBy(css = ".alert-success.alert")
    public WebElement writeYourSuccessMessage;


    @FindBy(xpath = "(//*[@class='title text-center'])[2]")
    public WebElement recommendItemsText;

    @FindBy(xpath = "(//*[@data-product-id='4'])[3]")
    public WebElement recommendProductAddToCartLink;


    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement years;


    @FindBy(id = "first_name")
    public WebElement firstNameBox;

    @FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement createAccount;


    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedText;


    @FindBy(css = ".title.text-center")
    public WebElement accountDeleteText;

    @FindBy(className = "single-widget")
    public WebElement subscription;

    @FindBy(css = ".fa.fa-angle-up")
    public WebElement upwardButton;

    @FindBy(css = ".fa.fa-home")
    public WebElement homeButton;

    @FindBy(xpath = "(//*[text()='Full-Fledged practice website for Automation Engineers'])[1]")
    public WebElement advertisingText;








}

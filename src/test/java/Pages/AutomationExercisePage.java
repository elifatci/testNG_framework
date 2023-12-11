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
}

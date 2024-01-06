package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EasyBusPage {

    public EasyBusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(className = "sign-in")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(css="#password")
    public WebElement passwordBox;


    @FindBy(css = ".account-button.w-100")
    public WebElement logInButton;

    @FindBy(className = "title")
    public WebElement verifiedDashboard;

    @FindBy(css = ".iziToast-message.slideIn")
    public WebElement signalAlert;

    @FindBy(xpath = "//*[@class='cmn--btn btn--sm']")
    public WebElement buyTicketsButton;

    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[1]")
    public WebElement pickupPoint;

    @FindBy(xpath ="//*[@class='select2-results__option select2-results__option--selectable']")
    public List<WebElement> pickupPointList;

    @FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
    public WebElement droppingPoint;

    @FindBy(xpath = "//*[@class='select2-results__option select2-results__option--selectable']")
    public List<WebElement> droppingPointList;

    @FindBy(xpath = "(//*[@class='form--group'])[4]")
    public WebElement findTicketsButton;

    @FindBy(xpath = "//*[@class='btn btn--base']")
    public WebElement selectSeatButton;

    @FindBy(xpath = "//*[@data-seat='1-G1']")
    public WebElement seat;

    @FindBy(id = "female")
    public WebElement female;

    @FindBy(className = "book-bus-btn")
    public WebElement continueButton;

    @FindBy(id = "btnBookConfirm")
    public WebElement alertConfirm;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement alertOnay;

    @FindBy(xpath = "//*[@data-name='Stripe Hosted']")
    public WebElement payNow;

    @FindBy(xpath = "//*[text()='pay now']")
    public WebElement payNow2;

    @FindBy(xpath = "//*[@type='text']")
    public WebElement nameOnCard;


    @FindBy(xpath = "(//*[@type='tel'])[1]")
    public WebElement cardNumber;

    @FindBy(xpath = "(//*[@type='tel'])[2]")
    public WebElement expirationDate;

    @FindBy(xpath = "(//*[@type='tel'])[3]")
    public WebElement cvcCode;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement payNowCard;

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement verifiedTicket;


    @FindBy(xpath = "(//*[@class='has-sub-menu'])[3]")
    public WebElement profileLink;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutLink;

    @FindBy(xpath = "(//*[@class='has-sub-menu'])[2]")
    public WebElement supportRequestLink;

    @FindBy(xpath = "//*[text()='Create New']")
    public WebElement createNewLink;

    @FindBy(name = "subject")
    public WebElement requestsSubject;

    @FindBy(name = "priority")
    public WebElement prioritySelect;

    @FindBy(id = "inputMessage")
    public WebElement requestsMessage;

    @FindBy(id = "recaptcha")
    public WebElement requestsSubmit;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement successMessage;

    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> supportTicketsTables;

    @FindBy(xpath = "(//*[@alt='Logo'])[2]")
    public WebElement footerLogo;

    @FindBy(xpath = "(//*[@alt='Logo'])[1]")
    public WebElement headerLogo;

    @FindBy(xpath = "(//*[@class='title'])[2]")
    public WebElement everyJourneyText;







}

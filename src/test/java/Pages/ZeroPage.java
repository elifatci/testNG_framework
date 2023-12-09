package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPage {
    public ZeroPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "signin_button")
    public WebElement signinButtonu;

    @FindBy(id = "user_login")
    public WebElement userLoginKutusu;

    @FindBy(id = "user_password")
    public WebElement userPasswordKutusu;

    @FindBy(name = "submit")
    public WebElement signinTusu;

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBankingMenuLinki;

    @FindBy(id = "pay_bills_link")
    public WebElement payBillsLinki;

    @FindBy(partialLinkText = "urrency")
    public WebElement purchaseForeignLinki;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropDownMenu;

}

package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {
    public HerokuappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@onclick='jsAlert()']")
    public WebElement birinciAlertLinki;

    @FindBy(xpath = "//*[@onclick='jsConfirm()']")
    public WebElement ikinciAlertLinki;

    @FindBy(xpath = "//*[@onclick='jsPrompt()']")
    public WebElement ucuncuAlertLinki;

    @FindBy(id = "result")
    public WebElement cancelAlertText;
}

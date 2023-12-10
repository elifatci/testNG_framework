package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}

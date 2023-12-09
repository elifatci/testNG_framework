package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class QualitydemyPage {
    public QualitydemyPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Log in")
    public WebElement loginLinki;

    @FindBy(name = "email")
    public WebElement emailKutusu;

    @FindBy(name = "password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement loginButonu;

    @FindBy(className = "toast-message")
    public WebElement hataliGirisMesaji;


}

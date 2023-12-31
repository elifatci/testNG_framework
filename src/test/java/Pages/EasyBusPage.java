package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EasyBusPage {

    public EasyBusPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(className = "sign-in")
    public WebElement signInButton;
}

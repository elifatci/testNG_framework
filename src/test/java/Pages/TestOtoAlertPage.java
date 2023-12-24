package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestOtoAlertPage {

    public TestOtoAlertPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='j-button'])[1]")
    public WebElement birinciAlert;

    @FindBy(xpath = "(//*[@class='j-button'])[2]")
    public WebElement ikinciAlert;

    @FindBy(xpath = "(//*[@class='j-button'])[3]")
    public WebElement ucuncuAlert;

    @FindBy(id = "result")
    public WebElement resultText;
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationTesting {

    public AutomationTesting(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#menu-item-40") public WebElement linkShop;
    @FindBy(linkText = "Home") public WebElement menuHome;
    @FindBy(xpath = "(//*[@class='n2-ow'])[1]") public WebElement iconSliderRight;
    @FindBy(xpath = "(//*[@class='n2-ow'])[2]") public WebElement iconSliderLeft;
    @FindBy(className = "pull-down") public WebElement iconPullDown;

}

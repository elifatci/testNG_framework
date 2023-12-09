package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//*[@data-cy='title-recipe'])[2]")
    public WebElement ilkUrunLinki;

    @FindBy(id = "corePrice_desktop")
    public WebElement ilkUrunFiyati;
}

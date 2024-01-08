package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> TabloSatir;

    @FindBy(xpath = "//tr[1]//*[@class='nav_a']")
    public List<WebElement> TabloSutun;

    @FindBy(xpath = "//*[text()='Women']")
    public WebElement womenLink;

    @FindBy(name = "sortBy")
    public WebElement sortByMenu;

    @FindBy(xpath = "(//*[@class='relative group'])[19]")
    public WebElement product;

    @FindBy(xpath = "(//*[@href='/_next/static/assets/icons/chevron-right.svg#icon'])[28]")
    public WebElement productIcon;
}

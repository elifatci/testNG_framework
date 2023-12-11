package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestOtomasyonuPage {

    public TestOtomasyonuPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='search-input']")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucu;

    @FindBy(xpath = "(//*[@class='lazy'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//*[@class=' heading-sm mb-4']")
    public WebElement urunIsmi;
}

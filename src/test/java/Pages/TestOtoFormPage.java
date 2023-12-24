package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestOtoFormPage {

    public TestOtoFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='form-control'])[3]")
    public WebElement dogumTarihiGun;


    @FindBy(xpath = "(//*[@class='form-control'])[4]")
    public WebElement dogumTarihiAy;


    @FindBy(xpath = "(//*[@class='form-control'])[5]")
    public WebElement dogumTarihiYil;

}

package tests.testNG_8;

import Pages.TestOtomasyonuPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ConcurrentModificationException;

public class T1 {

    TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
    @Test
    public void gecerliMailGecersizPassword(){

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- login linkine basin
        testOtomasyonuPage.accountLink.click();
        testOtomasyonuPage.emailLogin.sendKeys(ConfigReader.getProperty("toGecerliMail"));
        testOtomasyonuPage.passwordLogin.sendKeys(ConfigReader.getProperty("toGecersizPassword"));
        //4- Login butonuna basarak login olun
        testOtomasyonuPage.signinButton.click();
        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testOtomasyonuPage.wrongLogin.isDisplayed());
    }

    @Test
    public void gecersizMailGecerliPassword(){
    Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    testOtomasyonuPage.accountLink.click();
    testOtomasyonuPage.emailLogin.sendKeys(ConfigReader.getProperty("toGecersizMail"));
    testOtomasyonuPage.passwordLogin.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
    testOtomasyonuPage.signinButton.click();
    Assert.assertTrue(testOtomasyonuPage.wrongLogin.isDisplayed());

    }

    @Test
    public void gecersizMailGecersizPassword(){

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        testOtomasyonuPage.accountLink.click();
        testOtomasyonuPage.emailLogin.sendKeys(ConfigReader.getProperty("toGecersizMail"));
        testOtomasyonuPage.passwordLogin.sendKeys(ConfigReader.getProperty("toGecersizPassword"));
        testOtomasyonuPage.signinButton.click();
        Assert.assertTrue(testOtomasyonuPage.wrongLogin.isDisplayed());
    }
}

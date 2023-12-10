package tests.testNG_2;

import Pages.HerokuappPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class T7 {

    @Test
    public void AlertTestiText(){
        //1. Test
        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("herokuappUrl"));

        //- 1.alert'e tiklayin
        HerokuappPage herokuappPage=new HerokuappPage();
        herokuappPage.birinciAlertLinki.click();
        //- Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        String expectedText=ConfigReader.getProperty("birinciAlertText");
        String actualText=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedText,actualText,"Alert yazisi bekleneni icermiyor");
        //- OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
    }

    @Test
    public void AlertTestiCancel(){
        //2.Test
        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("herokuappUrl"));
        //- 2.alert'e tiklayalim
        HerokuappPage herokuappPage=new HerokuappPage();
        herokuappPage.ikinciAlertLinki.click();
        //- Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        Driver.getDriver().switchTo().alert().dismiss();
        String expectedTtext=ConfigReader.getProperty("ikinciAlertCancelText");
        String actualText=herokuappPage.cancelAlertText.getText();
        Assert.assertEquals(expectedTtext,actualText,"Cikan sonuc yazisi mevcut icerikle ayni degildir");

    }

    @Test
    public void AlertTestiSonucYazisi(){

        //3.Test
        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("herokuappUrl"));

        //- 3.alert'e tiklayalim
        HerokuappPage herokuappPage=new HerokuappPage();
        herokuappPage.ucuncuAlertLinki.click();
        //- Cikan prompt ekranina "Abdullah" yazdiralim
        Driver.getDriver().switchTo().alert().sendKeys(ConfigReader.getProperty("promptEkraninaYazilanText"));

        //- OK tusuna basarak alert'i kapatalim
        Driver.getDriver().switchTo().alert().accept();
        //- Cikan sonuc yazisinin Abdullah icerdigini test edelim
        Assert.assertTrue(herokuappPage.cancelAlertText.getText().contains(ConfigReader.getProperty("promptEkraninaYazilanText")),"Sonuc yazisi yazilani icermemektedir");
    }


}

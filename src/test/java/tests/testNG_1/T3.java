package tests.testNG_1;

import Pages.FacebookPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class T3 {


    @Test
    public void girisTesti(){
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        //2- POM’a uygun olarak email, sifre kutularini ve giris
        //yap butonunu locate edin
        //3- Faker class’ini kullanarak email ve sifre
        //degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButonu.click();
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.yanlisGirisUyarisi.isDisplayed());

        Driver.closeDriver();
    }

}

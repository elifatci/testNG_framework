package tests.testNG_8;

import Pages.TestOtomasyonuPage;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ConcurrentModificationException;

public class T2 {
    TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
    @Test
    public void test01(){
        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- phone icin arama yapin
        testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);
        //3- Listelenen sonuclardan ilkini tiklayin
        testOtomasyonuPage.ilkUrun.click();
        //4- urun ismini kaydedin ve sepete ekleyin
        String expectedUrunIsmi=testOtomasyonuPage.urunIsmi.getText();
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",testOtomasyonuPage.addToCartLink);
        //5- your cart linkine tiklayin
        testOtomasyonuPage.yourCartLink.click();
        //6- kaydettiginiz urun ismi ile sepetteki urun isminin ayni oldugunu test edin
        Assert.assertEquals(expectedUrunIsmi,testOtomasyonuPage.sepettekiUrunIsmi.getText(),"Kaydedilen urun ismi sepetteki urun ismiyle ayni degil");
        //7- sayfayi kapatin
        Driver.closeDriver();

    }
}

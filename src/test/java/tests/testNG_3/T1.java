package tests.testNG_3;

import Pages.TestOtomasyonuPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class T1 extends TestBaseRapor {

    @Test
    public void test01(){
        extentTest=extentReports.createTest("Arama testi","Kullanici belirlenen aramayi yapip, dogru arama yapildigini test eder");
        // testotomasyonu ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanici testotomasyonu ana sayfasina gider");
        // belirlenen arama kelimesi icin arama yapin
        TestOtomasyonuPage testOtomasyonuPage=new TestOtomasyonuPage();
        testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);
        extentTest.info("belirlenen kelime icin arama yapar");
        // arama sonucunda urun bulunabildigini test edin
        String aramaSonucStr=testOtomasyonuPage.aramaSonucu.getText().replaceAll("\\D","");
        int sonuc=Integer.parseInt(aramaSonucStr);
        Assert.assertTrue(sonuc>0,"arama sonucunda urun bulunamadi");
        extentTest.pass("arama sonucunda urun bulunabildigini test eder");
        // ilk urunu tiklayin
        testOtomasyonuPage.ilkUrun.click();
        extentTest.info("ilk urune tiklar");
        // acilan urun sayfasinda urun isminin
        // case sensitive olmadan belirlenen arama kelimesi icerdigini test edin
        String expectedIcerik="phone";
        String actualIcerik=testOtomasyonuPage.urunIsmi.getText().toLowerCase();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik),"urun belirlenen kelimeyi icermemektedir");
        extentTest.pass(" acilan urun sayfasinda urun isminin \ncase sensitive olmadan belirlenen arama kelimesi icerdigini test eder");






    }
}

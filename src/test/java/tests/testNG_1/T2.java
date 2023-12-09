package tests.testNG_1;

import Pages.AmazonPage;
import org.bouncycastle.pqc.crypto.util.PQCOtherInfoGenerator;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class T2 {
    //● https://www.amazon.com/ adresine gidin.
    //1. Test : Amazon ana sayfaya gittiginizi test edin
    //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
    //ve aramanizin gerceklestigini Test edin
    //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $15.62
    //oldugunu test edin

    @Test
    public void anaSayfaTesti() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Thread.sleep(10000);
        String expectedUrl="https://www.amazon.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    @Test(dependsOnMethods = "anaSayfaTesti")
    public void aramaTesti(){
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Test(dependsOnMethods = "aramaTesti")
    public void fiyatTesti(){
    AmazonPage amazonPage=new AmazonPage();
    amazonPage.ilkUrunLinki.click();
    String expectedFiyat="$15.62";
    String actualFiyat=amazonPage.ilkUrunFiyati.getText();
    Assert.assertTrue(actualFiyat.contains(expectedFiyat));
    }
}

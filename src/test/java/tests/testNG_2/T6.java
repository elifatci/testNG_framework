package tests.testNG_2;

import Pages.AmazonPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.ArrayList;
import java.util.List;

public class T6 {
    @Test
    public void satirSayisi() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.Wait(9);
        // satirSayisi( ) ve webtable’da 10 satir oldugunu test edin
        AmazonPage amazonPage = new AmazonPage();
        List<String> satirStr = new ArrayList<>();
        for (int i = 0; i < amazonPage.TabloSatir.size(); i++) {
            satirStr.add(amazonPage.TabloSatir.get(i).getText());
            System.out.println(i + 1 + ". satir elemanlari :" + satirStr.get(i));
        }

        Assert.assertTrue(amazonPage.TabloSatir.size() == 10, "Satir sayisi 10'a esit degildir");

    }

    @Test
    public void sutunSayisi() {
        // Yeni bir method olusturun : sutunSayisi( ) ve yazi olan sutun sayisinin 7oldugunu test edin
        AmazonPage amazonPage = new AmazonPage();
        Assert.assertTrue(amazonPage.TabloSutun.size() == 7, "Sutun sayisi 7'ye esit degildir");
    }
}

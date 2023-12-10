package tests.testNG_1;

import Pages.QualitydemyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;


public class T4 {

    @Test(groups = {"regression"})
    public void negatifTest() throws InterruptedException {
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qualityUrl"));
        //2- login linkine basin
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.loginLinki.click();
        //3- Kullanici email'i olarak gecersiz email girin
        qualitydemyPage.emailKutusu.sendKeys("ee@ee.com");
        //4- Kullanici sifresi olarak gecerisz sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("11");
        //5- Login butonuna basarak login olun
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",qualitydemyPage.loginButonu);
        //6- Basarili olarak giris yapilamadigini test edin
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(qualitydemyPage.hataliGirisMesaji));
        Assert.assertTrue(qualitydemyPage.hataliGirisMesaji.isDisplayed());

    }
}

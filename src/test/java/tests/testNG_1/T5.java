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

public class T5 {
    //NegativeTest
    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin login sayfasinin acildigini test edin
    //3- 3 farkli test method’u olusturun.
    //- gecerli username, gecersiz password
    //- gecersiz username, gecerli password
    //- gecersiz username, gecersiz password.
    //4- Login butonuna basarak login olun
    //5- Basarili olarak giris yapilamadigini test edin

    @Test
    public void loginTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("qualityUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.loginLinki.click();
        String expectedTitle = "Login | QualityDemy";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 1)
    public void gecerliUsernameTesti() {
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.emailKutusu.sendKeys("ee@ee.com");
        qualitydemyPage.passwordKutusu.sendKeys("000");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",qualitydemyPage.loginButonu);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(qualitydemyPage.hataliGirisMesaji));
        Assert.assertTrue(qualitydemyPage.hataliGirisMesaji.isDisplayed());


    }

    @Test(priority = 2)
    public void gecerliPasswordTesti() {
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.emailKutusu.sendKeys("ee@ee.com");
        qualitydemyPage.passwordKutusu.sendKeys("11");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",qualitydemyPage.loginButonu);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(qualitydemyPage.hataliGirisMesaji));
        Assert.assertTrue(qualitydemyPage.hataliGirisMesaji.isDisplayed());

    }

    @Test(priority = 3)
    public void gecersizUsernameGecersizPasswordTesti() {
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.emailKutusu.sendKeys("ee@de.com");
        qualitydemyPage.passwordKutusu.sendKeys("0000");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",qualitydemyPage.loginButonu);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(qualitydemyPage.hataliGirisMesaji));
        Assert.assertTrue(qualitydemyPage.hataliGirisMesaji.isDisplayed());
        Driver.closeDriver();

    }
}

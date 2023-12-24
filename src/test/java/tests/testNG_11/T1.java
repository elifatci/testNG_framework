package tests.testNG_11;

import Pages.TestOtoAlertPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T1 {

    TestOtoAlertPage testOtoAlertPage = new TestOtoAlertPage();


    @Test
    public void test01() {
        //- https://testotomasyonu.com/javascriptAlert adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toAlertUrl"));
        //- 1.alert'e tiklayin
        testOtoAlertPage.birinciAlert.click();
        //- Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        String expectedAlert = "I am a JS Alert";
        String actualAlert = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlert, expectedAlert);
        //- OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
    }

    @Test
    public void test02() {

        //- 2.alert'e tiklayalim
        testOtoAlertPage.ikinciAlert.click();
        //- Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        Driver.getDriver().switchTo().alert().dismiss();
        String expectedText="You clicked: Cancel";
        String actualText=testOtoAlertPage.resultText.getText();
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void test03() {

        //- 3.alert'e tiklayalim
        testOtoAlertPage.ucuncuAlert.click();
        //- Cikan prompt ekranina "Abdullah" yazdiralim
        Driver.getDriver().switchTo().alert().sendKeys("Abdullah");
        //- OK tusuna basarak alert'i kapatalim
        Driver.getDriver().switchTo().alert().accept();
        //- Cikan sonuc yazisinin Abdullah icerdigini test edelim
        Assert.assertTrue(testOtoAlertPage.resultText.getText().contains("Abdullah"));
    }

}

package tests.testNG_2;

import Pages.AutomationExercisePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T3 {
    @Test
    public void exercise03(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle= ConfigReader.getProperty("automationAnasayfaTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"Anasayfa basarili bir sekilde goruntulenemedi");
        //4. Click on 'Signup / Login' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.signUpLoginButon.click();
        //5. Verify 'Login to your account' is visible
        softAssert.assertTrue(automationExercisePage.loginToYourAccount.isDisplayed(),"Hesabiniza giris yapin secenegi gorunur degil");
        //6. Enter incorrect email address and password
        automationExercisePage.loginEmailKutusu.sendKeys("ee@ee.com");
        automationExercisePage.passwordKutusu.sendKeys("12");
        //7. Click 'login' button
        automationExercisePage.loginButonu.click();
        //8. Verify error 'Your email or password is incorrect!' is visible
        softAssert.assertTrue(automationExercisePage.yanlisGirisText.isDisplayed(),"Hatali giris yapildi yazisi gorunur degil");
    }
}

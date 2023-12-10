package tests.testNG_2;

import Pages.AutomationExercisePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T5 {
    @Test
    public void exercise05(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedUrl=ConfigReader.getProperty("automationCurrentUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrl,"Anasayfaya goruntulenemedi");
        //4. Click on 'Signup / Login' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.signUpLoginButon.click();
        //5. Verify 'New User Signup!' is visible
        softAssert.assertTrue(automationExercisePage.newSignUpDogrulamasi.isDisplayed(),"Yeni kullanici kaydi secenegi gorunur degil");
        //6. Enter name and already registered email address
        automationExercisePage.newUserIsimLinki.sendKeys("elif");
        automationExercisePage.newUserMailLinki.sendKeys("ee@we.com");
        //7. Click 'Signup' button
        automationExercisePage.newUserSignupButon.click();
        //8. Verify error 'Email Address already exist!' is visible
        softAssert.assertTrue(automationExercisePage.mailAdresiZatenMevcutText.isDisplayed(),"Mail adresi zaten mevcut yazisi gorunmedi");
        Driver.closeDriver();
    }
}

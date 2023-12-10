package tests.testNG_2;

import Pages.AutomationExercisePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T4 {
    @Test
    public void exercise04(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationAnasayfaTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"Anasayfa goruntulenemedi");
        //4. Click on 'Signup / Login' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.signUpLoginButon.click();
        //5. Verify 'Login to your account' is visible
        softAssert.assertTrue(automationExercisePage.loginToYourAccount.isDisplayed(),"Hesabiniza giris yapin secenegi gorunur degil");
        //6. Enter correct email address and password
        automationExercisePage.loginEmailKutusu.sendKeys("ee@we.com");
        automationExercisePage.passwordKutusu.sendKeys("12");
        //7. Click 'login' button
        automationExercisePage.loginButonu.click();
        //8. Verify that 'Logged in as username' is visible
        softAssert.assertTrue(automationExercisePage.loggedinAsLinki.isDisplayed(),"Kullanici adi ile oturum acildigi dogrulanamadi");
        //9. Click 'Logout' button
        automationExercisePage.logOutLinki.click();
        //10. Verify that user is navigated to login page
        expectedTitle=ConfigReader.getProperty("automationLoginTitle");
        actualTitle=Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle,"Giris sayfasina yonlendirilemedi");
    }
}

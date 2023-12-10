package tests.testNG_2;

import Pages.AutomationExercisePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;


public class T2 {

    @Test
    public void exercise2(){
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
        softAssert.assertTrue(automationExercisePage.loginToYourAccount.isDisplayed(),"Hesabiniza giris yapin sekmesi gorunur degil");
        //6. Enter correct email address and password
        automationExercisePage.loginEmailKutusu.sendKeys("ee@ez.com");
        automationExercisePage.passwordKutusu.sendKeys("11");
        //7. Click 'login' button
        automationExercisePage.loginButonu.click();
        //8. Verify that 'Logged in as username' is visible
        softAssert.assertTrue(automationExercisePage.loggedinAsLinki.isDisplayed(),"Kullanici adiyla oturum acildigi secenegi görünür degil");
        //9. Click 'Delete Account' button
        automationExercisePage.deleteLinki.click();

        Driver.closeDriver();

    }
}

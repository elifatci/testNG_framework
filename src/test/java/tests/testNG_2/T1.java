package tests.testNG_2;

import Pages.AutomationExercisePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class T1 {

    @Test
    public void exercise1(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"Bulundugunuz sayfa anasayfa degil");
        //4. Click on 'Signup / Login' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.signUpLoginButon.click();
        //5. Verify 'Login to your account' is visible
            String expectedUrl=ConfigReader.getProperty("automationLoginUrl");
            String actualUrl=Driver.getDriver().getCurrentUrl();
            softAssert.assertEquals(actualUrl,expectedUrl,"Login sayfasina girilemedi");
        //6. Enter correct email address and password
        automationExercisePage.loginEmailKutusu.sendKeys("ee@ez.com");
        automationExercisePage.passwordKutusu.sendKeys("11");

        //7. Click 'login' button
        automationExercisePage.loginButonu.click();
        //8. Verify that 'Logged in as username' is visible
        softAssert.assertTrue(automationExercisePage.loggedinAsLinki.isDisplayed(),"Giris yapilamadi");
        //9. Click 'Logout' button
        automationExercisePage.logOutLinki.click();
        //10. Verify that user is navigated to login page
        expectedTitle=ConfigReader.getProperty("automationLoginTitle");
        actualTitle=Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle,"Giris sayfasi acilamadi");
    }

}

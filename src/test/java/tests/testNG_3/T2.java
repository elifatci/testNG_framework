package tests.testNG_3;

import Pages.AutomationExercisePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class T2 extends TestBaseRapor {

    @Test
    public void exercise06(){
        extentTest=extentReports.createTest("Mesaj gonderme testi","Kullanici mesaj gonderip, basarili sekilde mesaj gonderildigini test eder");
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationAnasayfaTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"Anasayfa goruntulenemedi");
        extentTest.pass("Anasayfa goruntuleme testi yapar");
        //4. Click on 'Contact Us' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.contactUs.click();
        //5. Verify 'GET IN TOUCH' is visible
        softAssert.assertTrue(automationExercisePage.getInTouch.isDisplayed(),"Get in touch is not visible");
        //6. Enter name, email, subject and message
        // 7. Upload file
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(automationExercisePage.contactNameLinki)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("tesekkur")
                .sendKeys(Keys.TAB)
                .sendKeys("thank u!")
                .sendKeys(Keys.TAB)
                .sendKeys("\"C:\\Users\\Elif\\Downloads\\logo.png\"").perform();

        //8. Click 'Submit' button
        automationExercisePage.contactSubmit.click();
        //9. Click OK button
        Driver.getDriver().switchTo().alert().accept();
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        softAssert.assertTrue(automationExercisePage.contactSuccessMessage.isDisplayed(),"Message is not visible");
        //11. Click 'Home' button and verify that landed to home page successfully
        automationExercisePage.homeLinki.click();
        softAssert.assertEquals(actualTitle,expectedTitle,"Anasayfa goruntulenemedi");
        extentTest.pass("Ana sayfaya basarili sekilde gidildigini test eder");
    }
}

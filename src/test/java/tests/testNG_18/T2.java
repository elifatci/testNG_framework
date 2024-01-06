package tests.testNG_18;

import Pages.AutomationExercisePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T2 {

    @Test
    public void exercise24(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle="Automation Exercise";
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);
        //4. Scroll down page to bottom
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        //5. Verify 'SUBSCRIPTION' is visible
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        SoftAssert softAssert1=new SoftAssert();
        softAssert.assertTrue(automationExercisePage.subscription.isDisplayed());
        //6. Click on arrow at bottom right side to move upward
        automationExercisePage.upwardButton.click();
        //7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        softAssert.assertTrue(automationExercisePage.homeButton.isDisplayed());
        softAssert1.assertTrue(automationExercisePage.advertisingText.isDisplayed());
    }
}

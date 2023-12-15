package tests.testNG_6;

import Pages.AutomationExercisePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T2 {

    @Test
    public void exercise11(){
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationHomePageTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"Homepage is not visible");
        //4. Click 'Cart' button
        automationExercisePage.cartButton.click();
        //5. Scroll down to footer
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        //6. Verify text 'SUBSCRIPTION'
        softAssert.assertTrue(automationExercisePage.subscriptionText.isDisplayed(),"subscription text is not verify");
        //7. Enter email address in input and click arrow button
        automationExercisePage.subscribeEmailBox.sendKeys(ConfigReader.getProperty("istenenEmail"));
        //8. Verify success message 'You have been successfully subscribed!' is visible
        String expectedMessage = "You have been successfully subscribed!";
        String actualMessage=automationExercisePage.successSubscribeText.getText();
        softAssert.assertEquals(actualMessage,expectedMessage,"Message is not visible");
        Driver.closeDriver();
    }
}

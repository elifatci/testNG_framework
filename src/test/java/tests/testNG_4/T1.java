package tests.testNG_4;

import Pages.AutomationExercisePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Test
   public void exercise07(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedUrl="http://automationexercise.com";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrl,"homepage is not visible success");
        //4. Click on 'Test Cases' button
        automationExercisePage.testCaseLink.click();
        //5. Verify user is navigated to test cases page successfully
        softAssert.assertTrue(automationExercisePage.testCaseText.isDisplayed(),"user is not navigated to test case page");
    }

}

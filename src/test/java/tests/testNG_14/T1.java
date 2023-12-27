package tests.testNG_14;

import Pages.AutomationExercisePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;


public class T1 {

    @Test
    public void exercise19(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Click on 'Products' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.productsButton.click();
        //4. Verify that Brands are visible on left side bar
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",automationExercisePage.brandsText);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(automationExercisePage.brandsText.isDisplayed());
        //5. Click on any brand name
        automationExercisePage.brandsList.get(0).click();
        //6. Verify that user is navigated to brand page and brand products are displayed
        softAssert.assertTrue(automationExercisePage.brandsPage.isDisplayed());
        //7. On left side bar, click on any other brand link
        js.executeScript("arguments[0].scrollIntoView(true);",automationExercisePage.brandsText);
        js.executeScript("arguments[0].click();",automationExercisePage.brandsList.get(3));
        //8. Verify that user is navigated to that brand page and can see products
        softAssert.assertTrue(automationExercisePage.brandsPage.isDisplayed());
    }
}

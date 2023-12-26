package tests.testNG_13;

import Pages.AutomationExercisePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T1 {

    @Test
    public void exercise18() {
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that categories are visible on left side bar
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", automationExercisePage.categoryTable);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(automationExercisePage.categoryTable.isDisplayed());
        //4. Click on 'Women' category
        automationExercisePage.womenLink.click();
        //5. Click on any category link under 'Women' category, for example: Dress
        automationExercisePage.categoryDressLink.click();
        //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        softAssert.assertTrue(automationExercisePage.womenDressProductsText.isDisplayed());
        //7. On left side bar, click on any sub-category link of 'Men' category
        automationExercisePage.menLink.click();
        automationExercisePage.menTshirtsLink.click();
        //8. Verify that user is navigated to that category page
        softAssert.assertTrue(automationExercisePage.menTshirtText.isDisplayed());
    }
}

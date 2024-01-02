package tests.testNG_17;

import Pages.AutomationExercisePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    @Test
    public void exercise22(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Scroll to bottom of page
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",automationExercisePage.recommendItemsText);
        //4. Verify 'RECOMMENDED ITEMS' are visible
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(automationExercisePage.recommendItemsText.isDisplayed());
        //5. Click on 'Add To Cart' on Recommended product
        automationExercisePage.recommendProductAddToCartLink.click();
        //6. Click on 'View Cart' button
        automationExercisePage.viewCart.click();
        //7. Verify that product is displayed in cart page
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    }
}

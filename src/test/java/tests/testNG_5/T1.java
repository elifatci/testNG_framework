package tests.testNG_5;

import Pages.AutomationExercisePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Test
    public void exrecise08(){

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle="Automation Exercise";
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"homepage is not visible");
        //4. Click on 'Products' button
        automationExercisePage.productsButton.click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
            expectedTitle="Automation Exercise - All Products";
            actualTitle=Driver.getDriver().getTitle();
            softAssert.assertEquals(actualTitle,expectedTitle,"user is not visible ALL PRODUCTS page");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",automationExercisePage.firstProductViewProductLink);
        //6. The products list is visible
        //7. Click on 'View Product' of first product
        automationExercisePage.firstProductViewProductLink.click();
        //8. User is landed to product detail page
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        softAssert.assertTrue(automationExercisePage.productDetail.isDisplayed(),"product detail is not visible");
    }
}

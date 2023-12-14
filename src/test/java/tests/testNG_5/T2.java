package tests.testNG_5;

import Pages.AutomationExercisePage;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T2 {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Test
    public void exercise09(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationHomePageTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"homepage is not visible");
        //4. Click on 'Products' button
        automationExercisePage.productsButton.click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        expectedTitle="Automation Exercise - All Products";
        actualTitle=Driver.getDriver().getTitle();
        softAssert.assertEquals(actualTitle,expectedTitle,"All Products page is not visible");
        //6. Enter product name in search input and click search button
        automationExercisePage.searchProductBox.sendKeys("dress");
        automationExercisePage.searchSubmit.click();
        //7. Verify 'SEARCHED PRODUCTS' is visible
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("search="),"searched products is not visible");
        //8. Verify all the products related to search are visible
        softAssert.assertTrue(automationExercisePage.searchedProductsDetail.isDisplayed(),"all the products related to search are not visible");
    }
}

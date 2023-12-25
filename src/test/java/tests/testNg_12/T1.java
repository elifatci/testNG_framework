package tests.testNg_12;

import Pages.AutomationExercisePage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {
    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Test
    public void exercise17(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationHomePageTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"homepage is not visible");
        //4. Add products to cart
        automationExercisePage.firstProductAddToCart.click();
        //5. Click 'Cart' button
        automationExercisePage.continueShopping.click();
        automationExercisePage.cartButton.click();
        //6. Verify that cart page is displayed
        String expectedContent="view_cart";
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedContent),"cart page is not displayed");
        //7. Click 'X' button corresponding to particular product
        automationExercisePage.deleteProductButton.click();
        //8. Verify that product is removed from the cart
        softAssert.assertFalse(automationExercisePage.productImage.isDisplayed());
    }
}

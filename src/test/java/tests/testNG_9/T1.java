package tests.testNG_9;

import Pages.AutomationExercisePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    @Test
    public void exercise13(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationHomePageTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"homepage is not visible");
        //4. Click 'View Product' for any product on home page
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",automationExercisePage.firstProductViewProductLink);

        //5. Verify product detail is opened
        softAssert.assertTrue(automationExercisePage.productDetail.isDisplayed(),"product detail is not opened");
        //6. Increase quantity to 4
        automationExercisePage.quantity.clear();
        automationExercisePage.quantity.sendKeys("4");
        //7. Click 'Add to cart' button
        automationExercisePage.addToCart.click();
        //8. Click 'View Cart' button
        automationExercisePage.viewCart.click();
        //9. Verify that product is displayed in cart page with exact quantity
        int expectedQuantity=4;
        int actualQuantity= Integer.parseInt(automationExercisePage.cartQuantitySize.getText());

        softAssert.assertEquals(actualQuantity,expectedQuantity,"The product added is not displayed on the cart page");
        Driver.closeDriver();
    }
}

package tests.testNG_6;

import Pages.AutomationExercisePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class T3 {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Test
    public void exercise12(){

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

        //3. Verify that home page is visible successfully
        String expectedUrl=ConfigReader.getProperty("automationHomePageTitle");
        String actualUrl=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUrl,expectedUrl,"homepage is not visible");

        //4. Click 'Products' button
        automationExercisePage.productsButton.click();
        //5. Hover over first product and click 'Add to cart'
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",automationExercisePage.firstProductAddToCart);
        jse.executeScript("arguments[0].click();",automationExercisePage.firstProductAddToCart);
        //6. Click 'Continue Shopping' button
        automationExercisePage.continueShopping.click();
        //7. Hover over second product and click 'Add to cart'
        jse.executeScript("arguments[0].scrollIntoView(true);",automationExercisePage.secondProductAddToCart);
        jse.executeScript("arguments[0].click();",automationExercisePage.secondProductAddToCart);

        //8. Click 'View Cart' button
        automationExercisePage.viewCart.click();
        //9. Verify both products are added to Cart
        softAssert.assertTrue(automationExercisePage.cartList.size()==2,"products are not added to cart");
        //10. Verify their prices, quantity and total price
        String expectedPrice=ConfigReader.getProperty("autoFirstProductPrice");
        String actualPrice=automationExercisePage.firstProductPrice.getText();
        softAssert.assertEquals(actualPrice,expectedPrice,"the price of first product is different");

        expectedPrice=ConfigReader.getProperty("autoSecondProductPrice");
        actualPrice=automationExercisePage.secondProductPrice.getText();
        softAssert.assertEquals(actualPrice,expectedPrice,"the price of second product is different ");

        String expectedQuantity="1";
        String actualQuantity=automationExercisePage.firstProductQuantity.getText();

        softAssert.assertEquals(actualQuantity,expectedQuantity,"The quantity of the first product is not equal");

        actualQuantity=automationExercisePage.secondProductQuantity.getText();
        softAssert.assertEquals(actualQuantity,expectedQuantity,"the quantity of the second product is not equal");

        String totalPrice=automationExercisePage.firstProductTotalPrice.getText();
        softAssert.assertEquals(totalPrice,automationExercisePage.firstProductPrice.getText(),"The price of the product is not same as the total price");

        totalPrice=automationExercisePage.secondProductTotalPrice.getText();
        softAssert.assertEquals(totalPrice,automationExercisePage.secondProductTotalPrice.getText(),"The price of the second product is not same as the total price");

        softAssert.assertAll();

        Driver.closeDriver();

    }
}

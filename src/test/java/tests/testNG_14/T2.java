package tests.testNG_14;

import Pages.AutomationExercisePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T2 {

    @Test
    public void exercise20(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Click on 'Products' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.productsButton.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(automationExercisePage.allProductsPage.isDisplayed());
        //5. Enter product name in search input and click search button
        automationExercisePage.searchProductBox.sendKeys("winter top");
        automationExercisePage.searchSubmit.click();
        //6. Verify 'SEARCHED PRODUCTS' is visible
        softAssert.assertTrue(automationExercisePage.searchedProductsText.isDisplayed());
        //7. Verify all the products related to search are visible
        softAssert.assertTrue(automationExercisePage.searchedProductsDetail.isDisplayed());
        //8. Add those products to cart
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",automationExercisePage.firstProductAddToCart);
        automationExercisePage.continueShopping.click();
        //9. Click 'Cart' button and verify that products are visible in cart
        automationExercisePage.cartButton.click();
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));
        //10. Click 'Signup / Login' button and submit login details
        automationExercisePage.signUpLoginButon.click();
        automationExercisePage.loginEmailKutusu.sendKeys("ee@we.com");
        automationExercisePage.passwordKutusu.sendKeys("12");
        automationExercisePage.loginButonu.click();
        //11. Again, go to Cart page
        automationExercisePage.cartButton.click();
        //12. Verify that those products are visible in cart after login as well
        softAssert.assertTrue(automationExercisePage.productImage.isDisplayed());
    }
}

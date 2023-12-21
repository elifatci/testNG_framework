package tests.testNG_9;

import Pages.AutomationExercisePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class T2 {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();
    @Test
    public void exercise14(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=ConfigReader.getProperty("automationHomePageTitle");
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle,"homepage is not visible");
        //4. Add products to cart
        automationExercisePage.firstProductAddToCartLink.click();
        //5. Click 'Cart' button
        automationExercisePage.continueShopping.click();
        automationExercisePage.cartButton.click();
        //6. Verify that cart page is displayed
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"),"cart page is not displayed");
        //7. Click Proceed To Checkout
        automationExercisePage.proceedToCheckoutLink.click();
        //8. Click 'Register / Login' button
        automationExercisePage.registerLoginLink.click();
        //9. Fill all details in Signup and create account
        Faker faker=new Faker();
        automationExercisePage.newUserIsimLinki.sendKeys(faker.name().firstName());
        automationExercisePage.newUserMailLinki.sendKeys(faker.internet().emailAddress());
        automationExercisePage.newUserSignupButon.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.click(automationExercisePage.genderButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("2")
                .sendKeys(Keys.TAB)
                .sendKeys("July")
                .sendKeys(Keys.TAB)
                .sendKeys("2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("account_created"));
        automationExercisePage.continueButton.click();
        //11. Verify ' Logged in as username' at top
        softAssert.assertTrue(automationExercisePage.loggedinAsLinki.isDisplayed());
        //12.Click 'Cart' button
        automationExercisePage.cartButton.click();
        //13. Click 'Proceed To Checkout' button
        automationExercisePage.proceedToCheckoutLink.click();
        //14. Verify Address Details and Review Your Order
        softAssert.assertTrue(automationExercisePage.adressDetail.isDisplayed());
        //15. Enter description in comment text area and click 'Place Order'
        automationExercisePage.textArea.sendKeys("thanks!");
        automationExercisePage.placeOrderButton.click();
        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
       actions.click(automationExercisePage.cardName)
               .sendKeys(faker.business().creditCardType())
               .sendKeys(Keys.TAB)
               .sendKeys(faker.business().creditCardNumber())
               .sendKeys(Keys.TAB)
               .sendKeys("320")
               .sendKeys(Keys.TAB)
               .sendKeys("10")
               .sendKeys(Keys.TAB)
               .sendKeys("2000").perform();
        //17. Click 'Pay and Confirm Order' button
        automationExercisePage.payAndConfirmOrder.click();
        //18. Click 'Delete Account' button
        automationExercisePage.deleteLinki.click();
        //19. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("delete_account"));
        automationExercisePage.continueButton.click();
    }
}

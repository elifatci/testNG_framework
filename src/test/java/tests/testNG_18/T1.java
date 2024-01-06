package tests.testNG_18;

import Pages.AutomationExercisePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    @Test
    public void exercise23(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Verify that home page is visible successfully
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("automationexercise"));
        //4. Click 'Signup / Login' button
        AutomationExercisePage automationExercisePage=new AutomationExercisePage();
        automationExercisePage.signUpLoginButon.click();
        //5. Fill all details in Signup and create account
        Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        String name=faker.name().firstName();
        automationExercisePage.newUserIsimLinki.sendKeys(name);
        automationExercisePage.newUserMailLinki.sendKeys(faker.internet().emailAddress());
        automationExercisePage.newUserSignupButon.click();
        actions.click(automationExercisePage.genderButton)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("24")
                .sendKeys(Keys.TAB).perform();
        Select select=new Select(automationExercisePage.days);
        select.selectByValue("24");
        select=new Select(automationExercisePage.months);
        select.selectByValue("9");
        select=new Select(automationExercisePage.years);
        select.selectByValue("1991");
        actions.click(automationExercisePage.firstNameBox).sendKeys(name)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("India")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).perform();

            automationExercisePage.createAccount.click();

        //6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        softAssert.assertTrue(automationExercisePage.accountCreatedText.isDisplayed());
        automationExercisePage.continueButton.click();
        //7. Verify ' Logged in as username' at top
        softAssert.assertTrue(automationExercisePage.loggedinAsLinki.isDisplayed());
        //8. Add products to cart
        automationExercisePage.firstProductAddToCartLink.click();
        automationExercisePage.continueShopping.click();
        //9. Click 'Cart' button
        automationExercisePage.cartButton.click();
        //10. Verify that cart page is displayed
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("cart"));
        //11. Click Proceed To Checkout
        automationExercisePage.proceedToCheckoutLink.click();
        //12. Click 'Delete Account' button
        automationExercisePage.deleteLinki.click();
        //13. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        softAssert.assertTrue(automationExercisePage.accountDeleteText.isDisplayed());
        automationExercisePage.continueButton.click();
    }
}

package tests.testNG_14;

import Pages.AutomationExercisePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class T3 {

    @Test
    public void exercise21() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //3. Click on 'Products' button
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();
        automationExercisePage.productsButton.click();
        //4. Verify user is navigated to ALL PRODUCTS page successfully
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(automationExercisePage.allProductsPage.isDisplayed());
        //5. Click on 'View Product' button
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", automationExercisePage.firstProductViewProductLink);
        //6. Verify 'Write Your Review' is visible
        softAssert.assertTrue(automationExercisePage.writeYourReviewText.isDisplayed());
        //7. Enter name, email and review
        js.executeScript("arguments[0].scrollIntoView(true);", automationExercisePage.writeYourReviewText);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationExercisePage.writeYourNameBox)
                .sendKeys("elif")
                .sendKeys(Keys.TAB)
                .sendKeys("ee@we.com")
                .sendKeys(Keys.TAB)
                .sendKeys("thank u!").perform();
        //8. Click 'Submit' button
        automationExercisePage.writeYourSubmitButton.click();
        //9. Verify success message 'Thank you for your review.'
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(automationExercisePage.writeYourSuccessMessage));
        softAssert.assertTrue(automationExercisePage.writeYourSuccessMessage.isDisplayed());
    }
}

package tests.testNG_24;

import Pages.AutomationTesting;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T1 {
    @Test
    public void test01(){
        //1) Open the browser
        //2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get(ConfigReader.getProperty("automationTestingUrl"));
        //3) Click on Shop Menu
        AutomationTesting automationTesting=new AutomationTesting();
        automationTesting.linkShop.click();
        //4) Now click on Home menu button
        automationTesting.menuHome.click();
        ReusableMethods.Wait(3);
        //5) Test whether the Home page has Three Arrivals only
        int expectedSize=3;
        int actualSize=automationTesting.listProducts.size();
        Assert.assertEquals(actualSize,expectedSize);
        //6) The Home page must contains only three Arrivals
        //7) Now click the image in the Arrivals
        automationTesting.listProducts.get(1).click();
        //8) Test whether it is navigating to next page where the user can add that book into his basket.
        Assert.assertTrue(automationTesting.textThinkinginHTML.isDisplayed());
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",automationTesting.buttonAddToBasket);
        //9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
        Assert.assertTrue(automationTesting.imageThinkingProduct.isEnabled());
        Assert.assertTrue(automationTesting.buttonViewBasket.isDisplayed());
        //10) Now clock on Reviews tab for the book you clicked on.
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(automationTesting.buttonReviews).perform();
        automationTesting.buttonReviews.click();
        //11) There should be a Reviews regarding that book the user clicked on
        Assert.assertTrue(automationTesting.textReviews.isDisplayed());
    }
}

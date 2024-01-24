package tests.testNG_25;

import Pages.AutomationTesting;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {
    @Test
    public void exercise06(){
        //1) Open the browser
        //2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get(ConfigReader.getProperty("automationTestingUrl"));
        //3) Click on Shop Menu
        AutomationTesting automationTesting=new AutomationTesting();
        automationTesting.linkShop.click();
        //4) Now click on Home menu button
        automationTesting.menuHome.click();
        //5) Test whether the Home page has Three Arrivals only
        int expectedSize=3;
        int actualSize=automationTesting.listProducts.size();
        Assert.assertEquals(actualSize,expectedSize);
        //6) The Home page must contains only three Arrivals
        //7) Now click the image in the Arrivals
        automationTesting.listProducts.get(1).click();
        //8) Test whether it is navigating to next page where the user can add that book into his basket.
        Assert.assertTrue(automationTesting.textThinkinginHTML.isDisplayed());
        //9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
        Assert.assertTrue(automationTesting.buttonViewBasket.isDisplayed());
        Assert.assertTrue(automationTesting.imageThinkingProduct.isEnabled());
        //10) Click on the Add To Basket button which adds that book to your basket
        automationTesting.buttonAddToBasket.click();
        //11) User can add a book by clicking on Add To Basket button which adds that book in to his Basket
    }
}

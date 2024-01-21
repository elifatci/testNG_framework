package tests.testNG_22;

import Pages.AutomationTesting;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class T2 extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Smoke test");
        //1) Open the browser
        //2) Enter the URL “http://practice.automationtesting.in/”
        Driver.getDriver().get(ConfigReader.getProperty("automationTestingUrl"));
        extentTest.info("enter the url");
        //3) Click on Shop Menu
        AutomationTesting automationTesting=new AutomationTesting();
        automationTesting.linkShop.click();
        extentTest.info("click on shop menu");
        //4) Now click on Home menu button
        automationTesting.menuHome.click();
        extentTest.info("click on home menu button");
        //5) Test whether the Home page has Three Arrivals only
        int expectedSize=3;
        Assert.assertEquals(automationTesting.listArrivals.size(),expectedSize);
        extentTest.pass("homepage has three arrivals");
        //6) Now click the image in the Arrivals
        automationTesting.imageFirstArrival.click();
        extentTest.info("click image in the arivals");
        //7) Test whether it is navigating to next page where the user can add that book into his basket.
        Assert.assertTrue(automationTesting.buttonAddToBasket.isDisplayed());
        extentTest.pass("verify navigating to next page");
        automationTesting.buttonAddToBasket.click();
        //8) Image should be clickable and shoul navigate to next page where user can add that book to his basket
    }
}


package tests.testNG_21;

import Pages.AutomationTesting;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class T1 extends TestBaseRapor {
    @Test
    public void test01(){
        //1) Open the browser
        //2) Enter the URL “http://practice.automationtesting.in/”
        extentTest=extentReports.createTest("Smoke test");
        Driver.getDriver().get(ConfigReader.getProperty("automationTestingUrl"));
        //3) Click on Shop Menu
        AutomationTesting automationTesting=new AutomationTesting();
        automationTesting.linkShop.click();
        //4) Now click on Home menu button
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",automationTesting.menuHome);
        //5) Test whether the Home page has Three Sliders only
        Assert.assertTrue(automationTesting.iconSliderLeft.isDisplayed());
        Assert.assertTrue(automationTesting.iconSliderRight.isDisplayed());
        Assert.assertTrue(automationTesting.iconPullDown.isDisplayed());
        //6) The Home page must contains only three sliders
    }
}

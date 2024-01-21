package tests.testNG_22;

import Pages.AutomationTesting;
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
        //5) Test whether the Home page has Three Arrivals only
        int expectedSize=3;
        Assert.assertEquals(automationTesting.listArrivals.size(),expectedSize);

    }
}

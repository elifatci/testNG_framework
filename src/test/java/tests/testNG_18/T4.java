package tests.testNG_18;

import Pages.EasyBusPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class T4 {

    @Test
    public void test01(){
        //1. Launch browser
        //2. Navigate to url 'https://qa.easybusticket.com/'
        Driver.getDriver().get(ConfigReader.getProperty("easyBusUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle=" Easy Bus Ticket - Home";
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);
        //4. Scroll down page to bottom
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.Wait(3);
        //5. Verify EASY BUS TİCKET logo is visible
        EasyBusPage easyBusPage=new EasyBusPage();
        softAssert.assertTrue(easyBusPage.footerLogo.isDisplayed());
        //6. Scroll up page to top
        actions.sendKeys(Keys.HOME).perform();
        ReusableMethods.Wait(3);
        //7. Verify that page is scrolled up and 'EVERY JOURNEY IS AN ADVENTURE EVERY TİCKET IS A STORY' text is visible on screen
        softAssert.assertTrue(easyBusPage.headerLogo.isDisplayed());
        softAssert.assertTrue(easyBusPage.everyJourneyText.isDisplayed());
    }
}

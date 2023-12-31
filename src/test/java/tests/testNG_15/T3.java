package tests.testNG_15;

import Pages.EasyBusPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T3 {

    @Test
    public void test03(){
        //Navigate to the page "https://qa.easybusticket.com/login/"
        Driver.getDriver().get(ConfigReader.getProperty("easyBusLogin"));
        //Username textbox is displayed, and a space character is entered into the textbox
        EasyBusPage easyBusPage=new EasyBusPage();
        easyBusPage.usernameBox.sendKeys("      ");
        //The Password textbox is displayed, and a valid/invalid password is entered into the textbox
        easyBusPage.passwordBox.sendKeys("12");
        //The Login button is clicked.
        easyBusPage.logInButton.click();
        //It is verified that the message 'Username field is required' is displayed.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(easyBusPage.signalAlert.isDisplayed());
        //The Username textbox is displayed, an invalid username is entered into the textbox
        easyBusPage.usernameBox.sendKeys(ConfigReader.getProperty("invalidUsername"));
        //The Password textbox is displayed, and a valid password is entered into the textbox.
        easyBusPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        //The Login button is clicked
        easyBusPage.logInButton.click();
        //It is verified that the message 'These credentials do not match our records' is displayed
        softAssert.assertTrue(easyBusPage.signalAlert.isDisplayed());
        //The Username textbox is displayed, and a valid username is entered into the textbox
        easyBusPage.usernameBox.sendKeys(ConfigReader.getProperty("validUsername"));
        //The Password textbox is displayed, and an invalid password is entered into the textbox
        easyBusPage.passwordBox.sendKeys(ConfigReader.getProperty("invalidPassword"));
        //The Login button is clicked
        easyBusPage.logInButton.click();
        //It is verified that the message 'These credentials do not match our records' is displayed
        softAssert.assertTrue(easyBusPage.signalAlert.isDisplayed());
        //The Username textbox is displayed, and an invalid username is entered into the textbox
        easyBusPage.usernameBox.sendKeys(ConfigReader.getProperty("invalidUsername"));
        //The Password textbox is displayed, and an invalid password is entered into the textbox
        easyBusPage.passwordBox.sendKeys(ConfigReader.getProperty("invalidPassword"));
        //The Login button is clicked.
        easyBusPage.logInButton.click();
        //It is verified that the message 'These credentials do not match our records' is displayed
        softAssert.assertTrue(easyBusPage.signalAlert.isDisplayed());
    }
}

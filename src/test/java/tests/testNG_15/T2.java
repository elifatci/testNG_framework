package tests.testNG_15;

import Pages.EasyBusPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T2 {

    @Test
    public void test02(){
        //Navigate to the page "https://qa.easybusticket.com/login/"
        Driver.getDriver().get(ConfigReader.getProperty("easyBusLogin"));
        //Verify that the username textbox is displayed on the opened page, and a valid username is entered into the textbox
        EasyBusPage easyBusPage=new EasyBusPage();
        easyBusPage.usernameBox.sendKeys("elifatci");
        //Verify that the password textbox is displayed on the opened page, and a valid password is entered into the textbox
        easyBusPage.passwordBox.sendKeys("1234567890Elif_");
        //Verify that the 'LogIn' button is displayed on the opened page and clicked
        easyBusPage.logInButton.click();
        //Confirm that the opened page is the dashboard page.
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(easyBusPage.verifiedDashboard.isDisplayed());
    }
}

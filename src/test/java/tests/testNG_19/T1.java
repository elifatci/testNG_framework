package tests.testNG_19;

import Pages.EasyBusPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    @Test
    public void test01(){

        //1. Launch browser
        //2. Navigate to url 'https://qa.easybusticket.com/'
        Driver.getDriver().get(ConfigReader.getProperty("easyBusUrl"));
        //3. Verify that home page is visible successfully
        String expectedTitle="Easy Bus Ticket - Home";
        String actualTitle=Driver.getDriver().getTitle();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle,expectedTitle);
        //4. Verify the section of Our Testimonials is visible
        EasyBusPage easyBusPage=new EasyBusPage();
        softAssert.assertTrue(easyBusPage.ourTestimonials.isDisplayed());
        //5. Click on the second item from our testimonials
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",easyBusPage.aprilouTestimonials);
        //6. Verify 'Marvan's comment' is visible
        softAssert.assertTrue(easyBusPage.aprilComment.isDisplayed());
    }
}

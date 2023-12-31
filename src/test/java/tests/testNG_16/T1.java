package tests.testNG_16;

import Pages.EasyBusPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    @Test
    public void test01(){
        //Kullanici browser acar ve "https://qa.easybusticket.com/" url'i girer
        Driver.getDriver().get(ConfigReader.getProperty("easyBusUrl"));
        //SignIn butonuna tiklar
        EasyBusPage easyBusPage=new EasyBusPage();
        easyBusPage.signInButton.click();
        //Gecerli username ve password ile LogIn olur
        easyBusPage.usernameBox.sendKeys(ConfigReader.getProperty("validUsername"));
        easyBusPage.passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        easyBusPage.logInButton.click();
        //Buy Tickets butonuna tiklar
        easyBusPage.buyTicketsButton.click();
        //Giris ve varis yerini girer
        easyBusPage.pickupPoint.click();
        easyBusPage.pickupPointList.get(3).click();
        easyBusPage.droppingPoint.click();
        easyBusPage.droppingPointList.get(9).click();
        //Find Tickets butonuna basar
        easyBusPage.findTicketsButton.click();
        //Select seat butonunu tiklar
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",easyBusPage.selectSeatButton);
        //Koltuk secer
        js.executeScript("arguments[0].click();",easyBusPage.seat);
        //Cinsiyetini secer
        js.executeScript("arguments[0].click();",easyBusPage.female);
        //Continue butonuna tiklar
        js.executeScript("arguments[0].click();",easyBusPage.continueButton);
        //Cikan alerti onaylar
        js.executeScript("arguments[0].click();",easyBusPage.alertConfirm);
        //Pay Now butonuna tiklar
        js.executeScript("arguments[0].click();",easyBusPage.payNow);
        //Cikan alerti onaylar
        js.executeScript("arguments[0].click();",easyBusPage.alertOnay);
        //Pay Now butonuna tiklar
        js.executeScript("arguments[0].click();",easyBusPage.payNow2);
        //Gecerli kart bilgilerini girer
        easyBusPage.nameOnCard.sendKeys("ee");
        easyBusPage.cardNumber.sendKeys("4242424242424242");
        easyBusPage.expirationDate.sendKeys("0230");
        easyBusPage.cvcCode.sendKeys("111");
        //Pay Now butonuna basar
        js.executeScript("arguments[0].click();",easyBusPage.payNowCard);
        //Acilan pencerede aldigi bileti goruntuler
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(easyBusPage.verifiedTicket.isDisplayed());
        //Profil linkin altinda Logout linkini tiklar
        easyBusPage.profileLink.click();
        easyBusPage.logoutLink.click();
        //Acilan pencerede login sayfasini goruntuler
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));

    }
}

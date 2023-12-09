package tests.testNG_1;

import Pages.ZeroPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T6 {

    @Test
    public void assertTesti(){
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        //2. Sign in butonuna basin
        ZeroPage zeroPage=new ZeroPage();
        zeroPage.signinButtonu.click();
        //3. Login kutusuna “username” yazin
        zeroPage.userLoginKutusu.sendKeys(ConfigReader.getProperty("istenenKullaniciAdi"));
        //4. Password kutusuna “password” yazin
        zeroPage.userPasswordKutusu.sendKeys(ConfigReader.getProperty("istenenPassword"));
        //5. Sign in tusuna basin
        zeroPage.signinTusu.click();
        //6. Back tusuna basip, Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().navigate().back();
        zeroPage.onlineBankingMenuLinki.click();
        zeroPage.payBillsLinki.click();
        //7. “Purchase Foreign Currency” tusuna basin
        zeroPage.purchaseForeignLinki.click();
        //8. “Currency” drop down menusunden Eurozone’u secin
        Select select=new Select(zeroPage.currencyDropDownMenu);
        select.selectByValue("EUR");
        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        String expectedOption="Eurozone (euro)";
        String actualOption=select.getFirstSelectedOption().getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualOption,expectedOption,"Eurozone (euro) optionu secili degil");

        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        List<WebElement> dropdownList=select.getOptions();
        List<String> dropDownStr=new ArrayList<>();
        for (WebElement each:dropdownList) {
            dropDownStr.add(each.getText());
        }
        List<String> expectedList= Collections.singletonList(ConfigReader.getProperty("istenenIcerikListesi"));

        softAssert.assertEquals(dropDownStr,expectedList,"liste tamamini icermemektedir");

        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
    }
}

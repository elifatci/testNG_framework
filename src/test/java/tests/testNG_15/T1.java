package tests.testNG_15;

import Pages.EasyBusPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    @Test
    public void test01(){
        //Web driver calistirilarak "https://qa.easybusticket.com/" sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("easyBusUrl"));
        //Anasayfada header bolumunde "Giris Yap" butonunun gorunurlugu dogrulanir
        EasyBusPage easyBusPage=new EasyBusPage();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(easyBusPage.signInButton.isDisplayed());
        //Anasayfada header bolumunde "Giris Yap" butonu tiklanir
        easyBusPage.signInButton.click();
        //Acilan sayfanin url'inin "https://qa.easybusticket.com/login/" oldugu dogrulanir
        String expectedUrl="https://qa.easybusticket.com/login/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl);
    }

}

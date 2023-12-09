package tests.testNG_1;

import Pages.YoutubePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    //1) https://www.youtube.com adresine gidin
    //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
    //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    @Test(priority = 1)
    public void titleTest(){
        Driver.getDriver().get(ConfigReader.getProperty("ytbUrl"));
        String expectedTitle="YouTube";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test(priority = 2)
    public void imageTest(){
        YoutubePage youtubePage=new YoutubePage();
        Assert.assertTrue(youtubePage.youtubeResmi.isDisplayed());
    }

    @Test(priority = 3)
    public void searchBoxTest(){
        YoutubePage youtubePage=new YoutubePage();
        Assert.assertTrue(youtubePage.aramaKutusu.isEnabled());
    }

    @Test(priority = 4)
    public void wrongTitleTest(){
        String expectedTitle="youtube";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertNotEquals(actualTitle,expectedTitle);
        Driver.closeDriver();
    }
}

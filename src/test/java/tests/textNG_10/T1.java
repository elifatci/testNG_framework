package tests.textNG_10;

import Pages.TestOtoFormPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class T1 {

    TestOtoFormPage testOtoFormPage=new TestOtoFormPage();
    @Test
    public void test01(){
        // https://testotomasyonu.com/form adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toFormUrl"));
        //1.Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
        Select selectGun=new Select(testOtoFormPage.dogumTarihiGun);
        selectGun.selectByIndex(5);
        //2. Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
        Select selectAy=new Select(testOtoFormPage.dogumTarihiAy);
        selectAy.selectByValue("nisan");
        //3. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
        Select selectYil=new Select(testOtoFormPage.dogumTarihiYil);
        selectYil.selectByVisibleText("1990");
        //4. Secilen değerleri konsolda yazdirin
        System.out.println("Gun: "+selectGun.getFirstSelectedOption().getText() +
                "\nAy: "+selectAy.getFirstSelectedOption().getText()+
                "\nYil: "+selectYil.getFirstSelectedOption().getText());
        //4. Ay dropdown menüdeki tum değerleri(value) yazdırın
        List<WebElement> ayDropdown=selectAy.getOptions();
        for (WebElement each:ayDropdown) {
            System.out.println(each.getText());
        }
        //5. Ay Dropdown menusunun boyutunun 13 olduğunu test edin
        Assert.assertEquals(13,selectAy.getOptions().size());
    }
}

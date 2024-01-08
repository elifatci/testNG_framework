package tests.testNG_20;

import Pages.AmazonPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class T1 {

    @Test
    public void exercise01(){
        //1. Open the website "url"
        Driver.getDriver().get(ConfigReader.getProperty("pumaUrl"));
        //2. Click the "Women" link in the header section
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.womenLink.click();
        //3.Click on the 'arrow down' icon next to the 'sort by'
        Select select=new Select(amazonPage.sortByMenu);
        //3. Select 'Price low to high' from the 'Sort by' menu
        select.selectByValue("price-low-to-high");
        //4. Scroll down to the 'script logo cap' product
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",amazonPage.product);
        //5.Click on the 'arrow right' icon on the 'script logo cap' product image
        amazonPage.productIcon.click();
    }
}

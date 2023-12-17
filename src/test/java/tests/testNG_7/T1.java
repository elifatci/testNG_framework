package tests.testNG_7;

import Pages.UsePage;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class T1 {

    @Test
    public void test01(){
        UsePage usePage=new UsePage();
        //1. Visit https://useinsider.com/ and check Insider home page is opened or not
        Driver.getDriver().get(ConfigReader.getProperty("useUrl"));
        usePage.cookies.click();
        String expectedUrl=ConfigReader.getProperty("useUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"homepage is not opened");
        //2. Select “Company” menu in navigation bar, select “Careers” and check Career page, its
        usePage.companyLink.click();
        usePage.careersLink.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("careers"),"The career page is not opened");
        //Locations, Teams and Life at Insider blocks are opened or not
        Assert.assertTrue(usePage.locations.isDisplayed());
        Assert.assertTrue(usePage.teams.isDisplayed());
        Assert.assertTrue(usePage.lifeAtInsider.isDisplayed());
        //3. Click “See All Teams”, select Quality Assurance, click “See all QA jobs”, filter jobs by
        //Location - Istanbul, Turkey and department - Quality Assurance, check presence of jobs list
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", usePage.seeAllTeamsLink);
        js.executeScript("arguments[0].click()", usePage.qualityAssuranceLink);
        js.executeScript("arguments[0].click()", usePage.seeAllQaJobsLink);
        ReusableMethods.Wait(5);
        usePage.locationSelect.click();
        usePage.locationIstanbul.click();
        Assert.assertTrue(usePage.QajobList.isDisplayed());
        js.executeScript("arguments[0].scrollIntoView(true)",usePage.QajobList);
        //4. Check that all jobs’ Position contains “Quality Assurance”, Department contains
        //“Quality Assurance”, Location contains “Istanbul, Turkey” and “Apply Now” button
        System.out.println(usePage.QajobList.getText());



    }
}

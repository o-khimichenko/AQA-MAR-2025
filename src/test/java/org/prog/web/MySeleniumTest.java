package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.page.CloudFlarePage;
import org.prog.page.GooglePage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//TODO: load allo.ua, and search for a phone
//TODO: Print 1st good in search and its price

public class MySeleniumTest {

    private WebDriver driver;
    private GooglePage googlePage;
    private CloudFlarePage cloudFlarePage;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
        googlePage = new GooglePage(driver);
        cloudFlarePage = new CloudFlarePage(driver);
    }

    @Test
    public void myGoogleTest() {
        googlePage.loadPage();
        googlePage.acceptCookieIfPresent();
        googlePage.search("Ben Affleck");
        System.out.println("We found ben!");
    }

    @Test
    public void myCloudFlareTest() {
        cloudFlarePage.loadPage();
        cloudFlarePage.acceptCookies();
        cloudFlarePage.goToLoginPage();
        Assert.assertTrue(cloudFlarePage.getEmailInput().isDisplayed(), "Email field is not displayed");
    }

    @Test
    public void iFrameTest() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.findElement(By.id("accept-choices")).click();
        WebElement iframe = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iframe);
        WebElement iframeInner = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
        driver.switchTo().frame(iframeInner);
        System.out.println(driver.findElement(By.xpath("//h1")).getText());

        WebElement header = driver.findElement(By.tagName("h1"));
        System.out.println(header.getText());
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

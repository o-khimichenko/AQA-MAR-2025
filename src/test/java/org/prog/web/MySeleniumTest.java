package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

//TODO: load allo.ua, and search for a phone

public class MySeleniumTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @Test
    public void myWebTest() {
        driver.get("https://google.com/");
        List<WebElement> cookieLinks = driver.findElements(
                By.xpath("//a[contains(@href, 'technologies/cookies')]"));
        if (!cookieLinks.isEmpty()) {
            driver.findElements(By.tagName("button")).get(4).click();
        }
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Ben Affleck");
        searchInput.sendKeys(Keys.ENTER);
        System.out.println("We found ben!");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

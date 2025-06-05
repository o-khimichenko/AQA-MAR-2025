package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class OnlineSearchTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @Test
    public void alloTest() {
        driver.get("https://allo.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Xiaomi");
        searchInput.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        WebElement titleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//a[contains(@class, 'product-card__title')])[1]")));
        String title = titleElement.getAttribute("title");


        WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//a[contains(@class, 'product-card__title')])[1]/ancestor::div[contains(@class, 'product-card')]//div[contains(@class, 'v-pb__cur')]")));
        String price = priceElement.getText();

        System.out.println("Product title: " + title);
        System.out.println("Price: " + price);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

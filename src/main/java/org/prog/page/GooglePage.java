package org.prog.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GooglePage {

    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("https://google.com/");
    }

    public void search(String searchTerm) {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(searchTerm);
        searchInput.sendKeys(Keys.ENTER);
    }

    public void acceptCookieIfPresent() {
        List<WebElement> cookieLinks = driver.findElements(
                By.xpath("//a[contains(@href, 'technologies/cookies')]"));
        if (!cookieLinks.isEmpty()) {
            driver.findElements(By.tagName("button")).get(4).click();
        }
    }
}

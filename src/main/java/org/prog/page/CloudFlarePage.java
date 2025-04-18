package org.prog.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CloudFlarePage {

    private WebDriver driver;

    public CloudFlarePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadPage() {
        driver.get("https://www.cloudflare.com/");
    }

    public void acceptCookies() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement btn = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(btn)).click();
        btn.click();
    }

    public void goToLoginPage() {
        driver.findElement(By.linkText("Log in")).click();
    }

    public WebElement getEmailInput() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
    }
}

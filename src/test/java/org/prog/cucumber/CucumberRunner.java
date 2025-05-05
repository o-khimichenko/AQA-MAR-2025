package org.prog.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.cucumber.steps.WebSteps;
import org.prog.page.CloudFlarePage;
import org.prog.page.GooglePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
        tags = "@wip",
        features = "src/test/resources/features",
        glue = "org.prog.cucumber.steps"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
        WebSteps.googlePage = new GooglePage(driver);
        WebSteps.cloudFlarePage = new CloudFlarePage(driver);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}

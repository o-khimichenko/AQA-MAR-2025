package org.prog.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.prog.cucumber.steps.SQLSteps;
import org.prog.cucumber.steps.WebSteps;
import org.prog.page.CloudFlarePage;
import org.prog.page.GooglePage;
import org.prog.util.WebDriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@CucumberOptions(
        tags = "@wip",
        features = "src/test/resources/features",
        glue = "org.prog.cucumber.steps",
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    private WebDriver driver;
    private Connection connection;

    @BeforeSuite
    public void beforeSuite() throws MalformedURLException, SQLException {
        String driverType = System.getProperty("driver.type", "jenkins");
        String sqlHost;
        if (driverType.equals("jenkins")) {
            sqlHost = "jdbc:mysql://mysql-db-1:3306/db";
        } else {
            sqlHost = "jdbc:mysql://localhost:3306/db";
        }

        driver = WebDriverFactory.getDriver(driverType);
        connection = DriverManager.getConnection(sqlHost, "root", "password");

        SQLSteps.connection = connection;
        WebSteps.googlePage = new GooglePage(driver);
        WebSteps.cloudFlarePage = new CloudFlarePage(driver);
    }

    @AfterSuite
    public void tearDown() throws SQLException {
        if (driver != null) {
            driver.quit();
        }
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}

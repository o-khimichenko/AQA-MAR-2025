package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.prog.page.CloudFlarePage;
import org.prog.page.GooglePage;

public class WebSteps {

    public static GooglePage googlePage;
    public static CloudFlarePage cloudFlarePage;

    @Given("I load google page")
    public void iLoadGooglePage() {
        googlePage.loadPage();
        googlePage.acceptCookieIfPresent();
    }

    @When("I google for {string}")
    public void iGoogleFor(String searchTerm) {
        googlePage.search(searchTerm);
    }

    @Then("Google does something")
    public void googleDoesSomething() {
        System.out.println("Validation should be here");
    }
}

package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.prog.page.CloudFlarePage;
import org.prog.page.GooglePage;
import org.prog.util.DataHolder;

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

    @When("I google random persons name")
    public void iGoogleRandomPersonsName() {
        googlePage.search(SQLSteps.randomPersonFirstLastName);
    }

    @When("I google name of {string}")
    public void iGoogleNameOf(String alias) {
        googlePage.search((String) DataHolder.HOLDER.get(alias));
    }

    @Given("I have {string} as {string}")
    public void iHaveJohnDoeAsOurWinner(String winner, String alias) {
        DataHolder.HOLDER.put(alias, winner);
    }
}

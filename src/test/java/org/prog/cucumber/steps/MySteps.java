package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {

    @Given("something always happens")
    public void somethingAlwaysHappens() {
        System.out.println("===================");
    }

    @Given("I enter {string} as login")
    public void iGoSomewhere(String login) {
        System.out.println("I am registering as " + login);
    }

    @Given("I enter {int} as age")
    public void iGoSomewhere1(int age) {
        System.out.println("I am registering with age " + age);
    }

    @Given("I enter {string} as password")
    public void iGoSomewhere2(String password) {
        System.out.println("I am registering with password " + password);
    }

    @When("I press register")
    public void iDoSomething() {
        System.out.println("Click register button");
    }

    @Then("Operation is successful")
    public void somethingHappen() {
        System.out.println("Operation is successful");
    }

    @Then("Operation has failed")
    public void somethingHappensFailed() {
        System.out.println("Operation has failed");
    }
}

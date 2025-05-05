package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.prog.dto.PersonDto;
import org.prog.dto.ResultDto;
import org.prog.util.DataHolder;

import java.util.List;

public class RestSteps {

    public static List<PersonDto> randomPersons;

    @Given("I request random people from API")
    public void iRequestRandomPeopleFromAPI() {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://randomuser.me");
        request.basePath("/api/");
        request.header("Content-Type", "application/json");
        request.param("inc", "gender,name,nat");
        request.param("noinfo");
        request.param("results", "5");
        Response response = request.get();
        response.prettyPrint();
        request.then().statusCode(200);
        randomPersons = response.as(ResultDto.class).getResults();
    }

    @Given("I request random people from API as {string}")
    public void iRequestRandomPeopleFromAPI(String alias) {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://randomuser.me");
        request.basePath("/api/");
        request.header("Content-Type", "application/json");
        request.param("inc", "gender,name,nat");
        request.param("noinfo");
        request.param("results", "5");
        Response response = request.get();
        response.prettyPrint();
        request.then().statusCode(200);
        DataHolder.HOLDER.put(alias, response.as(ResultDto.class).getResults());
    }
}

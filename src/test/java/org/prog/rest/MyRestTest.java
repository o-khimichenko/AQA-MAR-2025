package org.prog.rest;

import groovy.json.JsonParser;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.oneOf;

//TODO: add location to request query +
//TODO: write assertion that confirms city is not null +
//TODO: write assertion that confirms coordintaes are decimal digits (number is . in it: 123.123 or -123.123 etc) +

public class MyRestTest {

    @Test
    public void testMyRest() {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://randomuser.me");
        request.basePath("/api/");
        request.header("Content-Type", "application/json");
        request.param("inc", "gender,name,nat,location");
        request.param("noinfo");

        Response response = request.get();
        JsonPath path = response.jsonPath();
        String gender = path.get("results[0].gender");
        Assert.assertEquals(gender, "female", "Wrong gender");
        System.out.println("GENDER: " + gender);
        response.prettyPrint();

        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);
        validatableResponse.header("Content-Type", equalTo("application/json; charset=utf-8"));
        validatableResponse.body("results[0].gender", equalTo("female"));
        validatableResponse.body("coordinates", Matchers.matchesRegex("-?\\d+\\.\\d+"));
        validatableResponse.body("city", Matchers.notNullValue());
    }
}

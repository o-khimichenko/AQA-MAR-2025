package org.prog.rest;

import groovy.json.JsonParser;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.prog.dto.NameDto;
import org.prog.dto.PersonDto;
import org.prog.dto.ResultDto;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.naming.Name;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.oneOf;

//TODO: add location to request query
//TODO: write assertion that confirms city is not null
//TODO: write assertion that confirms coordintaes are decimal digits (number is . in it: 123.123 or -123.123 etc)

public class MyRestTest {

    @Test
    public void testMyRest() {
        RequestSpecification request = RestAssured.given();
        request.baseUri("https://randomuser.me");
        request.basePath("/api/");
        request.header("Content-Type", "application/json");
        request.param("inc", "gender,name,nat");
        request.param("noinfo");
        request.param("results", "5");

        Response response = request.get();
//        JsonPath path = response.jsonPath();
//        String gender = path.get("results[0].gender");
//        Assert.assertEquals(gender, "female", "Wrong gender");
//        System.out.println("GENDER: " + gender);
        response.prettyPrint();

        ResultDto resultDto = response.as(ResultDto.class);
        System.out.println(resultDto.getResults().size());

//        ValidatableResponse validatableResponse = response.then();
//        validatableResponse.statusCode(200);
//        validatableResponse.header("Content-Type", equalTo("application/json; charset=utf-8"));
//        validatableResponse.body("results[0].gender", equalTo("female"));
    }
}

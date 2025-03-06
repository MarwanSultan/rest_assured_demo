package com.api.tests;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetApiTest {

    @Test
    void getApiTest() {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println("Response: " + response.asString());
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Body : " + response.getBody().asString());
        System.out.println("Time taken :" + response.getTime());
        System.out.println("Header: " + response.getHeader("content-type"));
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    void alternateGetApiTest(){
        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200);

    }
}

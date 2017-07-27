package com.jagathes.service.WebServiceAutomation;

import static com.jayway.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GoogleMapGetRequestTest {
    @BeforeClass
    public void setBaseUri() {
	RestAssured.baseURI = "http://maps.googleapis.com";
    }

    @Test
    public void testStatusCode() {
	Response res = given().param("address", "chicago").param("sensor", "false&#8221").when().get("/maps/api/geocode/json").then().contentType(ContentType.JSON).extract().response();
	System.out.println(res.asString());
    }

}

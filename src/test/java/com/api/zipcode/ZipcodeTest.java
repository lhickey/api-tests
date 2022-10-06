package com.api.zipcode;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

public class ZipcodeTest {

    private static final String BASE_URI = "https://api.zippopotam.us";

    @Test
    public void correctCityIsReturned(){
        given().
                when().get(BASE_URI +"/us/90210").
                then().statusCode(HttpStatus.SC_OK).
                and().body("places.'place name'", hasItem("Beverly Hills"));
    }

}

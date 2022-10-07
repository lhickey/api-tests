package com.api.currency;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class CurrencyTest {

    private static RequestSpecification requestSpec;

    @BeforeAll
    public static void createRequestSpec(){
        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://api.coindesk.com/v1/bpi").
                build();
    }

    @Test
    public void priceOfBitcoinIsReturnedSuccessfully() {
        given().spec(requestSpec).
        when().get("/currentprice.json")
                .then()
                .statusCode(HttpStatus.SC_OK);

    }

}

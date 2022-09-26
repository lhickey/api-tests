package com.api.currency;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class CurrencyTest {

    @Test
    public void priceOfBitcoinIsReturnedSuccessfully() {
        when().get("https://api.coindesk.com/v1/bpi/currentprice.json")
                .then()
                .statusCode(HttpStatus.SC_OK);

    }

}

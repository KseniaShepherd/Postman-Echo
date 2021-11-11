package ru.netology;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestingPostman {

    @org.junit.jupiter.api.Test
    void shouldRCheckDataInTheRequiredField() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some  data"))
        ;
    }
}
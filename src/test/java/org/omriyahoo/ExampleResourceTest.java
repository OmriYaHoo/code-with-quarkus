package org.omriyahoo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/books")
                .then()
                .statusCode(200)
                .body("size()", is(5));
    }

    @Test
    public void testNameById() {
        given()
                .when().get("/books/1")
                .then()
                .statusCode(200)
                .body("title", is("Harry Potter"));
    }

}

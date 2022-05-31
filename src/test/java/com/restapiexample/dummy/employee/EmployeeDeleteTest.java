package com.restapiexample.dummy.employee;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class EmployeeDeleteTest extends TestBase {
    @Test
    public void deletUser() {
        Response response = given()
                .when()
                .delete("/delete/2");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}





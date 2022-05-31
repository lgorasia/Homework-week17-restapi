package com.restapiexample.dummy.employee;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class EmployeePutTest extends TestBase {
    @Test
    public void createStudent() {

        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setEmployee_name("Lalit");
        employeePojo.setEmployee_salary(20000);
        employeePojo.setEmployee_age(40);


        Response response = given()
                .header("Content-Type", "application/json")
                .body(employeePojo)
                .when()
                .put("/update/21");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}

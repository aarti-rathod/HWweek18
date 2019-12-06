package com.employees.employeesinfo;

import com.employees.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

/**
 * Created by JANVI on 04/12/2019.
 */
public class SerenityTest extends TestBase {
    @Test
    public void getAllEmployees(){
        SerenityRest.rest().given()
                .when()
                .get("/employees")
                .then()
                .statusCode(200);
    }




}
/*
 @Test
    public void getAllStudents(){
        SerenityRest.rest().given()
                .when()
                .get("/list")
                .then()
                .statusCode(200);
    }

    @Test
    public void thisIsaFailing(){
        SerenityRest.given()
                .when()
                .get("/list")
                .then()
                .statusCode(500);
    }
 */

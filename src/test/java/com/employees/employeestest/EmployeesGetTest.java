package com.employees.employeestest;

import com.employees.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

/**
 * Created by JANVI on 03/12/2019.
 */
public class EmployeesGetTest  extends TestBase{
    @Test
    public void getAllEmployeesData(){
        String response=given()
                .when()
                .get("/employees").asString();
        System.out.println(response);

    }



}

/*
@Test
    public void getSingleInfo(){
        Response response =given()
                .when()
                .get("/1");
        System.out.println(response.prettyPrint());
 */
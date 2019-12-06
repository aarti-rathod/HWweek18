package com.employees.serenity;

import com.employees.model.EmployeePojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;


public class EmployeeSerenitySteps {

//    @Step("Creating employee with Name:{0}, Salary:{1}, Age:{2}")
//    public ValidatableResponse createEmployee(String name ,String salary ,String age) {
//
//        EmployeePojo employeePojo = new EmployeePojo();
//        employeePojo.setEmployeesname(name);
//        employeePojo.setEmployeessalary(salary);
//        employeePojo.setEmployeesage(age);
//
//        return SerenityRest.rest().given()
//                .contentType(ContentType.JSON).log().all()
//                .when()
//                .body(employeePojo)
//                .post("/create")
//                .then();
//
//    }

    @Step("Creating employee with Name:{0}, Salary:{1}, Age:{2}")
    public void createEmployee(String name, String salary, String age) {

        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setEmployeesname(name);
        employeePojo.setEmployeessalary(salary);
        employeePojo.setEmployeesage(age);

        given()
                .contentType(ContentType.JSON)
                .log()
                .all()
                .when()
                .body(employeePojo)
                .post("/create")
                .then()
                .log()
                .all();

    }
}

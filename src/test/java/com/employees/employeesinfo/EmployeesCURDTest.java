package com.employees.employeesinfo;

import com.employees.testbase.TestBase;
import io.restassured.http.ContentType;
import net.bytebuddy.utility.RandomString;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/**
 * Created by JANVI on 03/12/2019.
 */
//@RunWith(SerenityRunner.class)
public class EmployeesCURDTest extends TestBase {

    static String employeesname = "aayushi" + RandomString.make(2);
    static String empID;

    /*
   1.C-Post()
   U-Put()
   R-get()
   D-delete()
    */

    //Post Method

    @Test
    public void test01() {

        HashMap<String, String> details = new HashMap<>();

        details.put("name", employeesname);
        details.put("salary", "1112");
        details.put("age", "29");

        empID = given()
                .contentType(ContentType.JSON)
                .when()
                .body(details)
                .post("/create")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .get("id");

        System.out.println(empID);
    }

    //Put Method

    @Test
    public void test02() {
        HashMap<String, String> details = new HashMap<>();
        details.put("name", employeesname);
        details.put("salary", "2234");
        details.put("age", "28");

        String response = given()
                .contentType(ContentType.JSON)
                .when()
                .body(details)
                .put("/update/" + empID)
                .then()
                .statusCode(200)
                .extract().asString();

        System.out.println(response);


    }

    //Get Method

    @Test
    public void test03() {

        String response = given()
                .when()
                .get("employee/" + empID).asString();

        System.out.println(response);
    }
    //Delete Method

    @Test
    public void test04() {

       given()
                .when()
                .delete("/delete/" + empID)
                .then().statusCode(200);
    }

}


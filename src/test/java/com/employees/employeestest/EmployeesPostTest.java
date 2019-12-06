package com.employees.employeestest;

import com.employees.model.EmployeePojo;
import com.employees.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

/**
 * Created by JANVI on 03/12/2019.
 */
public class EmployeesPostTest extends TestBase {

//    public static String getRandomString(int length) {
//        StringBuilder sb = new StringBuilder();
//        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
//        for (int i = 0; i < length; i++) {
//            int index = (int) (Math.random() * characters.length());
//            sb.append(characters.charAt(index));
//        }
//        return sb.toString();
//    }

    @Test
    public void createNewStudent(){
        EmployeePojo employeePojo=new EmployeePojo();
        employeePojo.setEmployeesname("Nisha");
        employeePojo.setEmployeessalary("120");
        employeePojo.setEmployeesage("30");


        Response response = given()
                .when()
                .body(employeePojo)
                .post("/create");
       // response.then().log().all().statusCode(200);
        System.out.println(response.asString());
    }




}
/*
"id": "1",
        "employee_name": "fdgfdhhgfg",
        "employee_salary": "15",
        "employee_age": "3",
        "profile_image": ""
 */


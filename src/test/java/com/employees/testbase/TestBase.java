package com.employees.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by JANVI on 03/12/2019.
 */
public class TestBase {
    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI="http://dummy.restapiexample.com/api";       //"/api/v1"
        RestAssured.basePath="/v1";
                                                                            //"/employees"
    }


}
/*
 @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";
    }
     @BeforeClass
    public static void inIt(){
        RestAssured.baseURI="http://localhost:8080";        //uri
        RestAssured.basePath="/student";                   //"student"will be base path
                                                          //"list"will be point



 */
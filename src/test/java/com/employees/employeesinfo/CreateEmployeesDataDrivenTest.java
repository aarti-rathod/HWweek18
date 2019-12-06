package com.employees.employeesinfo;

import io.restassured.RestAssured;
import net.thucydides.core.csv.FailedToInitializeTestData;
import com.employees.model.EmployeePojo;
import com.employees.serenity.EmployeeSerenitySteps;
import com.employees.testbase.TestBase;
import io.restassured.http.ContentType;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

/**
 * Created by JANVI on 03/12/2019.
 */
@Concurrent(threads = "4x")
@UseTestDataFrom("src\\test\\java\\com\\employees\\resources\\testdata\\infoOne.csv")
@RunWith(SerenityParameterizedRunner.class)

public class CreateEmployeesDataDrivenTest {

    private String employeesname;
    private String employeessalary;
    private String employeesage;

    public String getEmployeesname() {
        return employeesname;
    }

    public void setEmployeesname(String employeesname) {
        this.employeesname = employeesname;
    }

    public String getEmployeessalary() {
        return employeessalary;
    }

    public void setEmployeessalary(String employeessalary) {
        this.employeessalary = employeessalary;
    }

    public String getEmployeesage() {
        return employeesage;
    }

    public void setEmployeesage(String employeesage) {
        this.employeesage = employeesage;
    }

    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI="http://dummy.restapiexample.com/api";       //"/api/v1"
        RestAssured.basePath="/v1";
        //"/employees"
    }


    @Steps
    EmployeeSerenitySteps steps;

    @Title("DataDriven Test for Adding Multiple Employee")
    @Test
    public void createMultiplesEmployees() {
        steps.createEmployee(employeesname,employeessalary,employeesage);
    }
}
/*
 @Steps
    EmployeeSerenitySteps steps;

    @Title("DataDriven Test for adding multiple students to the Student App.")
    @Test
    public void createMultipleStudents(){
        ArrayList<String> courses = new ArrayList<>();
        courses.add(course);
        steps.createStudent(firstName, lastName, email, programme, courses);

    }
 */
package com.ulus.stepdef;

import com.ulus.pages.myGradesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class MyGradesStepDefinitions {

    myGradesPage myGradesPage = new myGradesPage();

    @When("user prints the names of courses")
    public void user_prints_the_names_of_courses() {

        for (int i = 0; i < myGradesPage.courses.size() ; i++) {
            System.out.println("The name of course is " + myGradesPage.courses.get(i).getText());
        }
    }
    @Then("user prints the number of courses taken so far")
    public void user_prints_the_number_of_courses_taken_so_far() {
        System.out.println("The number of courses taken so far = " + myGradesPage.courses.size());
    }
}

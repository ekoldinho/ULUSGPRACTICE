package com.ulus.stepdef;

import com.ulus.pages.CalendarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();


    @When("user clicks plus button")
    public void user_clicks_plus_button() {
        calendarPage.calendarText.click();
    }

    @When("user writes the name of the event {string} and clicks All Day button")
    public void user_writes_the_name_of_the_event_and_clicks_all_day_button(String string) {
        calendarPage.newEvent.sendKeys("Xmas Party");
        calendarPage.allDayButton.click();
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {

        calendarPage.saveButton.click();

    }

    @Then("user verifies new event {string} created")
    public void userVerifiesNewEventCreated(String arg0) {

        String actualResult = calendarPage.contains.getText();
        String expectedResult = arg0;

        Assert.assertEquals(expectedResult,actualResult);

    }


}

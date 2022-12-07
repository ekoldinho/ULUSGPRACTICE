Feature: Calendar Functionality

  Background: Blackboard login pre-cond
    Given user is on the Blackboard login page
    Given user passes "vehipaa96" username and password "826472Mal" and clicks on login
    Given user succesfully lands on Blackboard homepage
    Given user clicks on "Calendar" tool
@asimwip
Scenario: user creates new event on calendar
  When user clicks plus button
  And user writes the name of the event "Xmas Party" and clicks All Day button
  And user clicks save button
  Then user verifies new event "Xmas Party" created



@Aliwip
Feature: Zedat Portal Grade

  Background: user backg
    Given user is on the Blackboard login page
    Given user passes "yakupalit96" username and password "Sonradedimki1." and clicks on login
    Given user succesfully lands on Blackboard homepage


  Scenario: See your latest grade

    Given user clicks on "My Grades" tool
    Then user takes a ss for grades

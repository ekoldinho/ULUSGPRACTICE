@Ekowip
Feature: My Courses Functionality
  User Story:
  As a user, I should be able to print the names and number of all the courses taken
  Background:

    Given user is on the Blackboard login page
    Given user passes "aliekreu97" username and password "zxv10W300." and clicks on login
    Given user succesfully lands on Blackboard homepage


    Scenario: User can see the courses taken and print them
      When user prints the names of courses
      Then user prints the number of courses taken so far
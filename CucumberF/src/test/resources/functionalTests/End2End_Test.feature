
Feature: Automated End-to-End Test on Trade me


  Scenario: User has to check the keywords in motor section
    Given User clicks the Trademe Sandbox url
    When he clicks the Motors icon on the home page
    And searches BMW and click search button
    And select the first element
    And Verify the term Number Plate in the page
    And Verify the term Kilometres in the page
    And Verify the term Body in the page
    And Verify the term Seats in the page

  

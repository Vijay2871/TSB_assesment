
Feature: Recieve the quality order

Background: 

  Given Open the browser and launch the Dynamics url 
  Then I entered the valid credentials
  And I can see the dashboard page
  
  @Regression
  Scenario: Login check with valid credentials
   
    And I click the recieve button at the top corner
    Then Click the quality order
    And create a new quality order by clicking new option
    Then fill the test group and quanity
    And confirm the order by clicking the ok buton.
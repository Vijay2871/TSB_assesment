
Feature: Recieve the quality order


Background: 

  Given Open the browser and launch the Dynamics url 
  Then I entered the valid credentials
  And I can see the dashboard page
  
  
  @Regression
  Scenario: Login check with valid credentials
  
    And I click the transportation button at the top corner
    And I Click the route
    And view the requested delivery date and address
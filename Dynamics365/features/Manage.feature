
Feature: Purchase finalization

Background: 

  Given Open the browser and launch the Dynamics url 
  Then I entered the valid credentials
  And I can see the dashboard page
  
  
  @RegressionTesting
  Scenario: Login check with valid credentials
   
    And Click on the purchase button
    Then click the purchase order confirmation to view the purchase order

 

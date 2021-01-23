
Feature: Recieve the quality order

Background: 

  Given Open the browser and launch the Dynamics url 
  Then I entered the valid credentials
  And I can see the dashboard page
  
  @Regression
  Scenario: Login check with valid credentials
 
    And I click the invoice button at the top corner
    Then Click the cash flow forecasts
   Then I can view the account details
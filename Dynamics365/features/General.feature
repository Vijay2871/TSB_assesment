
Feature: Recieve the quality order


Background: 
  
  Given Open the browser and launch the Dynamics url 
  Then I entered the valid credentials
  And I can see the dashboard page
  
  @Regression
  Scenario Outline: Login check with valid credentials
   

    And I click the general button at the top corner
    And I click the cases and select create cases
    And select the <case category>
    Then I fill the information
       
    Examples: 
      | case category | 
      | general   | 
      | purchase   | 
      
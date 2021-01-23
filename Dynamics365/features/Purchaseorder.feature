Feature: Purchase order creation


Background: 

  Given Open the browser and launch the Dynamics url 
  Then I entered the valid credentials
  And I can see the dashboard page
 
    
  @Regression
  Scenario: Create purchase order
    
    Then Click the navigation panel and accounts payable and all purchase order
    Then click the new purchase order
    Then enter "<vendor account>"  and "<site>"
      | vendor account | site |
      |           1001 |    1 |
    Then click the ok button
    And enter the item number
    Then save and confirm the purchase order

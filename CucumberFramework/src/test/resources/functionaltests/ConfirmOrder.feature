Feature: I want to confirm the purchase order

  Background: 
    Given Open the browser and launch the Dynamics url
    Then I entered the valid credentials
    And I can see the dashboard page

  @RegressionTesting
  Scenario Outline: Title of your scenario outline
   
 Then I enter the <vendorname> and <site> of the purchase order
    And I click the ok button
     Then I enter the <itemnumber> of the purchase order
    And I save the purchase order
    Then I confirm the order
    Examples: 
      | vendorname | itemnumber | site |
      |       1000 | 1001 | 1 |

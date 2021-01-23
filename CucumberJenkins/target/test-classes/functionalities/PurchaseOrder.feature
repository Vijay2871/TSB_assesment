Feature: Purchaseorder operations

  Background: 
    Given Open the browser and launch the Dynamics url
    Then I entered the valid credentials
    And I can see the dashboard page

  @RegressionTesting
  Scenario Outline: Filling mandatory details in purchase order
    Then I enter the <itemnumber> and <site> of the purchase order
    And I click the ok button

    Examples: 
      | itemnumber | site |
      |       1000 |    1 |

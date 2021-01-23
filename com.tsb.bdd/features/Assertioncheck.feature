Feature: Trade Me Assertion Check

  Scenario: Check Keywords in Trade Me Website
    Given The User hits the Trade me url in Chrome
    Then User Clicks Motor
    Then User enters company name BMW and click search
    And select the first item
    Then Number plate is displayed
    And Kilometers is displayed
    And Body is displayed
    And Seats is displayed

Feature: Salesforce Lightning CRM features


  Scenario: Login Features
    Given Launched the chrome browser entering the salesforce url
    When I entered my valid  <username> and <password>
      | username                  | password |
      |18030625@student.agi.ac.nz | 5t4rncVB  |
Then I click the login button to see my homepage

    When I clicked the App launcher features
    Then I selected services option to navigate to service page
    Then I click the Accounts and created a new account
    And I fill the mandatory details
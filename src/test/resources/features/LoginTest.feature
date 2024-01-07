Feature: Log in
  Scenario: Validate that the user can log in
    Given the user introduces a valid username and password
    When the user clicks on the login button
    Then the user enters to the product page
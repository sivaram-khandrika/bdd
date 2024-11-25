Feature: feature to test login functionality

  Scenario: Checklogin is successful  with valid credentials
    Given user is on login page
    When user enters correct username and password
    And clicks on login button
    Then user is navigated to the homepage



Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: checking pre-condition, action and results
    Given user is on Application landing page
    When user clicks Sign in button
    Then user is on login screen
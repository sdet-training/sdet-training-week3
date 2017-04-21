Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: New User Registration
    Given user is on Application landing page
    When user enters "Irfan" in username field
    And user enters "123456" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered

  Scenario: login
    Given user is on Application landing page
    And Sign in button is present on screen
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "Irfan" in username field
    And user enters "123456" in password field
    And user clicks Sign in button
    Then user is on home page
    And title of home page is "GitHub"
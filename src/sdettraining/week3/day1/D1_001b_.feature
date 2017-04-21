Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: without and & but
    Given user is on Application landing page
    Given Sign in button is present on screen
    When user clicks on Log in button
    Then user can see login screen
    When user enters "Irfan@sdettraining.com" in username field
    When user enters "Password" in password field
    When user clicks Login button
    Then user is on home page
    Then title of home page is "SDET Training GUI API Test Projects"
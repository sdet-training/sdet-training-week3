@important
  Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Background: flow till home page
    Given user is on Application home page
    
 @smoke
  Scenario: New User Registration
    Given user is on Application landing page
    When user enters "Irfan" in username field
    And user enters "123456" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered

 @regression
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
    
  @sanity @regression
  Scenario: Existing user Verification
    Given user is displayed login screen
    Then we verify following user exists
      | Name       | Email            | JoinDate   |
      | Obama      | obama@email.com  | 2008-01-14 |
      | Bush       | bush@email.com   | 2001-01-14 |
      | Trump      | trump@email.org  | 2017-01-14 |
      | Clinton    | clinton@email.org| 1990-01-14 |
      
      
  
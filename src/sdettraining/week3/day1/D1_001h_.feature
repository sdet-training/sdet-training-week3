Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions
  
Scenario Outline: Login fail - possible combinations
    Given user is on Application landing page
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user clicks Sign in button
    Then user gets login failed error message

    Examples: 
      | UserName      | Password      |
      | wrongusername | 123456        |
      | irfan         | wrongpassword |
      | wrongusername | wrongpassword |

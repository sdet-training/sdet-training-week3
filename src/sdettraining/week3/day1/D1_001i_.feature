Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions

  Scenario: login flow
    Given user is on Application landing page
    And Sign in button is present on screen
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "Irfan" in username field
    And user enters "123456" in password field
    And user clicks Sign in button
    Then user is on home page
    And title of home page is "GitHub"

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
      | Irfan         | wrongpassword |
      | wrongusername | wrongpassword |

  Scenario: Existing user Verification
    Given user is on Application landing page
    Then we verify following user exists
      | Name    | Email           | 
      | Irfan   | ikusa@email.com | 
      | Ram     | ram@email.com   | 
      | Sham    | sham@email.org  | 

  Scenario: New User Registration
    Given user is on Application landing page
    When user enters "Irfan" in username field
    And user enters "ikusa@gmail.com" in password field
    And user enters "123456" in password field
    And user clicks on Signup for GitHub button
    Then user is successfully registered
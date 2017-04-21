Feature: login Page
  In order to test login page
  As a Registered user
  I want to specify the login conditions
  
Scenario: Existing user Verification
 
Given user is on Application landing page
    Then we verify following users can login
       | email                  | pwd       |
       | irfan@sdettraining.com | Password  |
       | ram@email.com          | Password  |
       | sham@email.org         | Password  |
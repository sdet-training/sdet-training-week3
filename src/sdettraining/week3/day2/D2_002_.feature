Feature: login Page - With Capture and Non Capture Groups
  In order to test login page
  As a Registered user
  I want to specify the login conditions

Scenario: Optional Capture Groups/Alternation
    #positive
    Then I see following dollars in my account
    #negative
    Then I do not see following dollars in my account
   
Scenario: Optional Non capture Groups
    Given I have following dollars in my account
    Given He has following dollars in my account
    Given User has following dollars in my account
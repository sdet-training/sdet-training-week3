Feature: sending Emails
  In order to send emails
  As a Registered user
  I want to receive an email with Role and body

Scenario Outline: E-mail content verification
    Given I have a user account with <Role> rights
    Then I should receive an email with the body:
      """
      Dear user,
      You have been granted <Role> rights.  You are <details>. Please be    
      responsible.
      -The Admins
      """

    Examples:
      | Role    | details                                       |
      | Manager | now able to manage your employee accounts     |
      | Admin   | able to manage any user account on system     |
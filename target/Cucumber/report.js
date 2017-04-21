$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sdettraining/week3/day2/D2_001a_.feature");
formatter.feature({
  "line": 1,
  "name": "login Page",
  "description": "In order to test login page\r\nAs a Registered user\r\nI want to specify the login conditions",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "checking pre-condition, action and results",
  "description": "",
  "id": "login-page;checking-pre-condition,-action-and-results",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on Application landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is on login screen",
  "keyword": "Then "
});
formatter.match({
  "location": "D2_001_.user_is_on_Application_landing_page()"
});
formatter.result({
  "duration": 174316580,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat sdettraining.week3.day2.D2_001_.user_is_on_Application_landing_page(D2_001_.java:14)\r\n\tat ✽.Given user is on Application landing page(sdettraining/week3/day2/D2_001a_.feature:7)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "D2_001_.user_clicks_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "D2_001_.user_is_on_login_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("sdettraining/week3/day2/D2_002_.feature");
formatter.feature({
  "line": 1,
  "name": "login Page - With Capture and Non Capture Groups",
  "description": "In order to test login page\r\nAs a Registered user\r\nI want to specify the login conditions",
  "id": "login-page---with-capture-and-non-capture-groups",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Optional Capture Groups/Alternation",
  "description": "",
  "id": "login-page---with-capture-and-non-capture-groups;optional-capture-groups/alternation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#positive"
    }
  ],
  "line": 8,
  "name": "I see following dollars in my account",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#negative"
    }
  ],
  "line": 10,
  "name": "I do not see following dollars in my account",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": " see",
      "offset": 1
    }
  ],
  "location": "D2_002_.I_see_or_do_not_see_following_dollars_in_my_account(String)"
});
formatter.result({
  "duration": 4630189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " do not see",
      "offset": 1
    }
  ],
  "location": "D2_002_.I_see_or_do_not_see_following_dollars_in_my_account(String)"
});
formatter.result({
  "duration": 101781,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Optional Non capture Groups",
  "description": "",
  "id": "login-page---with-capture-and-non-capture-groups;optional-non-capture-groups",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I have following dollars in my account",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "He has following dollars in my account",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User has following dollars in my account",
  "keyword": "Given "
});
formatter.match({
  "location": "D2_002_.have_following_dollars_in_my_account()"
});
formatter.result({
  "duration": 41483,
  "status": "passed"
});
formatter.match({
  "location": "D2_002_.have_following_dollars_in_my_account()"
});
formatter.result({
  "duration": 26087,
  "status": "passed"
});
formatter.match({
  "location": "D2_002_.have_following_dollars_in_my_account()"
});
formatter.result({
  "duration": 24376,
  "status": "passed"
});
formatter.uri("sdettraining/week3/day2/D2_003_.feature");
formatter.feature({
  "line": 1,
  "name": "sending Emails",
  "description": "In order to send emails\r\nAs a Registered user\r\nI want to receive an email with Role and body",
  "id": "sending-emails",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "E-mail content verification",
  "description": "",
  "id": "sending-emails;e-mail-content-verification",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a user account with \u003cRole\u003e rights",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should receive an email with the body:",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 9,
    "value": "Dear user,\r\nYou have been granted \u003cRole\u003e rights.  You are \u003cdetails\u003e. Please be    \r\nresponsible.\r\n-The Admins"
  }
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "sending-emails;e-mail-content-verification;",
  "rows": [
    {
      "cells": [
        "Role",
        "details"
      ],
      "line": 17,
      "id": "sending-emails;e-mail-content-verification;;1"
    },
    {
      "cells": [
        "Manager",
        "now able to manage your employee accounts"
      ],
      "line": 18,
      "id": "sending-emails;e-mail-content-verification;;2"
    },
    {
      "cells": [
        "Admin",
        "able to manage any user account on system"
      ],
      "line": 19,
      "id": "sending-emails;e-mail-content-verification;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "E-mail content verification",
  "description": "",
  "id": "sending-emails;e-mail-content-verification;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a user account with Manager rights",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should receive an email with the body:",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 9,
    "value": "Dear user,\r\nYou have been granted Manager rights.  You are now able to manage your employee accounts. Please be    \r\nresponsible.\r\n-The Admins"
  }
});
formatter.match({
  "arguments": [
    {
      "val": "Manager",
      "offset": 27
    }
  ],
  "location": "D2_003_.i_have_a_user_account_with_Manager_rights(String)"
});
formatter.result({
  "duration": 217247,
  "status": "passed"
});
formatter.match({
  "location": "D2_003_.i_should_receive_an_email_with_the_body(String)"
});
formatter.result({
  "duration": 3151122437,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "E-mail content verification",
  "description": "",
  "id": "sending-emails;e-mail-content-verification;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I have a user account with Admin rights",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should receive an email with the body:",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 9,
    "value": "Dear user,\r\nYou have been granted Admin rights.  You are able to manage any user account on system. Please be    \r\nresponsible.\r\n-The Admins"
  }
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 27
    }
  ],
  "location": "D2_003_.i_have_a_user_account_with_Manager_rights(String)"
});
formatter.result({
  "duration": 258729,
  "status": "passed"
});
formatter.match({
  "location": "D2_003_.i_should_receive_an_email_with_the_body(String)"
});
formatter.result({
  "duration": 1964112714,
  "status": "passed"
});
formatter.uri("sdettraining/week3/day2/D2_004_.feature");
formatter.feature({
  "line": 2,
  "name": "login Page",
  "description": "In order to test login page\r\nAs a Registered user\r\nI want to specify the login conditions",
  "id": "login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@important"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "flow till home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user is on Application home page",
  "keyword": "Given "
});
formatter.match({
  "location": "D2_004_.user_is_on_Application_home_page()"
});
formatter.result({
  "duration": 68852,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "New User Registration",
  "description": "",
  "id": "login-page;new-user-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on Application landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user enters \"Irfan\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters \"123456\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on Signup for GitHub button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user is successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "D2_001_.user_is_on_Application_landing_page()"
});
formatter.result({
  "duration": 215537,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat sdettraining.week3.day2.D2_001_.user_is_on_Application_landing_page(D2_001_.java:14)\r\n\tat ✽.Given user is on Application landing page(sdettraining/week3/day2/D2_004_.feature:12)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "Irfan",
      "offset": 13
    }
  ],
  "location": "D2_004_.user_enters_in_username_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "D2_004_.user_enters_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "line": 7,
  "name": "flow till home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user is on Application home page",
  "keyword": "Given "
});
formatter.match({
  "location": "D2_004_.user_is_on_Application_home_page()"
});
formatter.result({
  "duration": 39772,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "login",
  "description": "",
  "id": "login-page;login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user is on Application landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Sign in button is present on screen",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user is displayed login screen",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user enters \"Irfan\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user enters \"123456\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user clicks Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "title of home page is \"GitHub\"",
  "keyword": "And "
});
formatter.match({
  "location": "D2_001_.user_is_on_Application_landing_page()"
});
formatter.result({
  "duration": 219386,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat sdettraining.week3.day2.D2_001_.user_is_on_Application_landing_page(D2_001_.java:14)\r\n\tat ✽.Given user is on Application landing page(sdettraining/week3/day2/D2_004_.feature:20)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "D2_004_.sign_in_button_is_present_on_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "Irfan",
      "offset": 13
    }
  ],
  "location": "D2_004_.user_enters_in_username_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 13
    }
  ],
  "location": "D2_004_.user_enters_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "D2_001_.user_clicks_Sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "D2_004_.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "GitHub",
      "offset": 23
    }
  ],
  "location": "D2_004_.title_of_home_page_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 7,
  "name": "flow till home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user is on Application home page",
  "keyword": "Given "
});
formatter.match({
  "location": "D2_004_.user_is_on_Application_home_page()"
});
formatter.result({
  "duration": 32929,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Existing user Verification",
  "description": "",
  "id": "login-page;existing-user-verification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@sanity"
    },
    {
      "line": 30,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user is displayed login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "we verify following user exists",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "JoinDate"
      ],
      "line": 34
    },
    {
      "cells": [
        "Obama",
        "obama@email.com",
        "2008-01-14"
      ],
      "line": 35
    },
    {
      "cells": [
        "Bush",
        "bush@email.com",
        "2001-01-14"
      ],
      "line": 36
    },
    {
      "cells": [
        "Trump",
        "trump@email.org",
        "2017-01-14"
      ],
      "line": 37
    },
    {
      "cells": [
        "Clinton",
        "clinton@email.org",
        "1990-01-14"
      ],
      "line": 38
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "D2_004_.we_verify_following_user_exists(User\u003e)"
});
formatter.result({
  "status": "skipped"
});
});
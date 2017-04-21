$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("github_logn.feature");
formatter.feature({
  "line": 1,
  "name": "github login",
  "description": "",
  "id": "github-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login without username and password",
  "description": "",
  "id": "github-login;login-without-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on github homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user is displayed login screen",
  "keyword": "Then "
});
formatter.match({
  "location": "login_stepDefinition.user_is_on_github_homepage()"
});
formatter.result({
  "duration": 6547863062,
  "status": "passed"
});
formatter.match({
  "location": "login_stepDefinition.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 211477744,
  "status": "passed"
});
formatter.match({
  "location": "login_stepDefinition.user_is_displayed_login_screen()"
});
formatter.result({
  "duration": 921309683,
  "status": "passed"
});
});
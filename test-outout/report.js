$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login1.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios login functionality",
  "description": "",
  "id": "techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_login_page()"
});
formatter.result({
  "duration": 4310598700,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "",
  "description": "",
  "id": "techfios-login-functionality;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user should be on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_enter_the_username_and_password()"
});
formatter.result({
  "duration": 936658200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_submit_button()"
});
formatter.result({
  "duration": 1539609600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_should_be_on_homepage()"
});
formatter.result({
  "duration": 734236700,
  "status": "passed"
});
});
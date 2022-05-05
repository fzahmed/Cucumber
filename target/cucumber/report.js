$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/LoginUsingDatabese.feature");
formatter.feature({
  "name": "User should be able to login using test data from Database",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user willbe able to login using Database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Dblogin"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Techfios Database Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.user_is_on_Techfios_Database_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user put \"username\" in username field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_put_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user put \"passward\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_put_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user lands on Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_lands_on_Dashboard_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
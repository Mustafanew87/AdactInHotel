$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactInScenarios.feature");
formatter.feature({
  "line": 2,
  "name": "End to End functionality for AdactIn Web Application",
  "description": "Contains 3 test scenario with Login Details",
  "id": "end-to-end-functionality-for-adactin-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TC"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "User lauch the browser",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User should launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User hold for \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "AdactInStepDefinition.user_should_launch_the_browser()"
});
formatter.result({
  "duration": 17287840099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "AdactInStepDefinition.user_hold_for_seconds(int)"
});
formatter.result({
  "duration": 5003617542,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User verify for valid login details",
  "description": "",
  "id": "end-to-end-functionality-for-adactin-web-application;user-verify-for-valid-login-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User should verify the Welcome to AdactIn Group of Hotels is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should enter the username in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should enter the passward in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks the Login button in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User hold for \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click the signout to exit from the loggin page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User hold for \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "AdactInStepDefinition.user_should_verify_the_Welcome_to_AdactIn_Group_of_Hotels_is_displayed()"
});

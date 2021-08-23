$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "AppiumTest",
  "description": "",
  "id": "appiumtest",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@appium"
    }
  ]
});
formatter.before({
  "duration": 8502094211,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login to RN app",
  "description": "",
  "id": "appiumtest;login-to-rn-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Select login button",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Input username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify login",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.SelectLoginButton()"
});
formatter.result({
  "duration": 1042101803,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.inputUsernameAndPassword()"
});
formatter.result({
  "duration": 2258955590,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.ClickOnLoginButton()"
});
formatter.result({
  "duration": 847629408,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyLogin()"
});
formatter.result({
  "duration": 1289110434,
  "status": "passed"
});
formatter.after({
  "duration": 24262,
  "status": "passed"
});
});
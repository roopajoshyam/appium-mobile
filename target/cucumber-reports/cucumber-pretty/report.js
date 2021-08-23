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
  "duration": 9018220925,
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
  "duration": 898374598,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.inputUsernameAndPassword()"
});
formatter.result({
  "duration": 2167346499,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.ClickOnLoginButton()"
});
formatter.result({
  "duration": 960456130,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyLogin()"
});
formatter.result({
  "duration": 1317886773,
  "status": "passed"
});
formatter.after({
  "duration": 3078080649,
  "status": "passed"
});
});
@appium
Feature: AppiumTest


  Scenario: Login to RN app
    Given Select login button
    Then Input username and password
    And Click on login
    And Verify login

@login
Feature: AppiumTest Login

  Scenario: Login to RN app
    Given Select login button
    Then Input username and password

  Scenario: Verify
    Given Click on login
    And Verify login

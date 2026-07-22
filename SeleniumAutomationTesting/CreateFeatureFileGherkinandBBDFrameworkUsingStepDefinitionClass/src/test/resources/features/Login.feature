Feature: Login Functionality

  Scenario: Login User with correct email and password
    Given User launches the browser
    And User is on Automation Exercise home page
    When User clicks on Signup Login button
    Then Login to your account section should be displayed
    When User enters valid email "automationtest123@gmail.com"
    And User enters valid password "Test@123"
    And User clicks Login button
    Then Logged in as username should be displayed
    When User clicks Delete Account button
    Then Account Deleted should be displayed
    And User clicks Continue button

  Scenario: Login User with incorrect email and password
    Given User launches the browser
    And User is on Automation Exercise home page
    When User clicks on Signup Login button
    Then Login to your account section should be displayed
    When User enters invalid email "wronguser@gmail.com"
    And User enters invalid password "Wrong@123"
    And User clicks Login button
    Then Error message Your email or password is incorrect should be displayed

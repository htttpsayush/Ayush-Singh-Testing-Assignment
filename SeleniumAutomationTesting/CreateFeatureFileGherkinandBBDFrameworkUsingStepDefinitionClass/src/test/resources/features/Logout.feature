Feature: Logout Functionality

  Scenario: Logout User Successfully
    Given User launches the browser
    And User is on Automation Exercise home page
    When User clicks on Signup Login button
    Then Login to your account section should be displayed
    When User enters valid email "bablu@gmail.com"
    And User enters valid password "bablu1234"
    And User clicks Login button
    Then Logged in as username should be displayed
    When User clicks Logout button
    Then User should be navigated to Login page

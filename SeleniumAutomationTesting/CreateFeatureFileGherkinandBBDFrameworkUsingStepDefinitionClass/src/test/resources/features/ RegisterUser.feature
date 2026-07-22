Feature: Register User

  Scenario: Register a new user successfully

    Given User launches the browser
    And User is on Automation Exercise home page
    When User clicks on Signup Login button
    Then New User Signup section should be displayed

    When User enters name "Ayush"
    And User enters email "ayush123456@gmail.com"
    And User clicks Signup button

    Then Enter Account Information page should be displayed

    When User selects title "Mr"
    And User enters password "Test@123"
    And User selects day "10"
    And User selects month "May"
    And User selects year "2002"

    And User selects newsletter checkbox
    And User selects special offers checkbox

    And User enters first name "Ayush"
    And User enters last name "Singh"
    And User enters company "Coforge"
    And User enters address1 "Mathura"
    And User enters address2 "UP"

    And User selects country "India"

    And User enters state "Uttar Pradesh"
    And User enters city "Mathura"
    And User enters zipcode "281001"
    And User enters mobile number "9876543210"

    And User clicks Create Account button

    Then Account Created should be displayed

    When User clicks Continue button

    Then Logged in as username should be displayed

    When User clicks Delete Account button

    Then Account Deleted should be displayed

    And User clicks Continue button
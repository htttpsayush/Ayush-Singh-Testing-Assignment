Feature: Register User with Existing Email

Scenario: Register using an already registered email

Given User launches the browser
And User is on Automation Exercise home page
When User clicks on Signup Login button
Then New User Signup section should be displayed
When User enters existing name "bablu"
And User enters existing email "bablu@gmail.com"
And User clicks on Signup button for existing email
Then Error Email Address already exist should be displayed
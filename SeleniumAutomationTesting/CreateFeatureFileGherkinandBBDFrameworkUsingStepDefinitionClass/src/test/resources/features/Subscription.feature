Feature: Verify Subscription in Home Page

Scenario: Verify Subscription functionality

Given User launches the browser
And User is on Automation Exercise home page
When User scrolls down to footer
Then Subscription text should be visible
When User enters subscription email "ayush@gmail.com"
And User clicks Subscribe button
Then Subscription success message should be displayed
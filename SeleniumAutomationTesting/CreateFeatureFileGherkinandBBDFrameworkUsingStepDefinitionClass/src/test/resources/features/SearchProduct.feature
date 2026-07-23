Feature: Search Product

Scenario: Search a product successfully

Given User launches the browser
And User is on Automation Exercise home page
When User clicks on Products button
Then User should be navigated to All Products page
When User enters product name "Blue Top" in search box
And User clicks Search button
Then Searched Products should be displayed
And All searched products should be visible
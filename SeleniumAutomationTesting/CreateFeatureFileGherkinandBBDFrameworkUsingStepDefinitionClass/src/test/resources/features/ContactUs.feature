Feature: Contact Us Form

Scenario: Submit Contact Us Form Successfully

Given User launches the browser
And User is on Automation Exercise home page
When User clicks on Contact Us button
Then Get In Touch should be displayed
When User enters contact name "Ayush Kumar Singh"
And User enters contact email "ayush@gmail.com"
And User enters contact subject "Automation Testing"
And User enters contact message "This is a Selenium Automation Test."
And User uploads file "C:\\Users\\acayu\\Downloads\\sample.txt"
When User clicks Submit button
Then Success message should be displayed
When User clicks Home button
Then User should be navigated to Home page
Feature: Cart Functionality

Scenario: Verify Subscription in Cart Page

Given User launches the browser
And User is on Automation Exercise home page
When User clicks Cart button
And User scrolls down to footer in Cart page
Then Subscription should be visible in Cart page
When User enters email in Cart subscription "ayush@gmail.com"
And User clicks Subscribe button in Cart page
Then Subscription success message should be displayed in Cart page


Scenario: Add Product to Cart

Given User launches the browser
And User is on Automation Exercise home page
When User opens Products page
And User adds first product to cart
And User clicks Continue Shopping
And User clicks View Cart
Then Product should be added successfully into cart
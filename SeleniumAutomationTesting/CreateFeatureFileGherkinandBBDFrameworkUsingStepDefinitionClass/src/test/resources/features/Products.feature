Feature: Verify All Products and Product Detail Page

Scenario: Verify all products and product details

Given User launches the browser
And User is on Automation Exercise home page
When User clicks on Products button
Then User should be navigated to All Products page
And Products list should be visible
When User clicks on View Product of first product
Then Product detail page should be displayed
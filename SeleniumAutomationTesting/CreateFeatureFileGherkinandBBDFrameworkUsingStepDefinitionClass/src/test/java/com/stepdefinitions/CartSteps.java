package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.CartPage;
import com.pages.ProductsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {

    CartPage cartPage = new CartPage(DriverFactory.getDriver());
    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    // ==========================
    // TC11 - Subscription in Cart
    // ==========================

    @When("User clicks Cart button")
    public void user_clicks_cart_button() {

        cartPage.clickCart();

    }

    @When("User scrolls down to footer in Cart page")
    public void user_scrolls_down_to_footer_in_cart_page() {

        cartPage.scrollToFooter();

    }

    @Then("Subscription should be visible in Cart page")
    public void subscription_should_be_visible_in_cart_page() {

        Assert.assertTrue(cartPage.isSubscriptionVisible());

    }

    @When("User enters email in Cart subscription {string}")
    public void user_enters_email_in_cart_subscription(String email) {

        cartPage.enterSubscriptionEmail(email);

    }

    @When("User clicks Subscribe button in Cart page")
    public void user_clicks_subscribe_button_in_cart_page() {

        cartPage.clickSubscribe();

    }

    @Then("Subscription success message should be displayed in Cart page")
    public void subscription_success_message_should_be_displayed_in_cart_page() {

        Assert.assertTrue(cartPage.isSubscriptionSuccessDisplayed());

    }

    // ==========================
    // TC12 - Add Products in Cart
    // ==========================

    @When("User opens Products page")
    public void user_opens_products_page() {

        productsPage.clickProducts();

    }

    @When("User adds first product to cart")
    public void user_adds_first_product_to_cart() {

        cartPage.addFirstProductToCart();

    }

    @When("User clicks Continue Shopping")
    public void user_clicks_continue_shopping() {

        cartPage.clickContinueShopping();

    }

    @When("User clicks View Cart")
    public void user_clicks_view_cart() {

        cartPage.clickViewCart();

    }

    @Then("Product should be added successfully into cart")
    public void product_should_be_added_successfully_into_cart() {

        Assert.assertTrue(cartPage.isProductAddedToCart());

    }

}
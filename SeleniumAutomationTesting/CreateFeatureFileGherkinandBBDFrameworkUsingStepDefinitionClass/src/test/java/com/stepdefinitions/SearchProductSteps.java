package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.ProductsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {

    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    @When("User enters product name {string} in search box")
    public void user_enters_product_name_in_search_box(String productName) {

        productsPage.searchProduct(productName);

    }

    @When("User clicks Search button")
    public void user_clicks_search_button() {

        productsPage.clickSearchButton();

    }

    @Then("Searched Products should be displayed")
    public void searched_products_should_be_displayed() {

        Assert.assertTrue(productsPage.isSearchedProductsDisplayed());

    }

    @Then("All searched products should be visible")
    public void all_searched_products_should_be_visible() {

        Assert.assertTrue(productsPage.isSearchResultsDisplayed());

    }

}
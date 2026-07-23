package com.stepdefinitions;

import org.testng.Assert;

import com.base.DriverFactory;
import com.pages.ProductsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsSteps {

    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    @When("User clicks on Products button")
    public void user_clicks_on_products_button() {

        productsPage.clickProducts();

    }

    @Then("User should be navigated to All Products page")
    public void user_should_be_navigated_to_all_products_page() {

        Assert.assertTrue(productsPage.isAllProductsPageDisplayed());

    }

    @Then("Products list should be visible")
    public void products_list_should_be_visible() {

        Assert.assertTrue(productsPage.isProductListVisible());

    }

    @When("User clicks on View Product of first product")
    public void user_clicks_on_view_product_of_first_product() {

        productsPage.clickFirstViewProduct();

    }

    @Then("Product detail page should be displayed")
    public void product_detail_page_should_be_displayed() {

        Assert.assertTrue(productsPage.isProductDetailVisible());

    }

}
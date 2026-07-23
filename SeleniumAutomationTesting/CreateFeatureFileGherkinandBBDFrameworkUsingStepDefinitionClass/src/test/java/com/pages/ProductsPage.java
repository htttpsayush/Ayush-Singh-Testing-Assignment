package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators
    private By productsButton =
            By.xpath("//a[@href='/products']");

    private By allProductsTitle =
            By.xpath("//h2[contains(text(),'All Products')]");

    private By productList =
            By.xpath("//div[@class='features_items']/div");

    private By firstViewProduct =
            By.xpath("(//a[contains(text(),'View Product')])[1]");

    private By productInformation =
            By.xpath("//div[@class='product-information']");

    // Search
    private By searchBox =
            By.id("search_product");

    private By searchButton =
            By.id("submit_search");

    private By searchedProductsTitle =
            By.xpath("//h2[contains(text(),'Searched Products')]");

    private By searchedProducts =
            By.xpath("//div[@class='features_items']/div");

    // Methods

    public void clickProducts() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(productsButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public boolean isAllProductsPageDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(allProductsTitle))
                .isDisplayed();
    }

    public boolean isProductListVisible() {

        List<WebElement> products =
                driver.findElements(productList);

        return products.size() > 0;
    }

    public void clickFirstViewProduct() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(firstViewProduct));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    public boolean isProductDetailVisible() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(productInformation))
                .isDisplayed();
    }

    // ---------- Search Product ----------

    public void searchProduct(String product) {

        driver.findElement(searchBox).clear();
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearchButton() {

        driver.findElement(searchButton).click();
    }

    public boolean isSearchedProductsDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchedProductsTitle))
                .isDisplayed();
    }

    public boolean isSearchResultsDisplayed() {

        return driver.findElements(searchedProducts).size() > 0;
    }

}
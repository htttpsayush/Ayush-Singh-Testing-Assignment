package com.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // ============================
    // Locators
    // ============================

    private By cartButton =
            By.xpath("//a[contains(text(),'Cart')]");

    private By subscriptionText =
            By.xpath("//h2[contains(text(),'Subscription')]");

    private By subscriptionEmail =
            By.id("susbscribe_email");

    private By subscribeButton =
            By.id("subscribe");

    private By subscriptionSuccess =
            By.xpath("//div[contains(@class,'alert-success')]");

    private By firstProduct =
            By.xpath("(//div[@class='product-image-wrapper'])[1]");

    private By addToCartButton =
            By.xpath("(//a[contains(text(),'Add to cart')])[1]");

    private By continueShoppingButton =
            By.xpath("//button[contains(text(),'Continue Shopping')]");

    private By viewCartButton =
            By.xpath("//u[contains(text(),'View Cart')]");

    private By cartProducts =
            By.xpath("//tr[contains(@id,'product')]");

    // ============================
    // Cart
    // ============================

    public void clickCart() {

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(cartButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

    // ============================
    // Subscription
    // ============================

    public void scrollToFooter() {

        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public boolean isSubscriptionVisible() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(subscriptionText))
                .isDisplayed();
    }

    public void enterSubscriptionEmail(String email) {

        driver.findElement(subscriptionEmail).sendKeys(email);
    }

    public void clickSubscribe() {

        driver.findElement(subscribeButton).click();
    }

    public boolean isSubscriptionSuccessDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(subscriptionSuccess))
                .isDisplayed();
    }

    // ============================
    // Add Product
    // ============================

    public void addFirstProductToCart() {

        WebElement product =
                wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct));

        new Actions(driver).moveToElement(product).perform();

        WebElement addButton =
                wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", addButton);
    }

    public void clickContinueShopping() {

        wait.until(ExpectedConditions.elementToBeClickable(
                continueShoppingButton)).click();
    }

    public void clickViewCart() {

        wait.until(ExpectedConditions.elementToBeClickable(
                viewCartButton)).click();
    }

    public boolean isProductAddedToCart() {

        List<WebElement> products =
                driver.findElements(cartProducts);

        return products.size() > 0;
    }

}
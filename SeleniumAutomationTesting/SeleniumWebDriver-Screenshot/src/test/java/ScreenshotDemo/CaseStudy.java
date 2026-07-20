package ScreenshotDemo;





import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaseStudy {

    WebDriver driver;
    String baseURL = "https://www.demoblaze.com/";

    // Screenshot Method
    public void takeScreenshot(String stepName) throws IOException {

        File folder = new File("./ScreenShots");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(folder, stepName + ".png");

        FileUtils.copyFile(source, destination);

        System.out.println(stepName + " Screenshot Captured");
    }

    


		
   

    @Test
    public void Casestudyscreenshot() throws Exception {

        // Step 1 - Launch Browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        takeScreenshot("Step01_LaunchBrowser");

        // Step 2 - Navigate Website
        driver.get(baseURL);

        takeScreenshot("Step02_HomePage");

        // Step 3 - Login
        driver.findElement(By.id("login2")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("loginusername")).sendKeys("ayush1012");
        driver.findElement(By.id("loginpassword")).sendKeys("ayush1234");

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Thread.sleep(4000);

        takeScreenshot("Step03_Login");

        // Step 4 - Search/Open Product
        driver.findElement(By.linkText("Samsung galaxy s6")).click();

        Thread.sleep(3000);

        takeScreenshot("Step04_Product");

        // Step 5 - Product Details Page
        System.out.println("Product Details Opened");

        takeScreenshot("Step05_ProductDetails");

        // Step 6 - Add Product To Cart
        driver.findElement(By.linkText("Add to cart")).click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);

        takeScreenshot("Step06_AddToCart");

        // Step 7 - Verify Cart
        driver.findElement(By.id("cartur")).click();

        Thread.sleep(3000);

        if (driver.getPageSource().contains("Samsung galaxy s6")) {
            System.out.println("Cart Verified");
        } else {
            System.out.println("Cart Verification Failed");
        }

        takeScreenshot("Step07_Cart");

        // Step 8 - Apply Coupon
        System.out.println("Coupon Feature Not Available");

        takeScreenshot("Step08_Coupon");

        // Step 9 - Proceed To Checkout
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        Thread.sleep(2000);

        takeScreenshot("Step09_Checkout");

        // Step 10 - Shipping Address
        driver.findElement(By.id("name")).sendKeys("Ayush");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Noida");
        driver.findElement(By.id("card")).sendKeys("106434645223");
        driver.findElement(By.id("month")).sendKeys("July");
        driver.findElement(By.id("year")).sendKeys("2026");

        takeScreenshot("Step10_Address");

        // Step 11 - Delivery Option
        System.out.println("Delivery Option Not Available");

        takeScreenshot("Step11_DeliveryOption");

        // Step 12 - Payment Method
        System.out.println("Credit Card Selected");

        takeScreenshot("Step12_PaymentMethod");

        // Step 13 - Complete Payment
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        Thread.sleep(3000);

        takeScreenshot("Step13_PaymentCompleted");

        // Step 14 - Verify Order Confirmation
        String actual = driver.findElement(By.xpath("//h2")).getText();
        String expected = "Thank you for your purchase!";

        if (actual.equals(expected)) {
            System.out.println("Order Placed Successfully");
        } else {
            System.out.println("Order Failed");
        }

        takeScreenshot("Step14_OrderConfirmation");

        // Step 15 - Verify My Orders
        System.out.println("My Orders Feature Not Available");

        takeScreenshot("Step15_MyOrders");

        // Click OK
        driver.findElement(By.xpath("//button[text()='OK']")).click();

        Thread.sleep(2000);

        // Step 16 - Logout
        driver.findElement(By.id("logout2")).click();

        Thread.sleep(3000);

        takeScreenshot("Step16_Logout");

        driver.quit();
    }}
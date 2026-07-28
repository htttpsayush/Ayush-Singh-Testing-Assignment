package com.guru99.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99.base.BaseClass;
import com.guru99.pages.LoginPage;
import com.guru99.pages.NewCustomerPage;

public class NewCustomerTest extends BaseClass {

    @Test(priority = 3)
    public void newCustomerTest() {

        // Login
        LoginPage login = new LoginPage(driver);
        login.login(config.getUsername(), config.getPassword());

        // Generate unique email
        String email = "rahul" + System.currentTimeMillis() + "@gmail.com";

        // Create Customer
        NewCustomerPage customer = new NewCustomerPage(driver);

        customer.addNewCustomer(
                "Rahul Sharma",
                "10/10/1998",
                "Delhi",
                "Delhi",
                "Delhi",
                "110001",
                "9876543210",
                email,
                "Rahul@123");

        // Verify
        String actualMessage = customer.getSuccessMessage();

        Assert.assertEquals(actualMessage,
                "Customer Registered Successfully!!!");

        System.out.println("Customer Created Successfully");
    }
}
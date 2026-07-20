package com.Framwork.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPages;

import utility.ExcelDataReader;

public class LoginorangeHRM extends BaseClass {

    @Test
    public void loginApp() throws InterruptedException {

        ExcelDataReader excel = new ExcelDataReader();

        LoginPages loginHRM =
                PageFactory.initElements(driver, LoginPages.class);

        loginHRM.LoginPage(
                excel.getStringData("Sheet1", 0, 0),
                excel.getStringData("Sheet1", 0, 1)
        );

        Thread.sleep(1000);
    }
}
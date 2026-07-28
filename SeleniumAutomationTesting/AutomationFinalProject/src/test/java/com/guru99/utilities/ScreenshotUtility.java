package com.guru99.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

    private ScreenshotUtility() {
        // Prevent object creation
    }

    public static String captureScreenshot(WebDriver driver, String testName) {

        String timeStamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

        String folderPath = "Screenshots";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdirs();
        }

        String filePath = folderPath + File.separator + testName + "_" + timeStamp + ".png";

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(filePath);

        try {
            FileUtils.copyFile(source, destination);
            System.out.println("Screenshot saved at : " + destination.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException("Unable to capture screenshot.", e);
        }

        return filePath;
    }
}
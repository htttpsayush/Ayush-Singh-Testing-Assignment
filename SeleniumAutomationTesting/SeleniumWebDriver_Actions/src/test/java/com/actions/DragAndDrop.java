package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://jqueryui.com/droppable/");
        Thread.sleep(3000);

        driver.switchTo().frame(0);   // switch to frame if it's present

        Actions action = new Actions(driver);

        action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
              .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
              .release().build().perform();
        
        driver.quit();
              
              
    }
}
package DataDrivenTesting;

import java.io.FileReader;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class CSVFileReading {

    WebDriver driver;

    String CsvPath = "D:\\coforge testing folder\\CSV File Reading\\Details.csv";

    @BeforeTest
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://only-testing-blog.blogspot.com/2014/05/form.html");
    }

    @Test
    public void DDDTestingBlog() throws Exception {

        CSVReader reader = new CSVReader(new FileReader(CsvPath));

        String[] csvCell;

        while ((csvCell = reader.readNext()) != null) {

            String FName = csvCell[0];
            String LName = csvCell[1];
            String Email = csvCell[2];
            String MNumb = csvCell[3];
            String CName = csvCell[4];

            driver.findElement(By.name("FirstName")).clear();
            driver.findElement(By.name("FirstName")).sendKeys(FName);

            driver.findElement(By.name("LastName")).clear();
            driver.findElement(By.name("LastName")).sendKeys(LName);

            driver.findElement(By.name("EmailID")).clear();
            driver.findElement(By.name("EmailID")).sendKeys(Email);

            driver.findElement(By.name("MobNo")).clear();
            driver.findElement(By.name("MobNo")).sendKeys(MNumb);

            driver.findElement(By.name("Company")).clear();
            driver.findElement(By.name("Company")).sendKeys(CName);

            Thread.sleep(1000);

            driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

            Thread.sleep(1000);

            Alert alert = driver.switchTo().alert();
            alert.accept();
        }

        reader.close();
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
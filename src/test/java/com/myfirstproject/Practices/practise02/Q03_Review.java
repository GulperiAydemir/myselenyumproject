package com.myfirstproject.Practices.practise02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q03_Review {


    // Create chrome driver by using @Before annotation and WebDriverManager
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Go to url : http://www.uitestpractice.com/
    @Test
    public void q03() {
        driver.get("http://www.uitestpractice.com/");

        // Click on 'Form'
        driver.findElement(By.linkText("Form")).click();

        // Fill the First Name: John

        driver.findElement(By.id("firstname")).sendKeys("John");
        // Fill the Last Name: Doe
        driver.findElement(By.id("lastname")).sendKeys("Doe");

        // Check the Marital Status: Married
        driver.findElement(By.xpath("(//input[@name='optradio'])[1]")).click();


        // Check the Hobby: Reading

        driver.findElement(By.xpath("//input[@value='read']")).click();
        // Select the Country : Canada
        WebElement dropDownCountry = driver.findElement(By.id("sel1"));
        Select country = new Select(dropDownCountry);
        country.selectByVisibleText("Canada");
        // Fill the Date Of Birth: 1st February 2000
        driver.findElement(By.id("datepicker")).sendKeys("1st February 2000");


        // Fill the Phone Number: 12345

        driver.findElement(By.id("phonenumber")).sendKeys("12345");

        // Fill the User Name: john_doe

        driver.findElement(By.id("username")).sendKeys("john_doe");
        // Fill the Email: john@doe.com
        driver.findElement(By.id("email")).sendKeys("John@doe.com");

        // Fill the About Yourself: My name is John Doe. I am a famous man. Because my name is used as a mock data everywhere.
        driver.findElement(By.id("comment")).sendKeys("My name is John Doe. I am a famous man. Because my name is used as a mock data everywher");
        // Fill the Password: John.123
        driver.findElement(By.id("pwd")).sendKeys("John.123");
        // Click on Submit Button

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Close the browser by using @After annotation
    }
        @After
                public void TearDown(){
        driver.quit();

        }
    }


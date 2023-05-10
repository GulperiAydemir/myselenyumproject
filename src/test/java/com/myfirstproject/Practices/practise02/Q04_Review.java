package com.myfirstproject.Practices.practise02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Q04_Review {
    // Create chrome driver by using @Before annotation and WebDriverManager

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    @Test
    public void Q04() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("4");
        // Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("2");
        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        // Get the result
        String result = driver.findElement(By.id("Answer")).getText();

        // Verify the result
        assertEquals(11, result);
        // Print the result
        System.out.println(result);
        // Close the browser by using @After annotation
    }
        @After
          public void TearDown(){
      driver.quit();
        }

    }


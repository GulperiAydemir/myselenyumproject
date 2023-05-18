package com.myfirstproject.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Task02 {
    //Task02:
    /*
    Create and Maximize the driver with the BeforeClass method and put implicit wait for 15 seconds
    Go to http://www.google.com in the before method
    With 3 different test methods:
     -Type "Desktop" in the search box and print the number of results
     -Type "Smartphone" in the search box and print the number of results
     -Type "Laptop" in the search box and print the number of results
    NOTE: Print the result numbers in After method
    Close driver with AfterClass method
     */

        WebDriver driver;
        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
              //Set<Cookie> allCookies=driver.manage().getCookies();
        @Test
        public void task02test(){
               driver.get("http://www.google.com ");
               WebElement search=driver.findElement(By.xpath("//textarea[@type='search']"));
               search.sendKeys("Desktop");
               driver.findElement(By.xpath("//div[.='Accept all']")).click(); ;
               //desktop.getSize();
        }

    }


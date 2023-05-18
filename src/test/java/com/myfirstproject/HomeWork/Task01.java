package com.myfirstproject.HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class Task01 {


    /*
    //Task01:
    /*
    Go to ebay page
    Click on electronics section
    Click on all the images with a Width of 225 and a Length of 225
    Print the page title of each page
    Close the page
     */


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(3000));
        //Go to ebay page
        driver.get("https://www.ebay.com");
        //Click on electronics section
        WebElement department = driver.findElement(By.linkText("Electronics"));
        department.click();
        //Click on all the images with a Width of 225 and a Length of 225
        int calculator=0;
        List<WebElement> images = driver.findElements(By.xpath("//img[@width='225' and @length='225']"));

        for(WebElement l:images){
           l.click();
            calculator++;
        }

    }

}

package com.myfirstproject.Practices.practise02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_Review {

    //Set Property

    public static void main(String[] args) {

        //Set Driver Path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

// Create chrome driver object

        WebDriver driver=new ChromeDriver();
// Maximize the window
        driver.manage().window().maximize();

// Open google home page https://www.google.com/

        driver.get("https://www.google.com/");
// Navigate to techproeducation home page https://techproeducation.com/
        driver.navigate().to("https://techproeducation.com/");
// Navigate back to google
        driver.navigate().back();
// Navigate forward to techproeducation
        driver.navigate().forward();
// Refresh the page
        driver.navigate().refresh();
// Close/Quit the browser
        driver.close();

// And last step : print "ALL OK" on console

        System.out.println("ALL OK");

    }



}

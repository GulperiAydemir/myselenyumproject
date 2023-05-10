package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Navigations {

    public static void main(String[] args) {
        //        1. Set Up
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //        2. Create the driver object
        WebDriver driver = new ChromeDriver();
        //     3. Now that we have our driver instance, we can START CREATING OUT TEST SCRIPT
        //        Maximize the window
        driver.manage().window().maximize();
        //  Open google home page https://www.walmart.com/.
          driver.get("https://www.walmart.com/");
//        On the same class, Navigate to amazon home page https://www.amazon.com/
//        driver.get("https://www.amazon.com/");
         driver.navigate().to("https://www.amazon.com/");//Alternative way of navigating to a website

//        Navigate back to google
        driver.navigate().back();

//        Navigate forward to amazon

        driver.navigate().forward();
//        Refresh the page

        driver.navigate().refresh();
//        Close/Quit the browser
        //There are 2 ways to close the browser:Close(),closes one page, quit() .We should not use Both
        //Driver close ();
          driver.quit();
/*

***** What is the difference between get and navigate to functions?
*Smilarities :Both let you to to page
*get is more common the navigate to
*get accepts only String as URL .Navigate to accepts both string and URL
*Navigate has more options such as  to(),back(),forward(),refresh()
*

*****What is the difference between close and quit ?
*Close closed ONLY the last active window
*Quit closes ALL ACTIVE windows
*Recomendation is use quit at the end of the last test case

 */




    }


}

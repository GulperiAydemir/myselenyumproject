package com.myfirstproject.Practices.practise02;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_Review {
    public static void main(String[] args) throws InterruptedException {


// Set Driver Path

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
// Create chrome driver object
        WebDriver driver=new ChromeDriver();
// Maximize the window

        driver.manage().window().maximize();
// Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
// Wait for 3 seconds
        Thread.sleep(3000);
// Go to the "https://techproeducation.com/"
        driver.get("https://techproeducation.com/");
// Get the title and URL of the page
        String title=driver.getTitle();
        String url= driver.getCurrentUrl();
        System.out.println("title = " + title);
        System.out.println("url = " + url);

// Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
        if(title.contains("Bootcamps")){
            System.out.println("Title contains Bootcamps");

        }else{
            System.out.println("Title does not contain Bootcamps");
        }

// Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
if(url.contains("Courses")){
    System.out.println("URL contains Courses");

}else{
    System.out.println("URL does not contain Courses");
}
// Then go to "https://medunna.com/"

        driver.get("https://medunna.com/");
// Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
       String medunaTitle= driver.getTitle();
        if(medunaTitle.contains("MEDUNNA")){
            System.out.println("Title contains MEDUNNA");

        }else{
            System.out.println("Title does not contain MEDUNNA");
        }
// Navigate Back to the previous webpage
        driver.navigate();
// Refresh the page
        driver.navigate().refresh();
// Navigate to forward
        driver.navigate().forward();
// Wait for 3 seconds
        Thread.sleep(3000);
// Close the browser
driver.close();
    }
}

package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

    public static void main(String[] args) {
        //this is one way to create automation script
        // We will not use main method later on

        //MAC
        //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver")

        //Windows
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//LATER WE WILL NOT USE THIS METHOD
        //create driver
        WebDriver driver=new ChromeDriver();

        //navigate ro techpro
        driver.get("https://www.techproeducation.com");

    }
}

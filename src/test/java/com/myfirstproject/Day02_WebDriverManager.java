package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_WebDriverManager {
    public static void main(String[] args) {
        //WITHOUT WEBRIVER MANAGER
        //TESTING ON CHROME
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//Chrome setup
        WebDriver chrome=new ChromeDriver();
        //        TESTING ON FIREFOX
       // System.setProperty("webdriver.edge.driver","./driver/edgedriver");//edge setup//  WebDriver firefox = new FirefoxDriver();
       //
       //   TESTING ON EDGE
      //    System.setProperty("webdriver.edge.driver","./driver/edgedriver");//edge setup
      //   WebDriver edge = new EdgeDriver();



        //****WITH WEB DRIVER MANAGER

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techproeducation.com");

//        WebDriverManager.firefoxdriver().setup();//firefox setup
//        WebDriver driver = new FirefoxDriver();//firefox driver create
//        driver.manage().window().maximize();//maximize
//        driver.get("https://www.techproeducation.com");//navigate

    }
}
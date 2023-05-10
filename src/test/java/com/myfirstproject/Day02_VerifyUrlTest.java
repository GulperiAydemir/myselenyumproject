package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_VerifyUrlTest {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();


        driver.get("https://www.techproeducation.com");

        String actualCurrentURL = driver.getCurrentUrl();

        if (actualCurrentURL.equals("https://www.techproeducation.com")) {

            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
            System.out.println("ACTUAL URL : "+actualCurrentURL);
            System.out.println("BUT EXPECTED URL : https://techproeducation.com/”");
        }
        driver.quit();
    }
}

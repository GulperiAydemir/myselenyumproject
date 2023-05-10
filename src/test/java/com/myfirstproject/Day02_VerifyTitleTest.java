package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day02_VerifyTitleTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        //Create a new class:VerifyTitleTestLSEP
        //Navigate to

        driver.get("https://www.techproeducation.com");
        String actualTitle =driver.getTitle();
        if(actualTitle.equals("Techpro Education | Online It Courses & Bootcamps")){
            System.out.println("PASS");
        }else{

            System.out.println("FAIL");
            System.out.println("EXPECTED TITLE:Techpro Education | Online It Courses & Bootcamps");
            System.out.println("ACTUAL TITLE:"+actualTitle);
        }



    }


}

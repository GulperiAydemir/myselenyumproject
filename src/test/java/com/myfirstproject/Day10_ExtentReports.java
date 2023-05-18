package com.myfirstproject;

import com.aventstack.extentreports.ExtentTest;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class Day10_ExtentReports extends TestBase {
    @Test
    public void extentReportsTests1(){
        String text="selenium";
        if(text.contains("e")){
            extentTest.pass("PASS: " +text +"CONTAINS e");

        }else{
            extentTest.pass("FAILED"+text + "DOESN'T CONTAINS THAT LETTER");
        }
        //Pass is used in the lines that we are expecting pass.This is uaed a alot
        extentTest.pass("PASSED");
        //Fail is used in the lines that we are expecting to fail such as else condition
        extentTest.pass("FAILED");
        extentTest.info("INFO");
        extentTest.skip("SKIP");
        extentTest.warning("WARNING");



    }


    @Test
    public void extentReportsTest() throws IOException, InterruptedException {
        //        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//        When user type “uni” in the search box
        extentTest.pass("Taking the screenshot of the home page");//Just like system out print
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        Thread.sleep(2000);
//        And select the ‘United Kingdom’ from the suggestions
        //TAKE SCREENSHOT
        extentTest.pass("Selecting the United Kingdom option");
        takeScreenshotOfTheEntirePage();

//        TAKING SCREENSHOT OF ONLY UNITED KINGDOM ELEMENT
        takeScreenshotOfThisElement(driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']")));
        driver
                .findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']"))
                .click();
        Thread.sleep(2000);
//        And click on submit button
        //TAKE SCREENSHOT
        takeScreenshotOfTheEntirePage();
        extentTest.pass("Clinking on the Submit Button");
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(2000);
        //TAKE SCREENSHOT
//        Then verify the result contains ‘United Kingdom’
        takeScreenshotOfTheEntirePage();

//        TAKING THE SCREENSHOT OF THE RESULT ELEMENT
        extentTest.pass("Taking the screenshot of result element");
        WebElement result = driver.findElement(By.id("result"));
        takeScreenshotOfThisElement(result);

        extentTest.pass("Asserting the result contains United Kingdom");
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
    }
}
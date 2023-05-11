package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day09_AutoComplete extends TestBase {


    @Test
    public void autoCompleteTest() throws InterruptedException {


//Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
//When user type “uni” in the search box
        driver.findElement(By.id("myCountry")).sendKeys("uni");
//And select the ‘United Kingdom’ from the suggestions
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//*[.='United Kingdom']")).click();

///        And click on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();
        Thread.sleep(1000);
//        Then verify the result contains ‘United Kingdom’
        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));


    }
}

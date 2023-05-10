package com.myfirstproject.Practices.practise02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q05_Review extends TestBase {
    //Go to https://www.medunna.com/
    @Test

    public void Q05() {
        driver.get("https://www.medunna.com/");


        //Click on human sign
        driver.findElement(By.id("account-menu")).click();

        //Click on "sign in" option
        driver.findElement(By.id("login-item")).click();

        //Enter "mark_twain" username
        driver.findElement(By.id("username")).sendKeys("mark_twain");


        //Enter "Mark.123" password
        //driver.findElement(By.xpath("//input[@name='password'])")).sendKeys("Mark.123");
        driver.findElement(By.name("password")).sendKeys("Mark.123");
        //Click on "remember me"
        driver.findElement(By.id("rememberMe")).click();

        //Click on Sign in "Submit" button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Assert that you signed in
      WebElement assertSign= driver.findElement(By.xpath("(//*[@aria-haspopup='true'])[1]"));

     assertSign.isSelected();

    }
}

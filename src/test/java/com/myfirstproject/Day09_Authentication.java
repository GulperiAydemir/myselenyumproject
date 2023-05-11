package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day09_Authentication extends TestBase {
//    username : admin
//    password : admin
//    url   : the-internet.herokuapp.com/basic_auth

    @Test
    public void authTest(){

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

        //assert if login is succesful
        String actualLoginText=driver.findElement(By.xpath("/div[@id='content']//p")).getText();
        Assert.assertTrue(actualLoginText.contains("Congratulations!"));
    }
}

package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions1 extends TestBase {

        /*
        Create a class: Actions1
        Create a test method : contextClickMethod() and test the following scenario:
        Given user is on the https://testcenter.techproeducation.com/index.php?page=context-menu
        When use Right clicks on the box
        Then verify the alert message is “You selected a context menu”
        Then accept the alert

         */

//        Create a test method : contextClickMethod() and test the following scenario:

    @Test
    public void  contextClickTest() {
//        Given user is on the https://testcenter.techproeducation.com/index.php?page=context-menu
        driver.get("https://testcenter.techproeducation.com/index.php?page=context-menu");
//        When use Right clicks on the box
        WebElement box=driver.findElement(By.id("hot-spot"));
        //Creating actions Class
        Actions actions = new Actions(driver);//Creating Actions object
        actions.contextClick(box).perform();//right click on the box

//        Then verify the alert message is “You selected a context menu”
       Assert.assertTrue(driver.switchTo().alert().getText().equals("You selected a context menu"));


//        Then accept the alert
        driver.switchTo().alert().accept();


    }
}

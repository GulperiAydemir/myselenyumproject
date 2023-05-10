package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Day07_WindowHandle1Review extends TestBase {
    @Test
    public void review1() {


        //Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");

        //Then user verifies the text : “Opening a new window”
    String actualtext=driver.findElement(By.xpath("//h3")).getText();
    Assert.assertTrue(actualtext.contains("Opening a new window"));


//Then user verifies the title of the page is “The Internet”
        String actualTitle=driver.getTitle();
        String expectedTitle="The Internet";
        Assert.assertEquals(expectedTitle,actualTitle);

//When user clicks on the “Click Here” button

        driver.findElement(By.xpath("//a[@href='/windows/new']"));

        //     LET's GET WINDOW 1 HANDLE FIRST CAUSE WE MAY NEED TO SWITCH BACK TO WINDOW 1
        String herOkuAppHandle=driver.getWindowHandle();
        System.out.println("herOkuAppHandle = " + herOkuAppHandle);
        //      DRIVER IS STILL ON WINDOW 1

        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
//Then user verifies the new window 2 title is “New Window”

        Set<String> handles=driver.getWindowHandles();
        for(String eachHanle:handles) {
            if (!eachHanle.equals(herOkuAppHandle)) {
                driver.switchTo().window(eachHanle);
                break;
            }
        }


//        System.out.println("Current Window Title : "+driver.getTitle());
        String currentTitle=driver.getTitle();


//Then user verifies the text:  “New Window”
        driver.findElement(By.xpath("//*[.='New Window']"));

        //        DRIVER IS ON 2nd WINDOW AS OF NOW
          String handle2= driver.getWindowHandle();
        System.out.println("handle2 = " + handle2);
        driver.switchTo().window(herOkuAppHandle);

//When user goes back to the previous window(window1) and then verifies the title : “The Internet”

//      SWITCH BACK TO WINDOW 2

        driver.switchTo().window(handle2);

//      SWITCH BACK TO WINDOW 1
        driver.switchTo().window(herOkuAppHandle);
//      SWITCH BACK TO WINDOW 2
        driver.switchTo().window(handle2);

    }
}


package com.myfirstproject.Practices.practise02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q03_Alert extends TestBase {
       /*
Given
    Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
When
    Click "CLICK ME" of JavaScript Alert
And
    Get the Alert text
Then
    Verify that message is "I am an alert box!"
When
    Accept Alert


 */

    @Test
    public void Q03AlertText(){

        //Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        //Click "CLICK ME" of JavaScript Alert
        driver.findElement(By.id("button1")).click();

        //Get the Alert text
        String alertText=driver.switchTo().alert().getText();

       //Verify that message is "I am an alert box!"

        Assert.assertEquals("I am an alert box!",alertText);

       // Accept Alert
        driver.switchTo().alert().accept();


    }

}

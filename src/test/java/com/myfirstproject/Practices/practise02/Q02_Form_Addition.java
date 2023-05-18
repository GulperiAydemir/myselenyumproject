package com.myfirstproject.Practices.practise02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Q02_Form_Addition extends TestBase {

      /*
Given
     Go to url : https://phptravels.com/demo/
When
     Fill the form
And
     Click on 'SUBMIT'
Then
     Assert that the form has been sent
 */

    @Test
    public void Q02Form_AdditionTest() throws InterruptedException {
        //Go to url : https://phptravels.com/demo/
        driver.get("https://phptravels.com/demo/");
        //Fill the form
        Thread.sleep(1000);
        driver.findElement(By.name("first_name")).sendKeys("John");
        Thread.sleep(1000);
        driver.findElement(By.name("last_name")).sendKeys("Doe");
        Thread.sleep(1000);
        driver.findElement(By.name("business_name")).sendKeys("QA Engineer");
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("JohnDoe@gmail.com");

        //Locate number 1
      int  number1= Integer.parseInt(driver.findElement(By.id("numb1")).getText());
      int  number2= Integer.parseInt(driver.findElement(By.id("numb2")).getText());
      int sum=number1+number2;
      WebElement result=driver.findElement(By.id("number"));
      result.sendKeys(sum+"");//sum+""==>Converst to String

        //Click on 'SUBMIT'
        driver.findElement(By.id("demo")).click();

        Thread.sleep(500);
        String thankyouText=driver.findElement(By.xpath("//strong[.=' Thank you!']")).getText();
        System.out.println("thankyouText = " + thankyouText);
        assertTrue(thankyouText.contains("Thank you!"));
        //or
        WebElement checkCircle = driver.findElement(By.id("colored"));
        assertTrue(checkCircle.isDisplayed());


    }
}

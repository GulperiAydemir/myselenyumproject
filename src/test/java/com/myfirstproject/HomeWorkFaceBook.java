package com.myfirstproject;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;


//import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

    public class HomeWorkFaceBook extends TestBase {

    /*
    Create a class : RadioButton Complete the following task.
    Go to https:// www.facebook.com/
    Click on Create an Account button
    Locate the elements of radio buttons
    Then click on the radio buttons for your gender if they are not selected
     */

        @Test
        public void radioButtonTest() {

            //Go to https:// www.facebook.com/
            driver.get("https://www.facebook.com/");

            //Click on Create an Account button

            driver.findElement(By.xpath("//button[@title='Decline optional cookies']")).click();
            driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
           // driver.findElement(By.linkText("Create new account")).click();
            Faker faker = new Faker();
            driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());
            //System.out.println("firstName = " + firstName);
            //  System.out.println(faker.name().lastName());

            driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());
            String email = faker.internet().emailAddress();
            driver.findElement(By.name("reg_email__")).sendKeys(email);
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
            //driver.findElement(By.name("reg_email__")).sendKeys(faker.phoneNumber().cellPhone());
            driver.findElement(By.name("reg_passwd__")).sendKeys(faker.number().digits(7));
            //driver.findElement(By.name("birthday_day")).sendKeys(faker.date().birthday());

            //Day
            WebElement day= driver.findElement(By.id("day"));
            Select options=new Select(day);
            //options.selectByVisibleText(faker.date().birthday().getDate());
            // options.selectByIndex(faker.date().birthday().getDate());

            //Month
            WebElement month= driver.findElement(By.id("month"));
            Select options1=new Select(month);
            options1.selectByIndex(faker.date().birthday().getMonth());
            //Year

            WebElement year= driver.findElement(By.id("year"));
            Select options2=new Select(year);
            options2.selectByIndex(faker.date().birthday().getYear());



            //Female
            if (!driver.findElement(By.xpath("//input[@value='1']")).isSelected()) {
                driver.findElement(By.xpath("//input[@value='1']")).click();

            //Male
                if (!driver.findElement(By.xpath("//input[@value='2']")).isSelected()) {
                    driver.findElement(By.xpath("//input[@value='2']")).click();

                }
            }
            driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        }
    }


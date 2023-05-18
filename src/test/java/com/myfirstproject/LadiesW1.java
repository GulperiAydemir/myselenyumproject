package com.myfirstproject;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LadiesW1 extends TestBase {

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
//7. Click 'Signup' button
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
//9. Fill details: Title, Name, Email, Password, Date of birth
//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    @Test
    public void w1(){
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Automation Exercise",actualTitle);
        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        //5. Verify 'New User Signup!' is visible
       WebElement actualNewUser=driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
       Assert.assertEquals("New User Signup!",actualNewUser.getText());
       // Assert.assertTrue(actualNewUser,("New User Signup!"));
        //6. Enter name and email address
        Faker faker = new Faker();
        driver.findElement(By.name("name")).sendKeys(faker.name().firstName());
        String name=faker.name().firstName();
        driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys(faker.internet().emailAddress());
       //7. Click 'Signup' button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
       //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String actialEnteraccount=driver.findElement(By.xpath("//b[text()='Enter Account Information']")).getText();
        Assert.assertEquals("ENTER ACCOUNT INFORMATION",actialEnteraccount);
       //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys(faker.number().digits(6));

        WebElement day= driver.findElement(By.id("days"));
        Select optionDay=new Select(day);
        optionDay.selectByValue("3");

        WebElement months= driver.findElement(By.id("months"));
        Select optionsMonths=new Select(months);
        optionsMonths.selectByValue("9");
       // optionsMonths.selectByIndex(faker.date().birthday().getMonth());

        WebElement year=driver.findElement(By.id("years"));
        Select optionsYear=new Select(year);
        //optionsYear.selectByValue("2016");
       optionsYear.selectByIndex(faker.date().birthday().getYear());

//10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//label[text()='Sign up for our newsletter!']")).click();

//11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//label[text()='Receive special offers from our partners!']")).click();
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
       driver.findElement(By.id("first_name")).sendKeys(name);

//13. Click 'Create Account button'
        driver.findElement(By.name("last_name")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("company")).sendKeys("ABC");
        driver.findElement(By.id("address1")).sendKeys("A Street");
        driver.findElement(By.id("address2")).sendKeys("A Road");
       WebElement country= driver.findElement(By.id("country"));
        Select optionscountry=new Select(country);
        optionscountry.selectByValue("India");
        driver.findElement(By.id("state")).sendKeys("Assoas");
        driver.findElement(By.id("city")).sendKeys("Ass");
        driver.findElement(By.id("zipcode")).sendKeys("ST17 5GX");
        driver.findElement(By.id("mobile_number")).sendKeys("123445555");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

//14. Verify that 'ACCOUNT CREATED!' is visible
       WebElement acctualCreated=driver.findElement(By.xpath("//b[.='Account Created!']"));
        System.out.println(acctualCreated);

        Assert.assertEquals("ACCOUNT CREATED!",acctualCreated.getText());
//15. Click 'Continue' button
        driver.findElement(By.xpath("//a[.='Continue']")).click();
//16. Verify that 'Logged in as username' is visible
        //WebElement logged1 =driver.findElement(By.xpath("//*[@class='fa fa-user']"));
  // WebElement logged=driver.findElement(By.linkText("Logged in as"));

   //Assert.assertTrue(logged1.isDisplayed());
           ////*[@class='fa fa-user']//*[text()=' Logged in as ']
        Assert.assertTrue(driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed());

//17. Click 'Delete Account' button

        //driver.findElement(By.xpath("//a[text()=' Delete Account']")).click();

//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
//       WebElement actualDeleted=driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
//        Assert.assertEquals("ACCOUNT DELETED!",actualDeleted.getText());


    }

}





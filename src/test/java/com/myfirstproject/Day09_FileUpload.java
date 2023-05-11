package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day09_FileUpload extends TestBase {

    @Test
    public void fileUploadTest(){
        /*
Class Name: FileUploadTest
Method Name: fileUploadTest
When user goes to https://the-internet.herokuapp.com/upload
When user selects an image from the desktop
And click on the upload button
Then verify the File Uploaded!  Message displayed
         */

        //We use sendkeys functions to upload files if the html is INPUT TYPE-FILE
        //IF OTHER ELEMENT IS USED TO UPLOAD FILESS,THEN we can use ROBOT class in JAVAROBOT class in JAVA
        driver.get("https://the-internet.herokuapp.com/upload");
//        to upload a file to this type of element, we should send the path of the file to the input
//        element is TAG = INPUT, TYPE = FILE
//        locate the chose a file element, get the path of teh file, then use send keys function
        WebElement chooseAFile=driver.findElement(By.id("file-upload"));
        String pathOfFlower = System.getProperty("user.home")+"\\Downloads\\flower.jpeg";
        chooseAFile.sendKeys(pathOfFlower);
        //        click on teh upload button
        driver.findElement(By.id("file-submit")).click();

    }
}

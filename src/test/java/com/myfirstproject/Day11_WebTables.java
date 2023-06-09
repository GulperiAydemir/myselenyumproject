package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Day11_WebTables extends TestBase {
//    https://the-internet.herokuapp.com/tables
//    Create a class: WebTables
//    Task 1 : Print the entire table
//    Task 2 : Print All Rows
//    Task 3 : Print Last row data only
//    Task 4 : Print column 5 data in the table body
//    Task 5 : Write a method that accepts 2 parameters
//    Parameter 1 = row number
//    Parameter 2 = column number
//    printData(2,3); => prints data in 2nd row 3rd column

    @Test
    public void printTable() {
        driver.get("https://the-internet.herokuapp.com/tables");
        extentTest.pass("******PRINT ENTIRE TABLE****");
        String entireTable = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(entireTable);

//        ALTERNATIVELY
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachData : elements) {
            System.out.println(eachData.getText());
            extentTest.pass(eachData.getText());
        }


//        GET SPECIFIC INDEXED ELEMENTS
        System.out.println("6TH DATA IN THE TABLE =>>> " + elements.get(6).getText());
    }

    //    Task 2 : Print All Rows
    @Test
    public void printAllRows() {
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowNum = 1;
        for (WebElement eachRow : allRows) {
            System.out.println(rowNum + " :  " + eachRow.getText());
            rowNum++;
        }
        System.out.println("2ND ROW DATA : " + allRows.get(1).getText());


//    Task 3 : Print Last row data only
        System.out.println("LAST ROW DATA : " + allRows.get(allRows.size() - 1).getText());
    }

    //    Task 4 : Print column 5 data in the table body
    @Test
    public void printColumns() {
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> col5Data = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
        int colNum = 1;
        for (WebElement eachData : col5Data) {
            System.out.println(colNum + " : " + eachData.getText());
            extentTest.pass(eachData.getText());
            colNum++;

        }
//    Task 5 : Write a method that accepts 2 parameters
//    Parameter 1 = row number
//    Parameter 2 = column number
    }
        @Test
        public void printRowsandColumns() {
            driver.get("https://the-internet.herokuapp.com/tables");
        int Parameter1 = 2;
        int Parameter2 = 3;

    }
        public void methodRowColumn(int parameter1,int parameter2){
           methodRowColumn(2,3);

           driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[2]//td[3]"));
            }

        }






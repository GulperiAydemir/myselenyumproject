package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Day05_Dropdown extends TestBase {
    @Test
    public void selectByIndexTest() {
//Go to https://testcenter.techproeducation.com/index.php?page=dropdown
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
//1.Create method selectByIndexTest and Select Option 1 using index
//        1. locating the dropdown
        WebElement dropdown = driver.findElement(By.id("dropdown"));
//        2. create a select object
        Select options = new Select(dropdown);
//        3. use select object to select your option
        options.selectByIndex(1);

    }

    @Test
    public void selectByValueTest() {
//2.Create method selectByValueTest Select Option 2 by value
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdown);
        options.selectByValue("2");//selecting Option 2 by value
    }

    @Test
    public void selectByVisibleTextTest() throws InterruptedException {
//3.Create method selectByVisibleTextTest Select Option 1 value by visible text
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdown);
        options.selectByVisibleText("Option 1");
        Thread.sleep(3000);
        options.selectByVisibleText("Option 2");
        Thread.sleep(3000);
        options.selectByVisibleText("Option 1");
        Thread.sleep(3000);
        options.selectByVisibleText("Option 2");
    }

    @Test
    public void printAllTest() {
//4.Create method printAllTest Print all dropdown value
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement state = driver.findElement(By.id("state"));
        Select options = new Select(state);
        List<WebElement> allStates = options.getOptions();
        for (WebElement eachState : allStates) {
            System.out.println(eachState.getText());
        }

        /*
        Eger Lamda ile yazmak istersek

        stateList.stream().forEach(t-> System.out.println(t.getText()));
         */
//5. Verify the dropdown has Texas text
        boolean isTexasExist = false;
        for (WebElement eachState : allStates) {
            if (eachState.getText().equals("Texas")) {
                isTexasExist = true;
            }
        }
        Assert.assertTrue(isTexasExist);
    }

    @Test
    public void printFirstSelectedOptionTest() {
//6.Create method printFirstSelectedOptionTest Print first selected option
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement state = driver.findElement(By.id("state"));
        Select options = new Select(state);
        System.out.println("First Selected Option : " + options.getFirstSelectedOption().getText());
//7.Find the size of the dropdown,
// Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown
        int numberOfOptions = options.getOptions().size();
        Assert.assertEquals("Expected Is Not Equal Actual", 3, numberOfOptions);
    }
        /*
        1.What is Dropdown?
        We use dropdown for create list
        2.How to handle dropdown elements?Dropdown nasil automate edilir?
        -Dropdown i locate ederim
        -select objesi olustururum
        ---select onjesi ile istedigimi secerim
        Not:Select objesi olusturma nedenim ,dropdownlarin select classi ile olusturulmasi
        3.Tum dropdown seceneklerini nasil print yapariz
        Tum dropdown elementlerini getOptions() methodu ile listeye koyariz/
        4.Bir secenegin secili oldugunu otomate etmek icin ne yapilir?
        Ornek:Gun olarak 10 u sectik ama ya secilmediyse
        getFirstSelectedOption() secili olan secenegi return eder

         */

//Reusable Method :Dropdown icin tekrar tekrar kullanilabilen bir method

    public void selectFromDropdown(WebElement dropdown, String option) {
        selectFromDropdown(driver.findElement(By.xpath("//select[@id='year']")), "2005");
        selectFromDropdown(driver.findElement(By.xpath("//select[@id='month']")), "January");
        selectFromDropdown(driver.findElement(By.xpath("//select[@id='day']")), "12");

        //Gonderilen dropdown elemention tum opsiyonlarini almak

        List<WebElement> options = dropdown.findElements(By.tagName("option"));//Tum option tagli elementleri aliyorum

        for (WebElement eachoption : options) {
            if (eachoption.getText().equals(option)) {
                eachoption.click();
                break;
            }
        }
    }

        @Test
        public void selectFromDropdown () {
            selectFromDropdown(driver.findElement(By.xpath("//select[@id='year']")), "2005");
        }
    }








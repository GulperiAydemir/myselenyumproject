package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day08_Cookies extends TestBase {
    /*
    Class: Cookies
Method: handleCookies
-Go to amazon and automate the tasks:
1. Find the total number of cookies
2. Print all the cookies
3. Get the cookies by their name
4. Add new cookie
5. Delete cookie by name
6. Delete all of the cookies
     */
    @Test
    public void cookiesTest() throws InterruptedException {

        //-Go to amazon and automate the tasks:
        driver.get("https:amazon.com/");

//        1. Find the total number of cookies

        Set<Cookie> allCookies=driver.manage().getCookies();
        int totalNumcookies= allCookies.size();
        System.out.println("totalNumcookies = " + totalNumcookies);
//        2. Print all the cookies
        for(Cookie eachCookie:allCookies){
            System.out.println("Cookie---->"+eachCookie);
            System.out.println("Cookie Value--->" + eachCookie.getValue());
            System.out.println("Cookie Name-->"+ eachCookie.getName());
            System.out.println("Cookie Expire--->"+ eachCookie.getExpiry());
            System.out.println("Cookie Domain--->"+ eachCookie.getDomain());

        }

//        3. Get the cookies by their name
        System.out.println("Cookie by name"+driver.manage().getCookieNamed("sp-cdn"));
//        4. Add new cookie
        Cookie myFavoriteCookie=new Cookie("my-cookie","chocolate-chips");
        driver.manage().addCookie(myFavoriteCookie);
        Thread.sleep(3000);
        System.out.println(driver.manage().getCookies().size());
//        5. Delete cookie by name
        //passing the name of the cookie ,and deleting that cookie
         driver.manage().deleteCookieNamed("session-id");
         Thread.sleep(3000);
        System.out.println("Afterdeleting One "+driver.manage().getCookies().size());
//        6. Delete all of the cookies
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);
        System.out.println("Final Number of cookies " + driver.manage().getCookies().size());
//

    }
}

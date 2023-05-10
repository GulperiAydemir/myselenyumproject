package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class Day07_WindowHandle2Review extends TestBase {
    @Test
    public void windowhandleReview(){
        driver.get("https://www.linkedin.com");
        String actualLinkedinTitle= driver.getTitle();


      //  linkedin title test
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinHandle= driver.getWindowHandle();
        System.out.println("linkedinHandle = " + linkedinHandle);


//        ebay title test
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.ebay.com");
        String ebayHandle=driver.getWindowHandle();
        String ebayTitle=driver.getTitle();
        Assert.assertTrue(ebayTitle.contains("eBay"));

//        At this point driver is on EBAY, but I can switch to AMAZON or LINKEDIN
            driver.switchTo().window(linkedinHandle);
    }

//

}

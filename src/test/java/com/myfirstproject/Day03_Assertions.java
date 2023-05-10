package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

public class Day03_Assertions {
    /*

    ***What is assertion?
    Assertion is done to make sure expected and actual are equal.
    Assertions are very very very important in testing
    Assertion is done to improve the quality of the application and bug-free products
    -expected =actual ==>Pass
    -expected !=actual==>Fail

    *
    *assertEquals("expected","actual")
    *assertTrue(true)==>PASS
    *assertTrue(false)==>FAIL
    *assertFalse(false)==>PASS
    *assertFalse(true)==>FAIL
    * ***************************
    *These assertions are HARD assertions
    *If one of the assertion fails , the rest of the test case WILL NOT EXECUTE
    *For Example.If line 29 FAILS,then the test case will stop
    * ****************************

    * Assertion VS Verification?

    *
    Assertion =Hard assertion which means test case stops if this assertion fails
    *Verification =Not Hard assertion which means the test case continue to execute even after FAILURE eg:
     */

    @Test
    public void assertions(){
        Assert.assertEquals(5,5);
        Assert.assertEquals("ASSEERTION OF EXPECTED AND ACTUAL FAILS",5,"5");
        Assert.assertTrue("apple".contains("a"));
        Assert.assertFalse("apple".contains("b"));
    }

}

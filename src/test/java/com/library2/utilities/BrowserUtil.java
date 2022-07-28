package com.library2.utilities;

import org.junit.Assert;

import java.util.Set;

public class BrowserUtil {

    /** 1. ACTION METHODS: */




    /** 2. ASSERTION METHODS: */
    public static void switchWindowAndVerify(String expectedInUrl,String expectedTitle){

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each window and driver will be able to see each window
            Driver.getDriver().switchTo().window(eachWindow);
            //  System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title verification failed!",actualTitle.contains(expectedTitle));
    }



    /** 3. SUPPORTING METHODS: */











}

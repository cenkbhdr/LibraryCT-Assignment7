package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SamplePage {

    /**
     * -------------------------------------------------------------------------
     *  THE PURPOSE OF THIS PAGE IS TO GET SAMPLE OFF THE PAGE CONSTRUCTOR!
     * -------------------------------------------------------------------------
     */

    /** 0. Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );



    //------------------------------------------------------------//
    /** 1. Initialization of this page */

    public SamplePage(){
        PageFactory.initElements(Driver.getDriver() ,
        this);
    }


    //------------------------------------------------------------//
    /** 2. WebElements: */

    // description or purpose, created by Author
    @FindBy(xpath = "sampleName")
    public WebElement sample1;

    // description or purpose, created by Author
    @FindBy(css = "sampleName")
    public WebElement sample2;

    // description or purpose, created by Author
    @FindBy(id = "sampleID")
    public WebElement sample3;

    // description or purpose, created by Author
    @FindBy(name = "sampleName")
    public WebElement sample4;

    // description or purpose, created by Author
    @FindBy(linkText = "sampleLinkText")
    public WebElement sample5;

    // description or purpose, created by Author
    @FindBy(partialLinkText = "samplePartialLinkText")
    public WebElement sample6;

    // description or purpose, created by Author
    @FindBy(tagName = "sampleTagName")
    public WebElement sample7;

    // description or purpose, created by Author
    @FindBy(className = "sampleClassName")
    public WebElement sample8;


    //------------------------------------------------------------//


    /** 3. Methods: ======================================== */
    //3.1. Action Methods
    //3.2. Assertion Methods
    //3.3. Helping Methods


    /**------------------------------------------------------*/
    /** 3.1. Action Methods */




    /**------------------------------------------------------*/
    /** 3.2. Assertion Methods */




    /**------------------------------------------------------*/
    /** 3.3. Helping Methods */




}

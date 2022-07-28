package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    /** 1. Initialization of this page */
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //------------------------------------------------------------//
    /** 2. WebElements: */

    @FindBy(xpath = "")
    public WebElement dashboardModule;

    @FindBy(xpath = "")
    public WebElement booksModule;

    @FindBy(xpath = "")
    public WebElement borrowingBooksModule;

    @FindBy(xpath = "//header//div[@id='navbarCollapse']//a[@id='navbarDropdown']")
    public WebElement navigationBarDropdown;


    //------------------------------------------------------------//
    /** 3. Methods: */




    //------------------------------------------------------------//


}

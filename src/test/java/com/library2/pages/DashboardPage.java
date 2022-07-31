package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {


    /** 0. Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );



    //------------------------------------------------------------//
    /** 1. Initialization of this page */
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //------------------------------------------------------------//
    /** 2. WebElements: */

    // container for users on page body, by Alex
    @FindBy(xpath = "//section[@id='dashboard']//div[@class='col-md-6 col-lg-4']//h2[@id='user_count']")
    public WebElement userContainer;

    // container for books on page body, by Alex
    @FindBy(xpath = "//section[@id='dashboard']//div[@class='col-md-6 col-lg-4']//h2[@id='book_count']")
    public WebElement booksContainer;

    // container for borrowed books on page body, by Alex
    @FindBy(xpath = "//section[@id='dashboard']//div[@class='col-md-6 col-lg-4']//h2[@id='borrowed_books']")
    public WebElement booksBorrowedContainer;


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

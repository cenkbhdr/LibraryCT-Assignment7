package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    /** 1. Initialization of this page */
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //------------------------------------------------------------//
    /** 2. WebElements: */

    @FindBy(xpath = "//section[@id='dashboard']//div[@class='col-md-6 col-lg-4']//h2[@id='user_count']")
    public WebElement userContainer;

    @FindBy(xpath = "//section[@id='dashboard']//div[@class='col-md-6 col-lg-4']//h2[@id='book_count']")
    public WebElement booksContainer;

    @FindBy(xpath = "//section[@id='dashboard']//div[@class='col-md-6 col-lg-4']//h2[@id='borrowed_books']")
    public WebElement booksBorrowedContainer;


    //------------------------------------------------------------//
    /** 3. Methods: */




    //------------------------------------------------------------//





}

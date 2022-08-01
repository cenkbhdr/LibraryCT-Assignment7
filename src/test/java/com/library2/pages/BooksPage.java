package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BooksPage {


    /** 0. Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );



    //------------------------------------------------------------//
    /** 1. Initialization of this page */
    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //------------------------------------------------------------//
    /** 2. WebElements: */


    @FindBy(xpath = "//section[@id='books']//div[@class='portlet-title']//h3[.='Book Management']")
    public WebElement booksContainerName;

    @FindBy(xpath = "//section[@id='books']//div[@class='form-group']//select[@id='book_categories']")
    public WebElement dropdown_BooksCategories;

    @FindBy(xpath = "//section[@id='books']//div[@id='tbl_books_wrapper']//select[@name='tbl_books_length']")
    public WebElement dropdown_ShowingRecords;

    @FindBy(xpath = "//div[@id='tbl_books_wrapper']//div[@id='tbl_books_filter']//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@id='tbl_books_wrapper']//table[@id='tbl_books']")
    public WebElement table_books;


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

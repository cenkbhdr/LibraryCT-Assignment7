package com.library2.pages;

import com.library2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_LibraryPage extends BasePage{

    //------------------------------------------------------------//

    /** 0. Global objects: */
    BasePage basePage = new BasePage();


    //------------------------------------------------------------//

    /** 1. Initialization of this page */
        public Login_LibraryPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }


    //------------------------------------------------------------//
    /** 2. WebElements: */

    @FindBy(xpath = "//div[@class='form-label-group']//input[@id='inputEmail']")
    public WebElement usernameBox;

    @FindBy(xpath = "//div[@class='form-label-group']//input[@id='inputPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signInBtn;


    //------------------------------------------------------------//
    /** 3. Methods: */

    public void assert_if_student_is_loggedIn() {
        String actNavigationBarCredentials = basePage.navigationBarDropdown.getText();
        String expCredentials = "Test Student";

        Assert.assertTrue(
                "Navigation Bar Dropdown has Different Credentials - FAIL!",
                actNavigationBarCredentials.contains(expCredentials)
        );
    }




    //------------------------------------------------------------//




}

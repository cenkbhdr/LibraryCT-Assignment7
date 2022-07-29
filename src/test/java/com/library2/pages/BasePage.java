package com.library2.pages;

import com.library2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    /** 1. Initialization of this page */
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //------------------------------------------------------------//
    /** 2. WebElements: */

    @FindBy(xpath = "//header//div[@id='navbarCollapse']//li[@class='nav-item']//span[.='Dashboard']")
    public WebElement dashboardModule;

    @FindBy(xpath = "//header//div[@id='navbarCollapse']//li[@class='nav-item']//span[.='Users']")
    public WebElement usersModule;

    @FindBy(xpath = "//header//div[@id='navbarCollapse']//li[@class='nav-item']//span[.='Books']")
    public WebElement booksModule;

    @FindBy(xpath = "//header//div[@id='navbarCollapse']//li[@class='nav-item']//span[.='Borrowing Books']")
    public WebElement borowingBooksModule;



    @FindBy(xpath = "//header//div[@id='navbarCollapse']//a[@id='navbarDropdown']")
    public WebElement navigationBarDropdown;


    //------------------------------------------------------------//
    /** 3. Methods: */

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);



    public void assert_if_librarian_is_loggedIn() {
        //1. wait until the navigationBarDropdown is visible
            wait.until(ExpectedConditions.visibilityOf(navigationBarDropdown));
        //2. get actual text from navigationBarDropdown
            String actNavigationBarCredentials = navigationBarDropdown.getText();
            System.out.println("actNavigationBarCredentials = " + actNavigationBarCredentials);
        //3. provide expected string
            String expCredentials = "Librarian";
        //4. assert if actual contains expected
            Assert.assertTrue(
                    "Navigation Bar Dropdown has Different Credentials - FAIL!",
                    actNavigationBarCredentials.contains(expCredentials)
            );
    }

    public void assert_if_student_is_loggedIn() {
        //1. wait until the navigationBarDropdown is visible
            wait.until(ExpectedConditions.visibilityOf(navigationBarDropdown));
        //2. get actual text from navigationBarDropdown
            String actNavigationBarCredentials = navigationBarDropdown.getText();
            System.out.println("actNavigationBarCredentials = " + actNavigationBarCredentials);
        //3. provide expected string
            String expCredentials = "Student";
        //4. assert if actual contains expected
            Assert.assertTrue(
                    "Navigation Bar Dropdown has Different Credentials - FAIL!",
                    actNavigationBarCredentials.contains(expCredentials)
            );
    }




    //------------------------------------------------------------//


}

package com.library2.pages;

import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_LibraryPage extends BasePage{

    //------------------------------------------------------------//

    /** 0. Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );



    //------------------------------------------------------------//

    /** 1. Initialization of this page */
        public Login_LibraryPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }


    //------------------------------------------------------------//
    /** 2. WebElements: */

    //usernameBox, by Alex
    @FindBy(xpath = "//div[@class='form-label-group']//input[@id='inputEmail']")
    public WebElement usernameBox;

        //label for usernameBox, by Alex
        @FindBy(xpath = "//div[@class='form-label-group']/label[@for='inputEmail']")
        public WebElement label_usernameBox;

    //passwordBox, by Alex
    @FindBy(xpath = "//div[@class='form-label-group']//input[@id='inputPassword']")
    public WebElement passwordBox;

        //label for passwordBox, by Alex
        @FindBy(xpath = "//div[@class='form-label-group']/label[@for='inputPassword']")
        public WebElement label_passwordBox;

    //sign in button, by Alex
    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signInBtn;


    // *** Messages ***

    //message - Sorry, Wrong Email or Password, by Alex
    @FindBy(xpath = "//div[@class='alert alert-danger' and contains (. , 'Sorry, Wrong Email or Password')]")
    public WebElement message_WrongEmail_Or_Password;

    //message for empty email - This field is required, by Alex
    @FindBy(xpath = "//div[@class='alert alert-danger']//div[@id='inputEmail-error' and contains (. , 'This field is required')]")
    public WebElement message_requiredEmail;

    //message for not valid email - Please enter a valid email address., by Alex
    @FindBy(xpath = "//div[@class='alert alert-danger']//div[@id='inputEmail-error' and contains (. , 'Please enter a valid email address')]")
    public WebElement message_enterValidEmail;

    // message for empty password - This field is required, by Alex
    @FindBy(xpath = "//div[@class='alert alert-danger']//div[@id='inputPassword-error' and contains (. , 'This field is required')]")
    public WebElement message_requiredPassword;

    // message for empty password - This field is required, by Alex
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement message_neutralTag;

    //------------------------------------------------------------//


    /** 3. Methods: ======================================== */
    //3.1. Action Methods
    //3.2. Assertion Methods
    //3.3. Helping Methods


    /**------------------------------------------------------*/
    /** 3.1. Action Methods */




    /**------------------------------------------------------*/
    /** 3.2. Assertion Methods */

    public void assert_ifMatching_WarnMessage_EnterValidEmail(String message) {
        wait.until(ExpectedConditions.visibilityOf(message_enterValidEmail));

        String act_warningMessage = message_enterValidEmail.getText();

        Assert.assertEquals(
                "The warning message does NOT matching to expected message - FAIL!",
                message,
                act_warningMessage
        );
    }

    //-------------------------------------------------------------------------------

    public void assert_ifMatching_WarnMessage_WrongEmail_orPassword(String message) {
        wait.until(ExpectedConditions.visibilityOf(message_WrongEmail_Or_Password));

        String act_warningMessage = message_WrongEmail_Or_Password.getText();

        Assert.assertEquals(
                "The warning message does NOT matching to expected message - FAIL!",
                message,
                act_warningMessage
        );
    }

    //-------------------------------------------------------------------------------



    /**------------------------------------------------------*/
    /** 3.3. Helping Methods */


    // This method used for login with credentials used from scenario outline
    public void login_from_scenario_outline(String username, String password) {
        //1. input username
            usernameBox.clear();
            usernameBox.sendKeys(username);

        //2. input password
            passwordBox.clear();
            passwordBox.sendKeys(password);

        //3. click() on sign in button
            signInBtn.click();
    }

    //-------------------------------------------------------------------------------


    // This method used for login with credentials used from scenario outline
    // created by Alex S.
    public void login_with_parameters(String usernameWithParameters) {
        //1. clear the usernameBox and passwordBox
            wait.until(ExpectedConditions.visibilityOf(usernameBox));

            usernameBox.clear();
            passwordBox.clear();

        //2. input username and password for the parameter
            switch (usernameWithParameters.toLowerCase()){
                    case "librarian1" :
                        usernameBox.sendKeys(ConfigurationReader.getProperty("librarian_username1"));
                        passwordBox.sendKeys(ConfigurationReader.getProperty("librarian_password1"));
                        break;
                    case "librarian2" :
                        usernameBox.sendKeys(ConfigurationReader.getProperty("librarian_username2"));
                        passwordBox.sendKeys(ConfigurationReader.getProperty("librarian_password2"));
                        break;
                    case "student1" :
                        usernameBox.sendKeys(ConfigurationReader.getProperty("student_username1"));
                        passwordBox.sendKeys(ConfigurationReader.getProperty("student_password1"));
                        break;
                    case "student2" :
                        usernameBox.sendKeys(ConfigurationReader.getProperty("student_username2"));
                        passwordBox.sendKeys(ConfigurationReader.getProperty("student_password2"));
                        break;
                default:
                    System.out.println("Please provide correct parameters for login!");
                }

        //3. click() on sign in button
            signInBtn.click();
    }

    //-------------------------------------------------------------------------------


    public void input_correct_username(String cor_username_) {
        //1. clear the usernameBox
            usernameBox.clear();
        //2. input correct username based on options available
            switch (cor_username_.toLowerCase()) {
                case "librarian1":
                    usernameBox.sendKeys(ConfigurationReader.getProperty("librarian_username1"));
                    break;
                case "librarian2":
                    usernameBox.sendKeys(ConfigurationReader.getProperty("librarian_username2"));
                    break;
                case "student1":
                    usernameBox.sendKeys(ConfigurationReader.getProperty("student_username1"));
                    break;
                case "student2":
                    usernameBox.sendKeys(ConfigurationReader.getProperty("student_username2"));
                    break;
                default:
                    System.out.println("Please provide correct parameters for login!");
            }
    }

    //-------------------------------------------------------------------------------



}

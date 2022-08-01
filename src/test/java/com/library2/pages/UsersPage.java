package com.library2.pages;

import com.library2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

    /** Initializing this page     */
    public UsersPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------------------------------------------------------------//
    /** 2. WebElements: */

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']" )
    public WebElement btn_addUser;



    //ADD USER MODAL LOCATORS

    @FindBy(xpath = "//div[@id='add_user_modal']")
    public WebElement modal_addUser;

    @FindBy(xpath = "//div[@id='add_user_modal']//input[@name='full_name']")
    public WebElement inputBox_fullName;

    @FindBy(xpath = "//div[@id='add_user_modal']//input[@name='password']")
    public WebElement inputBox_password ;

    @FindBy(xpath = "//div[@id='add_user_modal']//input[@name='email']")
    public WebElement inputBox_email;

    @FindBy(xpath = "//div[@id='add_user_modal']//select[@name='user_group_id']")
    public WebElement dropdown_userGroup;

    @FindBy(xpath = "//div[@id='add_user_modal']//select[@name='status']")
    public WebElement dropdown_status;

    @FindBy(xpath = "//div[@id='add_user_modal']//input[@name='start_date']")
    public WebElement inputBox_startDate;

    @FindBy(xpath = "")
    public WebElement tableDate;

    @FindBy(xpath = "//div[@id='add_user_modal']//input[@name='end_date']")
    public WebElement inputBox_endDate;

    @FindBy(xpath = "//div[@id='add_user_modal']//textarea[@name='address']")
    public WebElement inputBox_address;

    @FindBy(xpath = "//div[@id='add_user_modal']//div[@class='modal-footer']//button[contains(.,'Close')]")
    public WebElement btn_close;

    @FindBy(xpath = "//div[@id='add_user_modal']//div[@class='modal-footer']//button[contains(.,'Save changes')]")
    public WebElement btn_saveChanges;



    //USER MANAGEMENT LOCATORS

    @FindBy(xpath = "//select[@id='user_groups']")
    public WebElement dropDown_userMng_userGroup;

    @FindBy(xpath = "//select[@id='user_groups']")
    public WebElement dropDown_userMng_status;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement dropDown_userMng_showRecords;


    //TABLE GRID LOCATORS

    @FindBy(xpath = "//table[@id='tbl_users']")
    public WebElement tableGrid;

    @FindBy(xpath = "//table[@id='tbl_users']//thead//th[contains(., 'Actions')]")
    public WebElement tableGrid_Actions_module;

    @FindBy(xpath = "//table[@id='tbl_users']//thead//th[contains(., 'User ID')]")
    public WebElement tableGrid_UserID_module;

    @FindBy(xpath ="//table[@id='tbl_users']//thead//th[contains(., 'Full Name')]" )
    public WebElement tableGrid_FullName_module;

    @FindBy(xpath = "//table[@id='tbl_users']//thead//th[contains(., 'Email')]")
    public WebElement tableGrid_Email_module;

    @FindBy(xpath = "//table[@id='tbl_users']//thead//th[contains(., 'Group')]")
    public WebElement tableGrid_Group_module;

    @FindBy(xpath = "//table[@id='tbl_users']//thead//th[contains(., 'Status')]")
    public WebElement tableGrid_Status_module;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody//td/a[@class='btn btn-primary btn-sm']")
    public WebElement tableGrid_button_EditUser;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody//td[2]")
    public WebElement tableGrid_data_UserId;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody//td[3]")
    public WebElement tableGrid_data_FullName;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody//td[4]")
    public WebElement tableGrid_data_Email;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody//td[5]\n")
    public WebElement tableGrid_data_Group;

    @FindBy(xpath = "//table[@id='tbl_users']//tbody//td[6]\n")
    public WebElement tableGrid_data_Status;

//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;
//
//    @FindBy(xpath = "")
//    public WebElement ;






}

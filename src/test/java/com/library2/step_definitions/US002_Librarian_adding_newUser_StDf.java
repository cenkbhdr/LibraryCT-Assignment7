package com.library2.step_definitions;

import com.github.javafaker.Faker;
import com.library2.pages.*;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US002_Librarian_adding_newUser_StDf {

    /** Global objects: */
    Login_LibraryPage loginLibraryPage = new Login_LibraryPage();
    BasePage basePage = new BasePage();
    UsersPage usersPage = new UsersPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );
    DashboardPage dashboardPage = new DashboardPage();
    BooksPage booksPage = new BooksPage();
    Faker faker = new Faker();



    //@us002_T01
    @Given("{string} is on Users page")
    public void is_on_users_page(String string) {

    //1. open the browser, navigate login page, login as librarian
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    //2. login as a librarian
        loginLibraryPage.login_with_parameters("librarian1");

    //3. navigate to users page
        basePage.usersModule.click();

    }

    @When("click on <Add User> button")
    public void click_on_add_user_button() {
    //4. click on add user button - I am located in users page now
        usersPage.btn_addUser.click();
    }

    @Then("<Add User Modal> should appear")
    public void add_user_modal_should_appear() {
    //5. assert if user modal is displayed
        wait.until(ExpectedConditions.visibilityOf(usersPage.modal_addUser));
        Assert.assertTrue(usersPage.modal_addUser.isDisplayed());
    }



    //@us002_T02
    @Then("<Add User Modal> should be able to close")
    public void addUserModalShouldBeAbleToClose() {
        //6. Click on close button
        usersPage.btn_close.click();

        //7. Assert if user modal is not displayed
        wait.until(ExpectedConditions.invisibilityOf(usersPage.modal_addUser));
        Assert.assertFalse(usersPage.modal_addUser.isDisplayed());

    }


    /**
     * @us002_t03
     *   Scenario: US002_T03_Librarian_adds_new_Librarian_user
     *     When  Librarian inputs all data for new Librarian user
     *     Then  new user should appear on the grid table
     */
    @When("Librarian inputs all data for new Librarian user")
    public void librarian_inputs_all_data_for_new_librarian_user() throws InterruptedException {
        //4. click on add user button - I am located in users page now
        usersPage.btn_addUser.click();

        //5. Input data for new librarian user
        usersPage.inputBox_fullName.sendKeys(faker.name().fullName());
        usersPage.inputBox_password.sendKeys(faker.internet().password());
        usersPage.inputBox_email.sendKeys(faker.internet().emailAddress());
        usersPage.dropdown_userGroup.click();
        Select select1 = new Select(usersPage.dropdown_userGroup);
        select1.selectByVisibleText("Librarian");
        usersPage.dropdown_status.click();
        Select select2 = new Select(usersPage.dropdown_status);
        select2.selectByVisibleText("ACTIVE");
        usersPage.inputBox_address.sendKeys(faker.address().fullAddress());

        Thread.sleep(2000);
        //6. Click on save changes button
        usersPage.btn_saveChanges.click();
    }

    @Then("new librarian user should appear on the grid table")
    public void new_librarian_user_should_appear_on_the_grid_table() {
        //7. assert if new librarian user added on grid table
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid));
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid_UserID_module));
//        usersPage.tableGrid_UserID_module.click();
//        usersPage.tableGrid_UserID_module.click();

        //7.1. Assert for librarian data group
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid_data_Group));
        String act_userGroup = usersPage.tableGrid_data_Group.getText();
        String exp_userGroup = "Librarian";
        Assert.assertEquals(
                "Group type does not match - FAIL!",
                exp_userGroup,
                act_userGroup
        );

        //7.2. Assert for librarian data status
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid_data_Status));
        String act_userStatus = usersPage.tableGrid_data_Status.getText();
        String exp_userStatus = "ACTIVE";
        Assert.assertEquals(
                "Group type does not match - FAIL!",
                exp_userStatus ,
                act_userStatus
        );
    }


    /**
     *   @us002_t04
     *   Scenario: US002_T04_Librarian_adds_new_Student_user
     *     When  Librarian inputs all data for new Student user
     *     Then  new user should appear on the grid table
     */
    @When("Librarian inputs all data for new Student user")
    public void librarianInputsAllDataForNewStudentUser() throws InterruptedException {
        //4. click on add user button - I am located in users page now
        usersPage.btn_addUser.click();

        //5. Input data for new librarian user
        usersPage.inputBox_fullName.sendKeys(faker.name().fullName());
        usersPage.inputBox_password.sendKeys(faker.internet().password());
        usersPage.inputBox_email.sendKeys(faker.internet().emailAddress());
        usersPage.dropdown_userGroup.click();
        Select select1 = new Select(usersPage.dropdown_userGroup);
        select1.selectByVisibleText("Students");
        usersPage.dropdown_status.click();
        Select select2 = new Select(usersPage.dropdown_status);
        select2.selectByVisibleText("ACTIVE");
        usersPage.inputBox_address.sendKeys(faker.address().fullAddress());

        Thread.sleep(2000);
        //6. Click on save changes button
        usersPage.btn_saveChanges.click();

    }

    @Then("new student user should appear on the grid table")
    public void newStudentUserShouldAppearOnTheGridTable() {
        //7. assert if new librarian user added on grid table
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid));
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid_UserID_module));
//        usersPage.tableGrid_UserID_module.click();
//        usersPage.tableGrid_UserID_module.click();

        //7.1. Assert for librarian data group
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid_data_Group));
        String act_userGroup = usersPage.tableGrid_data_Group.getText();
        String exp_userGroup = "Students";
        Assert.assertEquals(
                "Group type does not match - FAIL!",
                exp_userGroup,
                act_userGroup
        );

        //7.2. Assert for librarian data status
        wait.until(ExpectedConditions.visibilityOf(usersPage.tableGrid_data_Status));
        String act_userStatus = usersPage.tableGrid_data_Status.getText();
        String exp_userStatus = "ACTIVE";
        Assert.assertEquals(
                "Group type does not match - FAIL!",
                exp_userStatus ,
                act_userStatus
        );
    }







}

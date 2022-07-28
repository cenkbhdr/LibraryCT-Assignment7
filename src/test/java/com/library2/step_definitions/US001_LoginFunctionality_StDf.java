package com.library2.step_definitions;

import com.library2.pages.DashboardPage;
import com.library2.pages.Login_LibraryPage;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US001_LoginFunctionality_StDf {

    /** Global objects: */
    Login_LibraryPage loginLibraryPage = new Login_LibraryPage();
    DashboardPage dashboardPage = new DashboardPage();




    /**
     * Background:
     *     Given  user is on the Login_Library page
     */
    @Given("user is on the Login_Library page")
    public void user_is_on_the_login_library_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }



    /**
     *  @us001_T01
     *   Scenario Outline: US001_T01_Login_with_valid_credentials_as_Librarian
     *     When  user input "<librarianUsername>" with "<librarianPassword>" for librarian
     *     Then   user should navigate to Dashboard page
     *   Examples:
     *   | librarianUsername  | librarianPassword |
     *   | librarian1@library | qU9mrvur          |
     *   | librarian2@library | uYrhHmmj          |
     *   | librarian3@library | DFvU4b1i          |
     *   | librarian4@library | 3lwxJ1Kk          |
     *   | librarian5@library | hj65YBiE          |
     */

    @When("user input {string} with {string} for librarian")
    public void user_input_with_for_librarian(String username, String password) {
        //1. input username
            loginLibraryPage.usernameBox.clear();
            loginLibraryPage.usernameBox.sendKeys(username);

        //2. input password
            loginLibraryPage.passwordBox.clear();
            loginLibraryPage.passwordBox.sendKeys(password);

        //3. click() on Signin button
            loginLibraryPage.signInBtn.click();

    }


    @Then("user should navigate to Dashboard page")
    public void user_should_navigate_to_dashboard_page() {
        //4. assert the title is Dashboard

        //5. assert if 3 containers are visible at the Dashboard page
        Assert.assertTrue(dashboardPage.userContainer.isDisplayed());
        Assert.assertTrue(dashboardPage.booksContainer.isDisplayed());
        Assert.assertTrue(dashboardPage.booksBorrowedContainer.isDisplayed());

    }









}

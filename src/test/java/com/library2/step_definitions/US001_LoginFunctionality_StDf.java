package com.library2.step_definitions;

import com.library2.pages.BasePage;
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
    BasePage basePage = new BasePage();




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
    public void user_input_with_for_librarian(String librarianUsername, String librarianPassword) {
        //1. input librarianUsername
            loginLibraryPage.usernameBox.clear();
            loginLibraryPage.usernameBox.sendKeys(librarianUsername);

        //2. input librarianPassword
            loginLibraryPage.passwordBox.clear();
            loginLibraryPage.passwordBox.sendKeys(librarianPassword);

        //3. click() on Signin button
            loginLibraryPage.signInBtn.click();

    }
    @Then("user should navigate to Dashboard page as Librarian")
    public void userShouldNavigateToDashboardPageAsLibrarian() {
        //4. assert the title is Dashboard

        //5. assert if 3 containers are visible at the Dashboard page
            Assert.assertTrue(dashboardPage.userContainer.isDisplayed());
            Assert.assertTrue(dashboardPage.booksContainer.isDisplayed());
            Assert.assertTrue(dashboardPage.booksBorrowedContainer.isDisplayed());
    }



    /**
     * @us001_t02
     *   Scenario Outline: US001_T02_Login_with_valid_credentials_as_Student
     *     When  user input "<studentUsername>" with "<studentPassword>" for student
     *     Then   user should navigate to Dashboard page
     *   Examples:
     *   | studentUsername  | studentPassword |
     *   | student1@library |	d5fv9BtX       |
     *   | student2@library |	zyxa10vg       |
     *   | student3@library |	rPjgZ86a       |
     *   | student4@library |	pG3V6qaL       |
     *   | student5@library |	i1oDgf2d       |
     */
    @When("user input {string} with {string} for student")
    public void user_input_with_for_student(String studentUsername, String studentPassword) {
        //1. input librarianUsername
        loginLibraryPage.usernameBox.clear();
        loginLibraryPage.usernameBox.sendKeys(studentUsername);

        //2. input librarianPassword
        loginLibraryPage.passwordBox.clear();
        loginLibraryPage.passwordBox.sendKeys(studentPassword);

        //3. click() on Signin button
        loginLibraryPage.signInBtn.click();
    }


    @Then("user should navigate to Books page as Student")
    public void userShouldNavigateToBooksPageAsStudent() {
        //4. assert the title is Books

        //5. assert if dropdown has the student credentials
        loginLibraryPage.assert_if_student_is_loggedIn();
    }



}

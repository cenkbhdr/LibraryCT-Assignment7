package com.library2.step_definitions;

import com.github.javafaker.Faker;
import com.library2.pages.BasePage;
import com.library2.pages.BooksPage;
import com.library2.pages.DashboardPage;
import com.library2.pages.Login_LibraryPage;
import com.library2.utilities.ConfigurationReader;
import com.library2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US001_LoginFunctionality_StDf {

    /** Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Login_LibraryPage loginLibraryPage = new Login_LibraryPage();
    DashboardPage dashboardPage = new DashboardPage();
    BasePage basePage = new BasePage();
    BooksPage booksPage = new BooksPage();
    Faker faker = new Faker();




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
    @When("user input {string} with {string}")
    public void user_Input_With(String username, String password) {
        loginLibraryPage.login_from_scenario_outline(username, password);
    }

    @Then("user should navigate to Dashboard page as Librarian")
    public void user_Should_Navigate_To_DashboardPage_AsLibrarian() {
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

    @Then("user should navigate to Books page as Student")
    public void user_Should_Navigate_To_BooksPage_AsStudent() {
        //4. assert the title is Books

        //5. assert if dropdown has the student credentials
        loginLibraryPage.assert_if_student_is_loggedIn();
    }



    /**
     * @us001_t03
     *   Scenario: US001_T03_Login_with_parameters
     *     When  user login with parameters using "<username>" with "<password>"
     *     Then   user should navigate to Dashboard page
     */
    @When("user login as {string}")
    public void user_Login_As(String usernameWithParameters) {
        //login with parameters: Librarian or Student
        loginLibraryPage.login_with_parameters(usernameWithParameters);
    }

    @Then("user should navigate to Dashboard page")
    public void user_should_navigate_to_dashboard_page() {
        //1. assert if navigationBarDropdown has the Librarian text indicated
            basePage.assert_if_librarian_is_loggedIn();

        //2. assert if 3 containers are displayed - as a confirmation that you are at Dashboard page
            Assert.assertTrue(dashboardPage.userContainer.isDisplayed());
            Assert.assertTrue(dashboardPage.booksContainer.isDisplayed());
            Assert.assertTrue(dashboardPage.booksBorrowedContainer.isDisplayed());
    }


    /**
     * # 4. Login as Student
     *   @us001_t03
     *   Scenario: US001_T04_Login_with_parameters_as_Student
     *     When  user login as"<Student>"
     *     Then   user should navigate to Books page
     */
    @Then("user should navigate to Books page")
    public void user_Should_Navigate_To_BooksPage() {
        //1. assert if navigationBarDropdown has the Student text indicated
            basePage.assert_if_student_is_loggedIn();

        //2. assert if booksContainerName and table_books are displayed()
            Assert.assertTrue(booksPage.booksContainerName.isDisplayed());
            Assert.assertTrue(booksPage.table_books.isDisplayed());
    }




    /**
     * # 5. Login with correct username and wrong password
     *   @us001_t05
     *   Scenario: US001_T05_Login_with_corUsername_wrongPassword
     *     When  user input <correct username>
     *     And  user input <wrong password>
     *     Then  user should  see message "<Sorry, Wrong Email or Password>"
     */
    @When("user input cor_username with wrong_password for {string}")
    public void userInput_Cor_username_With_Wrong_passwordFor(String cor_username) {
        //1. input correct username
            loginLibraryPage.input_correct_username(cor_username);

        //2. input fake password
            loginLibraryPage.passwordBox.sendKeys(faker.letterify("%%%%%%%%%%%%%%"));

    }

    @Then("user should see message <Sorry, Wrong Email or Password>")
    public void user_Should_See_Message__SorryWrongEmailOrPassword() {
        //3. click sign in button
            loginLibraryPage.signInBtn.click();
        //4. assert if message is displayed
            wait.until(ExpectedConditions.visibilityOf(loginLibraryPage.message_WrongEmail_Or_Password));
            Assert.assertTrue(loginLibraryPage.message_WrongEmail_Or_Password.isDisplayed());

    }

  

    /**
     *  # 6. Login with wrong username and correct password
     *   @us001_t06
     *   Scenario: US001_T06_Login_with_wrongUsername_corPassword
     *     When  user input wrong_username with wrong_password
     *     Then  user should  see message "<Sorry, Wrong Email or Password>"
     */
    @When("user input wrong_username with wrong_password")
    public void userInputWrong_usernameWithWrong_password() {
        //1. input correct username
            loginLibraryPage.usernameBox.clear();
            loginLibraryPage.usernameBox.sendKeys(faker.internet().emailAddress());

        //2. input fake password
            loginLibraryPage.passwordBox.clear();
              loginLibraryPage.passwordBox.sendKeys(faker.internet().password());

        //3. click sign in button
        loginLibraryPage.signInBtn.click();

}

    @Then("user should see message {string}")
    public void userShouldSeeMessage(String message) {
        //4. Assert
        wait.until(ExpectedConditions.visibilityOf(loginLibraryPage.message_WrongEmail_Or_Password));

        //4.1. assert if message is displayed
            Assert.assertTrue(loginLibraryPage.message_WrongEmail_Or_Password.isDisplayed());

        //4.2. assert if warning message is correct
            loginLibraryPage.assert_ifMatching_WarnMessage_WrongEmail_orPassword(message);
    }



    /**
     *   # 7. Login with NULL username and NULL password
     *   @us001_t07
     *   Scenario: US001_T07_Login_with_nullUsername_nullPassword
     *     When  user input NULL username with NULL password
     *     Then  user should see 3 warning messages
     */

    @When("user input NULL username with NULL password")
    public void userInputNULLUsernameWithNULLPassword() {
        //1. input NULL username
            loginLibraryPage.usernameBox.clear();

        //2. input NULL password
            loginLibraryPage.passwordBox.clear();

        //3. click sign in button
            loginLibraryPage.signInBtn.click();
    }

    @Then("user should see warning message <This field is required.>")
    public void user_Should_See_Warning_Message_ThisField_isRequired() throws InterruptedException {
        //4. Assert if message <This field is required.> is displayed
            Assert.assertTrue(loginLibraryPage.message_requiredEmail.isDisplayed());
    }


}

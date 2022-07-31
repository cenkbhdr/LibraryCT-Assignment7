package com.library2.step_definitions;

import com.github.javafaker.Faker;
import com.library2.pages.BasePage;
import com.library2.pages.BooksPage;
import com.library2.pages.DashboardPage;
import com.library2.pages.Login_LibraryPage;
import com.library2.utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample_StDf {

    /**
     * -------------------------------------------------------------------------
     *  THE PURPOSE OF THIS PAGE IS TO GET SAMPLE OFF THE PAGE CONSTRUCTOR!
     * -------------------------------------------------------------------------
     */

    /** Global objects: */
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Login_LibraryPage loginLibraryPage = new Login_LibraryPage();
    DashboardPage dashboardPage = new DashboardPage();
    BasePage basePage = new BasePage();
    BooksPage booksPage = new BooksPage();
    Faker faker = new Faker();

    /**
     * Scenario
     */

    // Given.....

    // When.....

    // Then.....




}

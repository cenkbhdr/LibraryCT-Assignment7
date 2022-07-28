@wip @Login @smoke
Feature: US_001 Login Functionality

  User Story: Login Functionality
  Accounts: Librarian, Student


  Scenario: US001_T01_Login_with_valid_credentials_as_Librarian
    Given  user is on the Login_Library page
    When  user input "<librarianUsername>" with "<librarianPassword>" for librarian
    Then   user should navigate to Dashboard page
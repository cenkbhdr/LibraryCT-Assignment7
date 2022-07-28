@wip @Login @smoke
Feature: US_001 Login Functionality

  User Story: Login Functionality
  Accounts: Librarian, Student

  Background:
    Given  user is on the Login_Library page


  @us001_T01
  Scenario Outline: US001_T01_Login_with_valid_credentials_as_Librarian
    When  user input "<librarianUsername>" with "<librarianPassword>" for librarian
    Then   user should navigate to Dashboard page
  Examples:
  | librarianUsername  | librarianPassword |
  | librarian1@library | qU9mrvur          |
  | librarian2@library | uYrhHmmj          |
  | librarian3@library | DFvU4b1i          |
  | librarian4@library | 3lwxJ1Kk          |
  | librarian5@library | hj65YBiE          |



#  @us001_t02
#  Scenario: US001_T02_Login_with_valid_credentials_as_Student
#    Given  user is on the Login_Library page
#    When  user input "<studentUsername>" with "<studentPassword>" for student
#    Then   user should navigate to Dashboard page
#
#  @us001_t03
#  Scenario: US001_T03_Login_with_parameters
#    Given  user is on the Login_Library page
#    When  user input "<username>" with "<password>"
#    Then   user should navigate to Dashboard page




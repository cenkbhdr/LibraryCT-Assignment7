@wip @Login @smoke
Feature: US_001 Login Functionality

  User Story: Login Functionality
  Accounts: Librarian, Student

  Background:
    Given  user is on the Login_Library page


  @us001_T01
  Scenario Outline: US001_T01_Login_with_valid_credentials_as_Librarian
    When  user input "<librarianUsername>" with "<librarianPassword>" for librarian
    Then   user should navigate to Dashboard page as Librarian
  Examples:
  | librarianUsername  | librarianPassword |
  | librarian1@library | qU9mrvur          |
  | librarian2@library | uYrhHmmj          |
  | librarian3@library | DFvU4b1i          |
  | librarian4@library | 3lwxJ1Kk          |
  | librarian5@library | hj65YBiE          |



  @us001_t02
  Scenario Outline: US001_T02_Login_with_valid_credentials_as_Student
    When  user input "<studentUsername>" with "<studentPassword>" for student
    Then   user should navigate to Books page as Student
  Examples:
  | studentUsername  | studentPassword |
  | student1@library |	d5fv9BtX       |
  | student2@library |	zyxa10vg       |
  | student3@library |	rPjgZ86a       |
  | student4@library |	pG3V6qaL       |
  | student5@library |	i1oDgf2d       |

#
#  @us001_t03
#  Scenario: US001_T03_Login_with_parameters
#    When  user input "<username>" with "<password>"
#    Then   user should navigate to Dashboard page




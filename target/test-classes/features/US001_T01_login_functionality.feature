@wip @Login @smoke
Feature: US_001 Login Functionality

  User Story: Login Functionality
  Accounts: Librarian, Student

  Background:
    Given  user is on the Login_Library page

  #  1. Librarian credentials verification
  @us001_T01
  Scenario Outline: US001_T01_Login_with_valid_credentials_as_Librarian
    When  user input "<username>" with "<password>"
    Then   user should navigate to Dashboard page as Librarian
        Examples:
        | username           | password          |
        | librarian1@library | qU9mrvur          |
        | librarian2@library | uYrhHmmj          |
        | librarian3@library | DFvU4b1i          |
        | librarian4@library | 3lwxJ1Kk          |
        | librarian5@library | hj65YBiE          |


#  2. Student credentials verification
  @us001_t02
  Scenario Outline: US001_T02_Login_with_valid_credentials_as_Student
    When  user input "<username>" with "<password>"
    Then   user should navigate to Books page as Student
        Examples:
        | username         | password        |
        | student1@library |	d5fv9BtX       |
        | student2@library |	zyxa10vg       |
        | student3@library |	rPjgZ86a       |
        | student4@library |	pG3V6qaL       |
        | student5@library |	i1oDgf2d       |


  # 3. Login as Librarian
  @us001_t03
  Scenario: US001_T03_Login_with_parameters_as_Librarian
    When  user login as "Librarian2"
    Then   user should navigate to Dashboard page


  # 4. Login as Student
  @us001_t04
  Scenario: US001_T04_Login_with_parameters_as_Student
    When  user login as "Student2"
    Then   user should navigate to Books page


  # 5. Login with correct username and wrong password
  @us001_t05
  Scenario Outline: US001_T05_Login_with_corUsername_wrongPassword
    When  user input cor_username with wrong_password for "<user>"
    Then  user should see message <Sorry, Wrong Email or Password>
        Examples:
          | user       |
          | Librarian1 |
          | Librarian2 |
          | Student1   |
          | Student2   |





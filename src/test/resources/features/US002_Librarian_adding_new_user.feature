@wip @smoke @regression
Feature: US_002 Librarian adding new user
  User Story: Librarian adding new user
  Accounts: Librarian

  Background:
    Given  "<Librarian>" is on Users page


  @us002_t01
  Scenario: US002_T01_<Add User modal>_functionality
    When  click on <Add User> button
    Then  <Add User Modal> should appear


  @us002_t02
  Scenario: US002_T02_<Add User modal>_close_functionality
    When  click on <Add User> button
    And  <Add User Modal> should appear
    Then  <Add User Modal> should be able to close


  @us002_t03
  Scenario: US002_T03_Librarian_adds_new_Librarian_user
    When  Librarian inputs all data for new Librarian user
    Then  new librarian user should appear on the grid table


  @us002_t04
  Scenario: US002_T04_Librarian_adds_new_Student_user
    When  Librarian inputs all data for new Student user
    Then  new student user should appear on the grid table





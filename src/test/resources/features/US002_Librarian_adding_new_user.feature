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
      Then  new user should appear on the grid table



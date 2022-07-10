@wip123456
Feature: vytrack app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: truck driver, store manager, sale manager

  Background: Given user is on the login page

  @truckDriver
  Scenario: Login as truck driver
    When user enters the "driver" information
    Then user should sees dashboard

  @Salesmanager
  Scenario: Login as sales manager
    When user enters the "sales manager" information
    Then user should sees dashboard

  @storeManager
  Scenario: Login as store manager
    When user enters the "store manager" information
    Then user should sees dashboard
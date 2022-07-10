@Regression1456111
Feature: vytrack app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: truck driver, store manager, sale manager

  Background: Given users are on the vytracking login page

  @truckDriver
  Scenario: Login as truck driver
    When user the truck driver enters necessary credentials
     Then user should sees dashboard


  @Salesmanager
  Scenario: Login as sales manager
    When user the sales manager enters necessary credentials
    Then user should sees dashboard

  @storeManager
  Scenario: Login as store manager
    When user the store manager enters necessary credentials
    Then user should sees dashboard
@RegressionStore
Feature: vytrack app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: Store manager
  @storeManager
  Scenario: Login as store managers
    When user the store managers enters necessary credentials
    Then users should see dashboard
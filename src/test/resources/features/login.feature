
Feature: Login Test

@login
  Scenario: Login as standard_user
    Given The user on the login page
    When The user enters "standard_user" and "secret_sauce" credentials
    Then The user should be able to login and see "PRODUCTS" page



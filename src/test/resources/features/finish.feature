
Feature: Verify the Products Test

  Background:
    Given The user on the login page
    When The user enters "standard_user" and "secret_sauce" credentials
    When The user should be able to sort the product "Price (high to low)"
    And The user should be able to add the products in the basket
    When The user should be able to open the basket
    And The user should be able to checkout
    When The user should be able to enter the credentials
    And The user should be able to continue

  @wip
  Scenario: Verify the Products and finish
    When The user should be verify "Sauce Labs Backpack" and "Sauce Labs Onesie" products
   # When The user should be verify "Total: $" and "41.02" product's price
    And The user should be able to click finish button
    Then The user should be verify thank "THANK YOU FOR YOUR ORDER" message
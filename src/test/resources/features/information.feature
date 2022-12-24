
Feature: Information Test

  Background:
    Given The user on the login page
    When The user enters "standard_user" and "secret_sauce" credentials
    When The user should be able to sort the product "Price (high to low)"
    And The user should be able to add the products in the basket
    When The user should be able to open the basket
    And The user should be able to checkout


  Scenario: Given Information
    When The user should be able to enter the credentials
    And The user should be able to continue
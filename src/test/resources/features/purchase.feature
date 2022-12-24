Feature: Purchase E2E test

  Background:
    Given The user on the login page
    When The user enters "standard_user" and "secret_sauce" credentials


  Scenario: Sauce Purchase
    When The user should be able to sort the product "Price (high to low)"
    And The user should be able to add the products in the basket


    #And The user should be able to add "" and "" products in the basket

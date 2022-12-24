package com.sauce.stepDefs;

import com.sauce.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Purchase_StepDefs {

    ProductPage productPage=new ProductPage();

    @When("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String text) {
        productPage.priceSortMethod(text);

    }
    @And("The user should be able to add the products in the basket")
    public void theUserShouldBeAbleToAddTheProductsInTheBasket() {
        productPage.addToCard1Method();
        productPage.addToCard2Method();
    }


//    @And("The user should be able to add {string} and {string} products in the basket")
//    public void theUserShouldBeAbleToAddAndProductsInTheBasket(String arg0, String arg1) {
//
//
//    }
}

package com.sauce.stepDefs;

import com.sauce.pages.BasePage;
import com.sauce.pages.BasketPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Basket_StepDefs {
    BasketPage basketPage=new BasketPage();

    @When("The user should be able to open the basket")
    public void theUserShouldBeAbleToOpenTheBasket() {
        basketPage.basketButtonMethod();
    }
    @And("The user should be able to checkout")
    public void theUserShouldBeAbleToCheckout() {
        basketPage.checkoutBtnMethod();
    }

}

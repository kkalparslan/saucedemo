package com.sauce.stepDefs;

import com.sauce.pages.InformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Information_StepDefs {

    InformationPage informationPage=new InformationPage();
    @When("The user should be able to enter the credentials")
    public void theUserShouldBeAbleToEnterTheCredentials() {
        informationPage.checkoutYourInfMtd();
    }

    @And("The user should be able to continue")
    public void theUserShouldBeAbleToContinue() {
        informationPage.continueMethod();
    }


}

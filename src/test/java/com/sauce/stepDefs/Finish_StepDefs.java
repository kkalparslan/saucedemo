package com.sauce.stepDefs;

import com.sauce.pages.FinishAndVerifyPage;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Finish_StepDefs {

    FinishAndVerifyPage finish=new FinishAndVerifyPage();

    @When("The user should be verify {string} and {string} products")
    public void theUserShouldBeVerifyAndProducts(String expected1, String expected2) {

        String actual1=finish.getTextLabsBackpackMethod();
        String actual2=finish.getTextLabsOnesieMethod();
        Assert.assertEquals("verify", expected1, actual1);
        Assert.assertEquals("verify", expected2, actual2);
        System.out.println("expected1 = " + expected1);
        System.out.println("actual1 = " + actual1);
        System.out.println("expected2 = " + expected2);
        System.out.println("actual2 = " + actual2);

    }
    @Then("The user should be able to click finish button")
    public void theUserShouldBeAbleToClickFinishButton() {
        finish.finishmethod();
    }

    @Then("The user should be verify thank {string} message")
    public void theUserShouldBeVerifyThankMessage(String expectedMessage) throws InterruptedException {
        String actualMessage=finish.getTextThanksMethod(expectedMessage);
        Assert.assertEquals("verify", expectedMessage, actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);

    }
//    @When("The user should be verify {string} and {string} product's price")
//    public void theUserShouldBeVerifyAndProductSPrice(String expectedTotal, String expectedPrice) {
//        String actualTotalText=finish.totalTextMethod(expectedTotal);
//        String actualPriceText=finish.priceTextMethod(expectedPrice);
//
//        System.out.println("expectedTotal = " + expectedTotal);
//        System.out.println("actualTotalText = " + actualTotalText);
//        System.out.println("expectedPrice = " + expectedPrice);
//        System.out.println("actualPriceText = " + actualPriceText);
//
//    }
}

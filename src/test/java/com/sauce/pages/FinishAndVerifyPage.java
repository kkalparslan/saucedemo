package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinishAndVerifyPage extends BasePage {

    @FindBy(xpath = "//div[.='Sauce Labs Backpack']")
    public WebElement LabsBackpack_loc;

    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    public WebElement LabsOnesie_loc;

    public String getTextLabsBackpackMethod() {
        return LabsBackpack_loc.getText();

    }

    public String getTextLabsOnesieMethod() {
        return LabsOnesie_loc.getText();
    }

    @FindBy(css = "#finish")
    public WebElement finishBttn_loc;

    public void finishmethod() {
        finishBttn_loc.click();
    }

    @FindBy(xpath = "//*[.='THANK YOU FOR YOUR ORDER']")
    public WebElement thankYouMessage_loc;

    public String getTextThanksMethod(String message) {
        return thankYouMessage_loc.getText();
    }

//    @FindBy(xpath = "//*[.='Total: $']")
//    public WebElement totalPrice£_loc;
//
//    @FindBy(xpath = "//*[.='41.02']")
//    public WebElement totalPrice_loc;

//    public String totalTextMethod(String total) {
//        return totalPrice£_loc.getText();
//    }
//
//    public String priceTextMethod(String total){
//        return totalPrice_loc.getText();
//    }


}

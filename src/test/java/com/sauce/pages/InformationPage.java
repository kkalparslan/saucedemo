package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends BasePage{

    @FindBy(id = "first-name")
    public WebElement firstName_loc;

    @FindBy(id = "last-name")
    public WebElement lastName_loc;

    @FindBy(id = "postal-code")
    public WebElement zipCode_loc;

    public void checkoutYourInfMtd(){
        firstName_loc.sendKeys("Alp");
        lastName_loc.sendKeys("Arslan");
        zipCode_loc.sendKeys("12345");

    }
    @FindBy(css = "#continue")
    public WebElement continueButton_loc;

    public void continueMethod(){
        continueButton_loc.click();
    }


}

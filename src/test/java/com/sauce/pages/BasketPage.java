package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    @FindBy(className = "shopping_cart_badge")
    public WebElement basketButton_loc;

    public void basketButtonMethod(){
        basketButton_loc.click();
    }

    @FindBy(css = "#checkout")
    public WebElement checkoutButton_loc;

    public void checkoutBtnMethod(){
        checkoutButton_loc.click();
    }


}

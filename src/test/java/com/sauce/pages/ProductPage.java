package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productHeader_loc;

    @FindBy(className = "product_sort_container")
    public WebElement priceButton_loc;

    public void priceSortMethod(String text) {
        //priceButton_loc.click();
        Select select=new Select(priceButton_loc);
        select.selectByVisibleText(text);

    }

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement addToCard1_loc;

    public void addToCard1Method(){
        addToCard1_loc.click();
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCard2_loc;

    public void addToCard2Method(){
        addToCard2_loc.click();
    }

    @FindBy(xpath = "//*[.='29.99']")
    public WebElement secondCostliesPro_loc;

    @FindBy(xpath = "//*[.='7.99']")
    public WebElement cheapestPro_loc;



}

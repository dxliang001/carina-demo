package com.zebrunner.carina.demo.gui.saucedemo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CheckPage extends AbstractPage {


    @FindBy(xpath = "//div[@class=\"cart_item\"]//div[@class=\"inventory_item_name\"]")
    private List<ExtendedWebElement> itemList;

    @FindBy(xpath = "//div[@class=\"cart_item\"]//div[@class=\"inventory_item_price\"]")
    private List<ExtendedWebElement> itemPriceList;


    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    private ExtendedWebElement backButton;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    private ExtendedWebElement checkoutButton;

    @FindBy(xpath = "//*[@id=\"remove\"]")
    private ExtendedWebElement removeButton;


    public List<String> getItemNames() {
        return itemList.stream().map(ExtendedWebElement::getText).collect(Collectors.toList());
    }

    public List<String> getItemPrices() {
        return itemPriceList.stream().map(ExtendedWebElement::getText).collect(Collectors.toList());
    }


    public CheckPage(WebDriver driver) {
        super(driver);
    }

    public void removeItemFromCart() {
        removeButton.click();
    }

    public void clickBackToHomePage() {
        backButton.click();
    }

    public void goToCartPage() {
        checkoutButton.click();
    }



}
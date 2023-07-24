package com.zebrunner.carina.demo.gui.saucedemo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends AbstractPage {
    int count = 6;

    @FindBy(id = "react-burger-menu-btn")
    private ExtendedWebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private ExtendedWebElement logoutButton;

    @FindBy(id = "shopping_cart_container")
    private ExtendedWebElement cartButton;

    @FindBy(id = "inventory_container")
    private List<ExtendedWebElement> inventoryItems;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private ExtendedWebElement sortButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click(2000);
    }

    public void clickSortButton() {
        sortButton.click();
    }

    public void clickAddToCartButton(int itemIndex) {
        ExtendedWebElement addToCartButton = inventoryItems.get(itemIndex).findExtendedWebElement(By.className("btn_inventory"));
        addToCartButton.click();
    }

    public void clickCartButton() {
        cartButton.click();
    }

    public String getItemName(int itemIndex) {
        ExtendedWebElement itemNameElement = inventoryItems.get(itemIndex).findExtendedWebElement(By.className("inventory_item_name"));
        return itemNameElement.getText();
    }

    public String getItemPrice(int itemIndex) {
        ExtendedWebElement itemPriceElement = inventoryItems.get(itemIndex).findExtendedWebElement(By.className("inventory_item_price"));
        return itemPriceElement.getText();
    }
}
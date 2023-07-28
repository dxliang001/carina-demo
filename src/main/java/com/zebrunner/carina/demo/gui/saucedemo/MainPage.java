package com.zebrunner.carina.demo.gui.saucedemo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private WebDriver driver;

    @FindBy(className = "inventory_list")
    private ExtendedWebElement inventoryList;
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

    @FindBy(className = "shopping_cart_badge")
    private ExtendedWebElement cartBadge;

    @FindBy(id = "about_sidebar_link")
    private ExtendedWebElement aboutLink;



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

    public boolean isItemInCart() {
        try {
            ExtendedWebElement cartBadge = findExtendedWebElement(By.className("shopping_cart_badge"));
            int itemCount = Integer.parseInt(cartBadge.getText());
            return itemCount > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isInventoryListPresent() {
        try {
            assertElementPresent(inventoryList);
            List<ExtendedWebElement> inventoryItems = inventoryList.findExtendedWebElements(By.className("inventory_item"));
            if (inventoryItems.isEmpty()) {
                return false;
            } else {
                for (ExtendedWebElement item : inventoryItems) {
                    ExtendedWebElement itemNameElement = item.findExtendedWebElement(By.className("inventory_item_name"));
                    LOGGER.info(itemNameElement.getText());
                }
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public void selectSortOption(String optionValue) {
        Select sortSelect = new Select(sortButton.getElement());
        sortSelect.selectByValue(optionValue);
    }

    public String getSortOption() {
        Select sortSelect = new Select(sortButton.getElement());
        return sortSelect.getFirstSelectedOption().getText();
    }

    public boolean isSorted(String optionValue) throws InterruptedException {
        List<ExtendedWebElement> inventoryItems = inventoryList.findExtendedWebElements(By.className("inventory_item"));
        List<String> itemNames = new ArrayList<>();
        List<Double> itemPrices = new ArrayList<>();

        for (ExtendedWebElement item : inventoryItems) {
            ExtendedWebElement itemNameElement = item.findExtendedWebElement(By.className("inventory_item_name"));
            itemNames.add(itemNameElement.getText());

            ExtendedWebElement itemPriceElement = item.findExtendedWebElement(By.className("inventory_item_price"));
            itemPrices.add(Double.parseDouble(itemPriceElement.getText().substring(1)));
        }

        if (optionValue.equals("az") || optionValue.equals("za")) {
            List<String> sortedItemNames = new ArrayList<>(itemNames);
            Collections.sort(sortedItemNames);
            if (optionValue.equals("za")) {
                Collections.reverse(sortedItemNames);

            }
            return itemNames.equals(sortedItemNames);
        } else if (optionValue.equals("lohi") || optionValue.equals("hilo")) {
            List<Double> sortedItemPrices = new ArrayList<>(itemPrices);
            Collections.sort(sortedItemPrices);
            if (optionValue.equals("hilo")) {
                Collections.reverse(sortedItemPrices);

            }
            return itemPrices.equals(sortedItemPrices);
        } else {
            return false;
        }
    }

    public void openMenu() {
        menuButton.click();
    }

    public void openAboutSite() {
        aboutLink.click();
    }

}
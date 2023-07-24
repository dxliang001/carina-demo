package com.zebrunner.carina.demo.gui.saucedemo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends AbstractPage {
    private WebDriver driver;

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


    public void clickAddToCartButton(String itemId) {
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-" + itemId));
        addToCartButton.click();
    }

    public boolean isItemInCart(String itemId) {
        WebElement cartItem = driver.findElement(By.id("cart-" + itemId));
        return cartItem != null;
    }

    public boolean isProductCardDisplayed(String itemId) {
        WebElement productCard = driver.findElement(By.id("product-card-" + itemId));
        return productCard != null;
    }

    public void searchForItem(String itemName) {
        WebElement searchBox = driver.findElement(By.id("search-box"));
        searchBox.sendKeys(itemName);
        searchBox.submit();
    }

    public boolean isItemDisplayedInSearchResults(String itemName) {
        WebElement searchResult = driver.findElement(By.xpath("//div[contains(text(), '" + itemName + "')]"));
        return searchResult != null;
    }

    public void openAllItemsPage() {
        WebElement allItemsLink = driver.findElement(By.id("all-items-link"));
        allItemsLink.click();
    }

    public boolean isAllItemsPageDisplayed() {
        WebElement allItemsPage = driver.findElement(By.id("all-items-page"));
        return allItemsPage != null;
    }

    public void openAboutPage() {
        WebElement aboutLink = driver.findElement(By.id("about-link"));
        aboutLink.click();
    }

    public boolean isAboutPageDisplayed() {
        WebElement aboutPage = driver.findElement(By.id("about-page"));
        return aboutPage != null;
    }
}
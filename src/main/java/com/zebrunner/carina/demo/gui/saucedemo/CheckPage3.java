package com.zebrunner.carina.demo.gui.saucedemo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class CheckPage3 extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"cart_item\"]//div[@class=\"inventory_item_name\"]")
    private List<ExtendedWebElement> itemList;

    @FindBy(xpath = "//div[@class=\"cart_item\"]//div[@class=\"inventory_item_price\"]")
    private List<ExtendedWebElement> itemPriceList;

    @FindBy(xpath = "//div[@class=\"summary_total_label\"]")
    private ExtendedWebElement totalPrice;

    @FindBy(id = "cancel")
    private ExtendedWebElement cancelButton;

    @FindBy(id = "finish")
    private ExtendedWebElement finishButton;

    public CheckPage3(WebDriver driver) {
        super(driver);
    }

    public List<String> getItemNames() {
        return itemList.stream().map(ExtendedWebElement::getText).collect(Collectors.toList());
    }

    public List<String> getItemPrices() {
        return itemPriceList.stream().map(ExtendedWebElement::getText).collect(Collectors.toList());
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }

    public void clickCancel() {
        cancelButton.click();
    }

    public void clickFinish() {
        finishButton.click();
    }
}

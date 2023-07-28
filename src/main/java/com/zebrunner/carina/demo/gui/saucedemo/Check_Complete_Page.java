package com.zebrunner.carina.demo.gui.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check_Complete_Page {

    private WebDriver driver;


    private By completeHeader = By.className("complete-header");
    private By completeText = By.className("complete-text");
    private By backButton = By.id("back-to-products");

    public Check_Complete_Page(WebDriver driver) {
        this.driver = driver;
    }


    public String getHeaderText() {
        WebElement header = driver.findElement(completeHeader);
        return header.getText();
    }


    public String getCompleteText() {
        WebElement text = driver.findElement(completeText);
        return text.getText();
    }


    public void clickBackButton() {
        WebElement back = driver.findElement(backButton);
        back.click();
    }
}

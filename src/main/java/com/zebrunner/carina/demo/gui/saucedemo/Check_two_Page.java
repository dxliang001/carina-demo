package com.zebrunner.carina.demo.gui.saucedemo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Check_two_Page extends AbstractPage {

    @FindBy(id = "first-name")
    private ExtendedWebElement firstNameInput;

    @FindBy(id = "last-name")
    private ExtendedWebElement lastNameInput;

    @FindBy(id = "postal-code")
    private ExtendedWebElement postalCodeInput;

    @FindBy(id = "cancel")
    private ExtendedWebElement cancelButton;

    @FindBy(id = "continue")
    private ExtendedWebElement continueButton;

    public Check_two_Page(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName) {
        firstNameInput.type(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    public void enterPostalCode(String postalCode) {
        postalCodeInput.type(postalCode);
    }

    public void clickCancel() {
        cancelButton.click();
    }

    public void clickContinue() {
        continueButton.click();
    }
}

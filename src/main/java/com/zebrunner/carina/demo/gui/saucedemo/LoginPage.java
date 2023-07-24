package com.zebrunner.carina.demo.gui.saucedemo;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(className = "error-message-container")
    private ExtendedWebElement errorMessage;

    @FindBy(id="login-button")
    private ExtendedWebElement loginButton;

    @FindBy(id = "user-name")
    private ExtendedWebElement usernameField;

    @FindBy(id = "password")
    private ExtendedWebElement passwordField;

    public LoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.saucedemo.com/");
    }

    public void inputLogin(String login) {
        usernameField.click();
        usernameField.type(login);
    }

    public void inputPassword(String password) {
        passwordField.click();
        passwordField.type(password);
    }

    public boolean displayErrorMessage(String message) {
        assertElementPresent(errorMessage);
        return errorMessage.getText().equals(message);
    }

    public void clickLoginButton() {
        loginButton.click();

    }
}
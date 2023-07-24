package com.zebrunner.carina.demo.saucedemo;


import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.gui.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest implements IAbstractTest {

    LoginPage loginPage;
    @BeforeTest
    public void startDriver() {
        loginPage = new LoginPage(getDriver());
    }

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "1. empty input", value = {"web"})
    public void emptyUsernameInput() {
        loginPage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        loginPage.clickLoginButton();
        softAssert.assertTrue(loginPage.displayErrorMessage("Epic sadface: Username is required"), "Error message is not displayed or incorrect");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "2. username input only", value = {"web"})
    public void usernameInputOnly() {
        loginPage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        loginPage.inputLogin("standard_user");
        loginPage.clickLoginButton();
        softAssert.assertTrue(loginPage.displayErrorMessage("Epic sadface: Password is required"), "Error message is not displayed or incorrect");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "2. valid Password", value = {"web"})
    public void ValidPassword() {
        loginPage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("wrong_password");
        loginPage.clickLoginButton();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        softAssert.assertTrue(loginPage.displayErrorMessage("Epic sadface: Username and password do not " + "match any user in this service"));
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "4. successful login", value = {"web"})
    public void successfulLogin() {
        loginPage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Redirected URL after login is incorrect");
        softAssert.assertAll();
    }

}
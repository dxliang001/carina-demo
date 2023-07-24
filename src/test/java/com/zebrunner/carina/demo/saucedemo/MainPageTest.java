package com.zebrunner.carina.demo.saucedemo;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.gui.saucedemo.LoginPage;
import com.zebrunner.carina.demo.gui.saucedemo.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainPageTest implements IAbstractTest {
    LoginPage loginPage;
    MainPage mainPage;
    @BeforeTest
    public void startDriver() {
        loginPage = new LoginPage(getDriver());
        mainPage = new MainPage(getDriver());
    }

    @Test
    public void testCartValidation() {
        loginPage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Redirected URL after login is incorrect");
        mainPage.clickAddToCartButton("sauce-labs-bike-light");
        Assert.assertTrue(mainPage.isItemInCart("sauce-labs-bike-light"), "Item was not added to the cart!");
    }



}

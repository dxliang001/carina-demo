package com.zebrunner.carina.demo.saucedemo;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.gui.saucedemo.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainPageTest implements IAbstractTest {
    LoginPage loginPage;
    MainPage mainPage;

    CartPage cartPage;
    CheckPage checkPage;
    Check_two_Page check_two_page;
    Check_Complete_Page checkCompletePage;

    @BeforeTest
    public void startDriver() {
        loginPage = new LoginPage(getDriver());
        mainPage = new MainPage(getDriver());
        checkPage = new CheckPage(getDriver());
        check_two_page = new Check_two_Page(getDriver());
        cartPage = new CartPage(getDriver());
        checkCompletePage = new Check_Complete_Page(getDriver());
    }

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "1. add item to cart and check cart change", value = {"web"})
    public void testCartValidation() {
        loginPage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Redirected URL after login is incorrect");
        mainPage.clickAddToCartButton(0);
        Assert.assertTrue(mainPage.isItemInCart(), "Item was not added to cart");
    }

    @Test(dependsOnMethods = "testCartValidation")
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "2. test product card", value = {"web"})
    public void testProductCard() {
        Assert.assertTrue(mainPage.isInventoryListPresent(), "Inventory list is not present or empty");
    }

    @Test(dependsOnMethods = "testProductCard")
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "3. sort Z to A", value = {"web"})
    public void testSortByNameZToA() throws InterruptedException {
        mainPage.clickSortButton();
        mainPage.selectSortOption("za");
        Assert.assertTrue(mainPage.isSorted("za"), "Items are not sorted by name (Z to A)");
    }

    @Test(dependsOnMethods = "testSortByNameZToA")
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "4. sort A to Z", value = {"web"})
    public void testSortByNameAToZ() throws InterruptedException {
        mainPage.clickSortButton();
        mainPage.selectSortOption("az");
        Assert.assertTrue(mainPage.isSorted("az"), "Items are not sorted by name (A to Z)");
    }

    @Test(dependsOnMethods = "testSortByNameAToZ")
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "5. Sort low to high", value = {"web"})
    public void testSortByPriceLowToHigh() throws InterruptedException {
        mainPage.clickSortButton();
        mainPage.selectSortOption("lohi");
        Assert.assertTrue(mainPage.isSorted("lohi"), "Items are not sorted by price (low to high)");
    }

    @Test(dependsOnMethods = "testSortByPriceLowToHigh")
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "6. Sort high to low", value = {"web"})
    public void testSortByPriceHighToLow() throws InterruptedException {
        mainPage.clickSortButton();
        mainPage.selectSortOption("hilo");
        Assert.assertTrue(mainPage.isSorted("hilo"), "Items are not sorted by price (high to low)");
    }

    @Test(dependsOnMethods = "testSortByPriceHighToLow")
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "7. Open All site", value = {"web"})
    public void testOpenOfAllPage() {
        loginPage.open();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(loginPage.isPageOpened(), "Login Page Fail to opened");
        loginPage.inputLogin("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Redirected URL after login is incorrect");
        mainPage.clickAddToCartButton(0);
        mainPage.clickCartButton();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/cart.html", "Redirected URL after login is incorrect");
        checkPage.goToCartPage();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html", "Redirected URL after login is incorrect");
        check_two_page.enterFirstName("John");
        check_two_page.enterLastName("John");
        check_two_page.enterPostalCode("11222");
        check_two_page.clickContinue();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/checkout-step-two.html", "Redirected URL after login is incorrect");
        cartPage.clickFinish();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html", "Redirected URL after login is incorrect");
        checkCompletePage.clickBackButton();
        mainPage.openMenu();
        mainPage.openAboutSite();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://saucelabs.com/", "About site did not open correctly");
        softAssert.assertAll();
    }

}

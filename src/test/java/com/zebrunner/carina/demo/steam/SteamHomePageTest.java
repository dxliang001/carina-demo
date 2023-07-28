package com.zebrunner.carina.demo.steam;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.gui.steam.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

public class SteamHomePageTest implements IAbstractTest {

    HomePage steamHomePage;

    @BeforeTest
    public void setup() {
        steamHomePage = new HomePage(getDriver());
    }

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "1. Testing the 'Install Steam' button working properly, so we can test download file in the feature", value = {"web"})
    public void testInstallSteamPageOpens() {
        steamHomePage.open();
        SoftAssert softAssert = new SoftAssert();
        steamHomePage.isHomePageOpen();
        steamHomePage.clickInstallSteam();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://store.steampowered.com/about/", "Redirected URL after URL is incorrect");
        WebElement aboutGreeting = getDriver().findElement(By.id("about_greeting"));
        softAssert.assertNotNull(aboutGreeting, "About Greeting is not present on the page");

        WebElement steamLogo = getDriver().findElement(By.className("steam_logo"));
        softAssert.assertNotNull(steamLogo, "Steam Logo is not present on the page");

        WebElement aboutSubtitle = getDriver().findElement(By.className("about_subtitle"));
        softAssert.assertNotNull(aboutSubtitle, "Subtitle is not present on the page");
        steamHomePage.clickInstallButton();
        softAssert.assertAll();
    }


    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "2. Test different Categories button in the HomePage", value = {"web"})
    public void testTopSellersSelection() {
        steamHomePage.open();
        steamHomePage.clickTopSellersTab();
        steamHomePage.clickFirstTopSeller();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getDriver().getCurrentUrl(), "https://store.steampowered.com/agecheck/app/1282100/", "Redirected URL after URL is incorrect");
        //add more feature if we want to
    }

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "3. Test on language dropdown menu and see if website language change.", value = {"web"})
    public void testLanguageSelection() {
        steamHomePage.open();
        SoftAssert softAssert = new SoftAssert();
        steamHomePage.clickLanguageDropdown();
        List<String> availableLanguages = steamHomePage.getAvailableLanguages();
        Assert.assertTrue(availableLanguages.contains("简体中文 (Simplified Chinese)"), "'tchinese is not available in the language dropdown");
        Assert.assertTrue(availableLanguages.contains("Deutsch (German)"), "'German is not available in the language dropdown");
        Assert.assertTrue(availableLanguages.contains("Français (French)"), "'French is not available in the language dropdown");
        steamHomePage.selectLanguage("简体中文 (Simplified Chinese)");
        softAssert.assertAll();
    }
}




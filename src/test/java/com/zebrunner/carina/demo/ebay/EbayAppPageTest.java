package com.zebrunner.carina.demo.ebay;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import com.zebrunner.carina.demo.mobile.gui.pages.ebay.ebayAppPage;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class EbayAppPageTest implements IAbstractTest, IMobileUtils {

    @Test
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testSearchBar() {
        ebayAppPage ebayPage = new ebayAppPage(getDriver());
        ebayPage.clickCloseSignInSection();
        ebayPage.insertTextIntoSearchBar("Iphone");
        ebayPage.clickOnFirstSuggestedItem();
        ebayPage.clickOneTB();
        ebayPage.getFirstPhoneResultName();
        ebayPage.clickOnAddtocartButton();
    }


}
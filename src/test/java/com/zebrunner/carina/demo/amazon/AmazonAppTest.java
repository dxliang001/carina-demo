package com.zebrunner.carina.demo.amazon;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.mobile.gui.pages.amazon.AmazonHomePageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AmazonAppTest implements IAbstractTest, IMobileUtils {

    @Test
    public void Simpletest() throws InterruptedException {
        AmazonHomePageBase AmazonHomePage = initPage(getDriver(), AmazonHomePageBase.class);
        Thread.sleep(5000);
        AmazonHomePage.clickNotAllow();
        Assert.assertTrue(AmazonHomePage.isPageOpened(), "Amazon home page isn't opened");
        AmazonHomePage.clickSkipButton();

    }


}
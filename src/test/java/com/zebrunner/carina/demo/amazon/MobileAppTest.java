package com.zebrunner.carina.demo.amazon;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.mobile.gui.pages.mobile.CalculatorPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileAppTest implements IAbstractTest, IMobileUtils {

    @Test
    public void Simpletest() throws InterruptedException {
        CalculatorPageBase Calculator = initPage(getDriver(), CalculatorPageBase.class);
        Assert.assertTrue(Calculator.isPageOpened(), "App has not launched successfully.");

    }


}
package com.zebrunner.carina.demo.mobileApp;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.demo.mobile.gui.pages.mobile.CalculatorPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.emulation.model.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MobileAppTest implements IAbstractTest, IMobileUtils {


    @Test(description = "Test Addition and Subtraction")
    public void testAdditionAndSubtraction() throws InterruptedException {
        CalculatorPageBase calculator = initPage(getDriver(), CalculatorPageBase.class);

        Assert.assertTrue(calculator.isPageOpened(), "Calculator app has not launched successfully.");

        // Performing (2 + 3) + 6
        calculator.clickParenthesisButton();
        calculator.clickTwoButton();
        calculator.clickAddButton();
        calculator.clickThreeButton();
        calculator.clickParenthesisButton();
        calculator.clickAddButton();
        calculator.clickSixButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(), "11");


        // Performing (9 - 5) - 1
        calculator.clickParenthesisButton();
        calculator.clickNineButton();
        calculator.clickSubButton();
        calculator.clickFiveButton();
        calculator.clickParenthesisButton();
        calculator.clickSubButton();
        calculator.clickOneButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(), "3");
    }

    @Test(description = "Test Multiplication and Division")
    public void testMultiplicationAndDivision() throws InterruptedException {
        CalculatorPageBase calculator = initPage(getDriver(), CalculatorPageBase.class);
        Assert.assertTrue(calculator.isPageOpened(), "Calculator app has not launched successfully.");

        // Performing (8 * 7) / 4
        calculator.clickParenthesisButton();
        calculator.clickEightButton();
        calculator.clickMulButton();
        calculator.clickSevenButton();
        calculator.clickParenthesisButton();
        calculator.clickDivButton();
        calculator.clickFourButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(), "14");
    }

    @Test(description = "Test Sin, Cos, Tan Functions")
    public void testSinCosTanFunctions() throws InterruptedException {
        CalculatorPageBase calculator = initPage(getDriver(), CalculatorPageBase.class);
        Assert.assertTrue(calculator.isPageOpened(), "Calculator app has not launched successfully.");

        calculator.clickAcButton();
        //Degree Mode
        calculator.clickDropdownMenuButton();
        calculator.clickRadianButton();
        // Performing sin(1)
        calculator.clickSinButton();
        calculator.clickOneButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(), "0.8414709848078");

        // Performing cos(1)
        calculator.clickCosButton();
        calculator.clickOneButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(),  "0.5403023058681");

        // Performing tan(1)
        calculator.clickTanButton();
        calculator.clickOneButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(),  "1.5574077246549");


        //Radian Mode
        calculator.clickAcButton();
        calculator.clickRadianButton();
        // Performing Cos(π)
        calculator.clickCosButton();
        calculator.clickPieButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(),  "0.9998481525835");

    }

    @Test(description = "Test Ln and Log Functions")
    public void testLnAndLogFunctions() throws InterruptedException {
        CalculatorPageBase calculator = initPage(getDriver(), CalculatorPageBase.class);
        Assert.assertTrue(calculator.isPageOpened(), "Calculator app has not launched successfully.");

        calculator.clickDropdownMenuButton();
        // Performing ln(e)
        calculator.clickLnButton();
        calculator.clickEButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(),  "1");

        // Performing log(10)
        calculator.clickLogButton();
        calculator.clickOneButton();
        calculator.clickZeroButton();
        calculator.clickEqButton();
        Assert.assertEquals(calculator.getResultElement().getText(), "1");
    }
}
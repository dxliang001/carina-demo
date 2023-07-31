package com.zebrunner.carina.demo.mobileApp;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.mobile.gui.pages.mobile.CalculatorPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MobileAppTest implements IAbstractTest, IMobileUtils {



    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "1. Test Addition and Subtraction", value = {"mobile"})
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

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "2. Test Multiplication and Division", value = {"mobile"})
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

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "3. Test Sin, Cos, Tan Functions", value = {"mobile"})
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

    @Test
    @MethodOwner(owner = "dxl")
    @TestLabel(name = "4. Test Ln and Log Functions", value = {"mobile"})
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
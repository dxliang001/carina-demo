package com.zebrunner.carina.demo.mobile.gui.pages.mobile;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CalculatorPageBase extends AbstractPage {

    public CalculatorPageBase(WebDriver driver) {
        super (driver);
    }

    public abstract void clickAcButton();

    public abstract void clickPieButton();

    public abstract void clickZeroButton();
    public abstract void clickOneButton();
    public abstract void clickTwoButton();

    public abstract void clickThreeButton();

    public abstract void clickFourButton();

    public abstract void clickFiveButton();

    public abstract void clickSixButton();
    public abstract  void clickSevenButton();

    public abstract void clickEightButton();

    public abstract void clickNineButton();

    public abstract void clickEqButton();

    public abstract ExtendedWebElement getResultElement();

    public abstract void clickAddButton();

    public abstract void clickSubButton();

    public abstract void clickDivButton();

    public abstract void clickMulButton();

    public abstract void clickParenthesisButton();

    public abstract void clickDropdownMenuButton();
    public abstract void clickRadianButton();

    public abstract void clickSinButton();
    public abstract void clickCosButton();
    public abstract void clickTanButton();
    public abstract void clickInvButton();

    public abstract void clickEButton();
    public abstract void clickLnButton();
    public abstract void clickLogButton();
}
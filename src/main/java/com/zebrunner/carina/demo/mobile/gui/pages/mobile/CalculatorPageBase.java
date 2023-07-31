package com.zebrunner.carina.demo.mobile.gui.pages.mobile;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CalculatorPageBase extends AbstractPage {

    public CalculatorPageBase(WebDriver driver) {
        super (driver);
    }

    public abstract  ExtendedWebElement getZeroButton();
    public abstract ExtendedWebElement getOneButton();
    public abstract ExtendedWebElement getTwoButton();

    public abstract ExtendedWebElement getThreeButton();

    public abstract ExtendedWebElement getFourButton();

    public abstract ExtendedWebElement getFiveButton();

    public abstract ExtendedWebElement getSixButton();
    public abstract  ExtendedWebElement getSevenButton();

    public abstract ExtendedWebElement getEightButton();

    public abstract ExtendedWebElement getNineButton();

    public abstract ExtendedWebElement getEqButton();

    public abstract ExtendedWebElement getResultElement();

    public abstract ExtendedWebElement getAddButton();

    public abstract ExtendedWebElement getSubButton();

    public abstract ExtendedWebElement getDivButton();

    public abstract ExtendedWebElement getMulButton();

    public abstract ExtendedWebElement getParenthesisButton();

    public abstract ExtendedWebElement getDropdownMenuButton();
    public abstract ExtendedWebElement getRadianButton();

    public abstract ExtendedWebElement getSinButton();
    public abstract ExtendedWebElement getCosButton();
    public abstract ExtendedWebElement getTanButton();
    public abstract ExtendedWebElement getInvButton();

    public abstract ExtendedWebElement getEButton();
    public abstract ExtendedWebElement getLnButton();
    public abstract ExtendedWebElement getLogButton();
}
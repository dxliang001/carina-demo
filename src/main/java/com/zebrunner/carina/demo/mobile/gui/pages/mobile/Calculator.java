package com.zebrunner.carina.demo.mobile.gui.pages.mobile;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CalculatorPageBase.class)
public class Calculator extends CalculatorPageBase {

    public Calculator(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.google.android.calculator:id/main_calculator")
    private ExtendedWebElement acButton;

    @FindBy(id = "com.google.android.calculator:id/digit_0")
    private ExtendedWebElement zeroButton;
    @FindBy(id ="com.google.android.calculator:id/digit_1")
    private ExtendedWebElement oneButton;

    @FindBy(id = "com.google.android.calculator:id/digit_2")
    private ExtendedWebElement twoButton;

    @FindBy(id = "com.google.android.calculator:id/digit_3")
    private ExtendedWebElement threeButton;

    @FindBy(id = "com.google.android.calculator:id/digit_4")
    private ExtendedWebElement fourButton;

    @FindBy(id = "com.google.android.calculator:id/digit_5")
    private ExtendedWebElement fiveButton;

    @FindBy(id = "com.google.android.calculator:id/digit_6")
    private ExtendedWebElement sixButton;

    @FindBy(id = "com.google.android.calculator:id/digit_7")
    private ExtendedWebElement sevenButton;

    @FindBy(id = "com.google.android.calculator:id/digit_8")
    private ExtendedWebElement eightButton;

    @FindBy(id = "com.google.android.calculator:id/digit_9")
    private ExtendedWebElement nineButton;

    @FindBy(id = "com.google.android.calculator:id/parens")
    private ExtendedWebElement parenthesisButton;

    @FindBy(id = "com.google.android.calculator:id/op_pct")
    private ExtendedWebElement pctButton;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    private ExtendedWebElement divButton;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    private ExtendedWebElement mulButton;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    private ExtendedWebElement subButton;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    private ExtendedWebElement addButton;

    @FindBy(id = "com.google.android.calculator:id/eq")
    private ExtendedWebElement eqButton;

    @FindBy(id = "com.google.android.calculator:id/del")
    private ExtendedWebElement delButton;

    @FindBy(id = "com.google.android.calculator:id/dec_point")
    private ExtendedWebElement decPointButton;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    private ExtendedWebElement resultElement;

    @FindBy(id = "com.google.android.calculator:id/collapse_expand")
    private ExtendedWebElement dropdownMenuButton;

    @FindBy(id = "com.google.android.calculator:id/toggle_mode")
    private ExtendedWebElement DEGButton;
    @FindBy(id = "com.google.android.calculator:id/fun_sin")
    private ExtendedWebElement sinButton;
    @FindBy(id = "com.google.android.calculator:id/fun_cos")
    private ExtendedWebElement cosButton;
    @FindBy(id = "com.google.android.calculator:id/fun_tan")
    private ExtendedWebElement tanButton;
    @FindBy(id= "com.google.android.calculator:id/toggle_inv")
    private ExtendedWebElement INVButton;
    @FindBy(id = "com.google.android.calculator:id/const_e")
    private ExtendedWebElement eButton;
    @FindBy(id = "com.google.android.calculator:id/fun_ln")
    private ExtendedWebElement lnButton;
    @FindBy(id = "com.google.android.calculator:id/fun_log")
    private ExtendedWebElement logButton;


    @Override
    public boolean isPageOpened() {return acButton.isElementPresent();}

    public ExtendedWebElement getZeroButton() {
        return zeroButton;
    }
    public ExtendedWebElement getOneButton() {
        return oneButton;
    }

    public ExtendedWebElement getTwoButton() { return twoButton; }

    public ExtendedWebElement getThreeButton() {
        return threeButton;
    }

    public ExtendedWebElement getFourButton() {
        return fourButton;
    }

    public ExtendedWebElement getFiveButton() {
        return fiveButton;
    }

    public ExtendedWebElement getSixButton() {
        return sixButton;
    }

    public ExtendedWebElement getSevenButton() {
        return sevenButton;
    }

    public ExtendedWebElement getEightButton() {
        return eightButton;
    }
    public ExtendedWebElement getNineButton() {
        return nineButton;
    }
    public ExtendedWebElement getAddButton() {
        return addButton;
    }

    public ExtendedWebElement getSubButton() {
        return subButton;
    }

    public ExtendedWebElement getDivButton() {
        return divButton;
    }

    public ExtendedWebElement getMulButton() {
        return mulButton;
    }


    public ExtendedWebElement getEqButton() {
        return eqButton;
    }

    public ExtendedWebElement getParenthesisButton(){return parenthesisButton;}

    public ExtendedWebElement getResultElement (){ return resultElement;}
    public ExtendedWebElement getDropdownMenuButton() {
        return dropdownMenuButton;
    }

    public ExtendedWebElement getRadianButton() {
        return DEGButton;
    }
    public ExtendedWebElement getSinButton() {
        return sinButton;
    }
    public ExtendedWebElement getCosButton() {
        return cosButton;
    }
    public ExtendedWebElement getTanButton() {
        return tanButton;
    }
    public ExtendedWebElement getInvButton() {
        return INVButton;
    }
    public ExtendedWebElement getEButton() {
        return eButton;
    }
    public ExtendedWebElement getLnButton() {
        return lnButton;
    }
    public ExtendedWebElement getLogButton() {
        return logButton;
    }


}
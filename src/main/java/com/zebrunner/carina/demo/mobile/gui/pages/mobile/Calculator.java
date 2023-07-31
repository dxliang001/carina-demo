package com.zebrunner.carina.demo.mobile.gui.pages.mobile;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CalculatorBase.class)
public class Calculator extends CalculatorBase {

    @FindBy(id = "com.google.android.calculator:id/main_calculator")
    private ExtendedWebElement acBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_0")
    private ExtendedWebElement zeroBtn;
    @FindBy(id ="com.google.android.calculator:id/digit_1")
    private ExtendedWebElement oneBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_2")
    private ExtendedWebElement twoBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_3")
    private ExtendedWebElement threeBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_4")
    private ExtendedWebElement fourBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_5")
    private ExtendedWebElement fiveBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_6")
    private ExtendedWebElement sixBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_7")
    private ExtendedWebElement sevenBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_8")
    private ExtendedWebElement eightBtn;

    @FindBy(id = "com.google.android.calculator:id/digit_9")
    private ExtendedWebElement nineBtn;

    @FindBy(id = "com.google.android.calculator:id/parens")
    private ExtendedWebElement parensBtn;

    @FindBy(id = "com.google.android.calculator:id/op_pct")
    private ExtendedWebElement pctBtn;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    private ExtendedWebElement divBtn;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    private ExtendedWebElement mulBtn;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    private ExtendedWebElement subBtn;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    private ExtendedWebElement addBtn;

    @FindBy(id = "com.google.android.calculator:id/eq")
    private ExtendedWebElement eqBtn;

    @FindBy(id = "com.google.android.calculator:id/del")
    private ExtendedWebElement delBtn;

    @FindBy(id = "com.google.android.calculator:id/dec_point")
    private ExtendedWebElement decPointBtn;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    private ExtendedWebElement resultElement;


    public Calculator(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {return acBtn.isElementPresent();}

    public ExtendedWebElement getResultElement() {
        return resultElement;
    }

    public ExtendedWebElement getTwoBtn() {
        return twoBtn;
    }

    public ExtendedWebElement getFourBtn() {
        return fourBtn;
    }

    public ExtendedWebElement getAddBtn() {
        return addBtn;
    }

    public ExtendedWebElement getEqBtn() {
        return eqBtn;
    }

    public ExtendedWebElement getFiveBtn() {
        return fiveBtn;
    }

    public ExtendedWebElement getThreeBtn() {
        return threeBtn;
    }

    public ExtendedWebElement getSubBtn() {
        return subBtn;
    }

    public ExtendedWebElement getOneBtn() {
        return oneBtn;
    }

    public ExtendedWebElement getSixBtn() {
        return sixBtn;
    }

    public ExtendedWebElement getDivBtn() {
        return divBtn;
    }

    public ExtendedWebElement getEightBtn() {
        return eightBtn;
    }

    public ExtendedWebElement getSevenBtn() {
        return sevenBtn;
    }

    public ExtendedWebElement getMulBtn() {
        return mulBtn;
    }

    public ExtendedWebElement getNineBtn() {
        return nineBtn;
    }

    public ExtendedWebElement getParensBtn() {
        return parensBtn;
    }
}
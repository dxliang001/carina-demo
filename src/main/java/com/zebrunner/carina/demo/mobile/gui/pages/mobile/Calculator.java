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
    private ExtendedWebElement AppInterface;
    @FindBy(id = "com.google.android.calculator:id/clr")
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

    @FindBy(id = "com.google.android.calculator:id/const_pi")
    private ExtendedWebElement PieButton;

    @FindBy(id = "com.google.android.calculator:id/result_preview")
    private ExtendedWebElement result_preview;

    @FindBy(id = "com.google.android.calculator:id/op_sqrt")
    private ExtendedWebElement sqr_rootButton;

    @FindBy(id = "com.google.android.calculator:id/op_pow")
    private ExtendedWebElement powerButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private ExtendedWebElement choosethememButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private ExtendedWebElement DarkthemeButton;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    private ExtendedWebElement MoreoptionMenu;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    private ExtendedWebElement OkButton;

    @Override
    public boolean isPageOpened() {return AppInterface.isElementPresent();}


    public void clickOkButton(){OkButton.click();}
    public void clickMoreoption(){MoreoptionMenu.click();}

    public void clickTheme(){choosethememButton.click();}

    public void clickDark(){DarkthemeButton.click();}
    public void click_sqrrootButton(){sqr_rootButton.click();}

    public void clickPowButton(){powerButton.click();}
    public ExtendedWebElement getResult_prev(){return result_preview;}
    public void clickPieButton() { PieButton.click();}

    public void clickAcButton(){ acButton.click();}

    public void clickZeroButton() {
         zeroButton.click();
    }
    public void clickOneButton() {
         oneButton.click();
    }

    public void clickTwoButton() {  twoButton.click(); }

    public void clickThreeButton() {
         threeButton.click();
    }

    public void clickFourButton() {
         fourButton.click();
    }

    public void clickFiveButton() {
         fiveButton.click();
    }

    public void clickSixButton() {
         sixButton.click();
    }

    public void clickSevenButton() {
         sevenButton.click();
    }

    public void clickEightButton() {
         eightButton.click();
    }
    public void clickNineButton() {
         nineButton.click();
    }
    public void clickAddButton() {
         addButton.click();
    }

    public void clickSubButton() {
         subButton.click();
    }

    public void clickDivButton() {
         divButton.click();
    }

    public void clickMulButton() {
         mulButton.click();
    }


    public void clickEqButton() {
         eqButton.click();
    }

    public void clickParenthesisButton(){ parenthesisButton.click();}

    public ExtendedWebElement getResultElement (){ return resultElement;}
    public void clickDropdownMenuButton() {
         dropdownMenuButton.click();
    }

    public void clickRadianButton() {
         DEGButton.click();
    }
    public void clickSinButton() {
         sinButton.click();
    }
    public void clickCosButton() {
         cosButton.click();
    }
    public void clickTanButton() {
         tanButton.click();
    }
    public void clickInvButton() {
         INVButton.click();
    }
    public void clickEButton() {
         eButton.click();
    }
    public void clickLnButton() {
         lnButton.click();
    }
    public void clickLogButton() {
         logButton.click();
    }


}
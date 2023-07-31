package com.zebrunner.carina.demo.mobile.gui.pages.amazon;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AmazonHomePageBase.class)
public class AmazonHomePage extends AmazonHomePageBase {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
    private ExtendedWebElement signInButton;

    @FindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
    public ExtendedWebElement clickSkipIn;
    @FindBy(id = "com.android.permissioncontroller:id/permission_deny_button")
    public ExtendedWebElement alterNotAllowButton;

    public void clickNotAllow(){
        alterNotAllowButton.click();
    }
    public void clickSkipButton(){
        clickSkipIn.click();
    }
    public boolean isPageOpened() {
        return signInButton.isPresent();
    }

}

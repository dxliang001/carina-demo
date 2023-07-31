package com.zebrunner.carina.demo.mobile.gui.pages.ebay;

import java.io.IOException;

import com.zebrunner.carina.demo.mobile.gui.pages.common.WelcomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class ebayAppPage {


    public ebayAppPage(WebDriver driver) {
        super();
    }
    @FindBy(id = "com.ebay.mobile:id/home_app_onboarding_logo")
    private ExtendedWebElement title;

    @FindBy(id = "com.ebay.mobile:id/home_app_onboarding_screen_close")
    private ExtendedWebElement closeSignInSection;

    @FindBy(id = "com.ebay.mobile:id/search_box")
    private ExtendedWebElement clickSearchBar;

    @FindBy(xpath =("//android.widget.ImageButton[@content-desc=\"eBay\"]"))
    private ExtendedWebElement clickDropDownMenu;

    @FindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView")
    private ExtendedWebElement firstSuggestedItem;

    @FindBy (xpath="//android.widget.Button[@content-desc=\"1 TB, Storage Capacity\"]")
    private ExtendedWebElement chooseCapacity1TB;

    @FindBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private ExtendedWebElement clickFirstIphoneResult;


    public void insertTextIntoSearchBar(String text) {
        clickSearchBar.click();
        clickSearchBar.type(text);
    }

    public void clickOnFirstSuggestedItem() {
        firstSuggestedItem.click();
    }

}

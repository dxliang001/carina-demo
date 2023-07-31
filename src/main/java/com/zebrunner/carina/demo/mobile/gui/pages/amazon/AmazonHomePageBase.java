package com.zebrunner.carina.demo.mobile.gui.pages.amazon;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AmazonHomePageBase extends AbstractPage {


    protected AmazonHomePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void clickSkipButton();

    public abstract void clickNotAllow();
}

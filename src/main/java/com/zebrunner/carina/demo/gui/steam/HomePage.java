package com.zebrunner.carina.demo.gui.steam;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class HomePage extends AbstractPage {

    @FindBy(xpath = "//a[@class='header_installsteam_btn header_installsteam_btn_green']")
    private WebElement installSteamButton;

    @FindBy(id = "language_pulldown")
    private WebElement languageDropdown;

    @FindBy(id = "language_dropdown")
    private WebElement languageOptions;

    @FindBy(id = "tab_topsellers_content_trigger")
    //@FindBy(xpath = "(//div[@id='tab_topsellers_content']")
    private WebElement topSellersTab;

    @FindBy(xpath = "(//div[@id='tab_topsellers_content']//a[contains(@class, 'tab_item')])[1]")
    private WebElement firstTopSeller;

    @FindBy(xpath = ("//div[@class='about_install_wrapper']"))
    private WebElement InstallButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        setPageAbsoluteURL("https://store.steampowered.com/");
    }

    public void clickInstallSteam() {
        installSteamButton.click();
    }


    public void clickLanguageDropdown() {
        languageDropdown.click();
    }

    public void selectLanguage(String language) {
        WebElement languageOption = driver.findElement(By.xpath("//a[contains(text(), '" + language + "')]"));
        languageOption.click();
    }

    public boolean isHomePageOpen() {
        return driver.getCurrentUrl().equals("https://store.steampowered.com/");
    }


    public List<String> getAvailableLanguages() {
        List<String> languages = new ArrayList<>();
        List<WebElement> languageElements = driver.findElements(By.xpath("//div[@id='language_dropdown']//a[contains(@class, 'popup_menu_item')]"));
        for (WebElement languageElement : languageElements) {
            languages.add(languageElement.getText());
        }
        return languages;
    }

    public void clickTopSellersTab() {
        topSellersTab.click();
    }

    public void clickFirstTopSeller() {
        firstTopSeller.click();
    }

    public void clickInstallButton(){ InstallButton.click();}
}
package com.zebrunner.carina.demo.saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.zebrunner.carina.demo.gui.pages.saucedemo.LoginPage;

public class LoginTest {
    WebDriver driver;

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "file/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");


        LoginPage login = new LoginPage(driver);


        login.loginToSauceDemo("standard_user", "secret_sauce");

        driver.quit();
    }
}

package com.nopcommerce.user;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.nopCommerce.PageGenerator;
import pageObjects.nopCommerce.users.SearchPO;
import pageObjects.nopCommerce.users.UserCustomerInfoPO;
import pageObjects.nopCommerce.users.UserHomePO;

import java.lang.reflect.Method;
import java.util.Random;

public class Level_30_Not_Dependencies extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(UserCustomerInfoPO.class);
    //Declare variables
    private WebDriver driver;
    private SearchPO searchPO;
    private UserHomePO homePage;
    private PageGenerator pageGenerator;
    private String browserName;

    String day, month, year, companyName, firstName, lastName, email, password;

    //Pre-condition
    @Parameters("browser")
    @BeforeMethod
    public void beforeClass(String browserName) {
        this.browserName = browserName;
        driver = getBrowserDriver(browserName);
        homePage = PageGenerator.getUserHomePage(driver);
        searchPO = homePage.clickToSearchLink();
    }

    //Testcase
    @Test
    public void shouldBeSearchByEmptyData(Method method) {
        searchPO.enterToSearchTextbox("");
        searchPO.clickSearchButton();
    }

    @Test
    public void shouldBeSearchByNotExistName() {
        searchPO.enterToSearchTextbox("Macbook Pro 2050");
        searchPO.clickSearchButton();

    }

    @Test
    public void shouldBeSearchByContainsProductName() {
        searchPO.enterToSearchTextbox("Lenovo");
        searchPO.clickSearchButton();
    }

    @Test
    public void shouldBeSearchByProductName() {
        searchPO.enterToSearchTextbox("Lenovo Thinkpad X1 Carbon Laptop");
        searchPO.clickSearchButton();
    }

    //Post-condition

    protected String getEmailRandom(String prefix) {
        Random ran = new Random();
        return prefix + ran.nextInt(9999) + "@orgnature.com";

    }

    @AfterMethod
    public void afterClass() {
        driver.quit();
    }
}

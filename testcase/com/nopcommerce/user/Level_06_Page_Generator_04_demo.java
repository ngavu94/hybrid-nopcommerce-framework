package com.nopcommerce.user;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.*;

public class Level_06_Page_Generator_04_demo extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(Level_06_Page_Generator_04_demo.class);
    WebDriver driver;
    private HomePageObject homePage;
    private RegisterPageObject registerPage;
    private LoginPageObject loginPage;
    private CustomerInfoPageObject customerPage;
    private AddressPageObject addressPage;
    private OrderPageObject orderPage;
    private RewardPointPageObject rewardPointPage;

    String firstName, lastName, email, companyName, password;

    @Parameters("browser")
    @BeforeClass()
    public void beforClass(String browser) {
        driver = getBrowserDriver(browser);
        System.out.println("driver: " + driver);
        homePage = PageGenerator.getHomePage(driver);
        firstName = "Nga";
        lastName = "Vu";
        email = firstName + lastName + generateNumber() + "@gmail.com";
        companyName = "ABC company";
        password = "123456a@";
    }

    @Test
    public void User_01_Register() {
        registerPage = homePage.clickToRegisterLink();
        registerPage.clickToMaleRadio();
        registerPage.enterToFirstNameTextbox(firstName);
        registerPage.enterToLastNameTextbox(lastName);
        registerPage.enterToEmailTextbox(email);
        registerPage.enterToCompanyTextbox(companyName);
        registerPage.enterToPasswordTextbox(password);
        registerPage.enterToPasswordConfirmTextbox(password);
        registerPage.clickRegisterButton();
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
        registerPage.clickToLogoutButton();
    }

    @Test
    public void User_02_Login() {
        loginPage = registerPage.clickToLoginButton();
        loginPage.enterToEmailTextbox(email);
        loginPage.enterToPasswordTextbox(password);
        homePage = loginPage.clickLoginToSystem();
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

    }

    @Test
    public void User_03_Customer_Info() {
        customerPage = homePage.clickToMyaccountLink();
        Assert.assertTrue(customerPage.isGenderMaleSelected());
        Assert.assertEquals(customerPage.getFirstNameTextboxValue(), firstName);
        Assert.assertEquals(customerPage.getLastNameTextboxValue(), lastName);
        Assert.assertEquals(customerPage.getEmailTextboxValue(), email);
        Assert.assertEquals(customerPage.getCompanyNameTextboxValue(), companyName);
    }

    @Test
    public void User_04_Switch_Page() {
        customerPage = homePage.clickToMyaccountLink();
        //Chuyển sang address page
        addressPage = customerPage.openAddressPage(driver);
        //Chuyển sang order page
        orderPage = addressPage.openOrderPage(driver);
        //Chuyển sang Reward point page
        rewardPointPage = orderPage.openRewardPointPage(driver);
        //Chuyển lại Customer info page
        customerPage = rewardPointPage.openCustomerInfoPage(driver);

    }

}

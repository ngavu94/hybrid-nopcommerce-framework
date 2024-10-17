package com.nopcommerce.user;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

import java.time.Duration;

public class Level_04_Multiple_Browser extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(CustomerInfoPageObject.class);
    //Declare variables
    private WebDriver driver;
    private HomePageObject homePage;
    private RegisterPageObject registerPage;
    private LoginPageObject loginPage;
    private CustomerInfoPageObject customerPage;

    String firstName, lastName, day, month, year, email, companyName, password;

    //Pre-condition
    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName){
        driver = getBrowserDriver(browserName);
        //Nó được sinh ra và bắt đầu làm đc các action của page đó
        homePage=new HomePageObject(driver);
        firstName = "nga";
        lastName ="vu";
        day="10";
        month="August";
        year="1990";
        email="ngavu"+ generateNumber()+"@org.edu";
        companyName="viettel";
        password="123456789";
    }

    //Testcase
    @Test
    public void User_01_Register(){
        //ACtion 1
        homePage.clickToRegisterLink();

        //Từ homepage qua registerPage
        registerPage = new RegisterPageObject(driver);
        registerPage.clickToMaleRadio();
        registerPage.enterToFirstNameTextbox(firstName);
        registerPage.enterToLastNameTextbox(lastName);
//        registerPage.selectDayDropdown("12");
//        registerPage.selectMonthDropdown("04");
//        registerPage.selectYearDropdown("12");
        registerPage.enterToEmailTextbox(email);
        registerPage.enterToCompanyTextbox(companyName);
        registerPage.enterToPasswordTextbox(password);
        registerPage.enterToPasswordConfirmTextbox(password);
        registerPage.clickRegisterButton();
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(),"Your registration completed");
        registerPage.clickToLogoutButton();

    }
    @Test
    public void User_02_Login(){
        registerPage.clickToLoginButton();
        loginPage = new LoginPageObject(driver);
        loginPage.enterToEmailTextbox(email);
        loginPage.enterToPasswordTextbox(password);
        loginPage.clickLoginToSystem();

        //Từ loginPage qua homePage
        //Page đó đc sinh ra và làm các action
        homePage = new HomePageObject(driver);
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

    }
    @Test
    public void User_03_MyAccount(){
        homePage.clickToMyaccountLink();
        customerPage = new CustomerInfoPageObject(driver);
        System.out.println("from web: " +customerPage.getFirstNameTextboxValue());
        System.out.println("from variable: " +firstName);
        Assert.assertTrue(customerPage.isGenderMaleSelected());
        Assert.assertEquals(customerPage.getFirstNameTextboxValue(),firstName);

        Assert.assertEquals(customerPage.getLastNameTextboxValue(),lastName);
//        Assert.assertEquals(customerPage.getDayDropdownSelectedValue(),"");
//        Assert.assertEquals(customerPage.getMonthDropdownSelectedValue(),"");
//        Assert.assertEquals(customerPage.getYearDropdownSelectedValue(),"");
        Assert.assertEquals(customerPage.getEmailTextboxValue(),email);
        Assert.assertEquals(customerPage.getCompanyNameTextboxValue(),companyName);
    }

    //Post-condition
    // @AfterClass
    public void afterClass(){
        driver.quit();
    }
}

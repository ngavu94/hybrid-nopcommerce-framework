package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageUIs.CustomerInfoPageUI;

import java.time.Duration;

public class CustomerInfoPageObject extends BasePage {

    private WebDriver driver;

    public CustomerInfoPageObject(WebDriver driver){
        this.driver = driver;
    }
    public boolean isGenderMaleSelected() {
        waitForElementSelected(driver, CustomerInfoPageUI.GENDER_MALE_RADIO);
        return  getElement(driver, CustomerInfoPageUI.GENDER_MALE_RADIO).isSelected();
    }

    public String getFirstNameTextboxValue() {
        return getElementAttribute(driver, CustomerInfoPageUI.FIRST_NAME_TEXTBOX,"value");
    }

    public String getLastNameTextboxValue() {
        return getElementAttribute(driver, CustomerInfoPageUI.LAST_NAME_TEXTBOX,"value");
    }

//    public String getDayDropdownSelectedValue() {
//        return null;
//    }
//
//    public String getMonthDropdownSelectedValue() {
//        return null;
//    }
//
//    public String getYearDropdownSelectedValue() {
//        return null;
//    }

    public String getEmailTextboxValue() {
        return getElementAttribute(driver, CustomerInfoPageUI.EMAIL_TEXTBOX,"value");
    }

    public String getCompanyNameTextboxValue() {
        return getElementAttribute(driver, CustomerInfoPageUI.COMPANY_NAME_TEXTBOX,"value");
    }
}

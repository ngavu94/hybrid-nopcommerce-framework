package pageObjects.users;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageUIs.users.UserHomePageUI;
import pageUIs.users.UserRegisterPageUI;

public class UserRegisterPO extends BasePage {
    private WebDriver driver;

    public UserRegisterPO(WebDriver driver){
        this.driver = driver;
    }
    public void clickToMaleRadio() {
        waitForElementClickable(driver, UserRegisterPageUI.GENDER_MALE_RADIO);
        clickToElement(driver, UserRegisterPageUI.GENDER_MALE_RADIO);
    }

    public void enterToFirstNameTextbox(String firstName) {
        senkeysToElement(driver, UserRegisterPageUI.FIRST_NAME_TEXTBOX,firstName);
    }

    public void enterToLastNameTextbox(String lastName) {
        senkeysToElement(driver, UserRegisterPageUI.LAST_NAME_TEXTBOX,lastName);
    }

//    public void selectDayDropdown(String number) {
//    }
//
//    public void selectMonthDropdown(String number) {
//    }
//
//    public void selectYearDropdown(String number) {
//    }

    public void enterToEmailTextbox(String email) {
        senkeysToElement(driver, UserRegisterPageUI.EMAIL_TEXTBOX,email);
    }

    public void enterToCompanyTextbox(String companyName) {
        senkeysToElement(driver, UserRegisterPageUI.COMPANY_NAME_TEXTBOX,companyName);
    }

    public void enterToPasswordTextbox(String password) {
        senkeysToElement(driver, UserRegisterPageUI.PASSWORD_TEXTBOX,password);
    }

    public void enterToPasswordConfirmTextbox(String confirmPassword) {
        senkeysToElement(driver, UserRegisterPageUI.PASSWORD_CONFIRMED_TEXTBOX,confirmPassword);
    }

    public void clickRegisterButton() {
        waitForElementClickable(driver, UserRegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, UserRegisterPageUI.REGISTER_BUTTON);
    }

    public String getRegisterSuccessMessage() {
        return getElementText(driver, UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
    }

    public UserLoginPO clickToLoginButton() {
        waitForElementClickable(driver, UserHomePageUI.LOGIN_LINK);
        clickToElement(driver, UserHomePageUI.LOGIN_LINK);
        return PageGenerator.getUserLoginPage(driver);
    }
    public void clickToLogoutButton(){
        waitForElementClickable(driver, UserHomePageUI.LOGOUT_LINK);
        clickToElement(driver, UserHomePageUI.LOGOUT_LINK);
    }
}

package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;
import pageUIs.RegisterPageUI;

public class RegisterPageObject extends BasePage {
    private WebDriver driver;

    public RegisterPageObject(WebDriver driver){
        this.driver = driver;
    }
    public void clickToMaleRadio() {
        waitForElementClickable(driver, RegisterPageUI.GENDER_MALE_RADIO);
        clickToElement(driver, RegisterPageUI.GENDER_MALE_RADIO);
    }

    public void enterToFirstNameTextbox(String firstName) {
        senkeysToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX,firstName);
    }

    public void enterToLastNameTextbox(String lastName) {
        senkeysToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX,lastName);
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
        senkeysToElement(driver, RegisterPageUI.EMAIL_TEXTBOX,email);
    }

    public void enterToCompanyTextbox(String companyName) {
        senkeysToElement(driver, RegisterPageUI.COMPANY_NAME_TEXTBOX,companyName);
    }

    public void enterToPasswordTextbox(String password) {
        senkeysToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX,password);
    }

    public void enterToPasswordConfirmTextbox(String confirmPassword) {
        senkeysToElement(driver, RegisterPageUI.PASSWORD_CONFIRMED_TEXTBOX,confirmPassword);
    }

    public void clickRegisterButton() {
        waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public String getRegisterSuccessMessage() {
        return getElementText(driver, RegisterPageUI.REGISTER_SUCCESS_MESSAGE);
    }

    public LoginPageObject clickToLoginButton() {
        waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
        clickToElement(driver, HomePageUI.LOGIN_LINK);
        return PageGenerator.getLoginPage(driver);
    }
    public void clickToLogoutButton(){
        waitForElementClickable(driver, HomePageUI.LOGOUT_LINK);
        clickToElement(driver, HomePageUI.LOGOUT_LINK);
    }
}

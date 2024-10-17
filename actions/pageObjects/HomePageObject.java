package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
    private WebDriver driver;
    public HomePageObject(WebDriver driver){
        this.driver = driver;
    }
    public RegisterPageObject clickToRegisterLink() {
        waitForElementClickable(driver,HomePageUI.REGISTER_LINK);
        clickToElement(driver, HomePageUI.REGISTER_LINK);
        return PageGenerator.getRegisterPage(driver);
    }
    public boolean isMyAccountLinkDisplayed() {
        return getElement(driver, HomePageUI.MY_ACCOUNT_LINK).isDisplayed();
    }

    public CustomerInfoPageObject clickToMyaccountLink() {
        waitForElementClickable(driver, HomePageUI.MY_ACCOUNT_LINK);
        clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
        return PageGenerator.getCustomerInfoPage(driver);
    }
}

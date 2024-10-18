package pageObjects.users;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageUIs.users.UserSidebarPageUI;

public class UserSidebarPO extends BasePage {
    WebDriver driver;
    public UserSidebarPO(WebDriver driver){
        this.driver = driver;
    }

    public UserRewardPointPO openRewardPointPage() {
        //wait
        waitForElementClickable(driver, UserSidebarPageUI.REWARD_POINT_LINK);
        //click
        clickToElement(driver, UserSidebarPageUI.REWARD_POINT_LINK);
        return PageGenerator.getUserRewardPointPage(driver);
    }

    public UserCustomerInfoPO openCustomerInfoPage() {
        //wait
        waitForElementClickable(driver, UserSidebarPageUI.CUSTOMER_INFO_LINK);
        //click
        clickToElement(driver, UserSidebarPageUI.CUSTOMER_INFO_LINK);
        return PageGenerator.getUserCustomerInfoPage(driver);
    }

    public UserAddressPO openAddressPage() {
        //wait
        waitForElementClickable(driver, UserSidebarPageUI.ADDRESS_LINK);
        //click
        clickToElement(driver, UserSidebarPageUI.ADDRESS_LINK);
        return PageGenerator.getUserAddressPage(driver);
    }


    public UserOrderPO openOrderPage() {
        //wait
        waitForElementClickable(driver, UserSidebarPageUI.ORDER_LINK);
        //click
        clickToElement(driver, UserSidebarPageUI.ORDER_LINK);
        return PageGenerator.getUserOrderPage(driver);
    }
}

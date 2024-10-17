package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.BasePageUI;
import pageUIs.SidebarPageUI;

public class SidebarPageObject extends BasePage {
    WebDriver driver;
    public SidebarPageObject(WebDriver driver){
        this.driver = driver;
    }

    public RewardPointPageObject openRewardPointPage() {
        //wait
        waitForElementClickable(driver, SidebarPageUI.REWARD_POINT_LINK);
        //click
        clickToElement(driver, SidebarPageUI.REWARD_POINT_LINK);
        return PageGenerator.getRewardPointPage(driver);
    }

    public CustomerInfoPageObject openCustomerInfoPage() {
        //wait
        waitForElementClickable(driver,SidebarPageUI.CUSTOMER_INFO_LINK);
        //click
        clickToElement(driver,SidebarPageUI.CUSTOMER_INFO_LINK);
        return PageGenerator.getCustomerInfoPage(driver);
    }

    public AddressPageObject openAddressPage() {
        //wait
        waitForElementClickable(driver, SidebarPageUI.ADDRESS_LINK);
        //click
        clickToElement(driver, SidebarPageUI.ADDRESS_LINK);
        return PageGenerator.getAddressPage(driver);
    }


    public OrderPageObject openOrderPage() {
        //wait
        waitForElementClickable(driver, SidebarPageUI.ORDER_LINK);
        //click
        clickToElement(driver, SidebarPageUI.ORDER_LINK);
        return PageGenerator.getOrderPage(driver);
    }
}

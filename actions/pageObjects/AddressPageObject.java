package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.AddressPageUI;

public class AddressPageObject extends SidebarPageObject {
        private WebDriver driver;
        public AddressPageObject(WebDriver driver){
            super(driver);
            this.driver = driver;
        }

//    public RewardPointPageObject openRewardPointPage() {
//            //wait
//        waitForElementClickable(driver, AddressPageUI.REWARD_POINT_LINK);
//        //click
//        clickToElement(driver, AddressPageUI.REWARD_POINT_LINK);
//        return PageGenerator.getRewardPointPage(driver);
//    }

//    public CustomerInfoPageObject openCustomerInfoPage() {
//        //wait
//        waitForElementClickable(driver,AddressPageUI.CUSTOMER_INFO_LINK);
//        //click
//        clickToElement(driver,AddressPageUI.CUSTOMER_INFO_LINK);
//        return PageGenerator.getCustomerInfoPage(driver);
//    }
}

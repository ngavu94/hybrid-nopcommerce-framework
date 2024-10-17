package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;
import pageUIs.RegisterPageUI;
import pageUIs.RewardPageUI;

public class RewardPointPageObject extends SidebarPageObject {
     WebDriver driver;

    public RewardPointPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

//    public OrderPageObject openOrderPage() {
//        //wait
//        waitForElementClickable(driver, RewardPageUI.ORDER_LINK);
//        //click
//        clickToElement(driver, RewardPageUI.ORDER_LINK);
//        return PageGenerator.getOrderPage(driver);
//    }
}

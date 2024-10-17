package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.OrderPageUI;

public class OrderPageObject extends SidebarPageObject {
    private WebDriver driver;

    public OrderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

//    public AddressPageObject openAddressPage() {
//        //wait
//        waitForElementClickable(driver, OrderPageUI.ADDRESS_LINK);
//        //click
//        clickToElement(driver, OrderPageUI.ADDRESS_LINK);
//        return PageGenerator.getAddressPage(driver);
//    }
}

package pageObjects.orangeHRM.pim.employee;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.orangeHRM.PageGenerator;
import pageUIs.orangeHRM.pim.employee.EmployeeTabsPageUI;

public class EmployeeTabs extends BasePage {
    WebDriver driver;

    public EmployeeTabs(WebDriver driver) {
        this.driver = driver;
    }
    public PersonalDetailPO openPersonalDetailPage(){
        waitForElementClickable(driver, EmployeeTabsPageUI.PERSONAL_DETAIL_LINK);
        clickToElement(driver, EmployeeTabsPageUI.PERSONAL_DETAIL_LINK);
        return PageGenerator.getPersonalDetailPage(driver);
    }
    public ContactDetailPO openContactDetailPage(){
        waitForElementClickable(driver, EmployeeTabsPageUI.PERSONAL_DETAIL_LINK);
        clickToElement(driver, EmployeeTabsPageUI.PERSONAL_DETAIL_LINK);
        return PageGenerator.getContactDetailPage(driver);
    }
    public EmergencyContactsPO openEmergencyContactlPage(){
        waitForElementClickable(driver, EmployeeTabsPageUI.PERSONAL_DETAIL_LINK);
        clickToElement(driver, EmployeeTabsPageUI.PERSONAL_DETAIL_LINK);
        return PageGenerator.getEmergencyPage(driver);
    }
}

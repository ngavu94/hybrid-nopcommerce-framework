package pageObjects.orangeHRM.pim.employee;

import commons.BasePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageUIs.orangeHRM.pim.employee.PersonalDetailPageUI;

public class PersonalDetailPO extends EmployeeTabs {
    WebDriver driver;

    public PersonalDetailPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public Dimension getAvatarSize() {
         return getElementSize(driver, PersonalDetailPageUI.AVATAR_IMG);
    }

    public void clickToAvatarImage() {
        waitForElementClickable(driver, PersonalDetailPageUI.AVATAR_IMG);
        clickToElement(driver, PersonalDetailPageUI.AVATAR_IMG);
    }

    public void clickToSaveButtonAtProfileContainer() {
        waitForElementClickable(driver, PersonalDetailPageUI.SAVE_BUTTON_AT_EDIT_PROFILE_CONTAINER);
        clickToElement(driver, PersonalDetailPageUI.SAVE_BUTTON_AT_EDIT_PROFILE_CONTAINER);
    }

    public boolean isSuccessMessageDisplayed(String successMessage) {
        waitForListElementVisible(driver, PersonalDetailPageUI.SUCCESS_MESSAGE_UPLOAD_AVATAR);
        return isElementDisplayed(driver, PersonalDetailPageUI.SUCCESS_MESSAGE_UPLOAD_AVATAR,successMessage);
    }

    public boolean isProfileAvatarUpdateSuccess(Dimension beforeUpload) {
     Dimension afterUpload = getAvatarSize();
        System.out.println("afterUpload: "+afterUpload);
     return !(beforeUpload.equals(afterUpload));
    }
}

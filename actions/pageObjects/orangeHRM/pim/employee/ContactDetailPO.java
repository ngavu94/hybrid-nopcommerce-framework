package pageObjects.orangeHRM.pim.employee;

import org.openqa.selenium.WebDriver;

public class ContactDetailPO extends EmployeeTabs{
    WebDriver driver;

    public ContactDetailPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}

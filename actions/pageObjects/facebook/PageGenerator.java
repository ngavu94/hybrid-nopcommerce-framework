package pageObjects.facebook;

import org.openqa.selenium.WebDriver;
import pageObjects.jquerry.HomePO;

public class PageGenerator {
    public static LoginPO getLoginPage(WebDriver driver){
        return new LoginPO(driver);
    }
}

package javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.target.model.SessionID;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class Topic_04_Driver_Infor {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        SessionId sessionID = ((RemoteWebDriver) driver).getSessionId();
        System.out.println("SessionID: "+sessionID);
        System.out.println("DriverID: "+driver.toString());
        driver.quit();
    }
}

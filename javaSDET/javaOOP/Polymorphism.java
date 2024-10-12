package javaOOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Polymorphism {
    //Contructor- hàm khởi tạo trùng tên với tên class
    public Polymorphism(){

    }
    public Polymorphism(WebDriver driver){

    }
    public Polymorphism(WebDriver driver, WebDriverWait driverWait){

    }
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        Polymorphism polymorphism = new Polymorphism();
    }
}

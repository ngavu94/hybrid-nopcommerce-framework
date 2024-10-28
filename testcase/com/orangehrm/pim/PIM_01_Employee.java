package com.orangehrm.pim;

import commons.BaseTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.orangeHRM.DashboardPO;
import pageObjects.orangeHRM.LoginPO;
import pageObjects.orangeHRM.PageGenerator;
import pageObjects.orangeHRM.pim.employee.AddNewEmployeePO;
import pageObjects.orangeHRM.pim.employee.EmployeeListPO;
import pageObjects.orangeHRM.pim.employee.PersonalDetailPO;

public class PIM_01_Employee extends BaseTest {
    private WebDriver driver;
    private LoginPO loginPO;
    private DashboardPO dashboardPO;
    private AddNewEmployeePO addNewEmployeePO;
    private EmployeeListPO employeeListPO;
    private PersonalDetailPO personalDetailPO;
    private String employeeID, firstName, middleName, lastName;
    private String avatarImageName = "image01.png";

    @Parameters({"browser", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);
        loginPO = PageGenerator.getLoginPage(driver);
        firstName = "Michale";
        middleName = "Jame";
        lastName = "W";
        loginPO.enterToUsernameTextbox("Nga@automation1");
        loginPO.enterToPasswordTextbox("Nga@automation1");
        dashboardPO = loginPO.clickToLoginButton();


    }

    @Test
    public void Employee_01_Add_New() {
        employeeListPO = dashboardPO.clickToPIMPage();
        addNewEmployeePO = employeeListPO.clickToAddEmployeeButton();
        addNewEmployeePO.enterToFirstnameTextbox(firstName);
        addNewEmployeePO.enterToMiddlenameTextbox(middleName);
        addNewEmployeePO.enterToLastnameTextbox(lastName);
        employeeID = addNewEmployeePO.getEmployeeID();
        System.out.println("employeeID " + employeeID);
        personalDetailPO = addNewEmployeePO.clickToSaveButton();

    }

    @Test
    public void Employee_02_Upload_Avatar() {
        personalDetailPO.clickToAvatarImage();
        //Load file lên
        personalDetailPO.uploadMultipleFiles(driver, avatarImageName);
        //Lấy ra height/width của element (avatar)
        Dimension beforeUpload = personalDetailPO.getAvatarSize();
        System.out.println("beforeUpload" + beforeUpload);
        personalDetailPO.clickToSaveButtonAtProfileContainer();
        Assert.assertTrue(personalDetailPO.isSuccessMessageDisplayed("Successfully Updated"));
        personalDetailPO.waitAllLoadingIconInvisible(driver);
        Assert.assertTrue(personalDetailPO.isProfileAvatarUpdateSuccess(beforeUpload));
    }
//    @Test
//    public void Employee_03_Personal_Details() {
//
//    }
//    @Test
//    public void Employee_04_Contacts_Details() {
//
//    }
//    @Test
//    public void Employee_05_Emergency_Details() {
//
//    }

    @AfterClass
    public void afterClass() {
        closeBrowerDriver();
    }

}

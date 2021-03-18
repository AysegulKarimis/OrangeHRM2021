package com.orangehrm.page;

import com.orangehrm.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.orangehrm.base.BasePage.driver;

public class LoginPage {

    @FindBy(id ="txtUsername")
    private static WebElement userName;


    @FindBy(id = "txtPassword")
    private static WebElement password;

    @FindBy(id="btnLogin")
    private static WebElement loginBtn;

    @FindBy(xpath = "//span[contains(text(),'Invalid credentials')]")
    private static WebElement errorMsg;

    // Constructor
    public LoginPage() {

        PageFactory.initElements(driver, this);
    }
    // Page Actions
    public static String verifyTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static void enterUserName(String user){

        HelperMethods.sendText(userName, user);
    }
    public static void enterPassword(String pass){

        HelperMethods.sendText(password, pass);
    }

    public static void clickOnLoginBtn(){

        HelperMethods.doClick(loginBtn);
    }

    public static String invalidLoginMsg(){

        return HelperMethods.doGetText(errorMsg);
    }
}

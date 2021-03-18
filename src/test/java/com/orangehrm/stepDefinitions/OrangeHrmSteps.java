package com.orangehrm.stepDefinitions;

import com.orangehrm.base.ConfigReader;
import com.orangehrm.page.HomePage;
import com.orangehrm.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OrangeHrmSteps {
    @Given("User enter correct username")
    public void user_enter_correct_username() {
        LoginPage.enterUserName(ConfigReader.getProperty("username"));
    }

    @When("User enter correct password")
    public void user_enter_correct_password() {
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @And("User click login button")
    public void user_click_login_button() {

            LoginPage.clickOnLoginBtn();
        }


    @Then("User sees the Home page")
    public void user_sees_the_home_page() {

        Assert.assertEquals("OrangeHRM", HomePage.verifyTitle());
    }
    @Given("User enter incorrect username")
    public void user_enter_incorrect_username() {
        LoginPage.enterUserName(ConfigReader.getProperty("incorrectusername"));
    }

    @When("User enter incorrect password")
    public void user_enter_incorrect_password() {
        LoginPage.enterPassword(ConfigReader.getProperty("incorrectpassword"));
    }

    @Then("User sees the error message")
    public void user_sees_the_error_message() {
        Assert.assertEquals("Invalid credentials", LoginPage.invalidLoginMsg());
    }


}




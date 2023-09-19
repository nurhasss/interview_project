package com.interview.step_definitions;

import com.interview.pages.DashboardPage;
import com.interview.pages.LoginPage;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPage_StepDefinitions {

    @Given("user is on the login page of the application")
    public void userIsOnTheLoginPageOfTheApplication() {

        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }


    LoginPage login= new LoginPage();
    @When("user enters employee username")
    public void user_enters_employee_username() {
        login.userName.sendKeys(ConfigurationReader.getProperty("username"));

    }
    @When("user enters employee password")
    public void user_enters_employee_password() {
        login.password.sendKeys(ConfigurationReader.getProperty("password"));

    }
    DashboardPage dashboardPage= new DashboardPage();
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(dashboardPage.header.isDisplayed());

    }


}

package com.interview.step_definitions;

import com.interview.pages.BasePage;
import com.interview.pages.DashboardPage;
import com.interview.utilities.ConfigurationReader;
import com.interview.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dashboard_StepDefinitions extends BasePage {


    @Given("user is on the dashboard of the application")
    public void user_is_on_the_dashboard_of_the_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));

    }
    DashboardPage dashboardPage= new DashboardPage();

    @When("user clicks on contact us button")
    public void user_clicks_on_contact_us_button() {
        dashboardPage.contactButton.click();

    }
    @Then("user should see the title {string}")
    public void user_should_see_the_title (String expectedTitle) {
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }



}

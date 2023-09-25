package com.interview.step_definitions;

import com.interview.pages.ContactUsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ContactUs_StepDefinitions {
ContactUsPage contactPage= new ContactUsPage();

    @Then("user should submit the form with valid data")
    public void user_should_submit_the_form_with_valid_data() {

        Assert.assertTrue(contactPage.formSubmission().contains("Thank you"));

    }
}

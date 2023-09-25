Feature: Contact Sale feature

  User Story:
  As a user, I should be able to send Contact Sales form with valid data.

  Background:
    Given user is on the dashboard of the application
    When user clicks on contact us button

  @contactForm
  Scenario: Submit Contact Sales Form
   Then user should submit the form with valid data
